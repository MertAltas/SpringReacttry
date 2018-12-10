package com.springreact.spirngtry.exceptions;

public class ProjectIdExceptionRespone {
    private String projectIdentifer;

    public ProjectIdExceptionRespone(String projectIdentifer) {
        this.projectIdentifer = projectIdentifer;
    }

    public String getProjectIdentifer() {
        return projectIdentifer;
    }

    public void setProjectIdentifer(String projectIdentifer) {
        this.projectIdentifer = projectIdentifer;
    }
}
