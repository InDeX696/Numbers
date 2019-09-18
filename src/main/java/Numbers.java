import java.util.HashMap;
import java.util.Map;

public class Numbers {
    public static String get(int i) {
        String result="cero";
        String number = i + "";

        int  num = number.length();
        if(num == 1) {
            Map<Integer, String> units = initMapUnits();
            return simple(units,i);
        }
        if(num == 2) {
           Map<Integer, String> tens = initMapTens();
           return simple(tens, i);
        }
        return "Error";
    }

    private static Map<Integer, String> initMapTens() {
        Map<Integer,String> tens = new HashMap<Integer, String>();
        String L[] = new String[]{"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        for(int i = 1; i<10; i++ ){
            tens.put(i*10 , L[i-1]);
        }
        return tens;
    }

    public static String  simple(Map<Integer, String> map, int num){
        if(map.containsKey(num)){
            return map.get(num);
        }
        return "Error";
    }
    private static Map<Integer, String> initMapUnits(){
        Map< Integer, String> units = new HashMap<Integer,String >();
        String L[] = new String[]{"cero","one", "two","three","four","five","six","seven","eight","nine"};
        for(int i = 0; i<10; i++ ){
            units.put(i , L[i]);
        }
        return units;
    }
}
