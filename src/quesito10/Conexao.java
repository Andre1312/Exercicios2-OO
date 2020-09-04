package quesito10;

import java.sql.Connection;

public interface Conexao {
	
	//
	public Connection conectar();
	
	public void desconectar(Connection con);
	
}
