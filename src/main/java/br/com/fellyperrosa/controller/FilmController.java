package br.com.fellyperrosa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fellyperrosa.model.Film;
import br.com.fellyperrosa.service.FilmService;

@Controller
@RequestMapping("/films")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @GetMapping("/forminsert")
    public String insert(Model model) {
    	Film film = new Film();
        model.addAttribute("film", film);
        return "films/insert";
    }

    @GetMapping("/list")
    public String list(Model model) {
        List<Film> films = filmService.findAll();
        model.addAttribute("films", films);
        return "films/list";
    }

    @PostMapping("/insert")
    public String insert(@ModelAttribute("film") Film film) {
        Film resultFilm = filmService.insert(film);
        if (resultFilm != null) {
            return "films/success";
        }
        return "films/error";
    }
}