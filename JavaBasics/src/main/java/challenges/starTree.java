package challenges;

public class starTree {
    public static void main(String[] args) {
        tree(5);
    }

    static void tree(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            if(i<num)
            System.out.println();
        }
    }
}
