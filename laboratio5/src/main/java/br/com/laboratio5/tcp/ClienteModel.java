package br.com.laboratio5.tcp;

public class ClienteModel {
	private Long userId;
	private String senha;
	
	public ClienteModel(Long userId, String senha) {
		super();
		this.userId = userId;
		this.senha = senha;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

}
