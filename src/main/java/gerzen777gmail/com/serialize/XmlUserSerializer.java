package gerzen777gmail.com.serialize;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import gerzen777gmail.com.model.UserCollection;

import java.io.File;
import java.io.IOException;

public class XmlUserSerializer implements UserSerializer {

    @Override
    public void serializer(UserCollection users, String fileName) {
        ObjectMapper objectMapper = new XmlMapper();
        File out = new File(fileName);
        try {
            objectMapper.writerFor(UserCollection.class).writeValue(out, users);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
