package modelo;

public class Ingresso {
	private int codigo;
	
	public Ingresso (int codigo) {
		super();
		this.codigo = codigo;
		
	}

	public double calcularValor(){
		return 0;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "Ingresso [codigo=" + codigo + "]";
	}

}