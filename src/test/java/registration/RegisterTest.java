package registration;

import Page.Registration;
import org.testng.annotations.Test;

public class RegisterTest {

    final Registration registration = new Registration();

    @Test
    public void RegistrationSuccesfully(){
        registration.Register();
    }
}
