
package Atividade_Ciclo_1_POO;

public class Unidade_1 {

    public static void main(String[] args) {
      // instanciamos um obejto chamado "minhaGuitarra" que será do tipo Guitarra
      // Os valores passados são usados pelo cosntructorda classepara criar
      //o objeto
      
      Guitarra minhaGuitarra = new Guitarra("01020304","Fender","telecaster","Eletrica","Mogno",1500);
      
        System.out.println(minhaGuitarra.getNumeroSerie());
        System.out.println(minhaGuitarra.getMadeira());
        System.out.println(minhaGuitarra.getPreço());
        System.out.println(minhaGuitarra.getTipo());
        
      
        
        
    }
    
}
