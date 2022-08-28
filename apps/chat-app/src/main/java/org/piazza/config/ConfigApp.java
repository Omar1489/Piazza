package org.piazza.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

@Configuration
@Import(value = {AbstractMicroServiceConfig.class})
public class ConfigApp {
    @Bean
    @Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Firestore FirebaseApp() throws Exception {
        JSONObject jsonObject = new JSONObject();
        JSONParser parser = new JSONParser();
        jsonObject.put("type","service_account");
        jsonObject.put("project_id","piazza-c2c52");
        jsonObject.put("private_key_id","4a4a95cdc4dbf3bda2bd68dcf1adb40120f7abe1");
        jsonObject.put("private_key","-----BEGIN PRIVATE KEY-----\nMIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCxu9Qqp5wlQwGv\nCrpsObv9s2UuFvXz54eiFvr87pmGdNngzeRpz4Xw6eS7ZC0/bRRP3BFVMv3OJexR\nykFH0L96Q77rIwrf4K74A0VpcDcM8wGVR7VehhuHq39bOvu5cpfFSIuJ2FfMNkM5\nvENPhrmZXcYTGRkpBefLaGFQTdzeclAv7HokZpCdUjBKLy/x/lGIWB9SunO3iSQJ\nS9xOQ4hMKckbo2dt+C1FT5+l+XzoY0NyCkSYqqQ7/Am10Cs7o/9VbtwxwqsLu6zR\nSWrcYzxWawaV+DjOLfDooLdlLuLOO+s+VnxRbo2yhZLFw1J9Ewee72RoVD8LllsU\nbjrJ9vTVAgMBAAECggEACtqb3xv7xOnF50zqLBRNhvWG6wzjacj8pzksjDg8/3FQ\n4fHo7k5KUXdTLN92BO7SI/teQpv51HZL64XEvVBB9UNAXEc4UYo83TAD8+eysPOB\nJ/7oVFSvxzYBsc5VE5LsMlPXE6y21eWFbvfwi2GAoZ1QrJdmijMOYAVolfkfUSVD\nWvLE1Zarx9bSqXRVKEhEnIIk4TpkGKS88l371YtZkJy3DjX0IoAK0U1GiCefg2mY\no8SGLtqU7Fwq/ARjNTVuMrDAE3TyaOtUdIgnDY2IEibWXDoKwDRDuxBgAiVqvq5y\nlo+w+whKVoDry6zBHEIYWTAlxy1FMHHBgbAC27l5gQKBgQDoUhxLjR9ZOXBnF5hA\nUjts7aIgSyx2HKkYHI05f7kd2ZKgsmT/F3oj++mBVSADkLWM3cPFWAc2gXatk6VM\nPD0llKc1y3O/nUDtbO/kww4BgaA7pXfTmMhm5yADxpJQBERwUpYv2YhYLO28l4Kb\nKQxmYlZpgGraGq6DqcKtfW1nVQKBgQDD2WRJ4XXKYPshsKm7+1SgNYkVqjrVKVmC\nK+ng9khVgHf/JKAz04vxsaeAEsM0KcLp942Ui1jw17LdP742u/Fe4uyKSkpjAT7e\njSLH/BiRaSmeXlFqS0FfIQOluNd1kSucDb8ESWFM1XvNH6ZaSrCjrmPL0tk0N/05\nfj3yWNhXgQKBgD5LTiUACUjeewJZtEyDAEY8Df4Eyj49fyXk+gVR9yxG2+dVDnnM\nLMcbVEiGr9fk5JmKGWWALibyXgU7Eta3TFoYWyG0lSvrGa7QSB8aIlZLENENlGzb\nidj13oLEqxTjoApSSs030jR6j6DDK5U5U4bclXkiowQqpWLOkVH90OklAoGAZz+W\nJXTc2kJiYpJ2CQooxQU0Ld2+gl34OC3acKSl4Z2GpVWzt17RKiwUN+qsSjWx8hJ1\n61fDHcU5IHbYWpaeWv2a4hTkPmmLsVwKeA+pDA+6xyjGFxlxbytCdv2JaQuNSAnf\nJ+1fhFgPmkYTNwqlMMVhCzUvGN5jewnYsoiwFQECgYEAiBZTHO7uo5Gvfhvr/nI9\n6TVJs7qVf/5mMKwYwDii5uUDAjBvB1GcZ4IR9tQ6TzzdhkW/Xi1nwl96z48U2Yks\n0ip/PM2yFC0uVP5rZMerpAi4fHUylW8g3UBE1pzoIlP4jutyoYMZ8dq9/9B+6VvV\nhzI0ekAOsOKqK1gC2ljmruE=\n-----END PRIVATE KEY-----\n");
        jsonObject.put("client_email","firebase-adminsdk-4qyyh@piazza-c2c52.iam.gserviceaccount.com");
        jsonObject.put("client_id","114686222016561959991");
        jsonObject.put("auth_uri","https://accounts.google.com/o/oauth2/auth");
        jsonObject.put("token_uri","https://oauth2.googleapis.com/token");
        jsonObject.put("auth_provider_x509_cert_url","https://www.googleapis.com/oauth2/v1/certs");
        jsonObject.put("client_x509_cert_url","https://www.googleapis.com/robot/v1/metadata/x509/firebase-adminsdk-4qyyh%40piazza-c2c52.iam.gserviceaccount.com");
        FileWriter fileWriter = new FileWriter("service_account.json");
        fileWriter.write(jsonObject.toJSONString());
        fileWriter.close();
        File serviceAccount = new File("service_account.json");
        Object obj = parser.parse(new FileReader("service_account.json"));
        JSONObject testt = (JSONObject) obj;
        System.out.println(testt);
        GoogleCredentials googleCredentials = GoogleCredentials
                .fromStream(new FileInputStream(serviceAccount));
          FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(googleCredentials)
                .setDatabaseUrl("https://piazza-5a192-default-rtdb.firebaseio.com")
                .build();
        FirebaseApp.initializeApp(options);
        return FirestoreClient.getFirestore();
    }
}
