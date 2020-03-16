import org.omg.PortableInterceptor.INACTIVE;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class capitulo2 {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Paulo Silveira",150);
        Usuario user2 = new Usuario("Rodrigo Turini",120);
        Usuario user3 = new Usuario("Guilherme Silveira",190);

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(user1);
        usuarios.add(user2);
        usuarios.add(user3);
        //Forma básica
        /*for (Usuario u : usuarios){
            System.out.println(u.getNome());
        }*/
        //Usando o Consumer para o foreach
        /*usuarios.forEach(new Consumer<Usuario>() {
            @Override
            public void accept(Usuario usuario) {
                System.out.println(usuario.getNome());
            }
        });*/
        //Usando o lambda
        /*Consumer <Usuario> mostrador = u -> System.out.println(u.getNome());
        usuarios.forEach(mostrador);*/

        //Usando lambda de forma mais simplificada
        /*usuarios.forEach(u -> System.out.println(u.getNome()));

        Validador<String> validadorCep = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
        System.out.println(validadorCep.valida("60832-790"));*/

        //Consumer seguidos
        /*Consumer<Usuario> mostraMensagem = u -> System.out.println("Antes de imprimir o nome");
        Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());
        usuarios.forEach(mostraMensagem.andThen(imprimeNome));*/

        //Predicado
        /*usuarios.removeIf(u -> u.getPontos() > 160);
        usuarios.forEach(u -> System.out.println(u.getNome()));*/

        /*//Comparadores
        Comparator<Usuario> comparator = (u1,u2) -> u1.getNome().compareTo(u2.getNome());
        Collections.sort(usuarios,(u1,u2) -> u1.getNome().compareTo(u2.getNome()));
        //Método default
        usuarios.sort((u1,u2) -> u1.getNome().compareTo(u2.getNome()));
        usuarios.forEach(u -> System.out.println(u.getNome()));*/

        //Fábrica de comparator
        /*Comparator<Usuario> comparator = Comparator.comparing(u ->u.getNome());
        usuarios.sort(comparator);
        //Na mesma linha
        usuarios.sort(Comparator.comparing(u ->u.getNome()));
        usuarios.forEach(u -> System.out.println(u.getNome()));

        List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
        Collections.sort(palavras);
        palavras.sort(Comparator.naturalOrder());
        palavras.forEach(s -> System.out.println(s));
        Function<Usuario,String> extraiNome = u -> u.getNome();
        Comparator<Usuario> comparator = Comparator.comparing(extraiNome);
        usuarios.sort(comparator);
        usuarios.sort(Comparator.comparing(u -> u.getNome()));
        usuarios.forEach(u -> System.out.println(u.getNome()));

        //Auto boxing
        Function<Usuario, Integer> extraiPontos = u -> u.getPontos();
        Comparator<Usuario> comparator = Comparator.comparing(extraiPontos);
        usuarios.sort(comparator);
        usuarios.sort(Comparator.comparing(u -> u.getPontos()));
        usuarios.forEach(u -> System.out.println(u.getNome()));


        ToIntFunction<Usuario> extraiPontos = u -> u.getPontos();
        Comparator<Usuario> comparator = Comparator.comparingInt(extraiPontos);
        usuarios.sort(comparator);
        usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));
        usuarios.forEach(u -> System.out.println(u.getNome()));*/
    }
}
