package com.example.demo.repository;

import com.example.demo.model.Model;

import java.util.ArrayList;

public class Repository {
    static ArrayList<Model> list = new ArrayList<>();
    static{
        list.add(new Model(1, "vu", "13-7-1997", "da nang", "zalo_last_screenshot.png"));
        list.add(new Model(2, "vu", "13-7-1997", "da nang", "E:\\CodeGym\\demo\\zalo_last_screenshot.png"));
        list.add(new Model(3, "vu", "13-7-1997", "da nang", "E:\\CodeGym\\demo\\zalo_last_screenshot.png"));
        list.add(new Model(4, "vu", "13-7-1997", "da nang", "E:\\CodeGym\\demo\\zalo_last_screenshot.png"));
        list.add(new Model(5, "vu", "13-7-1997", "da nang", "E:\\CodeGym\\demo\\zalo_last_screenshot.png"));
        list.add(new Model(6, "vu", "13-7-1997", "da nang", "E:\\CodeGym\\demo\\zalo_last_screenshot.png"));
    }
    public ArrayList<Model> display(){
        return list;
    }
}
