import java.util.HashMap;
import java.util.Map;

public class Theater<K, V extends Person> {
    public HashMap<K,V[]> rows = new HashMap<>();

    public void checkTickets() {
        for (Map.Entry<K, V[]> entry : rows.entrySet()) {

            K row = entry.getKey();
            V[] persons = entry.getValue();

            for (int i = 0; i < persons.length; i ++) {
                if (persons[i] == null) continue;
                System.out.println("Ряд: "+ row + " Место: " + i + " Зритель: " + persons[i].toString());
            }

        }
    }



    public void deleteClient(K row, int place) {
        rows.get(row)[place] = null;
    }


}
