package calculadora;
public class CalcPotencia {
    
    
    public int CalculoPotencia(int base, int expoente){
       
        int result = 0;
        
        while(expoente != 0){
            result = base * base;
            expoente--;
        }
        
        return result;
    }
}
