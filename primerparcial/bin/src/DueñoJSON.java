import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class dueñoJSON {


    public static void main(String[] args) throws Exception {
    	dueñoJSON representacion = new dueñoJSON();
    	
    
    	
    	
    	
    }
    
    public static String objetoString(Persona p) {	
    	
		JSONObject obj = new JSONObject();
        obj.put("cedula", p.getCedula());
        obj.put("nombre", p.getNombre());
        obj.put("apellido", p.getApellido());
        obj.put("chapa", p.getChapa());
        obj.put("marca", p.getMarca());
        return obj.toJSONString();
    }
    
    
    public static Dueño stringObjeto(String str) throws Exception {
    	Dueño p = new Dueño();
        JSONParser parser = new JSONParser();

        Object obj = parser.parse(str.trim());
        JSONObject jsonObject = (JSONObject) obj;

        Long cedula = (Long) jsonObject.get("cedula");
        Long chapa = (Long) jsonObject.get("chapa");
        p.setCedula(cedula);
        p.setNombre((String)jsonObject.get("nombre"));
        p.setApellido((String)jsonObject.get("apellido"));
        p.setchapa(chapa);
        
        return p;
	}

}
