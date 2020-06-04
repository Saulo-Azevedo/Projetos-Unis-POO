package exemplopolimorfismo;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {   
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }
    
    
    
    
}
