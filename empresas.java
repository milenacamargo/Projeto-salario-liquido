/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex2;

/**
 *
 * @author aluno
 */
public class Ex2 {

    public static void main(String[] args) {
        empresa empresa = new empresa("market" , 20);
        funcionario funcionario = new funcionario("Milena", 2000, true, empresa);
        funcionario funcionario2 = new funcionario("João", 2000, false, empresa);
        System.out.println("Nome da empresa: " + empresa.nome);
        System.out.println("=====DADOS DOS FUNCIONARIOS====");
        System.out.println("Nome do funcionario: " + funcionario.nome);
        System.out.println("Salario bruto: " + funcionario.salBruto);
        System.out.println("Salario do funcionário: " + funcionario.getSalario());
        System.out.println("=====DADOS DOS FUNCIONARIOS====");
        System.out.println("Nome do funcionario: " + funcionario2.nome);
        System.out.println("Salario bruto: " + funcionario2.salBruto);
        System.out.println("Salario do funcionário: " + funcionario2.getSalario());
        
    }
}
