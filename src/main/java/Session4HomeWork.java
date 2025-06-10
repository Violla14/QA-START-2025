public class Session4HomeWork {

    /*TODO: перевірити чи мейл my.home.mail@gmail.com підпадає під правила:
    - закінчується на gmail.com
    - не містить більше одного символу @
    * - замінити всі крапки на _ окрім останньої

     */

        public static void main(String[] args) {
            String username = "my.home.mail@gmail.com";

            // Перевірка, чи починається на "@gmail.com" — буде false
            System.out.println("Починається на 'gmail.com': " + username.startsWith("gmail.com"));

            // Перевірка, чи закінчується на "@gmail.com" — правильна перевірка
            System.out.println("Закінчується на 'gmail.com': " + username.endsWith("gmail.com"));
            int count = 0;

      for (int i = 0; i < username.toCharArray().length; i++) {
           if (username.charAt(i) == '@'){
               System.out.println("@ found at: " + i);
               count++;

               System.out.println(username.indexOf("@"));
               System.out.println(username.lastIndexOf("@"));

               // 2. Перевірка, що тільки один '@'
               int atCount = 0;
               for (char ch : username.toCharArray()) {
                   if (ch == '@') atCount++;
               System.out.println("Кількість символів '@': " + atCount);
               boolean onlyOneAt = atCount == 1;

               // 3. Заміна всіх крапок на '_' окрім останньої
               int lastDotIndex = username.lastIndexOf('.');
               String beforeLastDot = username.substring(0, lastDotIndex); // усе до останньої крапки
               String afterLastDot = username.substring(lastDotIndex);     // остання крапка + решта

               String transformed = beforeLastDot.replace(".", "_") + afterLastDot;


               }
           }






