package vectores1;

import java.util.Scanner;
/**
 * Esta clase contiene los atributos y metodos de la clase Arreglo
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Generador Vectores y Matrices 1.0.0
 */
public class Arreglo implements Operaciones {

    // Declaracion de atributos
    
    private int vect[];
    private int vectAS[];
    private int vectDS[];

    // Constructor Vacio de la clase
    public Arreglo(){
        
    }
    
    //Metodos Get y Set de los atributos
    
    public int[] getVect() {
        return vect;
    }

    public void setVect(int[] vect) {
        this.vect = vect;
    }

    public int[] getVectAS() {
        return vectAS;
    }

    public void setVectAS(int[] vectAS) {
        this.vectAS = vectAS;
    }

    public int[] getVectDS() {
        return vectDS;
    }

    public void setVectDS(int[] vectDS) {
        this.vectDS = vectDS;
    }
    /**
     * este metodo crea el vector tomando el valor de referencia como el tamaño del vector
     * @param filas
     * @return vector
     */
    public int[] crearVector(int filas){
        Scanner t=new Scanner(System.in);
        int vector[]=new int[filas];
        for(int i=0;i<vector.length;i++){
            System.out.print("Digite el elmento "+i+ "del vector :");
            int e = t.nextInt();
            vector[i]=e;
            
        }
        this.setVect(vector);
        return vector;
      
    }
    
    /**
     * metodo que muestra el vector en pantalla
     * @param m 
     */
    public void mostrarV(int m[]){
        
        for(int j=0;j<m.length;j++){
               System.out.print(m[j] + " \t");
           }
           System.out.println();
       
   }
    
   /**
    * metodo que ordena el vector de forma ascendente
    */
    @Override
    public void ascendete() {
        
    int a[]=this.vect;           
    int temporal;
    int tamaño=a.length;
     
    for(int i=1;i<tamaño;i++){
        for(int j=0;j<tamaño-1;j++){
            if(a[j]>a[j+1]){
                    temporal=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temporal;
            }
        }
    }
        this.setVectAS(a);
        
    }
    
    /**
     * metodo que se encarga de ordenar el vector de forma descendente
     */
    @Override
    public void descendente() {
     int a[]=this.vect;   
     int temporal;
     int tamaño=a.length;
     
        for(int i=1;i<tamaño;i++){
            for(int j=0;j<tamaño-1;j++){
                if(a[j]<a[j+1]){
                    temporal=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temporal;
                    
                }
            }
        }
        this.setVectDS(a);
      
    }
        
    //Fin de clase Arreglo
    
   }
    

