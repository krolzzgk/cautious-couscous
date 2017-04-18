/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploAula;

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
        
        Funcionario funcionario = new Funcionario("F1", "111");
        Funcionario funcionario2 = new Funcionario("F2", "222");
        Funcionario funcionario3 = new Funcionario("F3", "333");
        Funcionario funcionario4 = new Funcionario("F4", "444");
        Funcionario funcionario5 = new Funcionario("F5", "555");

        
        Empresa empresa = new Empresa("E1", "123", funcionario);
        empresa.getRazaoSocial();
        empresa.getCnpj();
        empresa.contrata(funcionario2);
        empresa.contrata(funcionario3);
        empresa.contrata(funcionario4);
        empresa.contrata(funcionario5);
        
        
        ////////////////////////////////////////////////////////////////////////
        
        
        ArrayList<Funcionario> funcionarios = empresa.getFuncionario();
        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome());
        }
        
    }

}
