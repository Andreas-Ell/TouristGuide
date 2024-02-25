package com.example.touristguide.controller;

import com.example.touristguide.model.TouristAttraction;
import com.example.touristguide.service.TouristService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class TouristController {

    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }



    @GetMapping("/attractions")
    public String showList(Model model) {
        List<TouristAttraction> touristAttractions = touristService.getTouristAttractionsFromService();
        model.addAttribute("touristAttractions", touristAttractions);
        return "attractionList";
    }

    /*
    @GetMapping("/attractions/{name}/tags")
    public String tags(Model model) {

    }




    @GetMapping("/attractions/add")
    public String showAddForm(Model model) {
        model.addAttribute("touristAttraction", new TouristAttraction());
        return "addAttraction";
    }


    @PostMapping("/attractions/save")
    public void save(Model model) {

    }


    @GetMapping("/attractions/{name}/edit")
    public String editName(Model model) {

    }


    @PostMapping("/attractions/update")
    public void update(Model model) {

    }



    @GetMapping("attractions/{name}/delete")
    public void delete(Model model) {

    }

     */


}
