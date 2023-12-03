package b9;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: DataSpec.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f4127k = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f4128a;

    /* renamed from: b  reason: collision with root package name */
    public final long f4129b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4130c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f4131d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, String> f4132e;
    public final long f;

    /* renamed from: g  reason: collision with root package name */
    public final long f4133g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4134h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4135i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f4136j;

    static {
        o7.m.a("goog.exo.datasource");
    }

    public h(Uri uri, long j10, int i6, byte[] bArr, Map<String, String> map, long j11, long j12, String str, int i10, Object obj) {
        boolean z10;
        boolean z11;
        byte[] bArr2 = bArr;
        boolean z12 = true;
        if (j10 + j11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.q(z10);
        if (j11 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        sc.b.q(z11);
        if (j12 <= 0 && j12 != -1) {
            z12 = false;
        }
        sc.b.q(z12);
        this.f4128a = uri;
        this.f4129b = j10;
        this.f4130c = i6;
        this.f4131d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f4132e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j11;
        this.f4133g = j12;
        this.f4134h = str;
        this.f4135i = i10;
        this.f4136j = obj;
    }

    public final String toString() {
        String str;
        int i6 = this.f4130c;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    str = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str = "POST";
            }
        } else {
            str = "GET";
        }
        String valueOf = String.valueOf(this.f4128a);
        int length = valueOf.length() + str.length() + 70;
        String str2 = this.f4134h;
        StringBuilder n10 = defpackage.e.n(ri.e.c(str2, length), "DataSpec[", str, " ", valueOf);
        n10.append(", ");
        n10.append(this.f);
        n10.append(", ");
        n10.append(this.f4133g);
        n10.append(", ");
        n10.append(str2);
        n10.append(", ");
        return pl.a.g(n10, this.f4135i, "]");
    }
}
