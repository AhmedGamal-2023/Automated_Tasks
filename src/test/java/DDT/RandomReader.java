package DDT;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomReader {
    public String email;
    public void randomReader (){
        String generate = RandomStringUtils.randomAlphabetic(10);
         email = generate+"@gmail.com";
    }
}
