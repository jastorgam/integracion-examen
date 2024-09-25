/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.iplacex.jam;

/**
 *
 * @author JAM
 */
public class Solicitante {

    public String riesgo;
    public String rut;

    public Solicitante() {
    }

    public Solicitante(String riesgo, String rut) {
        this.riesgo = riesgo;
        this.rut = rut;
    }

    @Override
    public String toString() {
        return String.format("%s - %s\n", riesgo, rut);
    }
}
