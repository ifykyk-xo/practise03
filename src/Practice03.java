import java.util.Scanner;

public class Practice03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Завдання 1
        System.out.print("Введіть ім'я: ");
        String firstName1 = scanner.nextLine();

        System.out.print("Введіть прізвище: ");
        String lastName1 = scanner.nextLine();

        System.out.print("Введіть вік: ");
        int age1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть місто: ");
        String city1 = scanner.nextLine();

        System.out.println("=== ВХІДНІ ДАНІ ===");
        System.out.println("Ім'я: " + firstName1);
        System.out.println("Прізвище: " + lastName1);
        System.out.println("Вік: " + age1);
        System.out.println("Місто: " + city1);
        System.out.println("-------------------");
        System.out.println("Привіт, " + firstName1 + " " + lastName1 + " з міста " + city1 + "! Твій вік: " + age1 + " р.");

        // Завдання 2
        System.out.print("Введіть перше число: ");
        int a2 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b2 = scanner.nextInt();

        System.out.println("Сума: " + (a2 + b2));
        System.out.println("Різниця: " + (a2 - b2));
        System.out.println("Добуток: " + (a2 * b2));
        System.out.println("Остача від ділення: " + (a2 % b2));

        // Завдання 3
        System.out.print("Введіть суму в гривнях: ");
        double uah3 = scanner.nextDouble();

        System.out.print("Введіть курс USD: ");
        double rate3 = scanner.nextDouble();

        double dollars3 = Math.round((uah3 / rate3) * 100.0) / 100.0;

        System.out.println("Сума до видачі: " + dollars3 + " USD");

        // Завдання 4
        System.out.print("Введіть номер квитка: ");
        int ticket4 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть повне ім'я студента: ");
        String fullName4 = scanner.nextLine();

        System.out.print("Введіть спеціальність: ");
        String speciality4 = scanner.nextLine();

        System.out.println("Студент: " + fullName4
                + ", квиток №" + ticket4
                + ", спеціальність: " + speciality4);

        // Завдання 5
        System.out.print("Ваш зріст у метрах: ");
        double height5 = scanner.nextDouble();

        System.out.print("Ваша вага у кг: ");
        double weight5 = scanner.nextDouble();

        double bmi5 = weight5 / Math.pow(height5, 2);
        bmi5 = Math.round(bmi5 * 100.0) / 100.0;

        System.out.println("Розрахований BMI: " + bmi5);

        // Завдання 6
        System.out.print("Введіть символ: ");
        char ch6 = scanner.next().charAt(0);

        System.out.println("Символ: " + ch6);
        System.out.println("Код символу: " + (int) ch6);

        // Завдання 7
        System.out.print("Катет A: ");
        double a7 = scanner.nextDouble();

        System.out.print("Катет B: ");
        double b7 = scanner.nextDouble();

        double c7 = Math.sqrt(Math.pow(a7, 2) + Math.pow(b7, 2));
        double perimeter7 = a7 + b7 + c7;
        double area7 = (a7 * b7) / 2;

        System.out.println("Гіпотенуза: " + c7);
        System.out.println("Периметр: " + perimeter7);
        System.out.println("Площа: " + area7);

        // Завдання 8
        scanner.nextLine();

        System.out.print("Товар: ");
        String product8 = scanner.nextLine();

        System.out.print("Ціна: ");
        double price8 = scanner.nextDouble();

        System.out.print("Кількість: ");
        int quantity8 = scanner.nextInt();

        double total8 = price8 * quantity8;
        double vat8 = total8 * 0.20;

        System.out.println("Товар: " + product8);
        System.out.println("Загальна сума: " + total8
                + " грн (з них ПДВ 20%: " + vat8 + " грн)");

        // Завдання 9
        System.out.print("Введіть число: ");
        int number9 = scanner.nextInt();

        if (number9 > 0) {
            System.out.println("Число додатне");
        } else if (number9 < 0) {
            System.out.println("Число від'ємне");
        } else {
            System.out.println("Число дорівнює нулю");
        }

        // Завдання 10
        System.out.print("Введіть число: ");
        int number10 = scanner.nextInt();

        if (number10 == 0) {
            System.out.println("Число є нулем");
        } else if (number10 % 2 == 0) {
            System.out.println("Число " + number10 + " є парним");
        } else {
            System.out.println("Число " + number10 + " є непарним");
        }

        // Завдання 11
        System.out.print("Введіть вік: ");
        int age11 = scanner.nextInt();

        if (age11 < 0 || age11 > 120) {
            System.out.println("Некоректний вік");
        } else if (age11 <= 12) {
            System.out.println("Дитина");
        } else if (age11 <= 17) {
            System.out.println("Підліток");
        } else if (age11 <= 64) {
            System.out.println("Дорослий");
        } else {
            System.out.println("Пенсіонер");
        }

        // Завдання 12
        System.out.print("Введіть бал: ");
        int score12 = scanner.nextInt();

        if (score12 < 0 || score12 > 100) {
            System.out.println("Помилка: некоректний бал!");
        } else if (score12 >= 90) {
            System.out.println("Відмінно (A)");
        } else if (score12 >= 82) {
            System.out.println("Дуже добре (B)");
        } else if (score12 >= 74) {
            System.out.println("Добре (C)");
        } else if (score12 >= 64) {
            System.out.println("Задовільно (D)");
        } else if (score12 >= 60) {
            System.out.println("Достатньо (E)");
        } else {
            System.out.println("Незадовільно (F)");
        }

        // Завдання 13
        System.out.print("Введіть 3 числа: ");
        int a13 = scanner.nextInt();
        int b13 = scanner.nextInt();
        int c13 = scanner.nextInt();

        int max13 = a13;
        int min13 = a13;

        if (b13 > max13) {
            max13 = b13;
        }

        if (c13 > max13) {
            max13 = c13;
        }

        if (b13 < min13) {
            min13 = b13;
        }

        if (c13 < min13) {
            min13 = c13;
        }

        System.out.println("Максимум: " + max13);
        System.out.println("Мінімум: " + min13);

        System.out.print("Оберіть спосіб доставки: ");
        int delivery37 = scanner.nextInt();

        // Завдання 14
        System.out.print("Введіть X: ");
        double x14 = scanner.nextDouble();

        System.out.print("Введіть Y: ");
        double y14 = scanner.nextDouble();

        if (x14 == 0 && y14 == 0) {
            System.out.println("Точка знаходиться в початку координат");
        } else if (x14 == 0) {
            System.out.println("Точка лежить на осі Y");
        } else if (y14 == 0) {
            System.out.println("Точка лежить на осі X");
        } else if (x14 > 0 && y14 > 0) {
            System.out.println("Точка знаходиться у I чверті");
        } else if (x14 < 0 && y14 > 0) {
            System.out.println("Точка знаходиться у II чверті");
        } else if (x14 < 0 && y14 < 0) {
            System.out.println("Точка знаходиться у III чверті");
        } else {
            System.out.println("Точка знаходиться у IV чверті");
        }

        // Завдання 15
        int x15 = 5;
        int y15 = 20;

// else належить до найближчого if

        if (x15 > 10)
            if (y15 > 10)
                System.out.println("x більше 10 і y більше 10");
            else
                System.out.println("else належить до внутрішнього if");

// else належить до зовнішнього if

        if (x15 > 10) {
            if (y15 > 10) {
                System.out.println("x більше 10 і y більше 10");
            }
        } else {
            System.out.println("else належить до зовнішнього if");
        }
        
        // Завдання 16
        System.out.print("Спожито кВт год: ");
        double electricity16 = scanner.nextDouble();

        double payment16;

        if (electricity16 <= 100) {
            payment16 = electricity16 * 2.64;
        } else {
            payment16 = 100 * 2.64 + (electricity16 - 100) * 4.32;
        }

        System.out.println("Сума до сплати: " + payment16 + " грн");

        // Завдання 17
        System.out.print("Введіть x: ");
        int x17 = scanner.nextInt();

        System.out.print("Введіть y: ");
        int y17 = scanner.nextInt();

        int max17 = (x17 > y17) ? x17 : y17;

        System.out.println("Більше число: " + max17);

        // Завдання 18
        System.out.print("Введіть число: ");
        int n18 = scanner.nextInt();

        int abs18 = (n18 < 0) ? -n18 : n18;

        System.out.println("Абсолютне значення: " + abs18);

        // Завдання 19
        System.out.print("Введіть число: ");
        int number19 = scanner.nextInt();

        String result19 = (number19 % 2 == 0) ? "Парне" : "Непарне";

        System.out.println(result19);

        // Завдання 20
        System.out.print("Введіть бал: ");
        int score20 = scanner.nextInt();

        System.out.println("Результат: "
                + (score20 >= 60 ? "Зараховано" : "Незараховано"));

        // Завдання 21
        System.out.print("Введіть число: ");
        int n21 = scanner.nextInt();

        String status21 = (n21 > 0)
                ? "Додатне"
                : (n21 < 0)
                ? "Від'ємне"
                : "Нуль";

        System.out.println(status21);

        // Завдання 22
        System.out.print("Сума покупки: ");
        double purchase22 = scanner.nextDouble();

        double finalPrice22 = purchase22
                - purchase22 * ((purchase22 > 1000) ? 0.10 : 0.02);

        System.out.println("До сплати зі знижкою: "
                + finalPrice22 + " грн");

        // Завдання 23
        System.out.print("Введіть ділене: ");
        double a23 = scanner.nextDouble();

        System.out.print("Введіть дільник: ");
        double b23 = scanner.nextDouble();

        System.out.println(
                b23 != 0
                        ? "Результат: " + (a23 / b23)
                        : "Помилка: ділення на нуль неможливе!"
        );

        // Завдання 24
        System.out.print("Введіть кількість помилок: ");
        int count24 = scanner.nextInt();

        String result24 = (count24 == 1)
                ? "Знайдено 1 помилку"
                : "Знайдено " + count24 + " помилок";

        System.out.println(result24);

        // Завдання 25
        int x25 = 10;
        int divisor25 = 0;

        // права частина не виконується якщо ліва частина false

        if (divisor25 != 0 && (x25 / divisor25 > 1)) {
            System.out.println("Успішне ділення");
        } else {
            System.out.println("Ділення безпечно пропущено завдяки short circuit");
        }

        // Завдання 26
        int counter1 = 0;
        int counter2 = 0;

        boolean b1 = false && (++counter1 > 0);
        boolean b0 = false & (++counter2 > 0);

        System.out.println("counter1: " + counter1);
        System.out.println("counter2: " + counter2);

        // counter1 не збільшився через коротке замикання
        // counter2 збільшився тому що & перевіряє обидві частини

        // Завдання 27
        int number27 = 5;
        int ten27 = 10;
        int zero27 = 0;

        // права частина не виконується якщо ліва частина true

        if (number27 > 0 || (ten27 / zero27 == 0)) {
            System.out.println("Умова виконана аварійне ділення не викликалося");
        }

        // Завдання 28
        int counterA = 0;
        int counterB = 0;

        boolean test1 = true || (++counterA > 0);
        boolean test2 = true | (++counterB > 0);

        System.out.println("counterA: " + counterA);
        System.out.println("counterB: " + counterB);

        // counterA не збільшився через коротке замикання
        // counterB збільшився тому що | перевіряє обидві частини

        // Завдання 29
        System.out.print("Введіть години: ");
        int hours29 = scanner.nextInt();

        System.out.print("Введіть хвилини: ");
        int minutes29 = scanner.nextInt();

        boolean isValidTime29 =
                (hours29 >= 0 && hours29 <= 23)
                        && (minutes29 >= 0 && minutes29 <= 59);

        if (isValidTime29) {
            String hourText29 = (hours29 < 10)
                    ? "0" + hours29
                    : "" + hours29;

            String minuteText29 = (minutes29 < 10)
                    ? "0" + minutes29
                    : "" + minutes29;

            System.out.println("Час: " + hourText29 + ":" + minuteText29);
        } else {
            System.out.println("Помилка часу");
        }

        // Завдання 30
        System.out.print("Введіть сторони трикутника: ");
        int a30 = scanner.nextInt();
        int b30 = scanner.nextInt();
        int c30 = scanner.nextInt();

        boolean triangle30 =
                a30 + b30 > c30
                        && a30 + c30 > b30
                        && b30 + c30 > a30;

        System.out.println("Трикутник існує: " + triangle30);

        // Завдання 31
        System.out.print("Введіть число: ");
        int n31 = scanner.nextInt();

        boolean isEvenBitwise31 = (n31 & 1) == 0;
        boolean isEvenNormal31 = n31 % 2 == 0;

        System.out.println("Побітова перевірка: " + isEvenBitwise31);
        System.out.println("Звичайна перевірка: " + isEvenNormal31);
        System.out.println("Побітове І перевіряє останній біт");

        // Завдання 32
        boolean isPinCorrect32 = true;
        boolean isCardActive32 = true;
        boolean hasSufficientBalance32 = true;
        boolean isDailyLimitExceeded32 = false;

        boolean transactionAllowed32 =
                isPinCorrect32
                        && isCardActive32
                        && hasSufficientBalance32
                        && !isDailyLimitExceeded32;


        System.out.println("Транзакція дозволена: " + transactionAllowed32);

        // Завдання 33
        System.out.print("Введіть номер дня: ");
        int day33 = scanner.nextInt();

        switch (day33) {
            case 1:
                System.out.println("Понеділок");
                break;
            case 2:
                System.out.println("Вівторок");
                break;
            case 3:
                System.out.println("Середа");
                break;
            case 4:
                System.out.println("Четвер");
                break;
            case 5:
                System.out.println("П'ятниця");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неділя");
                break;
            default:
                System.out.println("Некоректний номер дня");
        }

        // Завдання 34
        System.out.print("Введіть номер дня: ");
        int day34 = scanner.nextInt();

        switch (day34) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Будній робочий день");
                break;
            case 6:
            case 7:
                System.out.println("Вихідний день");
                break;
            default:
                System.out.println("Некоректний номер дня");
        }

        // Завдання 35
        System.out.print("Введіть номер місяця: ");
        int month35 = scanner.nextInt();

        int days35 = switch (month35) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
        };

        if (days35 == 0) {
            System.out.println("Неіснуючий місяць");
        } else {
            System.out.println("Кількість днів: " + days35);
        }

        // Завдання 36
        scanner.nextLine();

        System.out.print("Введіть місяць: ");
        String month36 = scanner.nextLine();

        String season36 = switch (month36) {
            case "грудень", "січень", "лютий" -> "Зима";
            case "березень", "квітень", "травень" -> "Весна";
            case "червень", "липень", "серпень" -> "Літо";
            case "вересень", "жовтень", "листопад" -> "Осінь";
            default -> "Некоректний місяць";
        };

        System.out.println("Пора року: " + season36);

        // Завдання 37
        System.out.print("Оберіть спосіб доставки: ");
        delivery37 = scanner.nextInt();

        System.out.print("Введіть вагу товару у кг: ");
        double weight37 = scanner.nextDouble();

        double deliveryPrice37 = switch (delivery37) {
            case 1 -> 0;
            case 2 -> {
                if (weight37 > 5) {
                    yield 150;
                } else {
                    yield 90;
                }
            }
            case 3 -> 60;
            default -> -1;
        };

        System.out.println("Вартість доставки: "
                + deliveryPrice37 + " грн");

        // Завдання 38
        System.out.print("Число 1: ");
        double a38 = scanner.nextDouble();

        System.out.print("Оберіть операцію + - * /: ");
        char op38 = scanner.next().charAt(0);

        System.out.print("Число 2: ");
        double b38 = scanner.nextDouble();

        double result38 = switch (op38) {
            case '+' -> a38 + b38;
            case '-' -> a38 - b38;
            case '*' -> a38 * b38;
            case '/' -> {
                if (b38 == 0) {
                    System.out.println("Помилка: ділення на нуль");
                    yield 0;
                } else {
                    yield a38 / b38;
                }
            }
            default -> 0;
        };

        System.out.println("Результат: " + result38);

        // Завдання 39
        scanner.nextLine();

        System.out.print("Введіть команду: ");
        String command39 = scanner.nextLine();

        // == порівнює посилання а не текст

        if (command39.equalsIgnoreCase("start")) {
            System.out.println("Система успішно запущена");
        }

        switch (command39.toLowerCase()) {
            case "start" -> System.out.println("Команда start");
            case "pause" -> System.out.println("Система призупинена");
            case "stop" -> System.out.println("Система зупинена");
            case "exit" -> System.out.println("Вихід із системи");
            default -> System.out.println("Невідома команда");
        }

        // Завдання 40
        System.out.println("================ БАНКОМАТ ================");

        System.out.print("Введіть PIN: ");
        int pin40 = scanner.nextInt();

        if (pin40 == 1234) {

            System.out.println("Авторизація успішна!");

            double balance40 = 5000.0;

            System.out.println();
            System.out.println("1 - Баланс");
            System.out.println("2 - Поповнення");
            System.out.println("3 - Зняття");
            System.out.println("4 - Вихід");

            System.out.print("Оберіть дію: ");
            int action40 = scanner.nextInt();

            switch (action40) {

                case 1 -> {
                    System.out.println("Баланс: " + balance40 + " грн");
                }

                case 2 -> {
                    System.out.print("Введіть суму поповнення: ");
                    double deposit40 = scanner.nextDouble();

                    if (deposit40 > 0) {
                        balance40 = balance40 + deposit40;
                        System.out.println("Новий баланс: "
                                + balance40 + " грн");
                    } else {
                        System.out.println("Некоректна сума");
                    }
                }

                case 3 -> {
                    System.out.print("Введіть суму зняття: ");
                    double amount40 = scanner.nextDouble();

                    if (amount40 > 0 && amount40 <= balance40) {

                        double commission40 =
                                (amount40 > 1000)
                                        ? amount40 * 0.01
                                        : 0;

                        balance40 = balance40 - amount40 - commission40;

                        System.out.println("Комісія операції: "
                                + commission40 + " грн");

                        System.out.println("Видано: "
                                + amount40
                                + " грн. Залишок на рахунку: "
                                + balance40 + " грн");

                    } else {
                        System.out.println("Недостатньо коштів або некоректна сума");
                    }
                }

                case 4 -> {
                    System.out.println("Роботу завершено");
                }

                default -> {
                    System.out.println("Некоректний вибір");
                }
            }

        } else {
            System.out.println("Невірний PIN");
        }

        System.out.println("==========================================");

        scanner.close();
    }
}