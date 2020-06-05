package com.startingwithspring.StartingWithSpring.service;

import com.startingwithspring.StartingWithSpring.model.ResourceModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceAllocatorService {
    ResourceModel resourceModel = new ResourceModel();
    List<ResourceModel> list = new ArrayList<>();

    ResourceAllocatorService() {
        createResource("Resource One", "res1");
        createResource("Resource Two", "res2");
        createResource("Resource Three", "res3");
    }

    public List<ResourceModel> showResources() {
        return list;
    }

    public ResourceModel createResource(String name, String id) {
        ResourceModel resourceModel = new ResourceModel();
        resourceModel.setResourceName(name);
        resourceModel.setResourceId(id);
        list.add(resourceModel);
        return resourceModel;
    }

    public void deleteResource(String id) {
        list.removeIf(model -> model.getResourceId().equals(id));
    }

}
