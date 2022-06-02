package br.com.laboratio5.tcp;

public class UsuarioMensagemModel {

	private Long usuarioId;
	private String mensagem;

	public UsuarioMensagemModel(Long remententeId, String mensagem) {
		super();
		this.usuarioId = remententeId;
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
