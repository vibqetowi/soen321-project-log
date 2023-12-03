package j$.time;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class w implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a  reason: collision with root package name */
    private byte f21040a;

    /* renamed from: b  reason: collision with root package name */
    private Object f21041b;

    public w() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(byte b10, Object obj) {
        this.f21040a = b10;
        this.f21041b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b10, ObjectInput objectInput) {
        switch (b10) {
            case 1:
                g gVar = g.f20957c;
                return g.G(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f20774c;
                return Instant.Y(objectInput.readLong(), objectInput.readInt());
            case 3:
                j jVar = j.f20964d;
                return j.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return n.j0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f20777c;
                j jVar2 = j.f20964d;
                return LocalDateTime.c0(j.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), n.j0(objectInput));
            case 6:
                return ZonedDateTime.Y(objectInput);
            case 7:
                int i6 = B.f20770d;
                return ZoneId.W(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.h0(objectInput);
            case 9:
                return u.V(objectInput);
            case 10:
                return OffsetDateTime.W(objectInput);
            case 11:
                int i10 = y.f21044b;
                return y.T(objectInput.readInt());
            case 12:
                int i11 = A.f20767c;
                return A.U(objectInput.readInt(), objectInput.readByte());
            case 13:
                return r.T(objectInput);
            case 14:
                return v.d(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f21041b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f21040a = readByte;
        this.f21041b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f21040a;
        Object obj = this.f21041b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                ((g) obj).J(objectOutput);
                return;
            case 2:
                ((Instant) obj).d0(objectOutput);
                return;
            case 3:
                ((j) obj).v0(objectOutput);
                return;
            case 4:
                ((n) obj).o0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).l0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).c0(objectOutput);
                return;
            case 7:
                ((B) obj).b0(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).i0(objectOutput);
                return;
            case 9:
                ((u) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((y) obj).X(objectOutput);
                return;
            case 12:
                ((A) obj).a0(objectOutput);
                return;
            case 13:
                ((r) obj).U(objectOutput);
                return;
            case 14:
                ((v) obj).f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
