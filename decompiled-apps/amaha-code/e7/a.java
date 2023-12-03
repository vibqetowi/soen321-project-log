package e7;

import d7.n;
import java.util.Arrays;
/* compiled from: AutoValue_BackendRequest.java */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    public final Iterable<n> f13810a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f13811b;

    public a() {
        throw null;
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f13810a = iterable;
        this.f13811b = bArr;
    }

    @Override // e7.f
    public final Iterable<n> a() {
        return this.f13810a;
    }

    @Override // e7.f
    public final byte[] b() {
        return this.f13811b;
    }

    public final boolean equals(Object obj) {
        byte[] b10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13810a.equals(fVar.a())) {
            if (fVar instanceof a) {
                b10 = ((a) fVar).f13811b;
            } else {
                b10 = fVar.b();
            }
            if (Arrays.equals(this.f13811b, b10)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13810a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13811b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.f13810a + ", extras=" + Arrays.toString(this.f13811b) + "}";
    }
}
