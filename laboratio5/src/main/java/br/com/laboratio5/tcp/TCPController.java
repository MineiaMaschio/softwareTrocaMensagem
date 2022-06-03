package br.com.laboratio5.tcp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/tcp")
@CrossOrigin("*")
public class TCPController {

	@Autowired
	private TCPService service;
	
	@RequestMapping(method = RequestMethod.GET, value = "/usuarios")
	public ResponseEntity<List<UsuariosModel>> usuariosOnline() {
		List<UsuariosModel> usuarios = service.usuariosOnline();
		if (usuarios == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(usuarios, HttpStatus.ACCEPTED);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/mensagem")
	public ResponseEntity<UsuarioMensagemModel> ultimaMensagem() {
		UsuarioMensagemModel mensagem = service.ultimaMensagem();
		if (mensagem == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(mensagem, HttpStatus.ACCEPTED);
	}
}
