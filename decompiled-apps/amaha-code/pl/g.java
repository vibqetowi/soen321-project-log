package pl;

import android.graphics.Bitmap;
/* compiled from: N12CScreenFragment.kt */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final String f28595a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap f28596b;

    /* renamed from: c  reason: collision with root package name */
    public final String f28597c;

    public g(Bitmap bitmap, String str, String text) {
        kotlin.jvm.internal.i.g(text, "text");
        this.f28595a = str;
        this.f28596b = bitmap;
        this.f28597c = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (kotlin.jvm.internal.i.b(this.f28595a, gVar.f28595a) && kotlin.jvm.internal.i.b(this.f28596b, gVar.f28596b) && kotlin.jvm.internal.i.b(this.f28597c, gVar.f28597c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i6 = 0;
        String str = this.f28595a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode * 31;
        Bitmap bitmap = this.f28596b;
        if (bitmap != null) {
            i6 = bitmap.hashCode();
        }
        return this.f28597c.hashCode() + ((i10 + i6) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("N12CLocalData(imageLink=");
        sb2.append(this.f28595a);
        sb2.append(", imageBitmap=");
        sb2.append(this.f28596b);
        sb2.append(", text=");
        return v.g.c(sb2, this.f28597c, ')');
    }
}
