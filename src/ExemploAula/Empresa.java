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
public class Empresa {

    private String razaoSocial;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    //Relacionamento 0..*
    public Empresa(String razaoSocial, String cnpj) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
    }
    
    //Relacionamento 1..*
    public Empresa(String razaoSocial, String cnpj, Funcionario funcionario) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
        contrata(funcionario);
    }

    public void contrata(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public ArrayList<Funcionario> getFuncionario() {
        return funcionarios;
    }

}
