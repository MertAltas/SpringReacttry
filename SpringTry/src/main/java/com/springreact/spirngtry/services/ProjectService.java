package com.springreact.spirngtry.services;

import com.springreact.spirngtry.Domain.Project;
import com.springreact.spirngtry.exceptions.ProjectIdException;
import com.springreact.spirngtry.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository  projectRepository;

    public Project saveOrUpdateProject (Project project){
        try {
            project.setProjectIdentifer(project.getProjectIdentifer().toUpperCase());
            return  projectRepository.save(project);
        }
        catch (Exception e){
            throw  new ProjectIdException("projectIdentifiet  " + " " + project.getProjectIdentifer().toUpperCase()+" " + "is already exist");
        }
    }
}
