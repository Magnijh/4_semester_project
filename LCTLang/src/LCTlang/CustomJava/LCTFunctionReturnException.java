package LCTlang.CustomJava;

public class LCTFunctionReturnException extends RuntimeException {
    public LCTFunctionReturnException(String errorMsg, Value returnValue) {
        super(errorMsg, returnValue);
    }
}