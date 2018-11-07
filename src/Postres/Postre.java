/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postres;

import Leche.*;
import Otros.Aderezo;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public abstract class Postre{
        
    private String sabor;
    private double precioParcial;
    private ArrayList<Aderezo> aderezos;
    private ILeche leche;
    
    public Postre(String sabor){
        this.leche=new LecheEntera();
        aderezos= new ArrayList<>();
        this.sabor=sabor;
    }
    
    public double calcularPrecioFinal(){
        double precioFinal;
        precioFinal=(precioParcial+(precioParcial*0.12))+(aderezos.size()*0.50);
        return precioFinal;
    }

    public ArrayList<Aderezo> getAderezos() {
        return aderezos;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPrecioParcial() {
        return precioParcial;
    }

    public void setPrecioParcial(double precioParcial) {
        this.precioParcial = precioParcial;
    }

    public ILeche getLeche() {
        return leche;
    }

    public void setLeche(ILeche leche) {
        this.leche = leche;
    }

    
}
