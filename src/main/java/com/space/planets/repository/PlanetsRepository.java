package com.space.planets.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

@Repository
public class PlanetsRepository {

    Properties properties;

    public PlanetsRepository() {
         this.properties = ConfigLoader.loadConfig();
    }

    public void getAllPlanets() {
        System.out.println("getting all planets");
    }

}
