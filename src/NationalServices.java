import java.util.HashMap;
import java.util.Map;

public class NationalServices {

    private static  Map<String,NationalCard> nationalMap = new HashMap<>();

    static {
        nationalMap.put("12345674",new NationalCard("12345674","Sachin","BabuRam","Bardiya"));
        nationalMap.put("12345676",new NationalCard("12345676","Ramesh","Mahesh","Banke"));


    }

    public NationalCard getNationalCardNumber(String ID){

        return nationalMap.get(ID);
    }

}
