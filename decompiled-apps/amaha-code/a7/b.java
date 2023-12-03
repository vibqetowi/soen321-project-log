package a7;

import r1.b0;
/* compiled from: Encoding.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f333a;

    public b(String str) {
        if (str != null) {
            this.f333a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f333a.equals(((b) obj).f333a);
    }

    public final int hashCode() {
        return this.f333a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return b0.b(new StringBuilder("Encoding{name=\""), this.f333a, "\"}");
    }
}
