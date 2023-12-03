package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a  reason: collision with root package name */
    private byte f21059a;

    /* renamed from: b  reason: collision with root package name */
    private Object f21060b;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(byte b10, Object obj) {
        this.f21059a = b10;
        this.f21060b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(DataInput dataInput) {
        int readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return ((((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.f0(dataInput.readInt()) : ZoneOffset.f0(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(long j10, DataOutput dataOutput) {
        if (j10 < -4575744000L || j10 >= 10413792000L || j10 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j10);
            return;
        }
        int i6 = (int) ((j10 + 4575744000L) / 900);
        dataOutput.writeByte((i6 >>> 16) & 255);
        dataOutput.writeByte((i6 >>> 8) & 255);
        dataOutput.writeByte(i6 & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int c0 = zoneOffset.c0();
        int i6 = c0 % 900 == 0 ? c0 / 900 : 127;
        dataOutput.writeByte(i6);
        if (i6 == 127) {
            dataOutput.writeInt(c0);
        }
    }

    private Object readResolve() {
        return this.f21060b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object k10;
        byte readByte = objectInput.readByte();
        this.f21059a = readByte;
        if (readByte == 1) {
            k10 = ZoneRules.k(objectInput);
        } else if (readByte == 2) {
            long a10 = a(objectInput);
            ZoneOffset b10 = b(objectInput);
            ZoneOffset b11 = b(objectInput);
            if (b10.equals(b11)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            k10 = new b(a10, b10, b11);
        } else if (readByte == 3) {
            k10 = e.b(objectInput);
        } else if (readByte != 100) {
            throw new StreamCorruptedException("Unknown serialized type");
        } else {
            k10 = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f21060b = k10;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f21059a;
        Object obj = this.f21060b;
        objectOutput.writeByte(b10);
        if (b10 == 1) {
            ((ZoneRules) obj).l(objectOutput);
        } else if (b10 == 2) {
            ((b) obj).U(objectOutput);
        } else if (b10 == 3) {
            ((e) obj).c(objectOutput);
        } else if (b10 != 100) {
            throw new InvalidClassException("Unknown serialized type");
        } else {
            ((ZoneRules) obj).m(objectOutput);
        }
    }
}
