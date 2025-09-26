package dao;

import interfaces.IVisit;
import Models.Visit;
import util.Conexion;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class VisitDao implements IVisit {
    @Override
    public void agregar(Visit visita) {
        try{
            String sql ="INSERT INTO visit (visitor_name, visitor_documents, visitors_email, host_name, reason) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = Conexion.getConnection().prepareStatement(sql);
            ps.setString(1, visita.getVisitor_name());
            ps.setString(2, visita.getVisitor_document());
            ps.setString(3, visita.getVisitor_email());
            ps.setString(4, visita.getHost_name());
            ps.setString(5, visita.getReason());
            ps.executeUpdate();
            ps.close();
            System.out.println("Visita agregada correctamente");
    }catch(SQLException e){
            System.out.println("Error al agregar visita "+e.getMessage());
        }
    }

    @Override
    public ArrayList<Visit> obtenerVisitas() {
        ArrayList<Visit> visitas = new ArrayList<>();

        try {
            
        }
        return null;
    }
}
