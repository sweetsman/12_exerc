package exercises.t9;

import java.util.Scanner;

public class TestBin2DecUseBinaryFormatException
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("输入一个二进制数: ");
            Bin2DecUseBinaryFormatException bin = new
                    Bin2DecUseBinaryFormatException(input.next());

            System.out.println("二进制数" + bin.getBinString() + "的十进制表示为： " + bin.bin2Dec());
        }
        catch (BinaryFormatException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}