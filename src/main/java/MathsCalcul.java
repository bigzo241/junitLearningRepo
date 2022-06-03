public class MathsCalcul {


    public long fact(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
