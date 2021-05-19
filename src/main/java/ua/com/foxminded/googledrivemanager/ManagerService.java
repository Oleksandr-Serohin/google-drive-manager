package ua.com.foxminded.googledrivemanager;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ua.com.foxminded.googledrivemanager")
public class ManagerService {

    @Bean
    public ManagerPersistence getManagerPersistence(){
        return new ManagerPersistence();
    }

    @Bean
    public ManagerController getManagerController() {
       return new ManagerController();
    }

    @Bean
    public void getGoogleResponseClient() {
        GoogleDriveClient googleDriveClient = new GoogleDriveClient();
        System.out.println(googleDriveClient.getResponse(getManagerPersistence(), getManagerController()));
    }
}
