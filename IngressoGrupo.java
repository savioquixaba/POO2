package modelo;

import java.util.ArrayList;

public class IngressoGrupo {
	private ArrayList<Jogo> Jogo = new ArrayList<Jogo> ();
	
	public void adicionar(Jogo jog){
		Jogo.add(jog);
	}
	
	public double calcularValor() {
		return 0;
	}

}
