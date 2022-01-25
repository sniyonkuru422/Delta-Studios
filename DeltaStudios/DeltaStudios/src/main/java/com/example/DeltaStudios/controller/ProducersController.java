package com.example.DeltaStudios.controller;



import com.example.DeltaStudios.entity.Producers;
import com.example.DeltaStudios.repository.ProducersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProducersController {
    @Autowired
    private ProducersRepository repository;

    @GetMapping("/Producers")
    public String viewProducer(Model model) {
        model.addAttribute("ProducersList", repository.findAll());
        return "Producers";
    }
    @PostMapping("/addPro")
    public String addProd(Producers producers, Model model) {
        model.addAttribute("producer", new Producers());
        repository.save(producers);
        return "redirect:/Producers";
    }

    @GetMapping("/delete2/{id}")
    public String delProducer(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return "redirect:/Producers";
    }

    @GetMapping("/edit2/{id}")
    public String editProducer(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("producer", repository.findById(id).get());
        model.addAttribute("ProducersList", repository.findAll());
        return "editProducers";
    }
}

