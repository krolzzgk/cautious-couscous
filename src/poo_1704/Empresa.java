/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_1704;

import java.util.ArrayList;

/**
 *
 * @author karolina.gkallajian
 */
public class Empresa {

    private String razaoSocial;
    private String cnpj;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String razaoSocial, String cnpj, Funcionario funcionario) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(funcionario);
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

}
