import java.util.HashMap;
import java.util.Map;

public class PANServices {
    private static Map<String,PAN> panMap = new HashMap<>();
    static {
        panMap.put("ED123",new PAN("ED123","12345674","NIMB","STOCK , CRICKET"));
        panMap.put("ED124",new PAN("ED124","12345676","NIMB","STOCK , CRICKET"));




    }

    public PAN getPANbyNationalNumber(String nationalNumber){
        for(PAN pan: panMap.values()){
            if(pan.getNationalNumber().equals(nationalNumber)){
                return pan;
            }
        }
        return null;
    }
}
