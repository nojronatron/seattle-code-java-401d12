/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package pokeman;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    Gson gson = new Gson();
    // create request

    public HttpURLConnection createRequest(String _url) throws IOException {
        // dis the URL
        URL pokeURL = new URL(_url);
        // we want type HttpURLConncetion so we must cast
        HttpURLConnection pokeURLConnection = (HttpURLConnection) pokeURL.openConnection();
        // set the request Method: GET-POST-PUT-DELETE
        pokeURLConnection.setRequestMethod("GET");
        return pokeURLConnection;
    }

    // readResponse
    public StringBuffer readResponse(HttpURLConnection _connection) throws IOException{
        // we need to read the connection: FileReader, Scanner, BufferedReader
        // try-with-resources -> AUTOCLOSING!!
        try (BufferedReader responseReader = new BufferedReader(
                new InputStreamReader(_connection.getInputStream())
        )) {
            String inputLine;
            // What if I request MULTIPLE pokemon?? I can use my String Buffer to it's full potential
            StringBuffer content = new StringBuffer();
            while((inputLine = responseReader.readLine()) != null){
                content.append(inputLine);
            }
            return content;
        }

    }

    // parsePokemon out of response

    public Pokemon parsePokemonFromResponse(StringBuffer _content) {
        // step 1: get gson
        // step 2: read in JSOn and apply to the class
        // step 3 return the pokemon
        Pokemon newPokemon = gson.fromJson(String.valueOf(_content), Pokemon.class);
        return newPokemon;
    }

    // recursive fibonacci

    // recursive countDown
    public static int countDown(int number) {
        if (number == 0) {
            System.out.println(number);
        } else {
            System.out.println(number);
            countDown(number - 1);
        }
        return 0;
    }
}
