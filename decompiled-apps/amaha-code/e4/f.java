package e4;

import android.text.TextUtils;
import r1.b0;
/* compiled from: Header.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final String f13761a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13762b;

    public f(String str, String str2) {
        this.f13761a = str;
        this.f13762b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (TextUtils.equals(this.f13761a, fVar.f13761a) && TextUtils.equals(this.f13762b, fVar.f13762b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13762b.hashCode() + (this.f13761a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Header[name=");
        sb2.append(this.f13761a);
        sb2.append(",value=");
        return b0.b(sb2, this.f13762b, "]");
    }
}
