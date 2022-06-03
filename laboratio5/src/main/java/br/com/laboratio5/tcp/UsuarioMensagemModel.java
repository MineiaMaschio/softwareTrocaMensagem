package br.com.laboratio5.tcp;

public class UsuarioMensagemModel {

	private Long usuarioId;
	private String nome;
	private String mensagem;
	private boolean external;

	public UsuarioMensagemModel(Long usuarioId, String nome, String mensagem, boolean external) {
		super();
		this.usuarioId = usuarioId;
		this.nome = nome;
		this.mensagem = mensagem;
		this.external = external;
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

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public boolean isExternal() {
		return external;
	}

	public void setExternal(boolean external) {
		this.external = external;
	}

}
