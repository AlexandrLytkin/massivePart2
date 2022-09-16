public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        task1();
        task2();
    }
    public static void task2() {
        System.out.println("Задание2");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static void task1() {
        System.out.println("Задание1.2.3");
        int[] arr;
        arr = new int[30];
        arr[0] = 102500;
        arr[1] = 100500;
        arr[2] = 170500;
        arr[3] = 100600;
        arr[4] = 189000;
        arr[5] = 145550;
        arr[6] = 155600;
        arr[7] = 154600;
        arr[8] = 198600;
        arr[9] = 128600;
        arr[11] = 143600;
        arr[12] = 113600;
        arr[13] = 193600;
        arr[14] = 103600;
        arr[15] = 193600;
        arr[16] = 163600;
        arr[17] = 143600;
        arr[18] = 123600;
        arr[19] = 114600;
        arr[20] = 187600;
        arr[21] = 176600;
        arr[22] = 135600;
        arr[23] = 123600;
        arr[24] = 174600;
        arr[25] = 184600;
        arr[26] = 167600;
        arr[27] = 144600;
        arr[28] = 134600;
        arr[29] = 187600;
        int salary = 0;
        int minSalary = arr[0];
        int maxSalary = arr[0];
        int i = 0;
        while (i < arr.length) {
            salary = salary + arr[i];
            if (arr[i] > maxSalary) {
                maxSalary = arr[i];

                if (arr[i] < minSalary)
                    minSalary = arr[i];
            }
            i++;
        }
        System.out.println("Сумма трат за месяц составила " + salary + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxSalary + " рублей");
        System.out.println("Средняя сумма трат за месяц составила " + salary / arr.length + " рублей");
    }
}