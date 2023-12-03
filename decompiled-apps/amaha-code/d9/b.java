package d9;

import android.os.Bundle;
import java.util.Arrays;
/* compiled from: ColorInfo.java */
/* loaded from: classes.dex */
public final class b implements com.google.android.exoplayer2.f {

    /* renamed from: z  reason: collision with root package name */
    public static final p7.e f12608z = new p7.e(29);

    /* renamed from: u  reason: collision with root package name */
    public final int f12609u;

    /* renamed from: v  reason: collision with root package name */
    public final int f12610v;

    /* renamed from: w  reason: collision with root package name */
    public final int f12611w;

    /* renamed from: x  reason: collision with root package name */
    public final byte[] f12612x;

    /* renamed from: y  reason: collision with root package name */
    public int f12613y;

    public b(int i6, int i10, int i11, byte[] bArr) {
        this.f12609u = i6;
        this.f12610v = i10;
        this.f12611w = i11;
        this.f12612x = bArr;
    }

    public static String b(int i6) {
        return Integer.toString(i6, 36);
    }

    @Override // com.google.android.exoplayer2.f
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(b(0), this.f12609u);
        bundle.putInt(b(1), this.f12610v);
        bundle.putInt(b(2), this.f12611w);
        bundle.putByteArray(b(3), this.f12612x);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f12609u == bVar.f12609u && this.f12610v == bVar.f12610v && this.f12611w == bVar.f12611w && Arrays.equals(this.f12612x, bVar.f12612x)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f12613y == 0) {
            this.f12613y = Arrays.hashCode(this.f12612x) + ((((((527 + this.f12609u) * 31) + this.f12610v) * 31) + this.f12611w) * 31);
        }
        return this.f12613y;
    }

    public final String toString() {
        boolean z10;
        if (this.f12612x != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(this.f12609u);
        sb2.append(", ");
        sb2.append(this.f12610v);
        sb2.append(", ");
        sb2.append(this.f12611w);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}
