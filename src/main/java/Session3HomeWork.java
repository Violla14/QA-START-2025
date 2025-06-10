import java.util.Random;

public class Session3HomeWork {
    public static void main(String[] args) {
        int[] hotelRooms = new int[15];
        Random rand = new Random();

        // Заповнення масиву випадковими числами
        for (int i = 0; i < hotelRooms.length; i++) {
            hotelRooms[i] = rand.nextInt(25); // значення від 0 до 24
        }

        // Вивід ДО сортування
        System.out.print("До сортування:    ");
        for (int i = 0; i < hotelRooms.length; i++) {
            System.out.print(hotelRooms[i] + " ");
        }
        System.out.println();

        // Сортування за спаданням
        boolean unsorted = true;

        while (unsorted) {
            boolean elementsSwitched = false;

            for (int i = 0; i < hotelRooms.length - 1; i++) {
                if (hotelRooms[i + 1] > hotelRooms[i]) {
                    int temp = hotelRooms[i];
                    hotelRooms[i] = hotelRooms[i + 1];
                    hotelRooms[i + 1] = temp;
                    elementsSwitched = true;
                }
            }

            unsorted = elementsSwitched;
        }

        // Вивід ПІСЛЯ сортування
        System.out.print("Після сортування: ");
        for (int i = 0; i < hotelRooms.length; i++) {
            System.out.print(hotelRooms[i] + " ");
        }
        System.out.println();
    }
}