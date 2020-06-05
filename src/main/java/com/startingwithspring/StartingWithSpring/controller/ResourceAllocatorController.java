package com.startingwithspring.StartingWithSpring.controller;

import com.startingwithspring.StartingWithSpring.model.ResourceModel;
import com.startingwithspring.StartingWithSpring.service.ResourceAllocatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResourceAllocatorController {
    @Autowired
    ResourceAllocatorService resourceAllocatorService;

    @RequestMapping("/resource")
    public List<ResourceModel> showResources() {
        return resourceAllocatorService.showResources();
    }

    @RequestMapping(path = "/addResource/{name}:{id}")
    public String addResource(@PathVariable String name, @PathVariable String id) {
        String resource = resourceAllocatorService.createResource(name, id).toString();
        return "Resource has been inserted. Specifics :: " + resource;
    }

    @RequestMapping(path = "/delete/{id}")
    public String deleteResource(@PathVariable String id) {
        resourceAllocatorService.deleteResource(id);
        return "resource with id :: " + id + " has been deleted.";
    }
}
