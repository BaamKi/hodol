package com.example.blog.request;

public class PostCreate {

    public String title;
    public String content;



    @Override
    public String toString() {
        return "PostCreate{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
