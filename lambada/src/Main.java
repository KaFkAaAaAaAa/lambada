import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        lista.sort((o1, o2) -> o1-o2);

        //lambda zwraca długość stringa
        Function<String, Integer> strLenght = s -> s.length();

        System.out.println(strLenght.apply("Fryta kica fryty"));

        Consumer<String> wyswietlacz = s -> System.out.println(s);
        wyswietlacz.accept("Fryta kica fryty");

        Function<String, String> sizeChange = s -> s.toUpperCase();
        System.out.println(sizeChange.apply("Kajtek pije kafkę"));

        //zadanie

        //a)
        Function<Integer, Boolean> dividedBy = i -> i % 8 == 0;

        System.out.println(dividedBy.apply(9));
        System.out.println(dividedBy.apply(8));

        //b)
        Function<Integer, Integer> doubling = i -> i / i;

        System.out.println(doubling.apply(3));
        System.out.println(doubling.apply(4));

        //c)
        Supplier<String> sentence = () -> "Za  tydzień sprawdzian";

        System.out.println(sentence.get());

        //d)
        BiConsumer<Integer, String> multiline = (Integer x, String s) ->{
            for (int j = 0; j < x; j++){
                System.out.println(s);
            }
        };
        multiline.accept(4, "Michu 'Śliwa' Śliwowski");
    }
}