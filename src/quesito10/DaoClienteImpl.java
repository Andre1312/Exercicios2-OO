package quesito10;

import java.util.ArrayList;

public class DaoClienteImpl implements DaoCliente{
	
	// atributos
	private ArrayList<Cliente> lista = new ArrayList<Cliente>();
	
	private ConexaoImpl conexaoImpl;
	
	
	// getters/setters
	public ConexaoImpl getConexaoImpl() {
		return conexaoImpl;
	}

	public void setConexaoImpl(ConexaoImpl conexaoImpl) {
		this.conexaoImpl = conexaoImpl;
	}

	public ArrayList<Cliente> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Cliente> lista) {
		this.lista = lista;
	}

	@Override
	public Cliente incluir(Cliente cliente) {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"Cliente incluir(Cliente cliente)");		
		return null;
	}

	@Override
	public void excluir(Integer codigo) {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"void excluir(Integer codigo)");
	}

	@Override
	public Cliente alterar(Cliente cliente) {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"Cliente alterar(Cliente cliente)");
		return null;
	}

	@Override
	public ArrayList<Cliente> listar() {
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"ArrayList<Cliente> listar()");
		return null;
	}
	
}
