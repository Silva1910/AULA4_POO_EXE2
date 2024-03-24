package controller;

import model.Estudante;

public class EstudanteTecnicoController implements IEstudanteController {

	public EstudanteTecnicoController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double percentualRendimento(Estudante est) {
		return  est.getMediaNotas() *  Integer.parseInt(est.getQtdAprovacoes()) * 0.931;
		
	}

	@Override
	public double percentualProgressao(Estudante est) {
		return Double.parseDouble(est.getQtdAprovacoes()) / 3;
		
	}
	

}
