package pro1;

import pro1.data.Muni;

import java.util.List;

public class FunFact1 {
    /**
     * @return TODO: Počet obcí, které mají více než 10 000 obyvatel
     */
    public static long getFunFact(List<Muni> data)
    {
        return data.stream().filter(muni -> muni.getPopulation() > 10_000).count();

//        var result = 0;
//        for (var muni : data)
//        {
//            if(muni.getPopulation() > 10_000)
//            {
//                result++;
//            }
//        }
//        return result;
    }
}