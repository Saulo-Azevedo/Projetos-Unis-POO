/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid2code4;

/**
 *
 * @author teksa
 */
public class Unid2Code4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pode ser feito assim.. mais burocrático
        PersonalidadeObj personalidade = new PersonalidadeObj();
        PersonalidadePessimista pessimista = new PersonalidadePessimista();
        PersonalidadeOtimista otimista = new PersonalidadeOtimista();
        PersonalidadeIntrovertido introvertido = new PersonalidadeIntrovertido();
        PersonalidadeExtrovertido extrovertido = new PersonalidadeExtrovertido();
        
        System.out.println("=============[Forma 1]");
        System.out.println("Personalidadeobj Falando :" + personalidade.falar());
        System.out.println(" PersonalidadePessimista Falando: " + pessimista.falar());
        System.out.println("PersonalidadeOtimista Falando: " + otimista.falar()); 
        System.out.println("PersonalidadeIntrovertido Falando: " + introvertido.falar());
        System.out.println("PersonalidadeExtrovertido Falando: " + extrovertido.falar());
        
        
        // Mas podemos substituir assim ... bem mais elegante
        
        PersonalidadeObj [] personalidades = new PersonalidadeObj[5];
        personalidades[0] = personalidade;
        personalidades[1] = pessimista;
        personalidades[2] = otimista;
        personalidades[3] = introvertido;
        personalidades[4] = extrovertido;
        
        // Gerando disturbio de personalidade em OO :)
        
        System.out.println("=============[Forma 2]");
        System.out.println("Personalidadeobj Falando :" + personalidades[0].falar());
        System.out.println("Personalidadeobj Falando :" + personalidades[1].falar());
        System.out.println("Personalidadeobj Falando :" + personalidades[2].falar());
        System.out.println("Personalidadeobj Falando :" + personalidades[3].falar());
        System.out.println("Personalidadeobj Falando :" + personalidades[4].falar());    
        
    }
    
}
