public class Wrapper{
public static void main(String[] args) {
    Integer i=Integer.valueOf("10",2);    
    Double d=Double.valueOf("3.14");
    int a=Integer.parseInt("123");
    double b=Double.parseDouble("1245");
    int c=i.intValue();
    System.out.println(a+" "+b);
}

}