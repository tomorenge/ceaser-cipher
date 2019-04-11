
import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void CeaserCipher_testingEncryptingmethod() {
        Decrypt CeaserCipher = new  Decrypt();
        assertEquals("grj", CeaserCipher.decrypt("grj", 1));
    }

}