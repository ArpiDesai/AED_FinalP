/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB4OUtilConn;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ta.TransparentPersistenceSupport;
import model.system;



/**
 *
 * @author arpid
 */
public class DB40Util {
    private final String FILENAME = "BloodBank.db4o";// path to the data store
    private static DB40Util dB4OUtil;
    
    public synchronized static DB40Util getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB40Util();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
              ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), FILENAME);
//            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
//            config.common().add(new TransparentPersistenceSupport());
//            //Controls the number of objects in memory
//            config.common().activationDepth(Integer.MAX_VALUE);
//            //Controls the depth/level of updation of Object
//            config.common().updateDepth(Integer.MAX_VALUE);
//
//            //Register your top most Class here
//            config.common().objectClass(MainSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

//            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
              return db;
        } catch (Exception ex) {
            java.lang.System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(system s) {
        ObjectContainer conn = createConnection();
        conn.store(s);
        conn.commit();
        conn.close();
    }
    
    public system retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet result = conn.queryByExample(system.class); 
        system s;
        if (result.size() == 0){
            s = system.getInstance();  
            System.out.println(result);
            System.out.println(1);
        }
        else{
            s = (system) result.get(result.size() - 1);
            System.out.println(result);
            System.out.println(2);
        }
        conn.close();
        return s;
    }
    
}
