package gerzen777gmail.com.serialize;

import gerzen777gmail.com.deserializer.CsvUserDeserializer;
import gerzen777gmail.com.model.UserCollection;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.*;


public class SerializersTest {

    @Test
    public void jsonSerializeTest() {
        UserCollection userCollection = null;
        try {
            userCollection = prepareTestData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JsonUserSerializer jsonUserSerializer = new JsonUserSerializer();
        jsonUserSerializer.serializer(userCollection, "userinfo.json");

        Assertions.assertTrue(new File("userinfo.json").exists());

    }

    @Test
    public void xmlSerializeTest() {
        UserCollection userCollection = null;
        try {
            userCollection = prepareTestData();
        } catch (IOException e) {
            e.printStackTrace();
        }
        XmlUserSerializer xmlUserSerializer = new XmlUserSerializer();
        xmlUserSerializer.serializer(userCollection, "userinfo.xml");

        Assertions.assertTrue(new File("userinfo.xml").exists());
    }

    @Test
    public void csvUserSerializeTest() throws IOException {
        UserCollection userCollection = prepareTestData();
        CsvUserSerializer csvUserSerializer = new CsvUserSerializer();
        csvUserSerializer.serializer(userCollection, "user.txt");

        Assertions.assertTrue(new File("user.txt").exists());
    }

    //Для подготовки к тестам использовал csvUserDeserializer

    private UserCollection prepareTestData() throws IOException {

        CsvUserDeserializer csvUserDeserializer = new CsvUserDeserializer();
        return csvUserDeserializer.deserializer(new File("D:\\Work\\java\\Lesson3\\userinfo.csv"));
    }
}