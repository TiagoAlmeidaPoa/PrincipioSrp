package Test;

import org.junit.Test;

import application.Media;
import entities.Aluno;
import entities.Curso;
import junit.framework.TestCase;

public class MediaTest extends TestCase {

	@Test
	public void testeCursoDireitoAcimaDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 6.1;

		Aluno aluno = new Aluno(nome, nota, Curso.DIREITO);

		Media media = new Media();

		assertEquals(Curso.APROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoDireitoAbaixoDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 6.0;

		Aluno aluno = new Aluno(nome, nota, Curso.DIREITO);

		Media media = new Media();

		assertEquals(Curso.REPROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoInformaticaAcimaDaMedia() throws Exception {

		String nome = "Maria";
		double nota = 7.5;

		Aluno aluno = new Aluno(nome, nota, Curso.INFORMATICA);

		Media media = new Media();

		assertEquals(Curso.APROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoInformaticaAbaixoDaMedia() throws Exception {

		String nome = "Maria";
		double nota = 6.5;

		Aluno aluno = new Aluno(nome, nota, Curso.INFORMATICA);

		Media media = new Media();

		assertEquals(Curso.REPROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoMedicinaAcimaDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 8.5;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		Media media = new Media();

		assertEquals(Curso.APROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoMedicinaAbaixoDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 7.0;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		Media media = new Media();

		assertEquals(Curso.REPROVADO, media.calcula(aluno));

	}

	@Test
	public void testeNotaInvalidaAcimaDeDez() {

		String nome = "Carlos";
		double nota = 11.0;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		Media media = new Media();

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}

	}
	
	@Test
	public void testeNotaInvalidaAbaixoDeZero() {

		String nome = "Carlos";
		double nota = -1.0;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		Media media = new Media();

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}

	}

}
