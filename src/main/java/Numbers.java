import java.util.HashMap;
import java.util.Map;

public class Numbers {
    public static String get(int i) {
        String number = i + "";
        Map<Integer, String> units = initMapUnits();
        Map<Integer, String> tens = initMapTens();
        int  num = number.length();
        if(num == 1) {
            return simple(units,i);
        }
        if(num == 2) {
            return tens.containsKey(i) ? simple(tens, i) : compoundTens( tens,units, number);
        }
        if(num == 3){

            return compoundHundred(tens,units,number);
        }
        return "Error";
    }
    private static String compoundTens(Map<Integer, String> tens, Map<Integer,String> units,String n) {
        String result = simple(tens, Character.getNumericValue(n.charAt(0))*10) + "-";
        return result + simple(units, Character.getNumericValue(n.charAt(1)));
    }
    private static String compoundHundred(Map<Integer, String> tens, Map<Integer,String> units,String n) {
            String result = "-hundred";
            if(n.charAt(0) != 0){
                result = simple(units,Character.getNumericValue(n.charAt(0))) + result;
            }
            if(Character.getNumericValue(n.charAt(1)) > 1){

                result = result +"-"+ simple(tens, Character.getNumericValue(n.charAt(1))*10);

            }else if(Character.getNumericValue(n.charAt(1)) == 1){

                result = result + "-"+simple(tens,Character.getNumericValue(n.charAt(1) + n.charAt(2)));
                return result;
            }
            if(Character.getNumericValue(n.charAt(2)) != 0){
                result = result +"-"+ simple(units,Character.getNumericValue(n.charAt(2)));
            }
            return result;

    }

    private static Map<Integer, String> initMapTens() {
        Map<Integer,String> tens = new HashMap<Integer, String>();
        String L[] = new String[]{"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int numbers[] = {10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90};
        for(int i = 0; i<18; i++ ){
            tens.put(numbers[i] , L[i]);
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
