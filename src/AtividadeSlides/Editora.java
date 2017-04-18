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
public class Editora {

    private String nome;
    private String cnpj;
    
    public Editora(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

}
