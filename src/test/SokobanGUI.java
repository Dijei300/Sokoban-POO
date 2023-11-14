package test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

import pt.iscte.guitoo.board.Board;

public class SokobanGUI {
	
	final Board board;
	double probAlvo;
	
	SokobanGUI(String title) {
		probAlvo = 0.5;
		 
		// 50 corresponde ah largura (pixels)das imagens fornecidas
		board  = new Board(title, 5, 10, 50);
		
		// dada a coordenada (linha, coluna) devolve nome de imagem a mostrar
		board.setIconProvider((r,c) -> random(r, c)); 
		
		// quando a posicao (linha, coluna) eh primida, executa a acao
		board.addMouseListener((r,c) -> board.showMessage("clique: " + r + ", " + c));
		
		// adiciona uma etiqueta contendo o texto fornecido (atualiazado sempre que ha uma accao/clique)
		board.addLabel(() -> " Faltam: " + dias());
		
		// adiciona um botao, que executa a acao fornecida
		board.addAction("mudar probabilidade", () -> {
			String p = board.promptText("%?");
			probAlvo = Double.parseDouble(p) / 100;
		});
	}
	
	// :)
	String dias() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		int mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
		int dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		LocalDate hoje =  LocalDate.of(ano, mes, dia);
		LocalDate prazo = LocalDate.of(2020, 12, 7);
		return ChronoUnit.DAYS.between(hoje, prazo) + " dias";
	}

	// devolve alteatoriamente Alvo ou Parede, de acordo com a probabilidade dada por probAlvo
	String random(int r, int c) {
		if(Math.random() < probAlvo)
			return "images/Alvo.png";
		else
			return "images/Chao.png";
	}

	void open() {
		// abre a janela
		board.open();
	}

	
	public static void main(String[] args) {
		SokobanGUI gui = new SokobanGUI("Projeto sOkOban");
		gui.open(); 
	}
}
