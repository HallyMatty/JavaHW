package enums;

enum HttpStatus {
    OK(200),
    NOT_FOUND(404),
    SERVER_ERROR(500);
    
    private final int code;
    
    HttpStatus(int code) {
        this.code = code;
    }
    
    public int getCode() {
        return code;
    }
}

public class Enums {
    public static void main(String[] args) {
        HttpStatus status = HttpStatus.OK;
        System.out.println(status.getCode());   // 200
    }
}