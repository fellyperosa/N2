package br.com.fellyperrosa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.fellyperrosa.model.Film;

@Repository
public interface FilmRepository extends CrudRepository<Film, Integer> {

}