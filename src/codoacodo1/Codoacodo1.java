/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codoacodo1;

/**
 *
 * @author sergio
 */
import java.util.Scanner;
public class Codoacodo1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        usuario usuario1 = new usuario();
        System.out.print("Por favor, ingrese el nombre del usuario: ");
        usuario1.nombre = sc.next();
        System.out.print("ingrese el apellido: ");
        usuario1.apellido=sc.next();
        System.out.print("ingrese la edad: ");
        usuario1.edad =sc.nextInt();
        System.out.print("ingrese el hobbie: ");
        usuario1.hobbie=sc.next();
        
        System.out.print("Ingrese el editor de codigos favorito: ");
        usuario1.editorCodigoFavorito=sc.next();
        System.out.print("ingrese el sistema operativo que utiliza: ");
        usuario1.sistOperUsa=sc.next();
        usuario1.mostrarUsuario();
        
    }
    
}
