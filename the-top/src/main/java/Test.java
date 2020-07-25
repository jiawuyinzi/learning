import net.sf.json.JSONObject;

public class Test {

    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("qq", "dsds");

        System.out.println(jsonObject.get("qq"));
    }

}
