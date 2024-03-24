package controller;

import model.Estudante;

public class EstudanteSuperiorController implements IEstudanteController{

	public EstudanteSuperiorController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double percentualRendimento(Estudante est) {
		return  est.getMediaNotas() *  Integer.parseInt(est.getQtdAprovacoes()) * 0.972;
		
	}

	@Override
	public double percentualProgressao(Estudante est) {
		return Double.parseDouble(est.getQtdAprovacoes()) / 6;
		
	}


	
	
}
