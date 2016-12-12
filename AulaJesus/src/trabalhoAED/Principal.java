

package trabalhoAED;

public class Principal
{
      
	public static void main(String[] args) {
	  
              int valor=0;  
                FilaDinamica f1 = new FilaDinamica();
                NoArvore raiz = null;
		PilhaDinamica p = new PilhaDinamica();
		ABB arvore = new ABB();
		
                f1.enqueue(5);
                f1.enqueue(8);
                f1.enqueue(3);
                f1.enqueue(14);
                f1.enqueue(2);
                f1.imprime();
	
	
                while (!f1.filaEstaVazia()) {
                
               valor = (int) f1.dequeue();
                raiz = arvore.abb_insere(raiz,valor);
                   
            }
              arvore.abb_imprime(raiz, "");    
                
              
              
//              
//              while (raiz. != null) {
//                
//                 NoArvore a = arvore.abb_retira(raiz, valor);
//                 p.push(a.info);
//            }
              
           
             NoArvore no; 
              
                
             while ( raiz != null) {                
                
                 no = raiz;
                 while (no.direita  != null) {                     
                     
                     no = no.direita;
                 }
                 
                       System.out.println("aqui");
                 raiz = arvore.abb_retira(raiz, no.info);
                 p.push(no.info);
                 }
                
   
//             while (raiz.esquerda != null) {                
//                raiz = raiz.esquerda;
//                 System.out.println("aquii!!");
//                 NoArvore a = arvore.abb_retira(raiz, valor);
//                 p.push(a.info);
//                 
//            }
             
             
                
              arvore.abb_imprime(raiz, ""); 
              
              System.out.println("raizz!!cima");
          
              
              p.imprime();
              
                	f1 = null;
                
	}

   
}