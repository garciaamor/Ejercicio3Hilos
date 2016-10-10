
package ejercicio3;

public class Ejercicio3 extends Thread{

    public Ejercicio3(String str){
        super(str);
    }
    public void run(){
        System.out.println("Comienza el hilo "+ getName());
        for (int i =0;i<3;i++){
            System.out.println(i+" "+getName());
                      
            
        }
        
        System.out.println("Termina el hilo "+getName());
        
    }

    public static void main(String[] args) {
     
        new Ejercicio3("Aspas").start();
        
        
        System.out.println("Termina thread main");
        
 
        
        
    }
    
}
