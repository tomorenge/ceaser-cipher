import org.junit.Test;

import static org.junit.Assert.*;

public class CeaserCipherTest {
    @Test
    public void CeaserCipher_testingEncryptingmethod() {
        //CeaserCipher CeaserCipher = new CeaserCipher();
        assertEquals("grj", CeaserCipher.encrypt("dog", 3));
    }

}