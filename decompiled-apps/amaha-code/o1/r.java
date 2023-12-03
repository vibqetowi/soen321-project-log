package o1;

import android.text.TextUtils;
/* compiled from: MediaSessionManagerImplBase.java */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final String f26975a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26976b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26977c;

    public r(String str, int i6, int i10) {
        this.f26975a = str;
        this.f26976b = i6;
        this.f26977c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        int i6 = this.f26977c;
        String str = this.f26975a;
        int i10 = this.f26976b;
        if (i10 >= 0 && rVar.f26976b >= 0) {
            if (TextUtils.equals(str, rVar.f26975a) && i10 == rVar.f26976b && i6 == rVar.f26977c) {
                return true;
            }
            return false;
        } else if (TextUtils.equals(str, rVar.f26975a) && i6 == rVar.f26977c) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        return s0.b.b(this.f26975a, Integer.valueOf(this.f26977c));
    }
}
