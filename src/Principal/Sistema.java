/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import LecheCorregido.LecheDescremada;
import PostresCorregido.Pastel;
import PostresCorregido.Helado;
import Procesos.*;
import OtrosCorregido.*;
/**
 *
 * @author djurado
 */
public class Sistema {
    public static void main(String [ ] args){
        // Producir un helado de vainilla y una torta de chocolate, 
        // a ambos agregarles CREMA y FRUTILLAS
        
        // Producir Helado
        Helado helado_vainilla = new Helado("Vainilla");
        Aderezo ad=new Aderezo("CREMA");
        Aderezo ad1=new Aderezo("FRUTILLA");
        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, ad);
        OperacionesAderezo.anadirAderezoHelado(helado_vainilla, ad1);
        System.out.println(helado_vainilla);
        
        // Producir Pastel
        Pastel pastel_chocolate = new Pastel("Chocolate");
        OperacionesAderezo.quitarAderezoPastel(pastel_chocolate, ad);
        OperacionesAderezo.anadirAderezoPastel(pastel_chocolate,ad1);
        System.out.println(pastel_chocolate);
        
        
    }
}
