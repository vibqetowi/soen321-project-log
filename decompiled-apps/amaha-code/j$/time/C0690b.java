package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.b  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0690b extends AbstractC0691c implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    static final C0690b f20792b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a  reason: collision with root package name */
    private final ZoneId f20793a;

    static {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        f20792b = new C0690b(ZoneOffset.UTC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0690b(ZoneId zoneId) {
        this.f20793a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.AbstractC0691c
    public final ZoneId a() {
        return this.f20793a;
    }

    @Override // j$.time.AbstractC0691c
    public final long b() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0690b) {
            return this.f20793a.equals(((C0690b) obj).f20793a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20793a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f20793a + "]";
    }
}
