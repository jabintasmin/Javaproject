package newcode;

public class MethodOverloading {
    public static void main(String[] args) {
        test();
        test(10,8);
    }
            public static void test(){
            int mynum= 5;
            System.out.println(mynum);
        }
          public static void test(int x,int y) {
            int result = x+y;
            System.out.println(result);
        }


    }


