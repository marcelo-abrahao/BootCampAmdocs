package opt;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExOptionals {
        public static void main(String[] args) {
            
            //Estudo com valores existentes
            Optional<String> optString = Optional.of("I'm Here");
            System.out.println("Valor Opcional que está presente?");
            optString.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

            //Estudos com valores nulos.
            Optional<String> optNull = Optional.ofNullable(null);
            System.out.println("Valor Opcional que está presente?");
            optNull.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

            //Estudos com valores vazios.
            Optional<String> optVazio = Optional.empty();
            System.out.println("Valor Opcional que está presente?");
            optVazio.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

            //Estudos com valores com erro.
            Optional<String> optNullErr = Optional.of(null);
            System.out.println("Valor Opcional que está presente?");
            optNullErr.ifPresentOrElse(System.out::println, () -> System.out.println("Não está presente"));

            //OptionalInt.of(12).ifPresent(System.out::println);
            //OptionalLong.of(34L).ifPresent(System.out::println);
            //OptionalDouble.of(50.3d).ifPresent(System.out::println);
            
        }
    
}
