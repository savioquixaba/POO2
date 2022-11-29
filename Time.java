package modelo;

import java.util.ArrayList;

public class Time {
	private String nome;
	private String origem;
	private ArrayList<Jogo> Jogo = new ArrayList<Jogo> ();
	
	public void adicionar(Jogo jog){
		Jogo.add(jog);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double obterValorArrecadado(){
		return 0;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public ArrayList<Jogo> getJogo() {
		return Jogo;
	}
	public void setJogo(ArrayList<Jogo> jogo) {
		Jogo = jogo;
	}
	

}
