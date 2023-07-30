package ru.gb.AddHomework6;

import java.util.ArrayList;
import java.util.List;

public class AllOrdenadores {
    private List<Ordenador> ordenadores = new ArrayList<>();
    public AllOrdenadores(){

    }
    public AllOrdenadores(List<Ordenador> ordenadores){
        this.ordenadores = ordenadores;
    }

    public List<Ordenador> getOrdenadores() {
        return ordenadores;
    }

    public void setOrdenadores(List<Ordenador> ordenadores) {
        this.ordenadores = ordenadores;
    }
    public void addOrdenador(Ordenador ordenador){
        ordenadores.add(ordenador);
    }
    public void Print() {
        for (int i = 0; i < ordenadores.size(); i++) {
            System.out.println(ordenadores.get(i));
        }
    }
    public void FindPantallaForSize(Double size){
        for (int i = 0; i < ordenadores.size(); i++) {
            if (ordenadores.get(i).getDisplaySize() == size){
                System.out.println(ordenadores.get(i));
            }
        }
    }
    public void FindQuantityOfCores(Integer cores){
        for (int i = 0; i < ordenadores.size(); i++) {
            if (ordenadores.get(i).getQuantityOfCores() == cores){
                System.out.println(ordenadores.get(i));
            }
        }
    }
    public void FindSpaceOfSSD(Integer ssd){
        for (int i = 0; i < ordenadores.size(); i++) {
            if (ordenadores.get(i).getSpaceSSD() == ssd){
                System.out.println(ordenadores.get(i));
            }
        }
    }
    public void FindSpaceOfRAM(Integer ram){
        for (int i = 0; i < ordenadores.size(); i++) {
            if (ordenadores.get(i).getSizeRAM() == ram){
                System.out.println(ordenadores.get(i));
            }
        }
    }
}
