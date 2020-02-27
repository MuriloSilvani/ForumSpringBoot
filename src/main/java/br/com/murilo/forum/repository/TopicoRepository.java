package br.com.murilo.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.murilo.forum.model.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCursoNome(String nomeCurso);

//	// Faz a mesma coisa mas implementando o select
//	// JpaRepository tem os metodos de CRUP ja feitos p/ ajudar
//	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
//	List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);
}
