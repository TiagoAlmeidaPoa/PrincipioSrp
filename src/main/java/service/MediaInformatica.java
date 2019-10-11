package service;

import entities.Aluno;
import entities.Situacao;

public class MediaInformatica implements Media {

	public Enum calcula(Aluno aluno) {
		
		if (aluno.getNota() > 7.0) {
			return Situacao.APROVADO;
		} else {
			return Situacao.REPROVADO;
		}
	}
}
