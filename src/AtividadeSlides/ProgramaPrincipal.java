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
public class ProgramaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editora editora1 = new Editora("ABC", "123");
        Editora editora2 = new Editora("DEF", "456");
        Editora editora3 = new Editora("GHI", "789");
        Editora editora4 = new Editora("JKL", "012");

        Livro l1 = new Livro("AAAA", editora1);
        Livro l2 = new Livro("BBBB", editora2);
        Livro l3 = new Livro("CCCC", editora3);
        Livro l4 = new Livro("DDDD", editora4);

        Pessoa p1 = new Pessoa("A", "111");
        Pessoa p2 = new Pessoa("B", "222");
        Pessoa p3 = new Pessoa("C", "333");
        Pessoa p4 = new Pessoa("D", "444");

        p1.adiciona(l4);
        p1.adiciona(l3);
        p2.adiciona(l1);
        p3.adiciona(l1);
        p3.adiciona(l2);
        p3.adiciona(l3);
        p4.adiciona(l2);
        p4.adiciona(l4);

        ////////////////////////////////////////////////////////////////////////
        ArrayList<Livro> livrosP1 = p1.getLivros();
        ArrayList<Livro> livrosP2 = p2.getLivros();
        ArrayList<Livro> livrosP3 = p3.getLivros();
        ArrayList<Livro> livrosP4 = p4.getLivros();

        for (Livro livro : livrosP1) {
            System.out.println("Editora: " + livro.getEditora().getNome());
        }

        for (Livro livro : livrosP2) {
            System.out.println("Editora: " + livro.getEditora().getNome());
        }

        for (Livro livro : livrosP3) {
            System.out.println("Editora: " + livro.getEditora().getNome());
        }

        for (Livro livro : livrosP4) {
            System.out.println("Editora: " + livro.getEditora().getNome());
        }
    }

}
