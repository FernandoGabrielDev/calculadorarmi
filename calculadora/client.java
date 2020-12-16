package calculadora;

import javax.swing.*;
import java.rmi.Naming;

public class client {
    public static void main(String[] args) {
        char oper;
        float val1 = 0;
        float val2 = 0;
        request r;
        response resp = null;
        try {
            rmi c = (rmi) Naming.lookup("rmi://localhost:8080/calculadora");
            oper = (char) Integer.parseInt(JOptionPane.showInputDialog("Informe a operação desejada\n1 -> SOMA (+)\n2 -> SUBTRAÇÃO (-)\n3 -> MULTIPLICAÇÃO (X)\n4 -> DIVISÃO (/)\n5 -> POTENCIAÇÃO (^)\n6 -> PORCENTAGEM (%)\n7 -> RADICIAÇÃO (√)\n"));
            val2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o Primeiro operando:"));
            val1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o Segundo operando:"));
            r = new request(val2, val1);
            switch (oper) {
                case 1:
                    resp = c.soma(r);
                    oper = '+';
                    break;
                case 2:
                    resp = c.subtracao(r);
                    oper = '-';
                    break;
                case 3:
                    resp = c.multiplicacao(r);
                    oper = '*';
                    break;
                case 4:
                    resp = c.divisao(r);
                    oper = '/';
                    break;
                case 5:
                    resp = c.potencia(r);
                    oper = '^';
                    break;
                case 6:
                    resp = c.porcentagem(r);
                    oper = '%';
                    break;
                case 7:
                    resp = c.raiz(r);
                    oper = '√';
                    break;
                default:
                    resp.setStatus(1);
                    break;
            }
            System.out.println("Resultado: "+val2+" " + oper + " " + val1 + " =");
            if(resp.getStatus() != 1){
                JOptionPane.showMessageDialog(null, "Resultado: "+val2+" " + oper + " " + val1 + " = " + resp.getResult());
                System.out.println(resp.getResult());
            }else{
                JOptionPane.showMessageDialog(null, "Erro: Operação não Realizada");
                System.out.println("Erro: Operação não Realizada.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhuma Operação Realizada.");
            System.out.println("Nenhuma operação realizada.");
            System.out.println(e);
        }
    }
}