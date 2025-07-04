package dev.java.Nite.EstudoSprig.service;

import dev.java.Nite.EstudoSprig.model.Food;
import dev.java.Nite.EstudoSprig.repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //Listar
    public List<Food> getAll() {return foodRepository.findAll();}
    //Criar
    public Food save(Food food) {return  foodRepository.save(food);}
    //Deletar
    public void deletar(Long id){foodRepository.deleteById(id);}
}
