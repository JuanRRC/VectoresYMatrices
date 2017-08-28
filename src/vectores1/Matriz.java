
package vectores1;

import java.util.Scanner;
/**
 * Esta clase contiene los atributos y metodos de la clase matriz
 * @author Juan Ricardo Rodriguez Campos
 * @author Juan David Reyes
 * @verion 1.0.0
 * @since Generador Vectores y Matrices 1.0.0
 */
public class Matriz implements Operaciones{
    
    //declaracion de atributos de la clase
    
    private int mat[][];
    private int matAS[][];
    private int matDS[][];
    
    //Constructor vacio de la clase
    
    public Matriz(){
        
    }

    //metodos set y get de la clase
    
    public int[][] getMat() {
        return mat;
    }

    public void setMat(int[][] mat) {
        this.mat = mat;
    }

    public int[][] getMatAS() {
        return matAS;
    }

    public void setMatAS(int[][] matAS) {
        this.matAS = matAS;
    }

    public int[][] getMatDS() {
        return matDS;
    }

    public void setMatDS(int[][] matDS) {
        this.matDS = matDS;
    }
    
    /**
     * Metodo que crea a matriz tomando como tamaño el valor que recibe como parametro
     * @param filas
     * @return 
     */
    public int[][] crearMatriz(int filas){
        Scanner t=new Scanner(System.in);
        int vector[][]=new int[filas][filas];
        for(int i=0;i<filas;i++){
            for(int j=0;j<filas;j++){
                System.out.print("Digite los elmentos de la matriz :");
                int e = t.nextInt();
                vector[i][j]=e;
            }
        }
        this.setMat(vector);
        return vector;
             
    }
    
    /**
     * metodo que muestra la matriz en pantalla
     * @param m 
     */
    public void mostrar(int m[][]){
       for(int i=0;i<m.length;i++){
           for(int j=0;j<m.length;j++){
               System.out.print(m[i][j] + " \t");
           }
           System.out.println();
       }
   }
    
    
    /**
     * metodo que ordena la matriz de forma ascendente
     */
    @Override
    public void ascendete() {
        
     int a[][]=this.mat;           
     int temporal;
     int tamaño=a.length;
     
        for(int i=0; i < tamaño; i++){
	    for(int j=0;j<tamaño;j++){
	        for(int x=0; x<tamaño; x++){
		    for(int y=0; y <tamaño; y++){
			if(a[i][j] < a[x][y]){
			temporal = a[i][j];
			a[i][j] = a[x][y];
			a[x][y] = temporal;
			}
                    }
		}
            }    
        }
        this.setMatAS(a);
        
    
    }    
        

    /**
     * metodo que ordena la matriz de forma descendente
     */
    @Override
    public void descendente() {
        
     int a[][]=this.mat;   
     int temporal;
     int tamaño=a.length;
     
    for(int i=0; i < tamaño; i++){
	for(int j=0;j<tamaño;j++){
            for(int x=0; x<tamaño; x++){
		for(int y=0; y <tamaño; y++){
                    if(a[i][j] > a[x][y]){
			temporal = a[i][j];
			a[i][j] = a[x][y];
			a[x][y] = temporal;
		    }
		}
            }
	}    
    }
        this.setMatDS(a);
        
    }
    
    //Fin de la clase Matriz
}
