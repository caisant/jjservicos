package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Cliente;

public interface DAO {
	public void adicionar(Cliente cliente);
	public List<Cliente> lista = new ArrayList<Cliente>();
	
}
