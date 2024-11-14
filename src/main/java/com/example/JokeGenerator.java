import java.util.List;
import java.util.Random;

public class JokeGenerator {
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

    public String getRandomJoke() {
        return JOKES.get(random.nextInt(JOKES.size()));
    }

    public static void main(String[] args) {
        JokeGenerator jokeGenerator = new JokeGenerator();
        System.out.println("Here's a joke for you:");
        System.out.println(jokeGenerator.getRandomJoke());
    }
}
