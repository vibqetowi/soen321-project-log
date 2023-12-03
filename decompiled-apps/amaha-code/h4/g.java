package h4;

import h4.f;
import java.security.MessageDigest;
/* compiled from: Options.java */
/* loaded from: classes.dex */
public final class g implements e {

    /* renamed from: b  reason: collision with root package name */
    public final d5.b f17172b = new d5.b();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        int i6 = 0;
        while (true) {
            d5.b bVar = this.f17172b;
            if (i6 < bVar.f32260w) {
                f fVar = (f) bVar.i(i6);
                V m10 = this.f17172b.m(i6);
                f.b<T> bVar2 = fVar.f17169b;
                if (fVar.f17171d == null) {
                    fVar.f17171d = fVar.f17170c.getBytes(e.f17166a);
                }
                bVar2.a(fVar.f17171d, m10, messageDigest);
                i6++;
            } else {
                return;
            }
        }
    }

    public final <T> T c(f<T> fVar) {
        d5.b bVar = this.f17172b;
        if (bVar.containsKey(fVar)) {
            return (T) bVar.getOrDefault(fVar, null);
        }
        return fVar.f17168a;
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f17172b.equals(((g) obj).f17172b);
        }
        return false;
    }

    @Override // h4.e
    public final int hashCode() {
        return this.f17172b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f17172b + '}';
    }
}
