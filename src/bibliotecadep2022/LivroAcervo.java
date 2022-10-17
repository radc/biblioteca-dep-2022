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
public class LivroAcervo {
    int qtdAcervo;
    int qtdDisponivel;
    String local;
    Livro livro;
    
    public LivroAcervo(String titulo, String autor, String isbn, int numPaginas, String editora, int anoPublicacao){
        this.livro = new Livro(titulo,autor,isbn,numPaginas,editora,anoPublicacao);
        this.qtdAcervo = -1;
        this.qtdDisponivel = -1;
        this.local = "Não definido";
    }
    
}
