package newcode;

public class Formatspecifier {
    public static void main (String[] args){
       boolean b = true;
       char add = 'a';
       short s = 1356;
       int i = 123456;
       float f = 12.30f;
       double d = 10.23456;

       System.out.printf("boolean b = %b\n",b);
       System.out.printf("char = %c\n",add);
       System.out.printf("short = %d\n",s);
       System.out.printf("float = %.1f\n",f);
    }
}
