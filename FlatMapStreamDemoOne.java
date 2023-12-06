import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapStreamDemoOne {
  public static void main(String[] args){
    // we can have a collection of another collections, so each element of the big collection is
    // a collection.
    List<String> footballPlayers = Arrays.asList("Rooney", "Ronaldo", "Messi");
    List<String> basketballPlayers = Arrays.asList("Kobey", "Michael", "Lebron");
    // so we need to create a single list containing all the playes and append _fp to football 
    // and append _bp to basketballPlayers.
    List<List<String>> players = Arrays.asList(footballPlayers, basketballPlayers);
    List<String> allPlayers = players.stream().flatMap(p -> p.stream().
    map(pp -> pp.toUpperCase())).collect(Collectors.toList());
    System.out.println(allPlayers);
  }
}
