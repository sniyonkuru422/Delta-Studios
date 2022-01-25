package com.example.DeltaStudios.controller;

import com.example.DeltaStudios.entity.Tracks;
import com.example.DeltaStudios.repository.TracksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TracksController {
    @Autowired
    private TracksRepository repository;

    @GetMapping("/Tracks")
    public String viewTrack(Model model) {
        model.addAttribute("TracksList", repository.findAll());
        return "Tracks";
    }
    @PostMapping("/addTra")
    public String addTra(Tracks tracks, Model model) {
        model.addAttribute("track", new Tracks());
        repository.save(tracks);
        return "redirect:/Tracks";
    }

    @GetMapping("/delete3/{id}")
    public String delTrack(@PathVariable("id") Integer id) {
        repository.deleteById(id);
        return "redirect:/Producers";
    }

    @GetMapping("/edit3/{id}")
    public String editTrack(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("track", repository.findById(id).get());
        model.addAttribute("TracksList", repository.findAll());
        return "editTracks";
    }
}

