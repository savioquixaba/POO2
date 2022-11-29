package modelo;

import java.util.ArrayList;

public class IngressoIndividual extends Ingresso {
	public IngressoIndividual(int codigo) {
		super(codigo);
	}
    
	public void setJogo(ArrayList<Jogo> jogo) {
		 Jogo = jogo;
	}
	
	public double calcularValor() {
		return 0;
	}
}
