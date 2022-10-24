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
    private String titulo;
    private String autor;
    //genero
    private String isbn;
    private int numPaginas;
    private String editora;
    private int anoPublicacao;
    
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
    
    public String getAutor(){
        return this.autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if(numPaginas >= 1){
            this.numPaginas = numPaginas;
        }
        
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
}
