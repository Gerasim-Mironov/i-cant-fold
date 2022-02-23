package main;

public class main {

    public static void main(String[] args)
    {
        // первое
        /*human hh = new human("Александр", "мужчина", "белый", 17);
        System.out.println(hh + "\n");

        builder b = new builder(hh.getName(), hh.getGender(), hh.getRace(), hh.getAge(), "ни дня в жизни не работал");
        System.out.println(b + "\n");

        sailor sl = new sailor("Герасим", "мужчина", "белый", 21, "ни дня в жизни не работал", true);
        System.out.println(sl +  "\n");

        pilot unl = new pilot("Анатолий", "мужчина", "белый", 23, "3 года", false);
        System.out.println(unl + "\n");*/

        // четвёртое
        /*microwave mz = new microwave("Philips AR280", "бзззззззз, дзынь, пшшш.",
                "хорошая микроволновая печь.", 800);
        System.out.println(mz.sound());

        kettle uvao = new kettle("Xiaomi BS3A", "пхрр, пау- пау, вуииип.",
                "плохой чайник стреляет кипятком", type.electric);
        System.out.println(uvao.getType().toString() + ".\n" + uvao);

        car cc = new car("Toyota Cresta", "врум- врум- прааааааааааааауууу",
                "gj Hjccbb- vfneirt rfnbn toyota cresta.", 1.6f);
        System.out.println(cc);

        ship mt = new ship("Ямал", "пфууу- пфуу",
                "российский атомный ледокол, 4 буквы.", 3200);
        System.out.println(mt);*/

        // шестое
        array arr = new array(new int[]{3, 6, 9}, 3);
        System.out.println("максимум: " + arr.max() + "\n"
        + "минимум: " + arr.min() + "\n" +
                "среднее значение: " + arr.avg());
    }
}
