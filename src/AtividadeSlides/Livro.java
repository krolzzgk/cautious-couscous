/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeSlides;

/**
 *
 * @author karolina.gkallajian
 */
public class Livro {
    private String titulo;
    private Editora editora;

    public Livro(String titulo, Editora editora) {
        this.titulo = titulo;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public Editora getEditora() {
        return editora;
    }
    
   
}
