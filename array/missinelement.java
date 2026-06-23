public class missinelement {
    public static void main (String[] args){
        int[]arr= {1,3,4,5};
        int n = arr.length +1;

        int expectedsum = n*(n+1)/2;

        int actualsum = 0;

        for(int num: arr){
            actualsum+=num;

        }
        int missinelement= expectedsum - actualsum;
        System.out.println("Missingelement =" +missinelement);
    }
}
