package j$.time;

import j$.time.zone.ZoneRules;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class B extends ZoneId {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f20770d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: b  reason: collision with root package name */
    private final String f20771b;

    /* renamed from: c  reason: collision with root package name */
    private final transient ZoneRules f20772c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(String str, ZoneRules zoneRules) {
        this.f20771b = str;
        this.f20772c = zoneRules;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static B a0(String str, boolean z10) {
        ZoneRules zoneRules;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = str.charAt(i6);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i6 == 0) && ((charAt < '0' || charAt > '9' || i6 == 0) && ((charAt != '~' || i6 == 0) && ((charAt != '.' || i6 == 0) && ((charAt != '_' || i6 == 0) && ((charAt != '+' || i6 == 0) && (charAt != '-' || i6 == 0))))))))) {
                    throw new d("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                zoneRules = j$.time.zone.i.b(str, true);
            } catch (j$.time.zone.f e10) {
                if (z10) {
                    throw e10;
                }
                zoneRules = null;
            }
            return new B(str, zoneRules);
        }
        throw new d("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new w((byte) 7, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.ZoneId
    public final void Z(DataOutput dataOutput) {
        dataOutput.writeByte(7);
        dataOutput.writeUTF(this.f20771b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b0(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f20771b);
    }

    @Override // j$.time.ZoneId
    public final ZoneRules getRules() {
        ZoneRules zoneRules = this.f20772c;
        return zoneRules != null ? zoneRules : j$.time.zone.i.b(this.f20771b, false);
    }

    @Override // j$.time.ZoneId
    public final String k() {
        return this.f20771b;
    }
}
