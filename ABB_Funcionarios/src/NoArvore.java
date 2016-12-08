
public class NoArvore {
	Funcionario func;
	NoArvore direita;
	NoArvore esquerda;

	public NoArvore(Funcionario func) {
		this.func = func;
		this.direita = null;
		this.esquerda = null;
	}
}
