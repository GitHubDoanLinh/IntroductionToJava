public class PrimeLessThan100 {
    public static boolean check(int n) {
        if (n == 0 || n == 1)
            return false;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 100;
        for(int i=0;i<=n;i++){
            if(check(i))
            {
                System.out.println(i+ " ");
            }
        }
    }
}
