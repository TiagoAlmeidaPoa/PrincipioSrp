package application;

import entities.Aluno;
import entities.Curso;

public class Media {

	public Enum calcula(Aluno aluno) throws Exception {
		
		if(aluno.getNota() > 10 || aluno.getNota() < 0) {
			throw new Exception("Nota invalida");
		}
		
		if (Curso.DIREITO.equals(aluno.getCurso())) {

			if (aluno.getNota() > 6.0) {
				return Curso.APROVADO;
			} else {
				return Curso.REPROVADO;
			}

		} else if (Curso.INFORMATICA.equals(aluno.getCurso())) {
			if (aluno.getNota() > 7.0) {
				return Curso.APROVADO;
			} else {
				return Curso.REPROVADO;
			}
		} else {
			if (aluno.getNota() > 8.0) {
				return Curso.APROVADO;
			} else {
				return Curso.REPROVADO;
			}
		}

	}

}
