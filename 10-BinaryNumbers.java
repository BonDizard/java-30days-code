
public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
       int n = scanner.nextInt();
       int count = 0;
       int maxCount = 0;
        while(n>0)
        {
            int a = n%2;
            if(a==1)
            {
                count++;
                if(count>maxCount)
                {
                    maxCount = count;
                }
            }
            else{
                count = 0;
            }
            n = n/2;
            
        }
        System.out.println(maxCount);
        

        scanner.close();
    }
}
