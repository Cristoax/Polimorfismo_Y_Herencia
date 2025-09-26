package run;

import Models.Visit;
import dao.VisitDao;
import util.Conexion;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Visit visita = new Visit("Antony Lacayo", "123", "lacayo@gmail.com","DGarcias", "Consulta");
        VisitDao dao = new VisitDao();

        dao.agregar(visita);
    }
}
