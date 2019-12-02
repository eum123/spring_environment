package kr.heungkuklife.eai.statistic.common.response;

import org.springframework.http.HttpStatus;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ApiResponseMessage {
	// HttpStatus
    private HttpStatus status;
    // Http Default Message
    private Object userResponse;
    // Error Message to USER
    private String errorMessage;
    // Error Code
    private String errorCode;
 
    public ApiResponseMessage() {}
 
    public ApiResponseMessage(HttpStatus status, Object userResponse, String errorCode, String errorMessage) {
        this.status = status;
        this.userResponse = userResponse;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
