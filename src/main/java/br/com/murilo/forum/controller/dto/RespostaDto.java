package br.com.murilo.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.murilo.forum.model.Resposta;

public class RespostaDto {

	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAuthor;
	
	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeAuthor = resposta.getAutor().getNome();
	}

	public Long getId() {
		return id;
	}

	public String getMensagem() {
		return mensagem;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public String getNomeAuthor() {
		return nomeAuthor;
	}
	
	
	
	
}
