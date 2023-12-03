package a3;

import java.util.Arrays;
/* compiled from: LottieResult.java */
/* loaded from: classes.dex */
public final class p<V> {

    /* renamed from: a  reason: collision with root package name */
    public final V f268a;

    /* renamed from: b  reason: collision with root package name */
    public final Throwable f269b;

    /* JADX WARN: Multi-variable type inference failed */
    public p(c cVar) {
        this.f268a = cVar;
        this.f269b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        V v10 = this.f268a;
        if (v10 != null && v10.equals(pVar.f268a)) {
            return true;
        }
        Throwable th2 = this.f269b;
        if (th2 == null || pVar.f269b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f268a, this.f269b});
    }

    public p(Throwable th2) {
        this.f269b = th2;
        this.f268a = null;
    }
}
