package quesito10;

import java.util.ArrayList;

public interface DaoCliente {
	
	public Cliente incluir(Cliente cliente);
	
	public void excluir(Integer codigo);
	
	public Cliente alterar(Cliente cliente);
	
	public ArrayList<Cliente> listar();
	
}
