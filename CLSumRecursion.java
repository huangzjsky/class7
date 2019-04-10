import java.util.Arrays;

public class CLSumRecursion {
    public static void main(String [] args) {
        int sum = 0;

        if(args.length < 1){
            System.out.println("Usage: java CLSumRecursion num1 num2 ...");
            System.exit(0);
        }

        int [] tmp = new int [args.length];
        for(int i=0; i<args.length; i++) {
            tmp[i] = Integer.parseInt(args[i]);
        }

        sum =  clsum(tmp);
        System.out.println(sum);
    }

    public static int clsum(int [] arr)
        if (arr.length == 1)
            return arr[0];
        else {
            int [] tmp = Arrays.copyOf(arr, arr.length-1);
            return clsum(tmp) + arr[arr.length-1];
        }
    }
}