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
public class usuario extends personas {
    String editorCodigoFavorito;
    String sistOperUsa;
    public usuario(){};
    void mostrarUsuario(){
        System.out.println("Apellido: " + super.apellido);
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Edad: " +this.edad);
        System.out.println("Hobbie: " +this.hobbie);
        System.out.println("Editor de Codigos favorito: " +this.editorCodigoFavorito);
        System.out.println("Sistema operativo que usa: " +this.sistOperUsa);
        
    }
    
}
