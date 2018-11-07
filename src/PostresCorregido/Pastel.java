/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PostresCorregido;

/**
 *
 * @author Pedro Mendoza
 */
public class Pastel extends Postre{
    
    
    public Pastel(String sabor) {
        super(sabor);
    }

    @Override
    public String toString() {
        return "Pastel sabor a " + super.getSabor() + ",con precio parcial " + super.getPrecioParcial() + ",y precio total de " + super.calcularPrecioFinal() + " incluye los aderezos " + super.getAderezos() + ",y esta hecho de " + super.getLeche();
    }
    
}
