package c5;

import h4.e;
import java.security.MessageDigest;
import kc.f;
/* compiled from: ObjectKey.java */
/* loaded from: classes.dex */
public final class d implements e {

    /* renamed from: b  reason: collision with root package name */
    public final Object f4988b;

    public d(Object obj) {
        f.p(obj);
        this.f4988b = obj;
    }

    @Override // h4.e
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(this.f4988b.toString().getBytes(e.f17166a));
    }

    @Override // h4.e
    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f4988b.equals(((d) obj).f4988b);
        }
        return false;
    }

    @Override // h4.e
    public final int hashCode() {
        return this.f4988b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4988b + '}';
    }
}
