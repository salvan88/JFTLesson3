package gerzen777gmail.com.serialize;

import gerzen777gmail.com.model.User;
import gerzen777gmail.com.model.UserCollection;
import java.io.*;


public class CsvUserSerializer implements UserSerializer {

    @Override
    public void serializer(UserCollection users, String fileName) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for (User user : users.getUsers()) {

            bufferedWriter.write(user.getId() + ";");
            bufferedWriter.write(user.getName() + ";");
            bufferedWriter.write(user.getEmail());

            bufferedWriter.newLine();
        }

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
