// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("James","Programmer","Amazon");
        System.out.println();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(programmer);
        System.out.println("-----------------------------------------------------");
        Singer singer = new Singer("Charlie","singer","312");
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        System.out.println(singer);
        System.out.println("------------------------------------------------------");
        Dancer dancer = new Dancer("Max","dancer","WeNext");
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(dancer);


    }
}