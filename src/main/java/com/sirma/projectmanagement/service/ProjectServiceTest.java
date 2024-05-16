package com.sirma.projectmanagement.service;

import com.sirma.projectmanagement.entity.Project;
import com.sirma.projectmanagement.repository.ProjectRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class ProjectServiceTest {

    @Mock
    private ProjectRepository projectRepository;

    @InjectMocks
    private ProjectService projectService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetProjectById() {
        // Given
        Long projectId = 1L;
        Project project = new Project();
        project.setId(projectId);
        when(projectRepository.findById(projectId)).thenReturn(Optional.of(project));

        // When
        Optional<Project> result = projectService.getProjectById(projectId);

        // Then
        assertEquals(projectId, result.get().getId());
    }

    @Test
    void testGetAllProjects() {
        // Given
        List<Project> projects = new ArrayList<>();
        projects.add(new Project(1L, "Project 1", "Description 1", LocalDate.now(), LocalDate.now()));
        projects.add(new Project(2L, "Project 2", "Description 2", LocalDate.now(), LocalDate.now()));
        when(projectRepository.findAll()).thenReturn(projects);

        // When
        List<Project> result = projectService.getAllProjects();

        // Then
        assertEquals(2, result.size());
    }

    @Test
    void testCreateProject() {
        // Given
        Project project = new Project();
        project.setName("New Project");
        project.setDescription("New Description");

        // When
        when(projectRepository.save(project)).thenReturn(project);
        Project createdProject = projectService.createProject(project);

        // Then
        assertEquals(project.getName(), createdProject.getName());
        assertEquals(project.getDescription(), createdProject.getDescription());
    }

    @Test
    void testUpdateProject() {
        // Given
        Long projectId = 1L;
        Project existingProject = new Project();
        existingProject.setId(projectId);
        existingProject.setName("Existing Project");
        existingProject.setDescription("Existing Description");

        Project updatedProject = new Project();
        updatedProject.setId(projectId);
        updatedProject.setName("Updated Project");
        updatedProject.setDescription("Updated Description");

        when(projectRepository.findById(projectId)).thenReturn(Optional.of(existingProject));
        when(projectRepository.save(existingProject)).thenReturn(updatedProject);

        // When
        Project result = projectService.updateProject(projectId, updatedProject);

        // Then
        assertEquals(updatedProject.getName(), result.getName());
        assertEquals(updatedProject.getDescription(), result.getDescription());
    }

    @Test
    void testDeleteProject() {
        // Given
        Long projectId = 1L;

        // When
        projectService.deleteProject(projectId);

        // Then
        verify(projectRepository, times(1)).deleteById(projectId);
    }
}

