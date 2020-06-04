public class Unid2Code1 {
    
    public void debug(String mesagem){
        System.out.println("DEBUG");
    }
    
    public void info(String mensagem){
        System.out.println("INFO");
    } 
     
    public void warning(String mensagem){
        System.out.println("WARNING");
    }
    
    public void error(String mensagem){
        System.out.println("ERROR");
    }
    
    public void fatal(String mensagem){
        System.out.println("FATAL");
        System.exit(0);
    }
    
    public void print(String severidade, String mensagem){
        System.out.println(severidade + " :  ");
    }

      
    
}
