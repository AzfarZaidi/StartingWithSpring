package com.startingwithspring.StartingWithSpring.model;


public class ResourceModel {

    private String resourceName;
    private String resourceId;

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    @Override
    public String toString() {
        return "ResourceModel{" +
                "resourceName='" + resourceName + '\'' +
                ", resourceId='" + resourceId + '\'' +
                '}';
    }
}
