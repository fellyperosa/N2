package br.com.fellyperrosa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fellyperrosa.model.Film;
import br.com.fellyperrosa.repository.FilmRepository;

@Service
public class FilmService {
    @Autowired
    private FilmRepository filmRepository;

    public Film insert(Film film) {
        return filmRepository.save(film);
    }

    public Film update(Film objFilm) {
        return filmRepository.save(objFilm);
    }

    public List<Film> findAll() {
        List<Film> films = new ArrayList<>();
        filmRepository.findAll().forEach(films::add);
        return films;
    }

    public Optional<Film> findOne(Integer id) {
        return filmRepository.findById(id);
    }

    public void remove(Integer id) {
        filmRepository.deleteById(id);
    }
}