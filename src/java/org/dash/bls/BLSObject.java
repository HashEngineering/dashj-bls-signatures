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
            delete();
    }

    protected void delete()
    {
        if (objectPointer != 0) {
            if (owner) {
                owner = false;
                delete(objectPointer);
            }
            objectPointer = 0;
        }
    }

    protected abstract void delete(long objectPointer);

    public long getObjectPointer() {
        return objectPointer;
    }
}
