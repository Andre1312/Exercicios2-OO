package quesito10;

import java.sql.Connection;

public class ConexaoImpl implements Conexao{
	
	// atributos
	private String usuario;
	private String senha;
	private String uri;

	// construtor
	public ConexaoImpl(String usuario, String senha, String uri) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.uri = uri;
	}
	
	// getters/setters
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}


	@Override
	public Connection conectar() {
		// 
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"conectar()");
		//
		return null;
	}

	@Override
	public void desconectar(Connection con) {
		// 
		System.out.println("Class= "+this.getClass().getName());
		System.out.println("Metodo= "+"desconectar(Connection con)");
	}
	
	//
}
