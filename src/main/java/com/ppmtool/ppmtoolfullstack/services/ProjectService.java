package com.ppmtool.ppmtoolfullstack.services;

import com.ppmtool.ppmtoolfullstack.domain.Project;
import com.ppmtool.ppmtoolfullstack.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){

        return projectRepository.save(project);
    }
}
