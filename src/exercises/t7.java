package exercises;

import java.util.Scanner;
public class t7 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("输入一个二进制数: ");
            String bin = input.next();

            System.out.println("二进制数" + bin + "的十进制表示为： " + bin2Dec(bin));
        }
        catch (NumberFormatException ex)
        {
            System.out.println(ex.toString() + " 不是一个二进制数");
        }

    }

    public static int bin2Dec(String bin) throws NumberFormatException
    {
        int result = 0;
        for (int i = bin.length() - 1; i >= 0; i--)
        {
            if (!(bin.charAt(i) == '0' || bin.charAt(i) == '1'))
            {
                throw new NumberFormatException(bin);
            }
            else
                result += Math.pow(2, (bin.length() - i - 1)) * (bin.charAt(i) - '0');
        }

        return result;
    }
}