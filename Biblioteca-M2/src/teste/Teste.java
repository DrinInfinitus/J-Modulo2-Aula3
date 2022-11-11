package teste;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Teste {
	
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DEVELOPMENT");
	public static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		System.out.println(em.isOpen());
		
		List<Livro> Livros= new ArrayList<Livro>();
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(1950, 0, 05);
		Livro livro = new Livro();
		livro.setAutor("CHARLIE DONLEA");
		livro.setTitulo("A GAROTA DO LAGO");
		livro.setDataPublicacao(calendar);
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(2012, 11, 17);
		Livro livro2 = new Livro();
		livro2.setAutor("MAXIME CHATTAM");
		livro2.setTitulo("LEVIATEMPO");
		livro2.setDataPublicacao(calendar2);
		
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(2005, 0, 17);
		Livro livro3 = new Livro();
		livro3.setAutor("JORDAN B. PETTERSON");
		livro3.setTitulo("12 REGRAS PARA A VIDA");
		livro3.setDataPublicacao(calendar3);
		
		Livros.add(livro);
		Livros.add(livro2);
		Livros.add(livro3);
	
//		try {
//			em.getTransaction().begin();
//			for(Livro livro5 : Livros) {
//				em.persist(livro5);
//			}
////			Livro livro3 = em.find(Livro.class, 5); //Para procurar um
//			em.getTransaction().commit();
////			System.out.println(livro3.toString()); //Para mostrar qual achou
//			
//		} catch (Exception e) {
//			System.err.print(e);
//		} finally {
//			em.close();
//		}

	}
	
	public static Query listarTodosLivros(){
		em.getTransaction().begin();
		Query query = em.createQuery("From Livro");
		em.getTransaction().commit();
		return query;
	}
	
}


