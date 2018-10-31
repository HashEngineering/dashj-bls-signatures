package org.dash.bls;

import org.dash.blssignatures.PrivateKey;
import org.dash.blssignatures.PublicKey;
import org.dash.blssignatures.SWIGTYPE_p_uint8_t;
import org.dash.blssignatures.Signature;

public class DashBlsJni {
 
    static {
        System.loadLibrary("dashjbls");
    }
     
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Example seed, used to generate private key. Always use
// a secure RNG with sufficient entropy to generate a seed.
        byte seed[] = {0, 50, 6, 24, 24, 19, 1, 25, 52, 88, 19,
                19, 18, 12, 89, 6, 22, 18, 102, 58, 20,
                82, 12, 62, 89, 110, 18, 9, 44, 20, 25, 22};

        PrivateKey sk = PrivateKey.FromSeed(seed, seed.length);
        PublicKey pk = sk.GetPublicKey();

        byte msg[] = {100, 2, 254, 88, 90, 45, 23};

        Signature sig = sk.Sign(msg, msg.length);
    }

}