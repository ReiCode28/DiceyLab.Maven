import java.util.HashMap;
import java.util.Map;

public class Bins {
        private Map<Integer, Integer> mapOfBins = new HashMap<>();

        public Bins(int lowestBinNumber, int highestBinNumber){
            for(int i = lowestBinNumber; i <= highestBinNumber; i++){
                mapOfBins.put(i, 0);
            }
        }

        public Integer getBin(int binNumber){
            return mapOfBins.get(binNumber);

        }

        public void incrementBin(int binNumber){
            mapOfBins.replace(binNumber, mapOfBins.get(binNumber)+1);
        }
}
