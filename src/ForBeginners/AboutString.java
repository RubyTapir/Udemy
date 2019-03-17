package ForBeginners;

public class AboutString {
    public static void main(String[] args) {
        String s = "Fucking fuck";
        System.out.println(s.equals("Fucking fuck")); //сравниваем значение переменой s с выражением в скобках
        System.out.println(s.equals("Fucking"));

        String s1 = "FuCK";
        System.out.println(s1.equalsIgnoreCase("Fuck")); //сравнивается без учёта регистра

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

        System.out.println(s1.charAt(1)); //ищем символ по месту в слове
        System.out.println(s1.indexOf("CK")); //...и наоборот

        System.out.println(s1.contains("Fu")); //проверяем, есть ли заданное выражение в строке
        System.out.println(s1.length()); //длина строки

        System.out.println(s1.startsWith("F")); //проверяем, начинается ли строка с заданного выражения
        System.out.println(s1.endsWith("K")); //проверяем, заканчивается ли строка заданным выражением

        s = "Warning, Aliens!";
        String [] array = s.split(",");
        System.out.println(array[0] + ",humans,it's" + array[1]); //разбиваем строку на элементы массива и выводим по отдельности

        String str = "My name is %s I'm %d years oldfag"; //используем шаблон для разных значений
        int age = 35;
        String name = "Yury";
        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Petya", 22));

        String b = "10";
        int c = Integer.parseInt(b); //преобразуем строку в число
        System.out.println(c * 2);

        s = "Warning, Humans!";
        System.out.println(s.substring(3, 6)); //выделяем часть строки

        String v = "War";
        String v1 = "ning";
        String v2 = ",Aliens!";
        String res = v + v1 + v2; //способ конкатенации строк
        System.out.println(res);

        res = v.concat(v1).concat(v2); //...или так
        System.out.println(res);

    }


}
