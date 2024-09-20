package br.com.imc.main;
import br.com.imc.calculo.Pessoa;
import br.com.imc.calculo.Atleta;


public class Main {
    public static void main(String[] args) {
        
        Pessoa objPessoa = new Pessoa("Caio", 80, 1.85);

        System.out.println("Nome: " + objPessoa.getNome());
        System.out.println("Peso: " + objPessoa.getPeso());
        System.out.println("Altura: " + objPessoa.getAltura());
        System.out.println("IMC Pessoa: " + objPessoa.calculoImc());
        
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("");


        Atleta objAtleta = new Atleta("Joana", 58, 1.67, "HandBall");
    
        System.out.println("Nome: " + objAtleta.getNome());
        System.out.println("Peso: " + objAtleta.getPeso());
        System.out.println("Altura: " + objAtleta.getAltura());
        System.out.println("Esporte Praticado: " + objAtleta.esportePraticado);
        System.out.println("IMC Atleta: " + objAtleta.calculoImcAtleta());



    }
}