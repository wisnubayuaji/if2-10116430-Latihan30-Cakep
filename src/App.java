/**
 * @author
 * Nim  : 10116430
 * Nama : Wisnu Bayu Aji
 * Kelas: IF-2
 */
public class App {
    public static void main(String[] args) throws Exception {

        String yoi = "yoi", enggak = "enggak";
        Scanner scanner = new Scanner(System.in);

        System.out.print("\033[31mKamu ");
        System.out.print("\033[32mngerjain sendiri ");
        System.out.print("\033[33mlatihan 17 ");
        System.out.println("\033[34msampai latihan 30 ini? ");
        System.out.print("\033[31mJawab ");
        System.out.print("(\033[32mYoi/Enggak) : ");
        String jawab = scanner.next();

        if (jawab.equalsIgnoreCase(yoi)) {
            System.out.println("");
            System.out.print("\033[33mCakep Bener. ");
            System.out.println("\033[34mGood Job");
        } else if (jawab.equalsIgnoreCase(enggak)) {
            System.out.println("");
            System.out.println("\033[31mTetep Cakep Sih.");
            System.out.println("\033[32mSing penting paham konsep nya yee");
            System.out.println("\033[33mKeep the code works dude");
        } else {
            System.out.println("\033[34mIsi sesuai dengan pilihan yang di sediakan");
        }
    }
}
