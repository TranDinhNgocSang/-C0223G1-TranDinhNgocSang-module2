package com.example.demo.service;

import com.example.demo.model.Model;
import com.example.demo.repository.Repository;

import java.util.ArrayList;

public class Service {
    Repository repository = new Repository();

    public ArrayList<Model> display(){
        return repository.display();
    }
}
