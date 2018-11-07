/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProcesosCorregido;

import LecheCorregido.LecheDescremada;
import LecheCorregido.LecheDeslactosada;

/**
 *
 * @author Administrador
 */
public class CambioLeche implements CambiarLeche{

    @Override
    public void cambiarTipoLecheDescremada() {
       LecheDescremada ldescrem= new LecheDescremada();
       ldescrem.usar();
    }

    @Override
    public void cambiarTipoLecheDeslactosada() {
        LecheDeslactosada ldeslac= new LecheDeslactosada();
        ldeslac.usar();
    }
    
}
