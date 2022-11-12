public class EinkaufswagenTest {

    public static void main(String[] args) {


        // Objekt von Typ Einkaufswagen wird erstellt.

        Einkaufswagen cart = new Einkaufswagen();

        // Hinzufügen von Objekten.
        cart.addToCart("Birne");
        // Anzeigen des aktuellen Inhalts.
        cart.showContent();
        // Testversuch: Entfernen eines Objektes, ohne das es im Einkaufswagen liegt.
        cart.removeFromCart("Salat");
        // Anzeigen
        cart.showContent();
        // Anzahl der Objekte anzeigen.
        cart.size();


        cart.addToCart("Apfel");
        cart.addToCart("Kürbis");
        cart.addToCart("Schoki");
        cart.addToCart("Banane");
        cart.showContent();
        cart.size();
        // Testversuch: Mehr als 5 Objekte in den Wagen packen
        cart.addToCart("Linsen");

        cart.showContent();
        cart.size();


        // TestVersuch: Aus einem leeren Einkaufswagen ein Objekt entfernen.
        cart.removeFromCart("Birne");
        cart.removeFromCart("Apfel");
        cart.removeFromCart("Kürbis");
        cart.removeFromCart("Schoki");
        cart.removeFromCart("Banane");

        cart.showContent();

        cart.removeFromCart("Banane");

        cart.showContent();
        cart.size();




    }
}
