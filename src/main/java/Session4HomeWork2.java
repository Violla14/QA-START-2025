public class Session4HomeWork2 {

    /* TODO:
       - перевірити, чи мейл закінчується на gmail.com
       - перевірити, чи містить не більше одного символу '@'
       - замінити всі крапки на '_' окрім останньої
    */

    public static void main(String[] args) {
        String email = "my.home.mail@gmail.com";

        // Перевірка, чи закінчується на "gmail.com"
        boolean endsWithGmail = email.endsWith("gmail.com");
        System.out.println("Закінчується на 'gmail.com': " + endsWithGmail);

        // Перевірка кількості '@'
        int atCount = 0;
        for (char ch : email.toCharArray()) {
            if (ch == '@') atCount++;
        }
        System.out.println("Кількість '@': " + atCount);
        System.out.println("Не більше одного '@': " + (atCount <= 1));

        // Рахуємо кількість крапок
        int dotCount = 0;
        for (char ch : email.toCharArray()) {
            if (ch == '.') dotCount++;
        }
        System.out.println("Кількість крапок: " + dotCount);

        if (dotCount > 0) {
            int lastDotIndex = email.lastIndexOf('.');

            // Частина до останньої крапки (замінюємо всі крапки на "_")
            String beforeLastDot = email.substring(0, lastDotIndex).replace(".", "_");

            // Частина з останньою крапкою і після неї
            String afterLastDot = email.substring(lastDotIndex);

            // Результат
            String result = beforeLastDot + afterLastDot;
            System.out.println("Результат трансформації: " + result);
        } else {
            System.out.println("Крапок не знайдено — трансформація не потрібна.");
        }
    }
}

