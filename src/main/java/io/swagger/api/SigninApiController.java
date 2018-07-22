package io.swagger.api;


import io.swagger.model.SignBadResponse;
import io.swagger.model.SigninResponse;
import io.swagger.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-07-21T06:59:45.566Z")

@Controller
public class SigninApiController implements SigninApi {

    private static final Logger log = LoggerFactory.getLogger(SigninApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public SigninApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<SigninResponse> userCertification(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User email) {
        String accept = request.getHeader("Accept");
        System.out.println(email);
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<SigninResponse>(objectMapper.readValue("{  \"nickname\" : \"nickname\",  \"uuid\" : \"uuid\",  \"email\" : \"email\"}", SigninResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<SigninResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }


        return new ResponseEntity<SigninResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
