package fabrica.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * @author gabriel
 * @version 1.0.0
 * 
 *          Implementacao de transacao unsando framework Hibernate.
 */
public final class TransacaoHibernate extends ProvedorTransacao {

	/*
	 * Entity manager referente a base dados mapeada em nosso arquivo de
	 * configuração persistence.xml.
	 */
	private static EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("portal-transparencia");

	public void tx(final BlocoTransacao b) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		b.exc(em);
		em.getTransaction().commit();
		em.close();
	}


	public Object txr(BlocoTransacaoRetorno b) {
		final Object o;
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		o = b.exc(em);
		em.getTransaction().commit();
		em.close();
		return o;
	}
}
