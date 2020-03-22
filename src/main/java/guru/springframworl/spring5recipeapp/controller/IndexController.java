package guru.springframworl.spring5recipeapp.controller;

import guru.springframworl.spring5recipeapp.domain.Category;
import guru.springframworl.spring5recipeapp.domain.Recipe;
import guru.springframworl.spring5recipeapp.domain.UnitOfMeasure;
import guru.springframworl.spring5recipeapp.repositories.CategoryRepository;
import guru.springframworl.spring5recipeapp.repositories.UnitOfMeasureRepository;
import guru.springframworl.spring5recipeapp.services.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.swing.*;
import java.util.Optional;
@Slf4j
@Controller
public class IndexController {
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index.html","/index"})
    public String index(Model model){
        log.debug("Getting Index Page");
        model.addAttribute("recipes", recipeService.getRecipes());
        return "index";
    }
}
