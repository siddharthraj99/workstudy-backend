package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    @Autowired
    private ModelRepository repo;

    public List<Model> getAll() {
        return repo.findAll();
    }

    public Model save(Model m) {
        return repo.save(m);
    }
}