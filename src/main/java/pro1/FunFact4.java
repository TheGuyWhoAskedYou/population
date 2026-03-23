package pro1;

import pro1.data.Muni;

import java.util.Comparator;
import java.util.List;

public class FunFact4 {
    /**
     * @return TODO: Název obce, ve které je nejméně vyvážený počet mužů a žen
     */
    public static String getFunFact(List<Muni> data) {
       return data.stream().max(Comparator.comparing(m -> m.getMenPopulation() - m.getWomenPopulation())).get().getName();
    }

    public static String getFunFactJoined(List<Muni> data) {
        return data.stream().filter(m -> m.getPopulation() > 0).max(Comparator.comparing(m -> Math.abs(m.getMenPopulation() - m.getWomenPopulation()))).get().getName();
    }
}