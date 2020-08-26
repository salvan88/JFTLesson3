package gerzen777gmail.com.model;

import gerzen777gmail.com.serialize.JsonUserSerializer;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.util.Collection;

public class UserTest {

    @org.junit.jupiter.api.Test
    public void jsonSerializeTest() {
        UserCollection userCollection = prepareTestData();
        JsonUserSerializer jsonUserSerializer = new JsonUserSerializer();
        jsonUserSerializer.serializer(userCollection, "user.json");

        Assertions.assertTrue(new File("user.json").exists());
    }

    private UserCollection prepareTestData() {

        User ivan = new User();
        ivan.setId("1");
        ivan.setName("Ivan");
        ivan.setEmail("ivan@mail.ru");

        User marija = new User();
        marija.setId("2");
        marija.setName("Marija");
        marija.setEmail("Marija@yandex.ru");

        UserCollection userCollection = new UserCollection();

        userCollection.getUsers().add(ivan);
        userCollection.getUsers().add(marija);

        return userCollection;
    }
//    @Test
//    public void userInfoTest() throws IOException {
//
//        Path path = Paths.get("userinfo.txt");
//        List<String> fileLines = Files.readAllLines(path);
//        User user = new User();
//
//        for (String line : fileLines) {
//
//            ArrayList<String> s1 = new ArrayList<>(Arrays.asList(line.split(";")));
//
//            user.id = s1.get(0);
//            user.name = s1.get(1);
//            user.email = s1.get(2);
//
//            System.out.println(user);
//        }
//    }
}