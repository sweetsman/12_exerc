package exercises;

import java.util.Scanner;
public class t6 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("输入一个十六进制数: ");
            String hex = input.next();
            int dec = hexToDex(hex);

            System.out.println("十六进制数" + hex + "的十进制表示为： " + dec);
        }
        catch (NumberFormatException ex)
        {
            System.out.println(ex.toString() + " 不是一个十六进制数");
        }
    }

    public static int hexToDex(String hex) throws NumberFormatException
    {
        int result = 0;
        for (int i = hex.length() - 1; i >= 0; i--)
        {
            int flag  = flag(hex.charAt(i));
            if (flag == -1)
            {
                throw new NumberFormatException(hex);
            }
            else
                result += flag * Math.pow(16, (hex.length() - i - 1));
        }

        return result;
    }

    public static int flag(char ch)
    {
        if (ch >= '0' && ch <= '9')
        {
            return (ch - '0');
        }
        else if (ch >= 'A' && ch <= 'F')
        {
            return (ch - 'A' + 10);
        }
        else
            return -1;
    }

}