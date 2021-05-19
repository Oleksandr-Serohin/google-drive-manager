package ua.com.foxminded.googledrivemanager;

import lombok.Data;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Data
@Service
public class GoogleDriveClient {

    public ResponseEntity<String> getResponse(ManagerPersistence managerPersistence, ManagerController managerController) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", managerPersistence.token);
        httpHeaders.set("Content-Type", managerController.contentType);
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange(managerController.resourceURL, HttpMethod.GET, entity, String.class);
    }
}