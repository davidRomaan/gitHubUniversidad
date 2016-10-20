package co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.implementacion.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import co.edu.eam.ingesoft.desarrollo.banco.persistencia.dao.definiciones.IDAOCuenta;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cliente;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.modelo.entidades.Cuenta;
import co.edu.eam.ingesoft.desarrollo.banco.persistencia.utilidades.AdministradorEntityManager;

public class DAOCUentaJPA implements IDAOCuenta {

	public void crear(Cuenta cuenta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.persist(cuenta);

		em.getTransaction().commit();

	}

	public void editar(Cuenta cuenta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.merge(cuenta);

		em.getTransaction().commit();
	}

	public void borrar(Cuenta cuenta) throws Exception {
		EntityManager em = AdministradorEntityManager.getEntityManager();

		em.getTransaction().begin();

		em.remove(cuenta);

		em.getTransaction().commit();
	}

	public Cuenta buscar(String numero) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();

		return em.find(Cuenta.class, numero);
	}

	public List<Cuenta> listarCuentasCLiente(Cliente c) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Cuenta.CONSULTA_LISTAR_CUENTAS_POR_CLIENTE);
		q.setParameter(1, c);
		return q.getResultList();
	}

	public double sumaSaldosCliente(Cliente c) throws Exception {

		EntityManager em = AdministradorEntityManager.getEntityManager();
		Query q = em.createNamedQuery(Cuenta.CONSULTA_SUMA_SALDO_CUENTA_CLIENTE);
		q.setParameter(1, c);
		List<Double> lista = q.getResultList();
		if (lista.isEmpty()) {
			return 0;
		}else{
			if(lista.get(0)!=null){
			return lista.get(0);
			}else{
				return 0;
			}
		}
	}

}
