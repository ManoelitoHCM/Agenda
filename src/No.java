
public class No {
	
	Contato pessoa;
	private No proximo;

	public No(Contato pessoa) {
		this.pessoa = pessoa;
	    this.proximo = null;
	}
	
	public No(Contato pessoa, No proximo) {
		this.pessoa = pessoa;
	    this.proximo = proximo;
	}	
	
	public No getProximo() {
		return proximo;
	}
	
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	@Override
	public String toString() {
		return "No [pessoa=" + pessoa + ", proximo=" + proximo + "]";
	}
}