import com.sap.gateway.ip.core.customdev.util.Message

def Message processData(Message message) {
    
    // 1. Define your custom error message text
    String customErrorMessage = "Validation Failed: Unauthorized payload structure or bad input values detected."
    
    // 2. Set it as a property so you can still read it inside the Exception Subprocess
    message.setProperty("Custom_Error_Message", customErrorMessage)
    
    // 3. THROW the exception. This immediately transfers control to your Error Start Event.
    throw new java.lang.IllegalArgumentException(customErrorMessage)

}
