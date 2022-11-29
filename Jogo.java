package modelo;

import java.util.ArrayList;

public class Jogo {
	private int id;
	private String data;
	private int estoque;
	private double preco;
    private String time;
	private ArrayList<Ingresso> Ingresso = new ArrayList<Ingresso> ();
	
	public void adicionar(Ingresso ing){
		Ingresso.add(ing);
	}
	
	public double obterValorArrecadado(){
		return 0;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
    
	@Override
	public String toString() {
		return "Jogo [id=" + id + ", data=" + data + ", estoque=" + estoque + ", preco=" + preco + ", time=" + time
				+ ", Ingresso=" + Ingresso + "]";
	}

}
