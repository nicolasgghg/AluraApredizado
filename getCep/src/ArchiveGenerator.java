import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ArchiveGenerator {

    public void generateJson(Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter data = new FileWriter(address.getZipCode() + ".json");
        data.write(gson.toJson(address));
        data.close();
    }
}
