package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Daniel Machado", "121046088");
		Pessoa p2 = new Pessoa(null, "Pedro Mion", "121068342");
		Pessoa p3 = new Pessoa(null, "Camila Caleones", "121223567");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("crudagendamento");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto!");
	}

}
