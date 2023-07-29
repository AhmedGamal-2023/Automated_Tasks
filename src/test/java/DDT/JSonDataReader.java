package DDT;


import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JSonDataReader {

    public String email, password,product,FirstName,LastName,NewPassword ,ConfirmNewPassword ,url,name,Enquiry,FriendEmail
            ,message,text,title,p1,p2;
    public void jsonReader() throws IOException, ParseException {
        String filePath = System.getProperty("user.dir") + "/src/test/java/DDT/UserData.json";
        File srcFile = new File(filePath);
        JSONParser parser = new JSONParser();
        JSONArray jarray = (JSONArray) parser.parse(new FileReader(srcFile));
        for (Object jsonObj : jarray){
            JSONObject person = (JSONObject) jsonObj;
            email = (String) person.get("email");
            password = (String) person.get("password");
            product = (String) person.get("product");
            FirstName = (String) person.get("FirstName");
            LastName = (String) person.get("LastName");
            NewPassword = (String) person.get("NewPassword");
            ConfirmNewPassword = (String) person.get("ConfirmNewPassword");
            url=(String) person.get("url");
            name=(String) person.get("name");
            Enquiry=(String) person.get("Enquiry");
            FriendEmail=(String) person.get("FriendEmail");
            message=(String) person.get("message");
            title=(String) person.get("title");
            text=(String) person.get("text");
            p1=(String) person.get("p1");
            p2=(String) person.get("p2");

        }
}

}