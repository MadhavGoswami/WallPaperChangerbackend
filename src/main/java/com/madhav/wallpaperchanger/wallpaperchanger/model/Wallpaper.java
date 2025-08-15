package com.madhav.wallpaperchanger.wallpaperchanger.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Wallpaper{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String imageURL;

    public Wallpaper(){}

    public Wallpaper(String title,String imageURL){
        this.title=title;
        this.imageURL=imageURL;
    }

    public long getId(){
           return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getImageURL(){
        return imageURL;
    }
    public void setImageURL(String imageURL){
        this.imageURL=imageURL;
    }

    @Override
    public String toString(){
        return "Wallpaper{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", imageUrl='" + imageURL + '\'' +
                '}';

    }

}
