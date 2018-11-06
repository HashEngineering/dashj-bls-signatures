package org.dash.bls;

import org.dash.blssignatures.blssignaturesJNI;

public abstract class BLSObject {
    protected transient long objectPointer;
    protected transient boolean owner;

    protected BLSObject(long objectPointer, boolean owner) {
        this.objectPointer = objectPointer;
        this.owner = owner;
    }

    protected void finalize() throws Throwable {
        if(owner)
            delete(objectPointer);
    }

    protected void delete(long objectPointer)
    {
        if (objectPointer != 0) {
            if (owner) {
                owner = false;
                blssignaturesJNI.delete_PublicKey(objectPointer);
            }
            objectPointer = 0;
        }
    }

    public long getObjectPointer() {
        return objectPointer;
    }
}
