package br.com.laboratio5.tcp;

public class UsuariosModel {
	private Long usuarioId;
	private String nome;
	private Long vitorias;

	public UsuariosModel(Long usuarioId, String nome, Long vitorias) {
		super();
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.vitorias = vitorias;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getVitorias() {
		return vitorias;
	}

	public void setVitorias(Long vitorias) {
		this.vitorias = vitorias;
	}
	
	
}
