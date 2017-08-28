package vectores1;


import java.util.Scanner;
/**
 * Este proyecto Genera vectores y matrices con n numeros de elementos
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Generador Vectores y Matrices 1.0.0
 */
public class Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creacion de objetos
        Arreglo a= new Arreglo();
        Matriz  m= new Matriz();
        
        OUTER:
        while (true) {
            
        //Menu principal-------------------------------------------------------
        
        Scanner t=new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("---------Menu Principal----------");
        System.out.println("---------------------------------");
        System.out.println("1. Crear Vector                 |");
        System.out.println("2. Crear Matriz                 |");
        System.out.println("3. Salir                        |");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
        
        
       
            byte opcion =  t.nextByte();
            switch (opcion) {
                //Solicitud de datos......(tamaño del vector)
                case 1:
                    System.out.println("Digite el tamaño del vector");
                    int tamaño = t.nextInt();
                    a.crearVector(tamaño);
                    System.out.println("");
                    a.mostrarV(a.getVect());
                   
                    //submenu de ordenamientos del vector
                    submenu();
                    
                    byte op2 = t.nextByte();
                    switch(op2){
                        case 1:
                            a.ascendete();
                            a.mostrarV(a.getVectAS());
                            
                            break;
                            
                        case 2:
                            a.descendente();
                            a.mostrarV(a.getVectDS());
                            
                            break;
                            
                        case 3:
                            
                            break;
                    }
                    break;
                    
                case 2:
                    //Solicitud de datos......(tamaño de la matriz)
                    System.out.println("Digite el tamaño de la matriz");
                    int tamaño1 = t.nextInt();
                    m.crearMatriz(tamaño1);
                    System.out.println("");
                    m.mostrar(m.getMat());
                    
                    submenu();
                    //submenu de ordenamientos
                    byte op3 = t.nextByte();
                    switch(op3){
                        case 1:
                            m.ascendete();
                            m.mostrar(m.getMatAS());
                            
                            break;
                            
                        case 2:
                            m.descendente();
                            m.mostrar(m.getMatDS());
                            
                            break;
                            
                        case 3:
                            
                            break;
                 
                    }
                    break;
                case 3:
                    
                    break OUTER;
                default:
                    System.out.println("-----------------------------------------");
                    System.out.println("|            Numero no valido            |");
                    System.out.println("-----------------------------------------");
                    break;
            }
                
        
            
            
            
            
            
        }
        
        
    }
    
    // Submenu de ordenamientos
    
        public static void submenu(){
        
        System.out.println("------------Ordenamientos---------------");
        System.out.println("1.De forma Ascendente");
        System.out.println("2.De forma Descente");
        System.out.println("3.salir ");
    }
    
        //Fin de la clase Principal
}
