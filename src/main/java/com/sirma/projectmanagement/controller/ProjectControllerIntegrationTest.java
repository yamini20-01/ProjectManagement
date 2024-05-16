package com.sirma.projectmanagement.controller;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class ProjectControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateProject() throws Exception {
        String jsonBody = "{\"name\":\"Test Project\",\"description\":\"Test Description\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/projects")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonBody))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.name").value("Test Project"));
    }

    @Test
    public void testGetAllProjects() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/projects"))
                .andExpect(status().isOk());

    }

    @Test
    public void testGetProjectById() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/projects/{id}", 1L))
                .andExpect(status().isOk());

    }

    @Test
    public void testUpdateProject() throws Exception {
        String jsonBody = "{\"name\":\"Updated Project\",\"description\":\"Updated Description\"}";
        mockMvc.perform(MockMvcRequestBuilders.put("/projects/{id}", 1L)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonBody))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Updated Project"));
    }

    @Test
    public void testDeleteProject() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.delete("/projects/{id}", 1L))
                .andExpect(status().isNoContent());
    }
}

