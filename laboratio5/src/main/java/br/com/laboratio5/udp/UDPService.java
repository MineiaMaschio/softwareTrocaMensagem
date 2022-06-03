package br.com.laboratio5.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import org.springframework.stereotype.Service;

@Service
public class UDPService {

	public void enviarMensagem(UsuarioUDPModel mensagem) throws IOException {
		DatagramSocket ds = new DatagramSocket();

		InetAddress ip = InetAddress.getByName("larc.inf.furb.br");

		// convert the String input into the byte array.
		String me = "SEND MESSAGE 4268: ohfsp:"+mensagem.getUsuarioId()+":"+mensagem.getMensagem();
		
		byte buf[] = me.getBytes();

		// Step 2 : Create the datagramPacket for sending
		// the data.
		DatagramPacket DpSend = new DatagramPacket(buf, buf.length, ip, 1011);

		// Step 3 : invoke the send call to actually send
		// the data.
		ds.send(DpSend);
	}
}
