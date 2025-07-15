package dev.java.Nite.EstudoSprig.controller;

import dev.java.Nite.EstudoSprig.model.Food;
import dev.java.Nite.EstudoSprig.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    //injeção de dependencia
    private final FoodService service;

    public FoodController(FoodService service) {
        this.service = service;
    }

    @GetMapping
    public List<Food> getAll() {return service.getAll();}

    @PostMapping
    public Food create(@RequestBody Food food) {return service.save(food);}

    @DeleteMapping("/{id}")
    public void delete (@PathVariable Long id){service.deletar(id);}
}
