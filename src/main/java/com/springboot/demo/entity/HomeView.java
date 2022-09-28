package com.springboot.demo.entity;

import lombok.Data;

import java.util.List;

@Data
public class HomeView {
    private int id;
    private String view;
    private List viewt;
    private String path;
    public int getId() {
        return id;
    }

    public String getView() {
        return view;
    }

    public List getViewt() {
        return viewt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setView(String view) {
        this.view = view;
    }

    public void setViewt(List viewt) {
        this.viewt = viewt;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
