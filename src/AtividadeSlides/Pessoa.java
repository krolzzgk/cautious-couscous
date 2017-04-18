/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AtividadeSlides;

import java.util.ArrayList;

/**
 *
 * @author karolina.gkallajian
 */
public class Pessoa {

    private String nome;
    private String cpf;
    private ArrayList<Livro> livros;
    
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public void adiciona(Livro livro){
        livros.add(livro);
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }
    
    

}
