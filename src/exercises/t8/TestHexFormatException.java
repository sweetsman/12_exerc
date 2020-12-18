package exercises.t8;

import java.util.Scanner;

public class TestHexFormatException
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        try
        {
            System.out.print("输入一个十六进制数: ");
            HexToDecUseHexFormatException hex =
                    new HexToDecUseHexFormatException(input.next());

            System.out.println("十六进制数" + hex.getHexString() + "的十进制表示为： " + hex.hexToDec());
        }
        catch (HexFormatException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}