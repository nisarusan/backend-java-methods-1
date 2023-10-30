public class B_Dialoog {

    public static void main(String[] args) {
        // In deze dialoog praten Bert en Ernie met elkaar.
        // Maak methode bertSays die "Bert says: " + de string print en een methode ernieSays die de string " says Ernie" print.
        // De methode heeft als parameter de tekst die gesproken moet worden.
        // De volgende zin wordt steeds door de ander gesproken.
        // Vervang System.out.println() steeds door je eigen method.

        String[] name = { "Bert", "Ernie" };
        bertSay(name[0], "Hey!");
        ernieSay(name[1], "Hey");

        ernieSay(name[1], "Welcome to this wonderful conversation");
        bertSay(name[0], "Thnx, I'm looking forward to it");
       ernieSay(name[1],"How about this weather?");
        bertSay(name[0],"I really don't mind the cold....");
        ernieSay(name[1],"And did you see that random program on that random channel?");
        bertSay(name[0], "Well... I did watch a random program on a random channel...");
        ernieSay(name[1],"Thank you for a wonderful conversation!");
        bertSay(name[0], "Cya");
    }
   static void bertSay(String name, String say) {
       System.out.println(name + " : " + say); //Bert
   }

   static void ernieSay(String name, String say) {
       System.out.println(name + " : " + say); //Ernie
   }

    // nieuwe methods komen hier
}
