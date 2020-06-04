package exemplopolimorfismo;
 
public abstract class Animal {
    //Atributos de animal
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Mètodos de Animal
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
   
}
