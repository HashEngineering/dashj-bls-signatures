package org.dash.bls;

import org.dash.bls.BLSPublicKey;
import org.dash.blssignatures.*;

import java.util.AbstractList;

import static org.dash.blssignatures.PublicKey.PUBLIC_KEY_SIZE;

public class DashBlsJni {

    static {
        //try {
            System.loadLibrary("blswrapper");

            System.loadLibrary("dashjbls");
            System.loadLibrary("dashjblssimple");
            //System.loadLibrary("cyggcc_s-seh-1");
            //System.loadLibrary("cygstdc++-6");
            //System.loadLibrary("cygdashjbls");
        //} /*catch (UnsatisfiedLinkError x) {
            //System.out.println(x.getMessage());
        //}*/
    }

    public static void main(String[] args) {
        System.out.println("Hello World");

        // Example seed, used to generate private key. Always use
// a secure RNG with sufficient entropy to generate a seed.
        /*byte seed1[] = {0, 50, 6, 24, 24, 19, 1, 25, 52, 88, 19,
                19, 18, 12, 89, 6, 22, 18, 102, 58, 20,
                82, 12, 62, 89, 110, 18, 9, 44, 20, 25, 22};

        BLSPublicKey pk1 = BLSPublicKey.fromBytes(new byte [32]);

        SWIGTYPE_p_uint8_t _seed = null;

        PrivateKey sk1 = PrivateKey.FromSeed(seed1, seed1.length);
        PublicKey publicKey = sk1.GetPublicKey();

        byte msg1[] = {100, 2, 54, 88, 90, 45, 23}; //!!! 254 changed to 54 !!!

        Signature sign1 = sk1.Sign(msg1, msg1.length);

        if(sign1.Verify())
            System.out.println("Signature Verified");*/

        System.out.println("Creating keys and signatures");

        // Example seed, used to generate private key. Always use
// a secure RNG with sufficient entropy to generate a seed.
        byte [] seed = {0, 50, 6, 244-256, 24, 199-255, 1, 25, 52, 88, 192-256,
                19, 18, 12, 89, 6, 220-255, 18, 102, 58, 209-255,
                82, 12, 62, 89, 110, 182-255, 9, 44, 20, 254-255, 22};

        PrivateKey sk = PrivateKey.FromSeed(seed, seed.length);
        PublicKey pk = sk.GetPublicKey();

        byte [] msg = {100, 2, 254-256, 88, 90, 45, 23};

        Signature sig = sk.Sign(msg, msg.length);

        System.out.println("Serializing keys and signatures to bytes");
        byte [] skBytes = new byte[(int)PrivateKey.PRIVATE_KEY_SIZE];  // 32 byte array
        byte [] pkBytes= new byte[(int)PublicKey.PUBLIC_KEY_SIZE];    // 48 byte array
        byte [] sigBytes= new byte[(int)Signature.SIGNATURE_SIZE];    // 96 byte array

        sk.Serialize(skBytes);   // 32 bytes
        pk.Serialize(pkBytes);   // 48 bytes
        sig.Serialize(sigBytes); // 96 bytes

        System.out.println("Loading keys and signatures from bytes");
        // Takes array of 32 bytes
        sk = PrivateKey.FromBytes(skBytes);

        // Takes array of 48 bytes
        pk = PublicKey.FromBytes(pkBytes);

        // Takes array of 96 bytes
        sig = Signature.FromBytes(sigBytes);
        System.out.println("Verifying signatures");
        // Add information required for verification, to sig object
        sig.SetAggregationInfo(AggregationInfo.FromMsg(pk, msg, msg.length));

        boolean ok = sig.Verify();
        System.out.println("Signature Verify = " + ok);

        System.out.println("Aggregate signatures for a single message");
// Generate some more private keys
        seed[0] = 1;
        PrivateKey sk1 = PrivateKey.FromSeed(seed, seed.length);
        seed[0] = 2;
        PrivateKey sk2 = PrivateKey.FromSeed(seed, seed.length);

// Generate first sig
        PublicKey pk1 = sk1.GetPublicKey();
        Signature sig1 = sk1.Sign(msg, msg.length);

// Generate second sig
        PublicKey pk2 = sk2.GetPublicKey();
        Signature sig2 = sk2.Sign(msg, msg.length);

// Aggregate signatures together
        SignatureVector sigs = new SignatureVector();
        sigs.push_back(sig1);
        sigs.push_back(sig2);
        Signature aggSig = Signature.AggregateSigs(sigs);

// For same message, public keys can be aggregated into one.
// The signature can be verified the same as a single signature,
// using this public key.
        PublicKeyVector pubKeys = new PublicKeyVector();
        pubKeys.push_back(pk1);
        pubKeys.push_back(pk2);
        //PublicKey aggPubKey = Signature::Aggregate(pubKeys);
    }

}