package service;

import java.awt.Cursor;

import entities.Aluno;
import entities.Curso;
import entities.Situacao;

public class Media {

public Enum calcula(Aluno aluno) throws Exception {
			
		
		if(aluno.getNota() > 10 || aluno.getNota() < 0) {
			throw new Exception("Nota invalida");
		}

		if (aluno.getNota() > aluno.getCurso().getMedia()) {
			return Situacao.APROVADO;
		} else {
			return Situacao.REPROVADO;
		}
	}

}
