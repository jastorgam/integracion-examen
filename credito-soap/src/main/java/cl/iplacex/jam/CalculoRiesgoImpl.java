package cl.iplacex.jam;

import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author JAM
 */
@WebService
public class CalculoRiesgoImpl {

    private ArrayList<Solicitante> solicitantes;

    public CalculoRiesgoImpl() {
        this.solicitantes = new ArrayList<>();

        this.solicitantes.add(new Solicitante("bajo", "11111111-1"));
        this.solicitantes.add(new Solicitante("medio", "22222222-2"));
        this.solicitantes.add(new Solicitante("alto", "33333333-3"));

    }

    public String calcularRiesgo(
            @WebParam(name = "rut") String rut) {

        for (Solicitante s : solicitantes) {
            if (
                s.rut.trim().toLowerCase().replaceAll("-", "")
                .equals(rut.trim().toLowerCase().replaceAll("-", ""))
            ) {
                return s.riesgo;
            }
        }

        return "alto";

    }

    public String listarSolicitantes() {
        String retorno = new String();
        for (Solicitante s : solicitantes) {
            retorno += s.toString();
        }
        return retorno;
    }
}
