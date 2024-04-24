package com.example.touristguide;

import com.example.touristguide.controller.TouristController;
import com.example.touristguide.model.TouristAttraction;
import com.example.touristguide.service.TouristService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static java.lang.reflect.Array.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;


@WebMvcTest(TouristController.class)
public class ControllerTest {


    //private TouristAttraction touristAttraction = new TouristAttraction();


    @Autowired
    private MockMvc mockMvc;


    @MockBean
    private TouristService touristService;



/*
    @Test
    void showList() throws Exception {
        mockMvc.perform(get())
                .andExpect(status().isOk())
                .andExpect(view().name("attractionList"));
    }

 */






}


