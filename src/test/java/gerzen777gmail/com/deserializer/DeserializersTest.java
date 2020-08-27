package gerzen777gmail.com.deserializer;

import gerzen777gmail.com.model.UserCollection;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.File;
import java.io.IOException;


public class DeserializersTest {
    @Test
    public void jsonUserDeserializer() throws IOException {

        JsonUserDeserializer jsonUserDeserializer = new JsonUserDeserializer();
        UserCollection users = jsonUserDeserializer.deserializer(new File("D:\\Work\\java\\Lesson3\\userinfo.json"));

        Assertions.assertEquals(users.getUsers().size(), 11);
        Assertions.assertEquals("id", users.getUsers().iterator().next().getId());
    }

    @Test
    public void csvUserDeserializer() throws IOException {

        CsvUserDeserializer csvUserDeserializer = new CsvUserDeserializer();
        UserCollection users = csvUserDeserializer.deserializer(new File("D:\\Work\\java\\Lesson3\\userinfo.csv"));

        Assertions.assertEquals(users.getUsers().size(), 11);
        Assertions.assertEquals("id", users.getUsers().iterator().next().getId());
    }

    @Test
    public void xmlUserDeserializer() throws IOException {

        XmlUserDeserializer xmlUserDeserializer = new XmlUserDeserializer();
        UserCollection users = xmlUserDeserializer.deserializer(new File ("D:\\Work\\java\\Lesson3\\userinfo.xml"));

        Assertions.assertEquals(users.getUsers().size(), 11);
        Assertions.assertEquals("id", users.getUsers().iterator().next().getId());
    }
}