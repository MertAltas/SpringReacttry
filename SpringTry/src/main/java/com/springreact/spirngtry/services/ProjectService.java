package com.springreact.spirngtry.services;

import com.springreact.spirngtry.Domain.Project;
import com.springreact.spirngtry.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository  projectRepository;

    public Project saveOrUpdateProject (Project project){
       return  projectRepository.save(project);
    }
}