package com.example.touristguide.service;

import com.example.touristguide.model.TouristAttraction;
import com.example.touristguide.repository.TouristRepository;
import com.example.touristguide.repository.TouristRepository_DB;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TouristService {



    private TouristRepository_DB rp;

    public TouristService(TouristRepository_DB rp) {
        this.rp = rp;
    }


    public ArrayList<TouristAttraction> getTouristAttractionsFromService() {
        return rp.getTouristAttractions();
    }


    public void deleteAttractionFromService(String object) {
        rp.deleteAttraction(object);
    }












}
