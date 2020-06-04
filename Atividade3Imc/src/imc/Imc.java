/*
----------------------- Atividade POO 1.3--------------------------------------
Ler dois valores na interface gráfica: Peso em "Kg" e Altura em "Cm"
De posse dos dados deve ser calculado o Índice de Massa Corporal (IMC) do
usuário conforme indicado no seguinte link ( http://gg.gg/e29vt )

Após efetuar o calculo a aplicação deve mostrar ao usuário informações sobre 
seu resultado de IMC, informando o seu resultado e a sua classificação.
------------ ------------------------------------------------------------------
                        Tabela IMC :

Abaixo de 17    	Muito abaixo do peso
Entre 17 e 18,49    	Abaixo do peso
Entre 18,50 e 24,99	Peso normal
Entre 25 e 29,99	Acima do peso
Entre 30 e 34,99	Obesidade I
Entre 35 e 39,99	Obesidade II (severa)
Acima de 40	Obesidade III (mórbida)

-------------------------------------------------------------------------------
 */
package imc;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Saulo Azevedo
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String p, a;

        float peso;
        float altura;
        float imc;

        p = JOptionPane.showInputDialog("Informe o peso: ");
        peso = Float.parseFloat(p);

        a = JOptionPane.showInputDialog("Informe sua altura: ");
        altura = Float.parseFloat(a);

        imc = peso / (altura * altura);  
        
        // Formatando com duas casas decimais
        
        DecimalFormat df = new DecimalFormat("##.##");       

        
        if (imc <= 17) {
            JOptionPane.showMessageDialog(null,df.format(imc) + " Muito abaixo do peso");
        }
        if (imc >= 17 && imc <= 18.49) {
            JOptionPane.showMessageDialog(null, df.format(imc) + " Abaixo do peso");
        }
        if (imc >= 18.50 && imc <= 24.99) {
            JOptionPane.showMessageDialog(null, df.format(imc) + " Peso normal");
        }
        if (imc >= 25 && imc <= 29.99) {
            JOptionPane.showMessageDialog(null, df.format(imc) + " Acima do peso");
        }
        if (imc >= 30 && imc <= 34.99) {
            JOptionPane.showMessageDialog(null, df.format(imc) + " Obesidade I");
        }
        if (imc >= 35 && imc <= 39.99) {
            JOptionPane.showMessageDialog(null, df.format(imc) + " Obesidade II (severa)");
        }
        if (imc >= 41) {
            JOptionPane.showMessageDialog(null, df.format(imc) + "Obesidade III (mórbida)");
        }
    }

}
