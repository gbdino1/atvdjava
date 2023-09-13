import javax.swing.JOptionPane;
public class Exemplo2 {
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if(x>=10 && x%4==0){
            x+=2;
            JOptionPane.showMessageDialog(null, "O valor de x mais 2 = " + x);     
        }else if(x<10 && x%4!=0){
            x-=1;
            JOptionPane.showMessageDialog(null, "O valor de x menos 1 = " + x);
        }else{
            JOptionPane.showMessageDialog(null, "O valor de x é =" + x);
        }
    }
}