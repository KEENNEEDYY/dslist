package com.desenvolvedorkennedy.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.desenvolvedorkennedy.dslist.entities.Game;

public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;


    public GameDTO() {
    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return this.id;
    } 

    public String getTitle() {
        return this.title;
    } 

    public Integer getYear() {
        return this.year;
    } 

    public String getImgUrl() {
        return this.imgUrl;
    } 

    public String getShortDescription() {
        return this.shortDescription;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getPlatforms() {
        return this.platforms;
    }

    public Double getScore() {
        return this.score;
    }

   public String getLongDescription() {
        return this.longDescription;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }
    public void setScore(Double score) {
        this.score = score;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    
}
