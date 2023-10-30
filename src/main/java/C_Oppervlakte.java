public class C_Oppervlakte {

    public static void main(String[] args) {
        int antwoord = 0;
        // Uncomment de regels en maak een method die voor het juiste antwoord zorgt.
        antwoord = oppervlakteRechthoek(2, 8);
        System.out.println("De oppervlakte van een rechthoek met lengte 2 en breedte 8 is " + antwoord);

        antwoord = oppervlakteVierkant(5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteRechthoek()` hergebruiken.
        System.out.println("De oppervlakte van een vierkant met zijden van 5 cm is " + antwoord);

        antwoord = oppervlakteDoos(2,8,5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteRechthoek()` hergebruiken.
        System.out.println("De oppervlakte van een doos met lengte 2, breedte 8 en hoogte 5 is " + antwoord);

        antwoord = oppervlakteKubus(5); // Je kunt bij de implementatie van deze method een nieuwe berekening doen, of `oppervlakteVierkant()` hergebruiken, of `oppervlakteDoos()` hergebruiken.
        System.out.println("De oppervlakte van een kubus met zijden van 5 cm is " + antwoord);
    }


     static int oppervlakteRechthoek(int length, int width) {
        return length * width;
    }

    static int oppervlakteVierkant(int length) {
        return oppervlakteRechthoek(length, length);
    }

    static int oppervlakteDoos(int length, int hight, int side) {
        int bottom_en_top = oppervlakteRechthoek(length, hight) * 2; // of int bottom_en_top = oppervlakteRechtheok(x, y) * 2
        int voorkant_en_achterkant = oppervlakteRechthoek(length, side) * 2; // of int bottom_en_top = oppervlakteRechtheok(x, z) * 2
        int links_en_rechts = oppervlakteRechthoek(hight, side) * 2; // of int bottom_en_top = oppervlakteRechtheok(y, z) * 2
        return bottom_en_top + voorkant_en_achterkant + links_en_rechts;
    }

    static int oppervlakteKubus(int length) {
        return length * length * 6;
    }


    // nieuwe methods komen hier

}
