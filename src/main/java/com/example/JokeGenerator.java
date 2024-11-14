import java.util.List;
import java.util.Random;

public class JokeGenerator {

    // List of jokes to pick from
    private static final List<String> JOKES = List.of(
        """
        Why don't scientists trust atoms?
        Because they make up everything!
        """,
        """
        What do you get when you cross a snowman and a vampire?
        Frostbite!
        """,
        """
        Why did the bicycle fall over?
        Because it was two-tired!
        """
    );

    private final Random random;

    public JokeGenerator() {
        this.random = new Random();
    }

    // Method to get a random joke from the list
    public String getRandomJoke() {
        return JOKES.get(random.nextInt(JOKES.size()));
    }
}
