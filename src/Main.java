import java.util.Arrays;

public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        double sum = 0.0;
        for(int i:totalWasteKgPerCapitaPerYear){
            sum+=i;
        }
        double mean = sum/totalWasteKgPerCapitaPerYear.length + 0.5 ;
        return (int) mean;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }


    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int result = 0;
        int countryindex = 0;
        for(int i = 0; i<countries.length; i++){
            if(countries[i].equals(country)){
                countryindex = i;
            }

        }
        result = totalWasteKgPerCapitaPerYear[countryindex];

        return result;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int weight = totalWasteKgPerCapitaPerYear[0];
        int weightindex = 0;
        for(int i = 0; i< countries.length;i++){
            if(weight < totalWasteKgPerCapitaPerYear[i]){
                weight = totalWasteKgPerCapitaPerYear[i];
                weightindex = i;
            }

        }
        return countries[weightindex];
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        int p = 0;
        int numhighpoverty = 0;
        double poverty = 0.0;
        double max = 99.99;
        String[] tempcountries = new String[countries.length];
        for(int i = 0; i<percentagesShareInPoverty.length;i++){
            if (percentagesShareInPoverty[i] == 99.99){
                poverty = percentagesShareInPoverty[i];
                max = percentagesShareInPoverty[i];
                numhighpoverty++;
                tempcountries[p] = countries[i];
                p++;
            }

        }
        System.out.println(Arrays.toString(tempcountries));
        String [] high = new String[numhighpoverty];
        for(int j = 0; j< high.length; j++){
            high[j] = tempcountries[j];
        }

        return high;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        String [] one = new String[countries.length];
        int two = 0;
        int three  =0;
        for(int i = 0; i < one.length; i++){
            if (confidences[i].equals("High Confidence")) {
                one[three] = countries[i];
                two++;
                three++;
            }

        }
        System.out.println(Arrays.toString(one));
        String [] high = new String[two];
        for(int j = 0; j< high.length; j++){
            high[j] = one[j];
        }
        System.out.println(Arrays.toString(high));


        return high;
    }
}
