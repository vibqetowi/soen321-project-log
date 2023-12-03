package okhttp3.internal.publicsuffix;

import fv.t;
import gv.r;
import hs.k;
import is.u;
import is.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import mv.b;
import ta.v;
import uv.h;
import zv.m;
/* compiled from: PublicSuffixDatabase.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f27607e;
    public static final List<String> f;

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f27608g;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f27609a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f27610b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f27611c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f27612d;

    /* compiled from: PublicSuffixDatabase.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final String a(byte[] bArr, byte[][] bArr2, int i6) {
            int i10;
            boolean z10;
            int i11;
            int i12;
            byte[] bArr3 = PublicSuffixDatabase.f27607e;
            int length = bArr.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = (i13 + length) / 2;
                while (i14 > -1 && bArr[i14] != 10) {
                    i14--;
                }
                int i15 = i14 + 1;
                int i16 = 1;
                while (true) {
                    i10 = i15 + i16;
                    if (bArr[i10] == 10) {
                        break;
                    }
                    i16++;
                }
                int i17 = i10 - i15;
                int i18 = i6;
                boolean z11 = false;
                int i19 = 0;
                int i20 = 0;
                while (true) {
                    if (z11) {
                        i11 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i18][i19];
                        byte[] bArr4 = b.f25755a;
                        int i21 = b10 & 255;
                        z10 = z11;
                        i11 = i21;
                    }
                    byte b11 = bArr[i15 + i20];
                    byte[] bArr5 = b.f25755a;
                    i12 = i11 - (b11 & 255);
                    if (i12 != 0) {
                        break;
                    }
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr2[i18].length == i19) {
                        if (i18 == bArr2.length - 1) {
                            break;
                        }
                        i18++;
                        z11 = true;
                        i19 = -1;
                    } else {
                        z11 = z10;
                    }
                }
                if (i12 >= 0) {
                    if (i12 <= 0) {
                        int i22 = i17 - i20;
                        int length2 = bArr2[i18].length - i19;
                        int length3 = bArr2.length;
                        for (int i23 = i18 + 1; i23 < length3; i23++) {
                            length2 += bArr2[i23].length;
                        }
                        if (length2 >= i22) {
                            if (length2 <= i22) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                i.f(UTF_8, "UTF_8");
                                return new String(bArr, i15, i17, UTF_8);
                            }
                        }
                    }
                    i13 = i10 + 1;
                }
                length = i15 - 1;
            }
            return null;
        }
    }

    static {
        new a();
        f27607e = new byte[]{42};
        f = ca.a.O0("*");
        f27608g = new PublicSuffixDatabase();
    }

    public static List c(String str) {
        List Z0 = r.Z0(str, new char[]{'.'});
        if (i.b(u.o2(Z0), "")) {
            return u.c2(Z0);
        }
        return Z0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r1 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        if (r1 != false) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        boolean z10;
        String str2;
        String str3;
        String str4;
        w Z0;
        List Z02;
        int size;
        int size2;
        String unicodeDomain = IDN.toUnicode(str);
        i.f(unicodeDomain, "unicodeDomain");
        List c10 = c(unicodeDomain);
        int i6 = 0;
        if (!this.f27609a.get() && this.f27609a.compareAndSet(false, true)) {
            boolean z11 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z11 = true;
                    } catch (IOException e10) {
                        h hVar = h.f34614a;
                        h.f34614a.getClass();
                        h.i(5, "Failed to read public suffix list", e10);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
        } else {
            try {
                this.f27610b.await();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f27611c != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            int size3 = c10.size();
            byte[][] bArr = new byte[size3];
            for (int i10 = 0; i10 < size3; i10++) {
                Charset UTF_8 = StandardCharsets.UTF_8;
                i.f(UTF_8, "UTF_8");
                byte[] bytes = ((String) c10.get(i10)).getBytes(UTF_8);
                i.f(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i10] = bytes;
            }
            int i11 = 0;
            while (true) {
                if (i11 < size3) {
                    int i12 = i11 + 1;
                    byte[] bArr2 = this.f27611c;
                    if (bArr2 != null) {
                        str2 = a.a(bArr2, bArr, i11);
                        if (str2 != null) {
                            break;
                        }
                        i11 = i12;
                    } else {
                        i.q("publicSuffixListBytes");
                        throw null;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            if (size3 > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i13 = 0;
                while (i13 < length) {
                    int i14 = i13 + 1;
                    bArr3[i13] = f27607e;
                    byte[] bArr4 = this.f27611c;
                    if (bArr4 != null) {
                        str3 = a.a(bArr4, bArr3, i13);
                        if (str3 != null) {
                            break;
                        }
                        i13 = i14;
                    } else {
                        i.q("publicSuffixListBytes");
                        throw null;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i15 = size3 - 1;
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = i16 + 1;
                    byte[] bArr5 = this.f27612d;
                    if (bArr5 != null) {
                        str4 = a.a(bArr5, bArr, i16);
                        if (str4 != null) {
                            break;
                        }
                        i16 = i17;
                    } else {
                        i.q("publicSuffixExceptionListBytes");
                        throw null;
                    }
                }
            }
            str4 = null;
            if (str4 != null) {
                Z02 = r.Z0(i.n(str4, "!"), new char[]{'.'});
            } else if (str2 == null && str3 == null) {
                Z02 = f;
            } else {
                if (str2 == null) {
                    Z0 = null;
                } else {
                    Z0 = r.Z0(str2, new char[]{'.'});
                }
                w wVar = w.f20676u;
                if (Z0 == null) {
                    Z0 = wVar;
                }
                if (str3 == null) {
                    Z02 = null;
                } else {
                    Z02 = r.Z0(str3, new char[]{'.'});
                }
                if (Z02 == null) {
                    Z02 = wVar;
                }
                if (Z0.size() > Z02.size()) {
                    Z02 = Z0;
                }
            }
            if (c10.size() == Z02.size() && ((String) Z02.get(0)).charAt(0) != '!') {
                return null;
            }
            if (((String) Z02.get(0)).charAt(0) == '!') {
                size = c10.size();
                size2 = Z02.size();
            } else {
                size = c10.size();
                size2 = Z02.size() + 1;
            }
            fv.h A0 = t.A0(u.X1(c(str)), size - size2);
            i.g(A0, "<this>");
            StringBuilder sb2 = new StringBuilder();
            sb2.append((CharSequence) "");
            for (Object obj : A0) {
                i6++;
                if (i6 > 1) {
                    sb2.append((CharSequence) ".");
                }
                kotlin.jvm.internal.h.d(sb2, obj, null);
            }
            sb2.append((CharSequence) "");
            String sb3 = sb2.toString();
            i.f(sb3, "joinTo(StringBuilder(), …ed, transform).toString()");
            return sb3;
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        zv.t j10 = v.j(new m(v.P(resourceAsStream)));
        try {
            long readInt = j10.readInt();
            j10.C0(readInt);
            byte[] c0 = j10.f39915v.c0(readInt);
            long readInt2 = j10.readInt();
            j10.C0(readInt2);
            byte[] c02 = j10.f39915v.c0(readInt2);
            k kVar = k.f19476a;
            ca.a.z(j10, null);
            synchronized (this) {
                this.f27611c = c0;
                this.f27612d = c02;
            }
            this.f27610b.countDown();
        } finally {
        }
    }
}
