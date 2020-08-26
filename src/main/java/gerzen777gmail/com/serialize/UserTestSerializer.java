package gerzen777gmail.com.serialize;

import gerzen777gmail.com.model.UserCollection;

import java.io.*;

public class UserTestSerializer {
    public void serialize(UserCollection userCollection, String fileName) {
        FileOutputStream faos = null;
        ObjectOutputStream ous = null;
        try {
            faos = new FileOutputStream(fileName);
            ous = new ObjectOutputStream(faos);
            ous.writeObject(userCollection);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(ous != null) {
                try {
                    ous.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                faos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
