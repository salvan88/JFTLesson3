package gerzen777gmail.com.deserializer;

import gerzen777gmail.com.model.UserCollection;

import java.io.File;
import java.io.IOException;

public interface UserDeserializer {
    UserCollection deserializer(File file) throws IOException;

}
