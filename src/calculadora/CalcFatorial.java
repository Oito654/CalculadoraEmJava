package calculadora;

public class CalcFatorial {
    
    public long CalcularFatorial(int n1){
        
        int f = 1;
        int result = 0;
        
        for(int i = n1; i > 1; i-- ){
            result = n1 *= f;
            f++;
        }
        
        return result;
    }
    
}
