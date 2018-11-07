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
public class OperacionesAderezo implements AgregaQuitaAderezos{

    @Override
    public void anadirAderezoHelado(Helado helado, Aderezo aderezo) {
        helado.getAderezos().add(aderezo);
    }

    @Override
    public void quitarAderezoHelado(Helado helado, Aderezo aderezo) {
        helado.getAderezos().remove(aderezo);
    }

    @Override
    public void anadirAderezoPastel(Pastel pastel, Aderezo aderezo) {
        pastel.getAderezos().add(aderezo);
    }

    @Override
    public void quitarAderezoPastel(Pastel pastel, Aderezo aderezo) {
         pastel.getAderezos().remove(aderezo);
    }
    
}
