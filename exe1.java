package aula003;

import java.awt.*;
import javax.swing.*;

public class exe1 extends NFrame

{

    static String A, B;

    static int resp;
    static double c, a, b;

    public exe1()

    {

        String A = JOptionPane.showInputDialog(null, "Entre com o valor em reais:", "Entrada", -1);

        double a = Double.parseDouble(A);

        this.a = a;

        String B = JOptionPane.showInputDialog(null, "Digite a cotação do euro hoje :", "Entrada", -1);

        double b = Double.parseDouble(B);

        this.b = b;

        int resp = JOptionPane.showConfirmDialog(null, "Deseja realmente fazer a conversão ?", "Consulta",
                JOptionPane.YES_NO_CANCEL_OPTION, -1);

        this.resp = resp;

    }

    public static void main(String arg[])

    {

        efetuar();

    }

    public static void efetuar()

    {

        NFrame fx = new exe1();
        
        if (resp == 1)

        {

            JOptionPane.showMessageDialog(null, "Não desejo fazer a conversão!", "Resposta", -1);

            System.exit(0);

        }

        if (resp == 0)

        {

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