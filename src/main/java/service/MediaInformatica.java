package service;

import entities.Aluno;
import entities.Situacao;

public class MediaInformatica implements Media {

	public Enum calcula(Aluno aluno) throws Exception {
		
		if(aluno.getNota() > 10 || aluno.getNota() < 0) {
			throw new Exception("Nota invalida");
		}
		
		if (aluno.getNota() > 7.0) {
			return Situacao.APROVADO;
		} else {
			return Situacao.REPROVADO;
		}
	}
}
