
public class ABB {

	NoArvore abb_insere (NoArvore a, Funcionario f)
	{
	    if (a==null) {
	       a = new NoArvore(f);
	    }
	    
	    else if (f.id < a.func.id)
	       a.esquerda = abb_insere(a.esquerda,f);
	    
	    else /* v >= a->info */
	       a.direita = abb_insere(a.direita,f);
	    
	    return a;
	}
	
	NoArvore abb_retira (NoArvore r, Funcionario f)
	{
		if (r == null)
			return null;
		
		else if (r.func.id > f.id)
			r.esquerda = abb_retira(r.esquerda, f);
		
		else if (r.func.id < f.id)
			r.direita = abb_retira(r.direita, f);
		
		else { 	/* achou o n� a remover */
			
			/* n� sem filhos */
			if (r.esquerda == null && r.direita == null) {
				//free (r);
				r = null;
			}
			
			/* n� s� tem filho � direita */
			else if (r.esquerda == null) {
				NoArvore t = r;
				r = r.direita;
				//free (t);
			}
			
			/* s� tem filho � esquerda */
			else if (r.direita == null) {
				NoArvore t = r;
				r = r.esquerda;
				//free (t);
			}
			
			/* n� tem os dois filhos */
			else {
				NoArvore f1 = r.esquerda;
				
				while (f1.direita != null) {
					f1 = f1.direita;
				}
				
				r.func = f1.func; /* troca as informa��es */
				f1.func = f;
				r.esquerda = abb_retira(r.esquerda,f);
			}
	    }
		
		return r;
    }


	
	public void abb_imprimeCrescente (NoArvore a)
	{
	   if (a != null) { // infixa
		  abb_imprimeCrescente(a.direita); 
		   
		  System.out.println("\n\nId: " + a.func.id +
				             "\nNome: " + a.func.nome +
				             "\nSobrenome: " + a.func.media 
				            );
	      
	      abb_imprimeCrescente(a.esquerda);
	   }
	}

        
        
	public NoArvore abb_busca (NoArvore r, Funcionario f)
	{
	    if (r == null)
	        return null;
	    
	    else if (f.id < r.func.id)
	        return abb_busca (r.esquerda, f);
	    
	    else if (f.id > r.func.id)
	        return abb_busca (r.direita, f);
	    
	    else return r;
	}

	public int abb_alunoComMaiorMedia(NoArvore a) {
		
		if(a == null)
		
			return 0;
		
		else
                    return 0;
		
	}
	
	public double abb_somaSalario(NoArvore b) {

		if(b == null)
			return 0.0;
		
		else 
			return abb_somaSalario(b.esquerda) 
					+ abb_somaSalario(b.direita) + b.func.media;
		
	}
        
        public void abb_maiorId(NoArvore a) {
		
		if(a == null)
		{
			return;
		}
		
		if(a.direita == null)
		{
			System.out.println("\n\nId: " + a.func.id +
		             "\nNome: " + a.func.nome +
		             "\nSobrenome: " + a.func.nome
		         );
		}
		
		else
		{
			abb_maiorId(a.direita);
		}
		
	}
        
        
        
        public void abb_buscaFuncionario(NoArvore a){
            
            if (a == null  ) {
                return;
            }
            
            if (a.func.nome == "funcionario") {
                System.out.println(a.func.nome);
            }
                else{
                abb_buscaFuncionario(a.direita);
                }
                
            
            
            
        }
        
        
}
