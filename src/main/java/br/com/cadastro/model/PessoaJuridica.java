package br.com.cadastro.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="TB_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa{

	private static final long serialVersionUID = 1L;

	@Column(name="RAZAO_SOCIAL")
	private String razaoSocial;
	
	@Column(name="CNPJ")	
	private String CNPJ;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DT_FUNDACAO")
	private Calendar dataFundacao;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public Calendar getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Calendar dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	
}
