import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

public class Program {
  public static void main(String... args) throws IOException, InterruptedException {
    final var client = HttpClient.newHttpClient();

    final var request = HttpRequest.newBuilder(URI.create("https://pokeapi.co/api/v2/pokemon/1")).build();

    final var result = client.send(request, BodyHandlers.ofString());

    System.out.println(result.body());
  }
}