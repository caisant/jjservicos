package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.DAO;
import dao.DAOImpl;
import entity.Cliente;

@ManagedBean //pode ser nomeado colocando entre parenteses
@SessionScoped //uma linguagem para cada seção
public class CadastroMB implements Serializable{
	private Cliente cliente = new Cliente();
	private List<Cliente> lista = new ArrayList<Cliente>();
	private DAO daoMsg = new DAOImpl();
	
	public void enviar(){
		daoMsg.adicionar(cliente);
		
		System.out.println("Enviar Formulário:");
		System.out.println(cliente.getNome());
		System.out.println(cliente.getSobrenome());
		System.out.println(cliente.getEmail());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getMensagem());
		
		
		
		cliente.setNome("");
		cliente.setSobrenome("");
		cliente.setEmail("");
		cliente.setTelefone("");
		cliente.setMensagem("");
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Cliente> getLista() {
		return null;
	}

	public void setLista(List<Cliente> lista) {
		this.lista = lista;
	}
	
	

	
	
}
