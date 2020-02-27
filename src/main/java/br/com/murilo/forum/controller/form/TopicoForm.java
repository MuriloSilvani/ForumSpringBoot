package br.com.murilo.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.murilo.forum.model.Curso;
import br.com.murilo.forum.model.Topico;
import br.com.murilo.forum.repository.CursoRepository;

public class TopicoForm {

	@NotNull @NotEmpty @Length(min = 1)
	private String titulo;
	@NotNull @NotEmpty @Length(min = 1)
	private String mensagem;
	@NotNull @NotEmpty
	private String nomeCurso;
	
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public Topico converter(CursoRepository cursoRepository) {

		Curso curso = cursoRepository.findByNome(nomeCurso);
		
		return new Topico(titulo, mensagem, curso);
	}
}
