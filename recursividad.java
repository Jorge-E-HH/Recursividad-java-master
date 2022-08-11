package recursividad;

public class FactorialRecursivo {
 
 //Método recursivo para calcular el factorial de un número
 public long calcularFactorial(long fac) {
  
  if(fac <= 1) {
   return 1;
  }
  else {
   return fac * calcularFactorial(fac - 1);
  }
 }
 
}


package recursividad;

public class FactorialIterativo {

 //Método iterativo para calcular el factorial de un número
 public long calcularFactorial(long fac) {
  long factorial = 1;
  
  while(fac >= 1){
   factorial *= fac;
   fac--;
  }
  
  return factorial;
 }
}


package recursividad;

public class FactorialTest {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  
  long i = 10;
  FactorialRecursivo factorialRec = new FactorialRecursivo();
  FactorialIterativo factorialIte = new FactorialIterativo();
  
  System.out.println("Método Recursivo -> El factorial de " + i + 
    " es: " + factorialRec.calcularFactorial(i));
  
  System.out.println("-------------------------------------------");
  
  System.out.println("Método Iterativo -> El factorial de " + i + 
    " es: " + factorialIte.calcularFactorial(i));
  
 }

}