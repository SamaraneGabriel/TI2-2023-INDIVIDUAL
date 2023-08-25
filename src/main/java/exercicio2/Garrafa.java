package exercicio2;

public class Garrafa {

	private int id;
	private String cor;
	private int preco;
	private String marca;
		
	public Garrafa() {
		super();
		this.cor = "";
		this.preco = -1;
		this.marca = "";
	}

	public Garrafa(String cor, int preco, String marca) {
		super();
		this.cor = cor;
		this.preco = preco;
		this.marca = marca;

	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

	public String toString() {
		return "Garrafa [cor=" + cor + ", preco=" + preco + ", marca=" + marca + "]";
	}
	
	

	
}
