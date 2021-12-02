package opt;
import java.util.Optional;

public class ExOptionals2 {
    public static void main(String[] args) {

        Optional<String> optStr = Optional.ofNullable("I'm Here");

        System.out.println(optStr.isPresent());
        System.out.println(optStr.isEmpty());

        optStr.ifPresent(System.out::println);

        optStr.ifPresentOrElse(System.out::println, () -> System.out.println("Sem valor no Obj"));

        if (optStr.isPresent()) {
            String valor = optStr.get();
            System.out.println(valor);
        }

        optStr.map(valor -> valor.concat("****")).ifPresent(System.out::println);

        optStr.orElseThrow(IllegalStateException::new);

    }
}