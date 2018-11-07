package org.dash.bls;

import org.dash.bls.BLSPublicKey;
import org.dash.blssignatures.PrivateKey;
import org.dash.blssignatures.SWIGTYPE_p_PublicKey;
import org.dash.blssignatures.SWIGTYPE_p_Signature;
import org.dash.blssignatures.SWIGTYPE_p_uint8_t;

public class DashBlsJni {

    static {
        try {
            System.loadLibrary("blswrapper");

            System.loadLibrary("dashjbls");
            System.loadLibrary("dashjblssimple");
            //System.loadLibrary("cyggcc_s-seh-1");
            //System.loadLibrary("cygstdc++-6");
            //System.loadLibrary("cygdashjbls");
        } catch (UnsatisfiedLinkError x) {
            System.out.println(x.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Example seed, used to generate private key. Always use
// a secure RNG with sufficient entropy to generate a seed.
        byte seed[] = {0, 50, 6, 24, 24, 19, 1, 25, 52, 88, 19,
                19, 18, 12, 89, 6, 22, 18, 102, 58, 20,
                82, 12, 62, 89, 110, 18, 9, 44, 20, 25, 22};

        BLSPublicKey pk = BLSPublicKey.fromBytes(new byte [32]);

        SWIGTYPE_p_uint8_t _seed = null;

        PrivateKey sk = PrivateKey.FromSeed(seed, seed.length);
        SWIGTYPE_p_PublicKey swigtype_p_publicKey = sk.GetPublicKey();

        byte msg[] = {100, 2, 54, 88, 90, 45, 23}; //!!! 254 changed to 54 !!!

        SWIGTYPE_p_Signature sign = sk.Sign(msg, msg.length);

    }

}