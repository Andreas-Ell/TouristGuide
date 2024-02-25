package com.example.touristguide.repository;

import com.example.touristguide.model.TouristAttraction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    ArrayList<TouristAttraction> touristAttractions = new ArrayList<>(List.of(
            new TouristAttraction("Navn ", "Beskrivelse"),
            new TouristAttraction("Tivoli ", "Forlystelsespark i centrum af København"),
            new TouristAttraction("Zoo ", "En park med forskellige dyr på Frederiksberg")
    ));


    public ArrayList<TouristAttraction> getTouristAttractions() {
        return touristAttractions;
    }


    public void addAttraction(String name, String description) {
        TouristAttraction newAttraction = new TouristAttraction(name, description);
        touristAttractions.add(newAttraction);
    }






}
