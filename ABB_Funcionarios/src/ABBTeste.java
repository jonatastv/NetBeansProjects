
public class ABBTeste {

	public static void main(String[] args) {
		
		NoArvore raiz = null;
		
		ABB arvore = new ABB();
		
		Funcionario f1 = new Funcionario(1, "Pedro Duarte", 7.5);
		raiz = arvore.abb_insere(raiz, f1);
		
		Funcionario f2 = new Funcionario(2, "Ana Silva", 8.8);
		raiz = arvore.abb_insere(raiz, f2);
		
		Funcionario f3 = new Funcionario(3, "Joao Filho", 2.5);
		raiz = arvore.abb_insere(raiz, f3);
		
		Funcionario f4 = new Funcionario(4, "Maria Gomes", 9.0);
		raiz = arvore.abb_insere(raiz, f4);
		
		Funcionario f5 = new Funcionario(5, "Silvio Lins", 4.8);
		raiz = arvore.abb_insere(raiz, f5);
		
		Funcionario f6 = new Funcionario(6, "Marcia Morais", 2.0);
		raiz = arvore.abb_insere(raiz, f6);
		
		Funcionario f7 = new Funcionario(7, "Bruno Rodrigues", 6.5);
		raiz = arvore.abb_insere(raiz, f7);
                
                Funcionario f8 = new Funcionario(8, "Thais Silva", 10.0);
		raiz = arvore.abb_insere(raiz, f8);

		arvore.abb_imprimeCrescente(raiz);
                
                arvore.abb_busca(raiz, f8);
                
                arvore.abb_imprimeCrescente(raiz);
              // arvore.abb_imprimeCrescente(raiz);
                
              //  arvore.abb_alunoComMaiorMedia(raiz);
		
              
                
                
		System.out.println("Soma salario: " +arvore.abb_somaSalario(raiz));
                //arvore.abb_buscaFuncionario(raiz);
                
              //  arvore.abb_busca(raiz, f4);
              
              
              arvore.abb_maiorId(raiz);
	}

}
