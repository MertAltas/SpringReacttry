package com.springreact.spirngtry.repositories;

import com.springreact.spirngtry.Domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

    Project  findProjectByProjectIdentifer(String projectID);

    @Override
    Iterable<Project> findAll();
}
