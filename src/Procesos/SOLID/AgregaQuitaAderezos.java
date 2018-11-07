/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos.SOLID;

import OtrosCorregido.Aderezo;
import Postres.Helado;
import Postres.Pastel;

/**
 *
 * @author Administrador
 */
public interface AgregaQuitaAderezos {
   
    public void anadirAderezoHelado(Helado helado,Aderezo aderezo);
    
    public void quitarAderezoHelado(Helado helado,Aderezo aderezo);
    
    public void anadirAderezoPastel(Pastel pastel,Aderezo aderezo);
    
    public void quitarAderezoPastel(Pastel pastel,Aderezo aderezo);
}
