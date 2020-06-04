
package exemplopolimorfismo;

public class Reptil extends Animal {
    private String CorEscama;
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("C");
    }

    @Override
    public void emitirSom() {
        System.out.println("mamando");

    }
    
    
}
