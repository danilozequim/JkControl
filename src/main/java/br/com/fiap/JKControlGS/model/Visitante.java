package br.com.fiap.JKControlGS.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private LocalDate dataNascimento;
	private Long cpf;
	private Long rg;
	private char digitoRG;
	private LocalDate dataCadastro;
	private String imagePath;
	
	public Visitante() {
		super();
	}

	public Visitante(String name, LocalDate nascimento, Long cpf, Long rg, char digitoRG, LocalDate cadastro) {
		super();
		this.name = name;
		this.dataNascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.digitoRG = digitoRG;
		this.dataCadastro = cadastro;
	}

	public Visitante(Long id, String name, LocalDate nascimento, Long cpf, Long rg, char digitoRG, LocalDate cadastro) {
		super();
		this.id = id;
		this.name = name;
		this.dataNascimento = nascimento;
		this.cpf = cpf;
		this.rg = rg;
		this.digitoRG = digitoRG;
		this.dataCadastro = cadastro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getNascimento() {
		return dataNascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.dataNascimento = nascimento;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Long getRg() {
		return rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	public char getDigitoRG() {
		return digitoRG;
	}

	public void setDigitoRG(char digitoRG) {
		this.digitoRG = digitoRG;
	}

	public LocalDate getCadastro() {
		return dataCadastro;
	}

	public void setCadastro(LocalDate cadastro) {
		this.dataCadastro = cadastro;
	}
	
	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	@Override
	public String toString() {
		return "Visitante [id=" + id + ", name=" + name + ", nascimento=" + dataNascimento + ", cpf=" + cpf + ", rg=" + rg
				+ ", digitoRG=" + digitoRG + ", cadastro=" + dataCadastro + ", imagePath=" + imagePath + "]";
	}

}
