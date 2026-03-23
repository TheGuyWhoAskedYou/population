package pro1;

import pro1.data.Muni;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class FunFact5 {
    /**
     * @return TODO: Názvy obcí s nejméně obyvateli
     * @param count: počet hledaných obcí
     */
    public static List<String> getFunFact(List<Muni> data, int count) {
        return data.stream().filter(m -> m.getMenPopulation() > 0).sorted(Comparator.comparing(m -> m.getPopulation())).limit(count).map(m -> m.getName()).toList();
    }

    /**
     * @return TODO: Názvy obcí s nejméně obyvateli, oddělené čárkou
     * @param count: počet hledaných obcí
     */
    public static String getFunFactJoined(List<Muni> data, int count) {
        return data.stream().filter(m -> m.getMenPopulation() > 0).sorted(Comparator.comparing(m -> m.getPopulation())).limit(count).map(m -> m.getName()).collect(Collectors.joining(", "));
    }
}