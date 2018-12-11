package com.springreact.spirngtry.web;

import com.springreact.spirngtry.Domain.Project;
import com.springreact.spirngtry.services.MapValidationErrorService;
import com.springreact.spirngtry.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @Autowired
    private MapValidationErrorService mapValidationErrorService;

    @PostMapping("")
    public ResponseEntity<?> createNewProject(@Valid @RequestBody Project project, BindingResult result){
        ResponseEntity<?> errorMap = mapValidationErrorService.mapValidationService(result);
        if(errorMap!=null) return errorMap;
        Project project1 = projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project1,HttpStatus.CREATED);
    }
    @GetMapping( "/{projectId}")
    public  ResponseEntity<?> getProject (@PathVariable String projectId){
        Project project = projectService.findProjectByProjectId(projectId);
        return  new ResponseEntity<Project>(project,HttpStatus.OK);
    }

    @GetMapping("/all")
    public Iterable<Project> getAllProjects(){
        return projectService.findAllProjects();
    }

}
