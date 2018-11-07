package org.dash.bls;

public class DashBlsJniSimple {

    static {
        System.loadLibrary("dashjblssimple");
    }

    public static void main(String[] args) {

        int[] seed = new int[]{
                0, 50, 6, 244, 24, 199, 1, 25, 52, 88, 192,
                19, 18, 12, 89, 6, 220, 18, 102, 58, 209,
                82, 12, 62, 89, 110, 182, 9, 44, 20, 254, 22};

        DashBlsJniSimple blsJni = new DashBlsJniSimple();
        blsJni.nativePublicKeyFingerprint();

        long fingerprint = blsJni.publicKeyFingerprint(seed);
        System.out.println("Fingerprint (java):\t\t" + fingerprint);
    }

    private native long publicKeyFingerprint(int[] seed);

    private native void nativePublicKeyFingerprint();
}
