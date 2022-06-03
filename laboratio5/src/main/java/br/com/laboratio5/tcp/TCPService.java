package br.com.laboratio5.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TCPService {

	public List<UsuariosModel> usuariosOnline() {
		List<UsuariosModel> usuarios = new ArrayList<>();
		try {
			Socket cliente = new Socket("larc.inf.furb.br", 1012);

			System.out.println(cliente);

			PrintStream out = new PrintStream(cliente.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

			String t = "GET USERS 4268: ohfsp";

			out.println(t);
			out.println();

			String line = in.readLine();
			
			String[] splt = line.split(":");
			if (line.equals("")) {
				return null;
			} else {
				String s = "";
				List<String> list = new ArrayList<>();
				for (int i = 0; i < splt.length; i++) {
					s += splt[i] + ",";
					if ((i+1) % 3 == 0) {
						list.add(s);
						s = "";
					}
				}
				for (String string : list) {
					String[] spli2 = string.split(",");
					UsuariosModel m = new UsuariosModel(Long.valueOf(spli2[0]),spli2[1], Long.valueOf(spli2[2]));
					usuarios.add(m);
				}
			}
			System.out.println(line);

			// Close our streams
			in.close();
			out.close();
			cliente.close();

			System.out.println("Conexão encerrada");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return usuarios;
	}
	
	public UsuarioMensagemModel ultimaMensagem() {
		UsuarioMensagemModel mensagem = null;
		try {
			Socket cliente = new Socket("larc.inf.furb.br", 1012);

			System.out.println(cliente);

			PrintStream out = new PrintStream(cliente.getOutputStream());
			BufferedReader in = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

			String t = "GET MESSAGE 4268: ohfsp";

			out.println(t);
			out.println();

			String line = in.readLine();
			
			String[] splt = line.split(":");
			
			if (line.equals(":")) {
				return null;
			} else {
				mensagem = new UsuarioMensagemModel(Long.valueOf(splt[0]), getName(Long.valueOf(splt[0])), splt[1]);
			}
			System.out.println(line);

			// Close our streams
			in.close();
			out.close();
			cliente.close();

			System.out.println("Conexão encerrada");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return mensagem;
	}

	private String getName(Long userId) {
		String name = "";
		switch (userId.intValue()) {
		case 9240:
			name = "Bruno Giovani Bressanini Cavalheiro";
			break;
		case 6152:
			name = "Bruno Ricardo Junkes";
			break;
		case 1636:
			name = "Christyelen Kramel";
			break;
		case 4268:
			name = "Douglas Royes";
			break;
		case 2222:
			name = "Francisco Adell Péricas";
			break;
		case 5280:
			name = "Guilherme Barth";
			break;
		case 1158:
			name = "Hélio Potelicki";
			break;
		case 4038:
			name = "Igor Christofer Eisenhut";
			break;
		case 5562:
			name = "Luiz Augusto Kuhn";
			break;
		case 6364:
			name = "Minéia Maschio";
			break;
		case 6408:
			name = "Rennã Munlo Tiedt";
			break;
		case 1145:
			name = "Thomas Ricardo Reinke";
			break;
		case 8868:
			name = "Yuri Matheus Hartmann";
			break;
		case 6806:
			name = "Éliton Lunardi";
			break;
		default:
			break;
		}
		
		return name;
	}
	
}
