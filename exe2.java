package aula003;

import java.awt.*;
import javax.swing.*;

public class exe2 extends NFrame

{

    static String A, B;

    static int resp;
    static double c, a, b;

    public exe2()

    {

        String A = JOptionPane.showInputDialog(null, "Entre com a primeira métrica(lado ou base):", "Entrada", -1);

        double a = Double.parseDouble(A);

        this.a = a;

        String B = JOptionPane.showInputDialog(null, "Entre com a segunda métrica(lado ou altura):", "Entrada", -1);

        double b = Double.parseDouble(B);

        this.b = b;

        int resp = JOptionPane.showConfirmDialog(null, "De qual polígono estamos fazendo a área ?", "Consulta",
                JOptionPane, -1);

        this.resp = resp;

    }

    public static void main(String arg[])

    {

        efetuar();

    }

    public static void efetuar()

    {

        NFrame fx = new exe1();
        

        if (resp == JOptionPane.){

            double c = (a * b)/2;

            JOptionPane.showMessageDialog(null, " " + a + " x " + " " + b + " " + "/2" + " = " + c,
                    "Calculando a área de um triângulo", -1);

            System.exit(0);

        }
        
        if (resp == 1){

            double c = a * b;

            JOptionPane.showMessageDialog(null, " " + a + " x " + " " + b + " = " + c,
                    "Realizando a conversão pra euros ", -1);

            System.exit(0);

        }

        if (resp == 2)

        {

            efetuar();

        }

    }
}