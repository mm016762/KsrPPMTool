package com.ppmtool.ppmtoolfullstack.services;

import com.ppmtool.ppmtoolfullstack.domain.Project;
import com.ppmtool.ppmtoolfullstack.exceptions.ProjectIdException;
import com.ppmtool.ppmtoolfullstack.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
         try{
             project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
             return projectRepository.save(project);
         }catch (Exception e){
           throw new ProjectIdException("Project Id '"+project.getProjectIdentifier().toUpperCase()+"' already  exists");
         }

    }
}
