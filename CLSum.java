public class CLSum {
    public static void main(String [] args) {

        int sum = 0;

        for(String arg: args)
            sum += Interger.parseInt(arg);
        
    // 打印 
        System.out.println(sum);
    }
}