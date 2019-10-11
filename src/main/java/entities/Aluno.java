package entities;

public class Aluno {
	
	private String nome;
	private double nota;
	private Curso curso;

	public Aluno(String nome, double nota, Curso curso) {
		this.nome = nome;
		this.nota = nota;
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}



	public Curso getCurso() {
		return curso;
	}


	
	

}
