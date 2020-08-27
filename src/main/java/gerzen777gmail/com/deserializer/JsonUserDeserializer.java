package gerzen777gmail.com.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import gerzen777gmail.com.model.UserCollection;

import java.io.File;
import java.io.IOException;


public class JsonUserDeserializer implements UserDeserializer {

    @Override
    public UserCollection deserializer(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Object o = objectMapper.readerFor(UserCollection.class).readValue(file);
        UserCollection userCollection = (UserCollection) o;
        System.out.println(userCollection);

        return userCollection;
    }
}