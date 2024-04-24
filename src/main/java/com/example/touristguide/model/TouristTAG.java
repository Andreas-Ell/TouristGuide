package com.example.touristguide.model;

public class TouristTAG {

    private int tagID;
    private String tagNameOne;
    private String tagNameTwo;
    private String tagNameThree;

    public TouristTAG(int tagID, String tagNameOne, String tagNameTwo, String tagNameThree) {
        this.tagID = tagID;
        this.tagNameOne = tagNameOne;
        this.tagNameTwo = tagNameTwo;
        this.tagNameThree = tagNameThree;
    }


    public int getTagID() {
        return tagID;
    }


    public String getTagNameOne() {
        return tagNameOne;
    }


    public String getTagNameTwo() {
        return tagNameTwo;
    }


    public String getTagNameThree() {
        return tagNameThree;
    }


    public void setTagNameOne(String newTagNameOne) {
        tagNameOne = newTagNameOne;
    }


    public void setTagNameTwo(String newTagNameTwo) {
        tagNameTwo = newTagNameTwo;
    }


    public void setTagNameThree(String newTagNameThree) {
        tagNameThree = newTagNameThree;
    }

}
