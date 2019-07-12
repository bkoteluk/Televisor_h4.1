public class TellyTest {
    public static void main(String[] args) {
        Televisor tv = new Televisor();
//       1. Wyświetlenie statusu
        System.out.println("Is TV switched on ? " + tv.showStatus());
//       2. Włączenie telewizora i ponowne wyświetlenie statusu
        tv.turnOn();
        System.out.println("Is TV switched on ? " + tv.showStatus());
//       3. Wyłączenie telewizora i ponowne wyświetlenie statusu
        tv.turnOff();
        System.out.println("Is TV switched on ? " + tv.showStatus());


    }
}
