package br.com.devlucassilva.workshop.services;

import br.com.devlucassilva.workshop.entities.Category;
import br.com.devlucassilva.workshop.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {return categoryRepository.findAll();}

    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
