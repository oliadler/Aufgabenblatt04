import java.util.ArrayList;
import java.util.Iterator;

public class Einkaufswagen {


    // Instanzvariable: Liste der Objekte.
    private ArrayList<String> items = new ArrayList<>();

    // Instanzvariable: Maximale Anzahl der Objekte im Einkaufswagen.
    private int maxItems = 5;

    // Fügt neue Objekte hinzu.
    public void addToCart(String item)
    {
        if (maxItems > items.size())
        {
            items.add(item);
        }
        else
        {
            System.out.println("Der Einkaufswagen ist voll.");
        }
    }

    // Entfernt Objekte aus dem Einkaufswagen.
    public void removeFromCart(String item)
    {

        Iterator itemsIterator = items.iterator();

        // Überprüft ob der Einkaufswagen nicht bereits leer ist.
        if (items.size() > 0)
        {
            // Es können nur Objekte herausgenommen werden, die im Einkaufswagen liegen.
            if (itemsIterator.next() == item){
                items.remove(item);
            }
            else {
                System.out.println("Im Einkaufswagen gibt es nicht: "+item);
            }
        }
        else
        {
            System.out.println("Der Einkaufswagen ist bereits leer.");
        }
    }

    // Methode, um den aktuellen Inhalt des Einkaufswagens anzuzeigen.
    public void showContent()
    {
        if (items.size() == 0)
        {
            System.out.println("Aktuell sind keine Objekte im Einkaufswagen.");

        }
        else
        {
            System.out.println("Liste der aktuellen Objekte:");
            for (String item: items) {
                System.out.println(item);
            }
        }
        }




    // Gibt die Anzahl der Elemente im Einkaufswagen an.
    public void size()
    {
        System.out.println("Anzahl der Objekte im Einkaufswagen:"+  items.size());

    }
}
