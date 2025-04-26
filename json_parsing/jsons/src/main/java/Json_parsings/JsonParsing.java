package Json_parsings;
public class JsonParsing {
    public static void main(String[] args) {
        String json = "{\"name\":\"Honey\",\"age\":23}";
        String parsed = json.replace("{","").replace("}", "");
        String[] arr = parsed.split(",");

        for(String s : arr){
            String[] keyValue = s.split(":");
            String key = keyValue[0].replace("\"","").trim();
            String value = keyValue[1].replace("\"", "").trim();

            System.out.println(key + "->" + value);
        }
        String multiLine = """
                             { 
                                "name" : "Honey"
                                "age" : "23"
                              }
                """;

    }
}
