package com.abadarau.tourguider.domain.entities;

import java.io.Serializable;

public class BratislavaAttraction implements Serializable{
    private String name;
    private int descriptionId;
    private int pictureId;

    public BratislavaAttraction(String name, int descriptionId, int pictureId) {
        this.name = name;
        this.descriptionId = descriptionId;
        this.pictureId = pictureId;
    }

    public BratislavaAttraction(String name, int descriptionId) {
        this.name = name;
        this.descriptionId = descriptionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(int descriptionId) {
        this.descriptionId = descriptionId;
    }

    public int getPictureId() {
        return pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }
}
