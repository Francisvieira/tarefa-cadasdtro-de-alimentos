package br.com.francisalimentosdb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class AlimentosModel {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idalimento;
	
	@Column(length=100,nullable=false)
	private String nomedoalimento;
	
	@Column(length=999,nullable=false)
	private String quantidade;

	public Long getIdalimento() {
		return idalimento;
	}
	public AlimentosModel() {
	}
	public AlimentosModel(Long idalimento, String nomedoalimento, String quantidade) {
		this.idalimento = idalimento;
		this.nomedoalimento = nomedoalimento;
		this.quantidade = quantidade;
	}

	public void setIdalimento(Long idalimento) {
		this.idalimento = idalimento;
	}

	public String getNomedoalimento() {
		return nomedoalimento;
	}

	public void setNomedoalimento(String nomedoalimento) {
		this.nomedoalimento = nomedoalimento;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	
	
	
}
