package gerzen777gmail.com.deserializer;

import gerzen777gmail.com.model.User;

import java.io.File;
import java.util.Collection;

public interface UserDeserializer {
    Collection<User> deserializer(File file);

}
