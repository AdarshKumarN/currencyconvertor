import java.text.DecimalFormat;
import java.util.Scanner;

public class currencyconvertor
{
    public static void main(String[] args)
    {
        double rupees,dollar,euro,dinar,pounds,code;
        DecimalFormat f = new DecimalFormat("###.##");
        System.out.println("Enter the Code you want: ");
        System.out.println("1.RUPEES\n2.DOLLAR\n3.EURO\n4.DINAR\n5.POUNDS");
        Scanner sc = new Scanner(System.in);
        code = sc.nextDouble();

        if(code == 1)
        {
            System.out.println("Enter the code in rupees: ");
            rupees = sc.nextFloat();
            dollar = rupees/75;
            System.out.println("Dollar: "+f.format(dollar));
            euro = rupees/84;
            System.out.println("Euro: "+f.format(euro));
            dinar = rupees/250;
            System.out.println("Dinar: "+f.format(dinar));
            pounds = rupees/101;
            System.out.println("Pounds: "+f.format(pounds));
        }
        else if(code == 2)
        {
            System.out.println("Enter the code in dollars: ");
            dollar = sc.nextFloat();
            rupees = dollar*81;
            System.out.println("Rupees: "+f.format(rupees));
            euro = dollar*0.88;
            System.out.println("Euro: "+f.format(euro));
            dinar = dollar*0.30;
            System.out.println("Dinar: "+f.format(dinar));
            pounds = dollar*0.72;
            System.out.println("Pounds: "+f.format(pounds));

        }
        else if(code == 3)
        {
            System.out.println("Enter amount in Euro:");
            euro = sc.nextFloat();
            rupees = euro * 84;
            System.out.println("Rupees : "+f.format(rupees));
            dollar = euro * 1.12;
            System.out.println("Dollar : "+f.format(dollar));
            pounds = euro * 0.73;
            System.out.println("Pound : "+f.format(pounds));
            dinar = euro * 0.34;
            System.out.println("Kuwaiti dinar : "+f.format(dinar));
        }
        else if(code == 4)
        {
            System.out.println("Enter amount in Pound:");
            pounds = sc.nextFloat();
            rupees = pounds * 101;
            System.out.println("Rupees : "+f.format(rupees));
            dollar = pounds * 1.35;
            System.out.println("Dollar : "+f.format(dollar));
            euro = pounds * 1.36;
            System.out.println("Euro : "+f.format(euro));
            dinar = pounds * 0.4;
            System.out.println("Kuwaiti dinar : "+f.format(dinar));
        }
        else if(code == 5)
        {
            System.out.println("Enter amount in Kuwaiti dinar:");
            dinar = sc.nextFloat();
            rupees = dinar * 250;
            System.out.println("Rupees : "+f.format(rupees));
            dollar = dinar * 3.30;
            System.out.println("Dollar : "+f.format(dollar));
            pounds = dinar * 2.5;
            System.out.println("Pound : "+f.format(pounds));
            euro = dinar * 2.94;
            System.out.println("Euro : "+f.format(euro));
        }
        else
        {
            System.out.println("Invalid Code");
        }

    }
}
