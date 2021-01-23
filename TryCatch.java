package newcode;

public class TryCatch {
    public static void main(String[] args){
        try{
            int [] mynum= {4,7,8};
            System.out.println(mynum[6]);
        }catch(Exception e){
            System.out.println("Something else");
        }

    }
}
