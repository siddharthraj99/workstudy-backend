package com.klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data")
@CrossOrigin(origins = "http://localhost:5173")
public class ModelController {

    @Autowired
    private ModelRepository repo;

    @GetMapping
    public List<Model> getAll() {
        return repo.findAll();
    }

    // POST
    @PostMapping
    public Model add(@RequestBody Model m) {
        return repo.save(m);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}