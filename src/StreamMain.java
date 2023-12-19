import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMain {
    public Stream<Integer> filtrIntList(List<Integer> intList) {
        Stream<Integer> stream = intList.stream()
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder());
        return stream;
    }
}
