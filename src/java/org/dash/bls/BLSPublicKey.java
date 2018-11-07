package org.dash.bls;

public class BLSPublicKey extends BLSObject {

    BLSPublicKey(long objectPointer, boolean owner) {
        super(objectPointer, owner);
    }

    public static BLSPublicKey fromBytes(byte [] bytes) {
        return new BLSPublicKey(FromBytes(bytes), true);
    }

    native static long FromBytes(byte [] bytes);

    protected void delete(long objectPointer) {
        //blssignaturesJNI.delete_PublicKey(objectPointer);
    }
}
