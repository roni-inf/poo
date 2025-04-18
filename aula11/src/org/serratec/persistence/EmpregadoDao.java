package org.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.serratec.conexao.ConnectionFactory;
import org.serratec.exemplos.Empregado;

public class EmpregadoDao {
	private Connection connection;

	public EmpregadoDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Empregado empregado) {
		String sql = "insert into empregado(nome,profissao,salario) values(?,?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, empregado.getNome());
			stmt.setString(2, empregado.getProfissao());
			stmt.setDouble(3, empregado.getSalario());
			stmt.execute();
			System.out.println("Cadastrado com sucesso!");
		} catch (Exception e) {
			System.err.println("Empregado não cadastrado!");
		}
	}

	public static void main(String[] args) {
		EmpregadoDao dao = new EmpregadoDao();
		Empregado empregado = new Empregado(null, "Roni", "Programador", 6000.);
		dao.inserir(empregado);
	}
}
