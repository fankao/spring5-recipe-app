package guru.springframworl.spring5recipeapp.services;

import guru.springframworl.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
    Recipe findById(Long l);
}
