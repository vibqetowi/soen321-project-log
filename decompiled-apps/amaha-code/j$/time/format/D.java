package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
/* loaded from: classes3.dex */
public final class D {

    /* renamed from: a  reason: collision with root package name */
    public static final D f20866a = new D();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private D() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(char c10) {
        int i6 = c10 - '0';
        if (i6 < 0 || i6 > 9) {
            return -1;
        }
        return i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            ((D) obj).getClass();
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
