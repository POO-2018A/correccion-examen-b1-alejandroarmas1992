/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcion;
import java.util.Scanner;
/**
 *
 * @author ESFOT
 */
public class Correcion {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        Autor [] autores=new Autor[3];
        autores[0]=new Autor("A1","P1");
        autores[1]=new Autor("A2","P2");
        autores[2]=new Autor("A3","P3");
        Libro[]libros=new Libro[10];
        int opcion;
        int contadorLibros=0;
        do{
            System.out.println("MENU DE OPCIONES");
            System.out.println("1.Ingresar Libro");
            System.out.println("2.Libro de Favoritos");
            System.out.println("3.Contar libros de autor");
            System.out.println("4.SALIR");
            System.out.println("Ingrese la opcion deseada:");
            opcion=scan.nextInt();
            
            switch(opcion){
                case 1:
                    String titulo;
                    int anio;
                    boolean favorito;
                    String favoritoString;
                   
                    
                    System.out.println("Ingrese el titulo:");
                    titulo=scan.nextLine();
                    System.out.println("Ingrese el anio:");
                    anio=scan.nextInt();
                    scan.nextLine();
                    System.out.println("Es favorito? (si o no)");
                    favoritoString=scan.nextLine();
                    favorito=(favoritoString.equals("Si")?true:false); //operador ternario
                    System.out.println("Seleccione el autor");
                    System.out.println("1."+autores[0].getNombre());
                    System.out.println("2."+autores[1].getNombre());
                    System.out.println("3."+autores[2].getNombre());
                    int opcionAutor=scan.nextInt();
                    Autor autorLibro=autores[(opcionAutor-1)];
                    Libro nuevoLibro=new Libro(titulo,anio,favorito,autorLibro);
                    libros[contadorLibros]=nuevoLibro;
                    contadorLibros++;
                    break;
                case 2:
                    for(int i=0;i<libros.length;i++){
                        if(libros[i].isFavorito()&& libros[i]!=null){
                            System.out.println(libros.getTitulo());
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                System.out.println("opcion no valida");
                break;
                                
                    
                    

            }
            
            
    }
    }
    
}
