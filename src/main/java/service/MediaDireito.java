package service;

import entities.Aluno;
import entities.Situacao;

public class MediaDireito implements Media{

	public Enum calcula(Aluno aluno) throws Exception {
		
		if(aluno.getNota() > 10 || aluno.getNota() < 0) {
			throw new Exception("Nota invalida");
		}

		if (aluno.getNota() > 6.0) {
			return Situacao.APROVADO;
		} else {
			return Situacao.REPROVADO;
		}
	}

}
