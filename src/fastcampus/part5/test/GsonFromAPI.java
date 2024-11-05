package fastcampus.part5.test;

import com.google.gson.Gson;
import fastcampus.part5.model.Person;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":23}";
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.toString());
    }
}
