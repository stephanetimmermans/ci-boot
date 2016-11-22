package be.akala;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Stephane Timmermans
 * @since 1.0
 */
@RestController
public class ApiRestController {

    @RequestMapping("/api/hello")
    public ResponseEntity<?> helloDocker() {

        HelloDockerDTO helloDockerDTO = new HelloDockerDTO();
        helloDockerDTO.setTitle("Hello");
//        helloDockerDTO.setContent("Docker !!");

        return new ResponseEntity<>(helloDockerDTO, HttpStatus.OK);

    }

}
