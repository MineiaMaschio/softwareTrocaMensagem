package br.com.laboratio5.udp;

public class UsuarioUDPModel {

	private Long usuarioId;
	private String mensagem;

	public UsuarioUDPModel(Long usuarioId, String mensagem) {
		super();
		this.usuarioId = usuarioId;
		this.mensagem = mensagem;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
