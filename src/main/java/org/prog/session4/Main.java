package org.prog.session4;

public class Main {

    public static void main(String[] args) {
//        0  - 0  - 0
//        1  - 1  - 1
//        2  - 2  - 10
//        3  - 3  - 11
//        4  - 4  - 100
//        5  - 5  - 101
//        6  - 6  - 110
//        7  - 7  - 111
//        8  - 8  - 1000
//        9  - 9  - 1001
//        10 - A  - 1010
//        11 - B  - 1011
//        12 - C  - 1100
//        13 - D  - 1101
//        14 - E  - 1110
//        15 - F  - 1111

//        String s1 = "some value";
//        String s2 = "and another value";
//        String s3 = "TO LOWER CASE"; // Строка с записью (тетрадка с записью)
//        String s4 = ""; // Пустая строка (есть тетрадь, но нет записи)
//        String s4 = null; // Пустое место (без тетради и без записи)
//        System.out.println(s1);
//
//        System.out.println(s1.length()); //10 узнаем какая длина строки
//        System.out.println(s2.length()); //0
//
//        System.out.println("=================================");
//        System.out.println(s1 + " \r\n " + s2); // конкатенация (объединение строк), \r\n делает надпись со следующей строки, "" делает пробел
//        System.out.println("=================================");
//        System.out.println(s1.toUpperCase()); // Верхний регистр (все большими буквами)
//        System.out.println(s3.toLowerCase()); // Нижний регистр (все маленькими буквами)
//
//        System.out.println(s1.charAt(0)); //посмотреть есть ли на этом месте какой то символ (отсчет идет с нуля - индексация с нуля), то есть тут смотрим какой первый символ
//        System.out.println(s1.charAt(1)); // тут проверяем какой второй символ
//        System.out.println(s1.charAt(4)); // какой 5-й

//        s1.toCharArray(); // разбивание строки на массив букв (что бы в программе была задержка печатания букв к примеру, будто печатает человек)
//        for (int i = 0; i < s1.toCharArray().length; i++) {
//            System.out.println("Chat at " + i + " : " + s1.toCharArray()[i]);
//        }

        String s4 = "some value as well";
        System.out.println(s4.indexOf("lu")); // смотрим индекс буквы (местоположение в тексте). Где находится первая буква "l". Ищет по первой букве слова
        System.out.println(s4.indexOf("l"));
        System.out.println(s4.lastIndexOf("l")); //ищем местоположение последней буквы "l"
        System.out.println(">>>>>" + s4.indexOf("e", s4.indexOf("e") + 1)); //поиск буквы "e" посередине. В данном случае вторая от первой и-за "+1". "+2" - искало бы местоположение 3-й "е"
        // Оно звучит так, что я хочу найти первую букву "е" после того как нашла первую букву "е".

        System.out.println(s4.equals("some value as well")); //сравнение строк. Нельзя сравнивать строки через ==, такое работает только для int
        System.out.println(s4.equals("Some value as well"));
        System.out.println(s4.equalsIgnoreCase("Some value as well")); //equalsIgnoreCase - игнорирует регистр букв, смотрит только на совпадение слов(значений)

        System.out.println("--------------------------------------");

        System.out.println(s4.startsWith("some")); //начинается ли строка со слова "some" с маленькой буквы
        System.out.println(s4.startsWith("Some")); //начинается ли строка со слова "Some" с большой буквы
        System.out.println(s4.endsWith("ll")); //заканчивается ли строка буквами "ll" (взять в домашку)
        String[] strings = s4.split(" "); //разделить  строку по каком то символу на несколько элементов(на массивы), в данном случае через пробел
        System.out.println(strings.length);
        String s5 = "   " + s4 + "   "; //если надо убрать вначале и/или вконце пробелы
        System.out.println(s5);
        System.out.println(s5.trim());

    }
}
