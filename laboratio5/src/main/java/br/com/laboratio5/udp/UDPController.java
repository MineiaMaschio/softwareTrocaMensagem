package br.com.laboratio5.udp;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.laboratio5.tcp.UsuarioMensagemModel;

@Controller
@RequestMapping("/udp")
public class UDPController {

	@Autowired
	private UDPService service;
	
	@RequestMapping(method = RequestMethod.POST, value = "/mensagem", consumes =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> enviaMensagem(@RequestBody UsuarioMensagemModel mensagem) throws IOException {
		service.enviarMensagem(mensagem);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
