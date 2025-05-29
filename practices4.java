
import java.util.*;
import java.util.stream.Collectors;

public class practices4 {
    public static void main(String[] args) {
        List<List<String>> cloudwatchData = new ArrayList<>();
        cloudwatchData.add(Arrays.asList("2023-01-15", "14:30:00", "Critical"));
        cloudwatchData.add(Arrays.asList("2023-01-15", "10:00:00", "Error"));
        cloudwatchData.add(Arrays.asList("2023-01-16", "09:15:00", "Warning"));
        cloudwatchData.add(Arrays.asList("2023-01-15", "14:00:00", "Warning"));
        cloudwatchData.add(Arrays.asList("2023-01-16", "09:00:00", "Warning"));
        cloudwatchData.add(Arrays.asList("2023-01-16", "09:05:30", "Error"));
        cloudwatchData.add(Arrays.asList("2021-09-12", "12:12:12", "UNK"));

        // List<List<String>> filtered = new ArrayList<>();
        // for(List<String> temp : cloudwatchData){
        //     for(String s : temp){
        //         if(s == "Error" || s == "Critical"){
        //             filtered.add(temp);
        //         }
        //     }
        // }

        List<List<String>> sortedData = cloudwatchData.stream().filter((data) -> {
            return data.get(2).contains("Error") ||  data.get(2).contains("Critical");
        }).sorted(Comparator.comparing((List<String> datum) -> datum.get(1)).reversed()).collect(Collectors.toList());

        sortedData.forEach(System.out::println);


        List<List<String>> ls1 = cloudwatchData.stream().filter((Data) -> {
            return Data.get(2).contains("Warning") || Data.get(2).contains("UNK");
        }).sorted(Comparator.comparing((List<String> Datum) -> Datum.get(2)).reversed()).collect(Collectors.toList());


        //Converting a 2d array to List<List<Integer>>

        List<List<Integer>> newL = new ArrayList<>();
        int[][] twoDims = {{1 ,2 ,3} , {4 , 5 , 6} , {7 , 8 , 9}};

        //Traditional method :-
        for(int[] oneD : twoDims){
            List<Integer> innerList = new ArrayList<>();
            for(int num : oneD) innerList.add(num);
            newL.add(innerList);
        }

        //streams method :- 
        List<List<Integer>> streamed = Arrays.stream(twoDims).map(row -> Arrays.stream(row).boxed().collect(Collectors.toList())).collect(Collectors.toList());


        //removing duplicates in list of list Strings and also dupicate letters in words
        List<List<String>> listOfLists = new ArrayList<>();
        listOfLists.add(Arrays.asList("apple", "banana", "apple", "grape"));
        listOfLists.add(Arrays.asList("hello", "world", "helloo", "hallo"));
        listOfLists.add(Arrays.asList("programming", "java", "code", "java"));

        List<List<String>> processed = listOfLists.stream().map(
            innerlist -> innerlist.stream().distinct().map(
                word -> word.chars().mapToObj(c -> (char) c).distinct().map(String::valueOf).collect(Collectors.joining())
            ).collect(Collectors.toList())
        ).collect(Collectors.toList());

        System.out.println(processed);
    }
}
