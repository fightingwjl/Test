package com.example.bilibilishouye.bean;

public class television {
    private  int image;
    private String title;

    public television(int image, String title){
        this.image = image;
        this.title = title;
    }

    public int getImage(){
        return image;
    }

    public void setImage(){
        this.image = image;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(){
        this.title = title;
    }
}
