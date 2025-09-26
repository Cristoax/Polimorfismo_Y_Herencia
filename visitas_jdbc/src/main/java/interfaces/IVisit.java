package interfaces;

import Models.Visit;

import java.util.ArrayList;

public interface IVisit {
    public void agregar(Visit visit);
    ArrayList<Visit> obtenerVisitas();
}
