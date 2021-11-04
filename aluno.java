/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
//Criando a classe
public class aluno {
    String matricula, nome;
    double media; 
    
    //Criando os métodos
    //Método para verificar se a inserção do dado de matirucla é válido
    public void setMatricula(String m){
        if(!m.isEmpty()) {
            matricula = m;
        }    
    }
    //Método retornar o valor do dado matricula
    public String getMatricula(){
        return matricula;
    }
    //Método para verificar se a inserção do dado nome é válido
    public void setNome(String n){
        if(!n.isEmpty()){
            nome = n;
        }
    }
    //Método retornar o valor do dado nome
    public String getNome(){
        return nome;
    }
    //Método para verificar se a inserção do dado média é válido
    public void setMedia (double me){
        if(me >= 0.0 && me <= 10.0){
            media = me;
        }
    }
    //Método retornar o valor do dado media
    public double getMedia (){
        return media;
    }
    
    //Criando método para imprimir os dados
    public void imprimir (){
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Nome: " + getNome());
        System.out.println("Média: " + getMedia());
    }
    
    //Criando método para adicionar dados a dois alunos
    public void entradaDados(){
        //Setando o scaner para ler os dados digitados
        Scanner dados = new Scanner(System.in);
        System.out.println("Matrícula do aluno: ");
        setMatricula(dados.nextLine());
        System.out.println("Nome do aluno: ");
        setNome(dados.nextLine());
        System.out.println("Media do aluno: ");
        setMedia(Double.parseDouble(dados.nextLine()));
        
    }
}

