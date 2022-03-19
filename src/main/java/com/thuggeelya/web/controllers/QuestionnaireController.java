package com.thuggeelya.web.controllers;

import com.thuggeelya.app.services.QuestionnaireService;
import com.thuggeelya.web.dto.Capsule;
import com.thuggeelya.web.dto.Input;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/form")
public class QuestionnaireController {

    private final QuestionnaireService service;

    @Autowired
    public QuestionnaireController(QuestionnaireService service) {
        this.service = service;
    }

    @GetMapping()
    public String getQuestionnairePage(@NotNull Model model) {
        model.addAttribute("input", new Input());
        return "questionnaire";
    }

    @GetMapping("/train")
    public String ANNTrain() {
        service.ANNTraining();
        return "redirect:/form";
    }

    @GetMapping("/test")
    public String ANNTest() {
        String results = service.ANNTesting();
        return "redirect:/form";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute("input") Input input) {
        Capsule capsule = service.generateCapsule(input);
        return "redirect:/form";
    }
}
