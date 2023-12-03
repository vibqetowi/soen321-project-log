package lv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import java.util.concurrent.TimeUnit;
/* compiled from: CacheControl.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f24570n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f24571a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24572b;

    /* renamed from: c  reason: collision with root package name */
    public final int f24573c;

    /* renamed from: d  reason: collision with root package name */
    public final int f24574d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24575e;
    public final boolean f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f24576g;

    /* renamed from: h  reason: collision with root package name */
    public final int f24577h;

    /* renamed from: i  reason: collision with root package name */
    public final int f24578i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f24579j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f24580k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f24581l;

    /* renamed from: m  reason: collision with root package name */
    public String f24582m;

    /* compiled from: CacheControl.kt */
    /* loaded from: classes2.dex */
    public static final class a {
    }

    /* compiled from: CacheControl.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static int a(int i6, String str, String str2) {
            int length = str.length();
            while (i6 < length) {
                int i10 = i6 + 1;
                if (gv.r.I0(str2, str.charAt(i6))) {
                    return i6;
                }
                i6 = i10;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static d b(s sVar) {
            String str;
            int i6;
            int i10;
            int i11;
            String str2;
            s headers = sVar;
            kotlin.jvm.internal.i.g(headers, "headers");
            int length = headers.f24683u.length / 2;
            boolean z10 = true;
            int i12 = 0;
            boolean z11 = true;
            String str3 = null;
            boolean z12 = false;
            boolean z13 = false;
            int i13 = -1;
            int i14 = -1;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            int i15 = -1;
            int i16 = -1;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            while (i12 < length) {
                int i17 = i12 + 1;
                String m10 = headers.m(i12);
                String q10 = headers.q(i12);
                if (gv.n.A0(m10, "Cache-Control", z10)) {
                    if (str3 == null) {
                        str3 = q10;
                        i6 = 0;
                        while (i6 < q10.length()) {
                            int a10 = a(i6, q10, "=,;");
                            String substring = q10.substring(i6, a10);
                            kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            String obj = gv.r.i1(substring).toString();
                            if (a10 != q10.length() && q10.charAt(a10) != ',' && q10.charAt(a10) != ';') {
                                int i18 = a10 + 1;
                                byte[] bArr = mv.b.f25755a;
                                int length2 = q10.length();
                                while (true) {
                                    if (i18 < length2) {
                                        int i19 = i18 + 1;
                                        int i20 = length2;
                                        char charAt = q10.charAt(i18);
                                        i10 = length;
                                        if (charAt != ' ' && charAt != '\t') {
                                            break;
                                        }
                                        i18 = i19;
                                        length2 = i20;
                                        length = i10;
                                    } else {
                                        i10 = length;
                                        i18 = q10.length();
                                        break;
                                    }
                                }
                                if (i18 < q10.length() && q10.charAt(i18) == '\"') {
                                    int i21 = i18 + 1;
                                    int N0 = gv.r.N0(q10, '\"', i21, false, 4);
                                    str2 = q10.substring(i21, N0);
                                    kotlin.jvm.internal.i.f(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    i11 = N0 + 1;
                                } else {
                                    i11 = a(i18, q10, ",;");
                                    String substring2 = q10.substring(i18, i11);
                                    kotlin.jvm.internal.i.f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                    str2 = gv.r.i1(substring2).toString();
                                }
                            } else {
                                i10 = length;
                                i11 = a10 + 1;
                                str2 = null;
                            }
                            if (gv.n.A0("no-cache", obj, true)) {
                                z12 = true;
                            } else if (gv.n.A0("no-store", obj, true)) {
                                z13 = true;
                            } else if (gv.n.A0("max-age", obj, true)) {
                                i13 = mv.b.y(-1, str2);
                            } else if (gv.n.A0("s-maxage", obj, true)) {
                                i14 = mv.b.y(-1, str2);
                            } else if (gv.n.A0("private", obj, true)) {
                                z14 = true;
                            } else if (gv.n.A0("public", obj, true)) {
                                z15 = true;
                            } else if (gv.n.A0("must-revalidate", obj, true)) {
                                z16 = true;
                            } else if (gv.n.A0("max-stale", obj, true)) {
                                i15 = mv.b.y(SubsamplingScaleImageView.TILE_SIZE_AUTO, str2);
                            } else if (gv.n.A0("min-fresh", obj, true)) {
                                i16 = mv.b.y(-1, str2);
                            } else if (gv.n.A0("only-if-cached", obj, true)) {
                                z17 = true;
                            } else if (gv.n.A0("no-transform", obj, true)) {
                                z18 = true;
                            } else if (gv.n.A0("immutable", obj, true)) {
                                z19 = true;
                            }
                            i6 = i11;
                            length = i10;
                        }
                        headers = sVar;
                        i12 = i17;
                        length = length;
                        z10 = true;
                    }
                } else if (!gv.n.A0(m10, "Pragma", z10)) {
                    headers = sVar;
                    i12 = i17;
                    length = length;
                    z10 = true;
                }
                z11 = false;
                i6 = 0;
                while (i6 < q10.length()) {
                }
                headers = sVar;
                i12 = i17;
                length = length;
                z10 = true;
            }
            if (!z11) {
                str = null;
            } else {
                str = str3;
            }
            return new d(z12, z13, i13, i14, z14, z15, z16, i15, i16, z17, z18, z19, str);
        }
    }

    static {
        new a();
        new a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        kotlin.jvm.internal.i.g(timeUnit, "timeUnit");
        timeUnit.toSeconds((long) SubsamplingScaleImageView.TILE_SIZE_AUTO);
    }

    public d(boolean z10, boolean z11, int i6, int i10, boolean z12, boolean z13, boolean z14, int i11, int i12, boolean z15, boolean z16, boolean z17, String str) {
        this.f24571a = z10;
        this.f24572b = z11;
        this.f24573c = i6;
        this.f24574d = i10;
        this.f24575e = z12;
        this.f = z13;
        this.f24576g = z14;
        this.f24577h = i11;
        this.f24578i = i12;
        this.f24579j = z15;
        this.f24580k = z16;
        this.f24581l = z17;
        this.f24582m = str;
    }

    public final String toString() {
        boolean z10;
        String str = this.f24582m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f24571a) {
                sb2.append("no-cache, ");
            }
            if (this.f24572b) {
                sb2.append("no-store, ");
            }
            int i6 = this.f24573c;
            if (i6 != -1) {
                sb2.append("max-age=");
                sb2.append(i6);
                sb2.append(", ");
            }
            int i10 = this.f24574d;
            if (i10 != -1) {
                sb2.append("s-maxage=");
                sb2.append(i10);
                sb2.append(", ");
            }
            if (this.f24575e) {
                sb2.append("private, ");
            }
            if (this.f) {
                sb2.append("public, ");
            }
            if (this.f24576g) {
                sb2.append("must-revalidate, ");
            }
            int i11 = this.f24577h;
            if (i11 != -1) {
                sb2.append("max-stale=");
                sb2.append(i11);
                sb2.append(", ");
            }
            int i12 = this.f24578i;
            if (i12 != -1) {
                sb2.append("min-fresh=");
                sb2.append(i12);
                sb2.append(", ");
            }
            if (this.f24579j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f24580k) {
                sb2.append("no-transform, ");
            }
            if (this.f24581l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length());
            String sb3 = sb2.toString();
            kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
            this.f24582m = sb3;
            return sb3;
        }
        return str;
    }
}
