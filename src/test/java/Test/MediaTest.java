package Test;

import org.junit.Test;

import entities.Aluno;
import entities.Curso;
import entities.Situacao;
import junit.framework.TestCase;
import service.Media;

public class MediaTest extends TestCase {
	
	private Media media = new Media();	

	@Test
	public void testeCursoDireitoAcimaDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 6.1;

		Aluno aluno = new Aluno(nome, nota, Curso.DIREITO);

		assertEquals(Situacao.APROVADO, media.calcula(aluno));
	}

	@Test
	public void testeCursoDireitoAbaixoDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 6.0;

		Aluno aluno = new Aluno(nome, nota, Curso.DIREITO);

		assertEquals(Situacao.REPROVADO, media.calcula(aluno));
	}

	@Test
	public void testeNotaDireitoInvalidaAcimaDeDez() {

		String nome = "Carlos";
		double nota = 11.0;

		Aluno aluno = new Aluno(nome, nota, Curso.DIREITO);

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}
	}

	@Test
	public void testeNotaDireitoInvalidaAbaixoDeZero() {

		String nome = "Carlos";
		double nota = -1.0;

		Aluno aluno = new Aluno(nome, nota, Curso.DIREITO);

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}
	}

	@Test
	public void testeCursoInformaticaAcimaDaMedia() throws Exception {

		String nome = "Maria";
		double nota = 7.5;

		Aluno aluno = new Aluno(nome, nota, Curso.INFORMATICA);

		assertEquals(Situacao.APROVADO, media.calcula(aluno));
	}

	@Test
	public void testeCursoInformaticaAbaixoDaMedia() throws Exception {

		String nome = "Maria";
		double nota = 6.5;

		Aluno aluno = new Aluno(nome, nota, Curso.INFORMATICA);

		assertEquals(Situacao.REPROVADO, media.calcula(aluno));
	}

	@Test
	public void testeNotaInformaticaInvalidaAcimaDeDez() {

		String nome = "Carlos";
		double nota = 11.0;

		Aluno aluno = new Aluno(nome, nota, Curso.INFORMATICA);

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}
	}

	@Test
	public void testeNotaInformaticaInvalidaAbaixoDeZero() {

		String nome = "Carlos";
		double nota = -1.0;

		Aluno aluno = new Aluno(nome, nota, Curso.INFORMATICA);

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}

	}

	@Test
	public void testeCursoMedicinaAcimaDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 8.5;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		assertEquals(Situacao.APROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoMedicinaAbaixoDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 7.0;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		assertEquals(Situacao.REPROVADO, media.calcula(aluno));

	}

	@Test
	public void testeNotaMedicinaInvalidaAcimaDeDez() {

		String nome = "Carlos";
		double nota = 11.0;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}

	}

	@Test
	public void testeNotaMedicinaInvalidaAbaixoDeZero() {

		String nome = "Carlos";
		double nota = -1.0;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}

	}

}
