package ch.hotstuff.algorithms.babynames;

import java.util.Map;
import java.util.HashMap;
import org.junit.Test;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;

import static ch.hotstuff.algorithms.babynames.BabyNames.babyNames;

public class BabyNamesTest {

    @Test
    public void simpleJohnnyExample() {
        Map<String, Integer> nameCount = new HashMap<String, Integer>();
        nameCount.put("John", 10);
        nameCount.put("Johnny", 5);
        nameCount.put("Jon", 3);
        nameCount.put("Jony", 1);

        String[][] equivalences = {{"John", "Johnny"}, {"Jon", "Jony"},
            {"Jon", "Johnny"}};

        Map<String, Integer> result = babyNames(nameCount, equivalences);

        assertEquals(1, result.keySet().size());

        String name = result.keySet().iterator().next();
        assertThat(name,anyOf(is("John"), is("Johnny"), is("Jon"), is("Jony")));

        assertEquals(19, result.get(name).intValue());
    }

    @Test
    public void complexMultipleNameExample() {
        Map<String, Integer> nameCount = new HashMap<String, Integer>();
        nameCount.put("John", 10);
        nameCount.put("Johnny", 5);
        nameCount.put("Lisa", 7);
        nameCount.put("Jon", 3);
        nameCount.put("Jony", 1);
        nameCount.put("Liza", 2);
        nameCount.put("Lizzie", 4);
        nameCount.put("Caspar", 77);

        String[][] equivalences = {{"John", "Johnny"}, {"Liza", "Lisa"},
            {"Jon", "Jony"}, {"Jon", "Johnny"}, {"Lizzie", "Liza"}};

        Map<String, Integer> result = babyNames(nameCount, equivalences);

        assertEquals(3, result.keySet().size());

        Iterator<String> it = result.keySet().iterator();
        String name1 = it.next();
        String name2 = it.next();
        String name3 = it.next();

        final String johnName;
        final String lizaName;
        final String casparName;
        if (name1.equals("Lisa") || name1.equals("Liza") ||
                name1.equals("Lizzie")) {
            lizaName = name1;
            if (name2.equals("Caspar")) {
                casparName = name2;
                johnName = name3;
            }
            else {
                casparName = name3;
                johnName = name2;
            }
        }
        else if (name1.equals("Caspar")) {
            casparName = name1;
            if (name2.equals("Lisa") || name2.equals("Liza") ||
                    name2.equals("Lizzie")) {
                lizaName = name2;
                johnName = name3;
                    }
            else {
                lizaName = name3;
                johnName = name2;
            }
        }
        else {
            johnName = name1;
            if (name2.equals("Caspar")) {
                casparName = name2;
                lizaName = name3;
            }
            else {
                casparName = name3;
                lizaName = name2;
            }
        }
        
        assertThat(johnName,
            anyOf(is("John"), is("Johnny"), is("Jon"), is("Jony")));
        assertThat(lizaName, anyOf(is("Liza"), is("Lisa")));

        assertEquals(19, result.get(johnName).intValue());
        assertEquals(13, result.get(lizaName).intValue());
        assertEquals(77, result.get(casparName).intValue());
    }
}
