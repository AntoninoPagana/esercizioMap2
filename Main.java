import java.util.*;
public class Main {
    public static void main(String[] args) {
        Map<String, String> mappa = new HashMap<>();
        mappa.put("Nike", "Scarpe");
        mappa.put("Adidas", "Sciarpa");
        mappa.put("Asics", "Pantaloni");

        List<Map.Entry<String, String>> entryList = new ArrayList<>(mappa.entrySet());

        //Ordinamento
        Collections.sort(entryList, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> entry1, Map.Entry<String, String> entry2) {
                return entry1.getKey().compareTo(entry2.getKey());
            }
        });

        //Stampa elementi ordinati
        for (Map.Entry<String, String> element : entryList) {
            System.out.println("lista ordinata element: " + element);
        }
    }
}