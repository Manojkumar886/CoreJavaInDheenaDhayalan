package FundamentalJava.DemoDatatypes;

public class DemoTypeCasting
{
    public static void main(String[] args)
    {

        int myfirstvalue=97896598;
        double mysecondvalue=myfirstvalue;//widening
        long mythirdvalue=(long) mysecondvalue;//narrowing
        System.out.println("my first value is :"+myfirstvalue);
        System.out.println("my second value is :"+mysecondvalue);
        System.out.println("my third value is :"+mythirdvalue);
        char alpha1=' ';
        int cosmo=0;
        cosmo=alpha1;//widening
        System.out.println(cosmo);
        //explicit casting
        int number1=12;double number2=43.8;
        number1=(int) (number2+number1);
        System.out.println(number1);

        short value1=97;
        char value2='0';//nullchar  -127 to -128
        value2 =(char) value1;
        System.out.println(value2);
    }
}
