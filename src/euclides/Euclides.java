package euclides;

import javax.swing.JOptionPane;

public class Euclides {
    static int x = 1;
    static int y = 1;
    
    public static void main(String[] args) {
        
        boolean verificador;
        
        do{
        try {
            verificador = true;
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número para realizar o MDC: "));
            if (x < 1) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            verificador = false;
            JOptionPane.showMessageDialog(null, "Não é possível a entrada de 0 ou negativos. ");
            
        }
        }while(verificador != true);
        
        do{
        try {
            verificador = true;
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
            if (y < 1) {
                throw new NumberFormatException();
                
            }
        } catch (NumberFormatException e) {
            verificador = false;
            JOptionPane.showMessageDialog(null, "Não é possível a entrada de 0 ou negativos. ");
            
        }
        }while(verificador != true);

        
        JOptionPane.showMessageDialog(null, "O MDC de " + x + " e " + y + " é " + MDC(x, y));
    }

    public static int MDC(int a, int b) {
      if (b==0){
          return a;
        }else{
          return MDC(b, a%b);
      }   
    }
}

