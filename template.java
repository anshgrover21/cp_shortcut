import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;



public class template {
    class Pair<K, V>{
        K first;
        V second;
        Pair(K f,V s){
            first = f;
            second = s;
        }     
    }


    public void debug(){
        System.out.println("**");
    }
  
    public void printArray(int[] a){
        for (int i : a) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

      public void printArray(long[] a){
        for (long i : a) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }

    public int greaterCount(ArrayList<Integer> a , int val){
        int idx = upper_bound(a,val);
        if(idx ==-1){
            idx=  a.size();
        }
        
        return idx;
    }

    // to check the cell is valid or not
     private boolean isValidCell(int[][] mat, int i, int j , int n , int m) {
        int n = mat.length;
        return i >= 0 && j >= 0 && i < n && j < m;
    }

     final int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    


    String filename = null;
    InputReader sc;

    /*------------------------------    Solve   ------------------- */
    
    
    void solve() {
    //      int n= sc.nextInt();
    //    int k= sc.nextInt();
    //    long n=sc.nextLong();
    //    long k=sc.nextLong();
    //    long a[]= sc.nextArray(n);
    //    int a[] = sc.nextArray(n);
    //      StringBuilder s = new StringBuilder(sc.next());
    //      StringBuilder[] st = new StringBuilder[n];
          
    
    }



    /*---------------------------------------------------------------------------------- */
    public int upper_bound(int[] a  , int k ){
        int n= a.length;
        int e=n-1,s=0;
        while(s<=e){
            int mid =(s+e)/2;
            
            if(a[mid]>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        if(s>n-1)return -1;        
        return s;
    }
   
    public int upper_bound(ArrayList<Integer> a  , int k ){
        int n= a.size();
        int e=n-1,s=0;
        while(s<=e){
            int mid =(s+e)/2;
            
            if(a.get(mid)>k){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        if(s>n-1)return -1;        
        return s;
    }

    public int lower_bound(ArrayList<Integer> a,int k){
        int n= a.size();  
        int e=n-1,s=0;
        while(s<=e){
            int mid =(s+e)/2;
            
            if(a.get(mid)>=k){
                e=mid-1;
            }
            else{
                s=mid+1; 
            }
        }
        if(e<0)return -1;         
        return e;
}

    public int lower_bound(int a[],int k){
            int n= a.length;  
            int e=n-1,s=0;
            while(s<=e){
                int mid =(s+e)/2;
                
                if(a[mid]>=k){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
            if(e<0)return -1;         
            return e;
    }
   
     public long[] prefixSum(int[] a) 
    {
    
        long[] sum = new long[a.length +1];
        for(int i=1;i<a.length+1;i++) sum[i] =  sum[i-1]+(long)a[i-1];

        return sum;
    }

    public long[] suffixSum(int[] a) 
    {

        long[] sum = new long[a.length +1];
        for(int i=a.length-1;i>=0;i--) sum[i] =  sum[i+1]+(long)a[i];
        return sum;
    
    }   
   
   
    public int __gcd(int a, int b) {
    if (b == 0) {
    	return a;
    } else {
    return __gcd(b, a % b);
    }
    }

   
    public long __gcd(long a, long b) {
        if (b == 0) {
            return a;
        } else {
        return __gcd(b, a % b);
        }
     }

    
    
    
    public void run() throws FileNotFoundException {
        if (filename == null) {
            sc = new InputReader(System.in);
        } else {
            sc = new InputReader(new FileInputStream(filename));
        }
    
        int nTests = sc.nextInt();
        for (int test = 0; test < nTests; test++) {
            solve();
        }
    }
        
    
     public static void main(String[] args) {
            template  sol = new template ();
            try {
                sol.run();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
     
     
        static class InputReader {
            
            public BufferedReader reader;
            public StringTokenizer tokenizer;
     
            public InputReader(InputStream stream) {
                reader = new BufferedReader(new InputStreamReader(stream));
                tokenizer = null;
            }
     
            public String next() {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    try {
                        tokenizer = new StringTokenizer(reader.readLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                return tokenizer.nextToken();
            }
     
            public int nextInt() {
                return Integer.parseInt(next());
            }
     
            public float nextFloat() {
                return Float.parseFloat(next());
            }
     
            public double nextDouble() {
                return Float.parseFloat(next());
            }
     
            public long nextLong() {
                return Long.parseLong(next());
            }
            
            public int[] nextArray(int n){
                int[] a = new int[(n)];
                for (int i = 0; i < n; i++) {
                    a[i] = nextInt();
                }
                return a;
            }

            public char nextChar() {
                return next().charAt(0);
            }

            public long[] nextArray(long n) {
                long[] a = new long[(int)n];
                for (int i = 0; i < n; i++) {
                    a[i] = nextInt();
                }
                return a;
            }
        
}
}
