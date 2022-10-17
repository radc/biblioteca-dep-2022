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


public class Livro {
    String titulo;
    String autor;
    //genero
    String isbn;
    int numPaginas;
    String editora;
    int anoPublicacao;
    
    public Livro(){
        titulo = "Não definido";
        autor = "Não definido";
        isbn = "Não definido";
        editora = "Não definido";
        numPaginas = -1;
        anoPublicacao = -1;
    }

    public Livro(String titulo, String autor, String isbn, int numPaginas, String editora, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numPaginas = numPaginas;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
    
}


