package ec.edu.espe.Database.model;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.Mongo;
import java.net.UnknownHostException;

public class Connection {

    DB BaseDatos;
    DBCollection coleccion;
    BasicDBObject document = new BasicDBObject();

    public Connection() {
        try {
            Mongo mongo = new Mongo("localhost", 27017);
            BaseDatos = mongo.getDB("ToDo");
            coleccion = BaseDatos.getCollection("ToDo");
            System.out.println("Connect to database sucecessfully");
        } catch (UnknownHostException ex) {

        }
    }

    public boolean Insertar(String accion) {
        document.put("accion", accion);
        coleccion.insert(document);
        return true;
    }

    public void Mostrar() {
        DBCursor cursor = coleccion.find();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }

    public boolean actualizar(String actionOld, String accionNew) {
        document.put("accion", actionOld);
        BasicDBObject documentNew = new BasicDBObject();
        documentNew.put("accion", accionNew);
        coleccion.findAndModify(document, documentNew);
        return true;
    }

    public boolean eliminar(String action) {
        document.put("accion", action);
        coleccion.remove(document);
        return true;
    }

}

