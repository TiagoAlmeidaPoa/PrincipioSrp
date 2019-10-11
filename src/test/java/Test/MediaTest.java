package Test;

import org.junit.Test;

import entities.Aluno;
import entities.Curso;
import entities.Situacao;
import junit.framework.TestCase;
import service.Media;
import service.MediaDireito;
import service.MediaInformatica;
import service.MediaMedicina;

public class MediaTest extends TestCase {

	@Test
	public void testeCursoDireitoAcimaDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 6.1;

		Aluno aluno = new Aluno(nome, nota, Curso.DIREITO);

		Media media = new MediaDireito();

		assertEquals(Situacao.APROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoDireitoAbaixoDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 6.0;

		Aluno aluno = new Aluno(nome, nota, Curso.DIREITO);

		Media media = new MediaDireito();

		assertEquals(Situacao.REPROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoInformaticaAcimaDaMedia() throws Exception {

		String nome = "Maria";
		double nota = 7.5;

		Aluno aluno = new Aluno(nome, nota, Curso.INFORMATICA);

		Media media = new MediaInformatica();

		assertEquals(Situacao.APROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoInformaticaAbaixoDaMedia() throws Exception {

		String nome = "Maria";
		double nota = 6.5;

		Aluno aluno = new Aluno(nome, nota, Curso.INFORMATICA);

		Media media = new MediaInformatica();

		assertEquals(Situacao.REPROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoMedicinaAcimaDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 8.5;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		Media media = new MediaMedicina();

		assertEquals(Situacao.APROVADO, media.calcula(aluno));

	}

	@Test
	public void testeCursoMedicinaAbaixoDaMedia() throws Exception {

		String nome = "Carlos";
		double nota = 7.0;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		Media media = new MediaMedicina();

		assertEquals(Situacao.REPROVADO, media.calcula(aluno));

	}

	@Test
	public void testeNotaInvalidaAcimaDeDez() {

		String nome = "Carlos";
		double nota = 11.0;

		Aluno aluno = new Aluno(nome, nota, Curso.MEDICINA);

		Media media = new MediaMedicina();

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

		Media media = new MediaMedicina();

		try {
			media.calcula(aluno);
			fail("exception não lançada");
		} catch (Exception e) {
			assertEquals("Nota invalida", e.getMessage());
		}

	}

}
