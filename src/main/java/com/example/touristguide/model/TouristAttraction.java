package com.example.touristguide.model;

public class TouristAttraction {


        private int attractionID;
        private String attractionName;
        private String attractionDescription;


        public TouristAttraction(int attractionID, String attractionName, String attractionDescription) {
            this.attractionID = attractionID;
            this.attractionName = attractionName;
            this.attractionDescription = attractionDescription;
        }


        public int getAttractionID() {
            return attractionID;
        }


        public String getAttractionName() {
            return attractionName;
        }


        public String getAttractionDescription() {
            return attractionDescription;
        }


        public void setAttractionName(String newAttractionName) {
            attractionName = newAttractionName;
        }


        public void setAttractionDescription(String newAttractionDescription) {
            attractionDescription = newAttractionDescription;
        }






    }



