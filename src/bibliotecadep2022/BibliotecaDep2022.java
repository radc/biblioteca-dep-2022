/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotecadep2022;

/**
 *
 * @author ruhan
 */
public class BibliotecaDep2022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        LivroAcervo la = new LivroAcervo();
//        la.local = "71E";
//        la.qtdAcervo = 3;
//        la.qtdDisponivel = 2;
//        la.livro = new Livro();
//        
//        la.livro.titulo = "Trono de Vidro";
//        la.livro.autor = "Sarah J. Mass";
//        la.livro.anoPublicacao = 2019;
//        la.livro.editora = "Galera";
//        la.livro.isbn = "XXX-2019-4575373";
//        la.livro.numPaginas = 400;
        
        Livro l = new Livro("Trono de Vidro", "Sarah J. Mass", 
                "XXX-2019-4567876", 400, "Galera", 2019);
        
        //
        System.out.println(l.getNumPaginas());
        l.setNumPaginas(2);
        System.out.println(l.getNumPaginas());
        System.out.println(l.getAutor());
  
        
    }
    
}
