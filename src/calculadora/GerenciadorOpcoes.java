package calculadora;
import java.util.Scanner;

public class GerenciadorOpcoes {
    
    Scanner entrada = new Scanner(System.in);
    CalcPotencia calcPotencia = new CalcPotencia();
    CalcFatorial calcFatorial = new CalcFatorial();
    CalcPorcentagem calcPorcentagem = new CalcPorcentagem();
    VerifParImpar verifParImpar = new VerifParImpar();
    
    public void GerenciarOpcoes(){
        System.out.println("*******MENU CALCULADORA*************");
        System.out.println("* 1 - Cálculo de Potência          *");
        System.out.println("* 2 - Cálculo de Fatorial          *");
        System.out.println("* 3 - Cálculo de Porcentagem       *");
        System.out.println("* 4 - Cálculo de Acrescimo de %    *");
        System.out.println("* 5 - Cálculo de Desconto de %     *");
        System.out.println("* 6 - Identifica Par/Ímpar         *");
        System.out.println("* 7 - Sair do Sistema              *");
        System.out.println("************************************");
        System.out.print("Digite a Opção Desejada: ");
        
        int opcao = entrada.nextInt();
        
        if(opcao == 1){
             System.out.print("Informe a base: ");
             int base = entrada.nextInt();
             System.out.print("Informe o expoente: ");
             int expoente = entrada.nextInt();
             
             Boolean valido = ValidarNumeros(base, expoente);
             
             if(valido == true){
                  int result = calcPotencia.CalculoPotencia(base, expoente);
             
                  System.out.println(base + " ^ " + expoente + " = " + result);
             }
             else {
                 System.out.println("Números negativos não são aceitos.");
             }     
        }
        else if(opcao == 2){
            System.out.print("Informe o número: ");
            int n1 = entrada.nextInt();
            
            Boolean valido = ValidarNumeros(n1, 0);
            
            if(valido == true){
               System.out.println("Calculando o Fatorial de " + n1 + "!"); 
               
               long result = calcFatorial.CalcularFatorial(n1);
               
               System.out.println("Fatorial de " + n1 + "! = " + result); 
            }
            else{ 
               System.out.println("Números negativos não são aceitos.");
            }
            
        }
        else if(opcao == 3){
            System.out.print("Digite o Valor Total: ");
            int total = entrada.nextInt();
            System.out.print("Digite a taxa de porcentagem: ");
            int taxa = entrada.nextInt();
            
            Boolean valido = ValidarNumeros(total, taxa);
            
            if(valido == true){
                double result = calcPorcentagem.CalcularPorcentagem(total, taxa);
                
                System.out.println(taxa + "% de " + total + " = " + result);
            }
            else{
                System.out.println("Números negativos não são aceitos.");
            }
        }
        else if(opcao == 4){
            System.out.print("Digite o Valor Total: ");
            int total = entrada.nextInt();
            System.out.print("Digite a taxa de porcentagem: ");
            int taxa = entrada.nextInt();
            
            Boolean valido = ValidarNumeros(total, taxa);
            
            if(valido == true){
                double resultTaxa = calcPorcentagem.CalcularPorcentagem(total, taxa);
                
                double result = total + resultTaxa;
                
                System.out.println(total + " + " + taxa + " de juros " + " = " + result);
            }
            else{
                System.out.println("Números negativos não são aceitos.");
            }
        }
        else if(opcao == 5){
            System.out.print("Digite o Valor Total: ");
            int total = entrada.nextInt();
            System.out.print("Digite a taxa de porcentagem: ");
            int taxa = entrada.nextInt();
            
            Boolean valido = ValidarNumeros(total, taxa);
            
            if(valido == true){
                double resultTaxa = calcPorcentagem.CalcularPorcentagem(total, taxa);
                
                double result = total - resultTaxa;
                
                System.out.println(total + " + " + taxa + " de Desconto " + " = " + result);
            }
            else{
                System.out.println("Números negativos não são aceitos.");
            }
        }
        else if(opcao == 6){
            System.out.print("Informe o número: ");
            int n1 = entrada.nextInt();
            
            Boolean valido = ValidarNumeros(n1, 0);
            
            if(true){
              Boolean result =  verifParImpar.VerificarParImpar(n1);
              
              if(result == true){
                  System.out.println(n1 + " é um número par.");
              }
              else{
                  System.out.println(n1 + " é um número ímpar.");
              }
            }
            else{
                System.out.println("Números negativos não são aceitos.");
            }
        }
        else if(opcao == 7){
            EncerrarSistema();
        }
        else{
            System.out.println("Opção Inválida");
        }

    }
    
    private Boolean ValidarNumeros(int n1, int n2){
        
        if(n1 < 0 || n2 < 0){
            return false;
        }
        return true;
    }
    
    private void EncerrarSistema(){
        System.out.println("Sistema Encerrado");
        System.exit(0);
    }
}
