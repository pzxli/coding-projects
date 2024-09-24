package challenges;

public class oddOrEven {
    public static void main(String[] args) {
        ooe(1);
        ooe(2);
        ooe(3);
        ooe(4);
        ooe(0);
    }

    static void ooe(int num){
        if (num == 0){
            System.out.println("error");
        }
        else if (num%2 == 0){
            System.out.println("even");
        }
        else if (num%2 != 0) {
            System.out.println("odd");
        }
    }
}
