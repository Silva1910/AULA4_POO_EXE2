package model;

public abstract class Estudante {
	private String RA;
	private String nome;
	private String email;
	private float mediaNotas;
	private String qtdAprovacoes;

	public Estudante() {
		// TODO Auto-generated constructor stub
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String ra) {
		RA = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getMediaNotas() {
		return mediaNotas;
	}

	public void setMediaNotas(float mediaNotas) {
		this.mediaNotas = mediaNotas;
	}

	public String getQtdAprovacoes() {
		return qtdAprovacoes;
	}

	public void setQtdAprovacoes(String qtdAprovacoes) {
		this.qtdAprovacoes = qtdAprovacoes;
	}


}
