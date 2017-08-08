import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by kyle on 8/7/17.
 */
public class Coins {

    public static void main(String args[]) {

        List<Integer> values = new ArrayList<>(args.length);

        for (String arg : args)
            values.add(Integer.parseInt(arg));

        System.out.println(comboSum(values));
    }

    public static Set<Integer> comboSum(List<Integer> coinValues) {
        Set<Integer> values = new HashSet<>();

        if (coinValues.size() == 1) {
            values.add(coinValues.get(0));
            return values;
        }

        int sum = 0;
        for (int i = 0; i < coinValues.size(); i++) {
            Integer val = coinValues.remove(i);
            sum += val;
            values.addAll(comboSum(coinValues));
            coinValues.add(i, val);
        }

        values.add(sum);

        return values;

    }
}
