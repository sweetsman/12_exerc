package exercises.t9;

public class  BinaryFormatException extends Exception
{
    String binString;

    public BinaryFormatException(String binString)
    {
        super("BinaryFormatException: "+binString);
        this.binString = binString;
    }

    public String getBinString()
    {
        return binString;
    }
}