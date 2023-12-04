package org.threeten.bp.zone;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import org.threeten.bp.ZoneOffset;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class Ser implements Externalizable {
    static final byte SZR = 1;
    static final byte ZOT = 2;
    static final byte ZOTRULE = 3;
    private static final long serialVersionUID = -8885321777449118786L;
    private Object object;
    private byte type;

    public Ser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Ser(byte b, Object obj) {
        this.type = b;
        this.object = obj;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        writeInternal(this.type, this.object, objectOutput);
    }

    static void write(Object obj, DataOutput dataOutput) throws IOException {
        writeInternal((byte) 1, obj, dataOutput);
    }

    private static void writeInternal(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b == 1) {
            ((StandardZoneRules) obj).writeExternal(dataOutput);
        } else if (b == 2) {
            ((ZoneOffsetTransition) obj).writeExternal(dataOutput);
        } else if (b == 3) {
            ((ZoneOffsetTransitionRule) obj).writeExternal(dataOutput);
        } else {
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.type = readByte;
        this.object = readInternal(readByte, objectInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object read(DataInput dataInput) throws IOException, ClassNotFoundException {
        return readInternal(dataInput.readByte(), dataInput);
    }

    private static Object readInternal(byte b, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    return ZoneOffsetTransitionRule.readExternal(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            return ZoneOffsetTransition.readExternal(dataInput);
        }
        return StandardZoneRules.readExternal(dataInput);
    }

    private Object readResolve() {
        return this.object;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeOffset(ZoneOffset zoneOffset, DataOutput dataOutput) throws IOException {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i = totalSeconds % TypedValues.Custom.TYPE_INT == 0 ? totalSeconds / TypedValues.Custom.TYPE_INT : 127;
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(totalSeconds);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset readOffset(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.ofTotalSeconds(dataInput.readInt()) : ZoneOffset.ofTotalSeconds(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeEpochSec(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long readEpochSec(DataInput dataInput) throws IOException {
        int readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return ((((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }
}
