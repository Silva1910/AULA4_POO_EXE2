package controller;

import model.Estudante;

public interface IEstudanteController {
	public abstract double percentualRendimento(Estudante est);
	public abstract double percentualProgressao(Estudante est);
}
