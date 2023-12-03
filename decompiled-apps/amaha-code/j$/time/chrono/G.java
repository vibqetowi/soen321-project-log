package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
/* loaded from: classes3.dex */
final class G implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a  reason: collision with root package name */
    private byte f20804a;

    /* renamed from: b  reason: collision with root package name */
    private Object f20805b;

    public G() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public G(byte b10, Object obj) {
        this.f20804a = b10;
        this.f20805b = obj;
    }

    private Object readResolve() {
        return this.f20805b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object r;
        byte readByte = objectInput.readByte();
        this.f20804a = readByte;
        switch (readByte) {
            case 1:
                int i6 = AbstractC0692a.f20813c;
                r = AbstractC0692a.r(objectInput.readUTF());
                break;
            case 2:
                r = ((InterfaceC0694c) objectInput.readObject()).I((j$.time.n) objectInput.readObject());
                break;
            case 3:
                r = ((InterfaceC0697f) objectInput.readObject()).D((ZoneOffset) objectInput.readObject()).B((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.j jVar = z.f20851d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                x.f20849d.getClass();
                r = new z(j$.time.j.h0(readInt, readByte2, readByte3));
                break;
            case 5:
                A a10 = A.f20794d;
                r = A.q(objectInput.readByte());
                break;
            case 6:
                q qVar = (q) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                qVar.getClass();
                r = s.Z(qVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                C.f20800d.getClass();
                r = new E(j$.time.j.h0(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                I.f20807d.getClass();
                r = new K(j$.time.j.h0(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i10 = C0700i.f20818e;
                r = new C0700i(AbstractC0692a.r(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f20805b = r;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f20804a;
        Object obj = this.f20805b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((AbstractC0692a) obj).k());
                return;
            case 2:
                ((C0699h) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((m) obj).writeExternal(objectOutput);
                return;
            case 4:
                z zVar = (z) obj;
                zVar.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(zVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(zVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(zVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((A) obj).y(objectOutput);
                return;
            case 6:
                ((s) obj).writeExternal(objectOutput);
                return;
            case 7:
                E e10 = (E) obj;
                e10.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(e10, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(e10, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(e10, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                K k10 = (K) obj;
                k10.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(k10, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(k10, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(k10, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C0700i) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
