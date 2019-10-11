package service;

import entities.Aluno;
import entities.Situacao;

public class MediaDireito implements Media{

	public Enum calcula(Aluno aluno) {

		if (aluno.getNota() > 6.0) {
			return Situacao.APROVADO;
		} else {
			return Situacao.REPROVADO;
		}
	}

}
