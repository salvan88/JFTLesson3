package gerzen777gmail.com.serialize;


import gerzen777gmail.com.model.UserCollection;

import java.io.IOException;


public interface UserSerializer {
    void serializer(UserCollection users, String fileName) throws IOException;

}
