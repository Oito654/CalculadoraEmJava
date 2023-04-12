package calculadora;

public class CalcPorcentagem {
    
    public double CalcularPorcentagem(double total, double taxa){
        
        double result = 0;
        
        double taxaConv = taxa / 100;
        
        result = total * taxaConv;
        
        return result;
    }
}
