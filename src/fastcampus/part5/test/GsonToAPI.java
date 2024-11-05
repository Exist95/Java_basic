package fastcampus.part5.test;

import com.google.gson.Gson;
import fastcampus.part5.model.Person;

public class GsonToAPI {
    public static void main(String[] args) {
        Person p = new Person("John", 23);
        Gson json = new Gson();

        String s = json.toJson(p);
        System.out.println(s); // {"name":"John","age":23}

    }
}
