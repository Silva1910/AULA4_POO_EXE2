package view;

import controller.EstudanteSuperiorController;
import controller.EstudanteTecnicoController;
import model.EstudanteSuperior;
import model.EstudanteTecnico;

public class Principal {

	public static void main(String[] args) {
		EstudanteSuperior estudantesuperior  = new EstudanteSuperior();
		EstudanteTecnico  estudantetecnico  = new EstudanteTecnico();
		
		EstudanteSuperiorController estudantesuperiorcontroller  = new EstudanteSuperiorController();
		EstudanteTecnicoController  estudantetecnicocontroller  = new EstudanteTecnicoController();
	
		
		estudantesuperior.setRA("12345678");
		estudantesuperior.setEmail("fateczl@gmail.com");
		estudantesuperior.setInstituicaoSegundoGrau("fatec Zl");
		estudantesuperior.setAnoConclusaoSegundoGrau(2025);
		estudantesuperior.setNome("amos");
		estudantesuperior.setMediaNotas(10f);
		estudantesuperior.setQtdAprovacoes("10");
		
		 estudantetecnico.setRA("910111");
		 estudantetecnico.setEmail("eteczl@gmail.com");
		 estudantetecnico.setNome("silva");
		 estudantetecnico.setMediaNotas(10f);
		 estudantetecnico.setQtdAprovacoes("10");
		 estudantetecnico.setInstituicaoTecnico("Etec Zl");	
		 
		 
		 double tempSupProgre = estudantesuperiorcontroller.percentualProgressao(estudantesuperior);
		 double tempSupPercent = estudantesuperiorcontroller.percentualRendimento(estudantesuperior);

		 double tempTecProgre = estudantetecnicocontroller.percentualProgressao(estudantetecnico);
		 double tempTecPercent =estudantetecnicocontroller.percentualRendimento(estudantetecnico);
		
		 
	    System.out.println("ALUNO SUPERIOR" ); 
		System.out.println("o nome do aluno e " + estudantesuperior.getNome()  );
		System.out.println("a instituicao e " + estudantesuperior.getInstituicaoSegundoGrau()  );
		System.out.println("o email  e " + estudantesuperior.getEmail()  );
		System.out.println("o RA e " + estudantesuperior.getRA()  );
		System.out.println("o ano de conclusao e " + estudantesuperior.getAnoConclusaoSegundoGrau()  );
		System.out.println("a quantidade de aprovacoes " + estudantesuperior.getQtdAprovacoes()  );
		System.out.println("a media de notas e " + estudantesuperior.getMediaNotas()  );
		System.out.println("o percentual de progressao e  " + tempSupProgre  );
		System.out.println("o percentual de rendimento e  " + tempSupPercent  );
		System.out.println("**************************************************************************" );
	
		System.out.println("ALUNO TECNICO" ); 
		System.out.println("o nome do aluno e " + estudantetecnico.getNome()  );
		System.out.println("a instituicao e " + estudantetecnico.getInstituicaoTecnico()  );
		System.out.println("o email  e " + estudantetecnico.getEmail()  );
		System.out.println("o RA e " + estudantetecnico.getRA()  );
		System.out.println("a quantidade de aprovacoes " + estudantetecnico.getQtdAprovacoes()  );
		System.out.println("a media de notas e " + estudantetecnico.getMediaNotas()  );
		System.out.println("o percentual de progressao e  " + tempTecProgre  );
		System.out.println("o percentual de rendimento e  " + tempTecPercent  );
		System.out.println("**************************************************************************" );
	
	
	
	
	
	
	
	}

}
