package br.com.murilo.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murilo.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
