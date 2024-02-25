package com.example.touristguide.service;

import com.example.touristguide.model.TouristAttraction;
import com.example.touristguide.repository.TouristRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TouristService {


    TouristRepository rp = new TouristRepository();

    public ArrayList<TouristAttraction> getTouristAttractionsFromService() {
        return rp.getTouristAttractions();
    }









}
