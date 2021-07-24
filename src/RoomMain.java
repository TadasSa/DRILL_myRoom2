import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {

        Scanner roomScanner = new Scanner(System.in);
        System.out.println("Iveskite kambario ilgi: ");
        int ilgis = roomScanner.nextInt();

        System.out.println("Iveskite kambario ploti: ");
        int plotis = roomScanner.nextInt();

        Room myRoom = new Room(ilgis, plotis);

        int result = squareOfRoom(myRoom);
        printResult(result);
    }

    public static int squareOfRoom(Room myRoom) {
        return myRoom.getLength() * myRoom.getWidth();
    }

    public static void printResult(int resultToPrint) {
        System.out.println("Kambario plotis: " + resultToPrint);
    }
}
