package gerzen777gmail.com.deserializer;

import gerzen777gmail.com.model.User;
import gerzen777gmail.com.model.UserCollection;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvUserDeserializer implements UserDeserializer {
    @Override
    public UserCollection deserializer(File file) throws IOException {

        Path path = Paths.get(file.getName());
        UserCollection userCollection = new UserCollection();

        List<String> fileLines = Files.readAllLines(path);

        for (String line : fileLines) {

            User user = new User();

            ArrayList<String> s1 = new ArrayList<>(Arrays.asList(line.split(";")));

            user.setId(s1.get(0));
            user.setName(s1.get(1));
            user.setEmail(s1.get(2));

            userCollection.getUsers().add(user);
        }

        return userCollection;
    }
}
