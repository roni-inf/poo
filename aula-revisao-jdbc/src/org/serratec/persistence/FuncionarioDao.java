package org.serratec.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.serratec.conexao.ConnectionFactory;
import org.serratec.entity.Funcionario;

public class FuncionarioDao {
	private Connection connection;

	public FuncionarioDao() {
		connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Funcionario funcionario) {
		String sql = "insert into funcionario(nome,email) values(?,?)";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.execute();
		} catch (SQLException e) {
			System.err.println("Problema na execução da query");
		}
	}

	public void atualizar(Funcionario funcionario) {
		String sql = "update funcionario set nome=?, email=? where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1, funcionario.getNome());
			stmt.setString(2, funcionario.getEmail());
			stmt.setInt(3, funcionario.getId());
			stmt.execute();
		} catch (SQLException e) {
			System.err.println("Problema na execução da query");
		}
	}

	public void remover(int codigo) {
		String sql = "delete from funcionario where id=?";
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			stmt.execute();
		} catch (SQLException e) {
			System.err.println("Problema na execução da query");
		}
	}

	public List<Funcionario> listar() {
		String sql = "select * from funcionario";
		List<Funcionario> funcionarios = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				funcionarios.add(new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
			}

		} catch (SQLException e) {
			System.err.println("Problema na execução da query");
		}
		return funcionarios;
	}

	public Funcionario buscarUmFuncionario(int id) {
		String sql = "select * from funcionario where id=?";
		Funcionario f1 = null;
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				f1 = new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("email"));
			}

		} catch (SQLException e) {
			System.err.println("Problema na execução da query");
		}
		return f1;
	}

	
	
	public List<Funcionario> buscarPorNome(String nome, int tipoBusca) {
		String sql;
		if (tipoBusca==1) {
			sql = "select * from funcionario where nome like '" + nome + "%'";	
		} else if (tipoBusca == 2) {
			sql = "select * from funcionario where nome like '%" + nome+ "'";
		}else {
			sql = "select * from funcionario where nome like '%" + nome+ "%'";
		}
		
		List<Funcionario> funcionarios = new ArrayList<>();
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				funcionarios.add(new Funcionario(rs.getInt("id"), rs.getString("nome"), rs.getString("email")));
			}

		} catch (SQLException e) {
			System.err.println("Problema na execução da query");
		}
		return funcionarios;
	}
	
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(2, "Marcelo da Silva", "marcelosilva@gmail.com");
		FuncionarioDao dao = new FuncionarioDao();
		// dao.inserir(f1);
		// dao.atualizar(f1);
		//System.out.println(dao.listar());
		System.out.println(dao.buscarUmFuncionario(2));
	}
}
