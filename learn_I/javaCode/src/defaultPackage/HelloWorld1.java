public class HelloWorld1
{

    static String randomString = "String to print";

    static final double PINUM = 3.141529;
    public static void main(String[] args)
    {
        System.out.println(PINUM);

        int integerOne = 22;
        int integerTwo = integerOne + 7;
        System.out.println(integerTwo);

        double doubleValue = 3.141564;
        int doubleToInt = (int) doubleValue;
        String intString = "2100";
        int stringToInt = Integer.parseInt(intString);

        System.out.println(doubleToInt);
        System.out.println(stringToInt);
    }
}