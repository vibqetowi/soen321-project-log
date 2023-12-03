package mv;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import gv.e;
import gv.n;
import gv.r;
import is.u;
import j$.util.DesugarTimeZone;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import lv.b0;
import lv.d0;
import lv.f0;
import lv.s;
import lv.t;
import lv.x;
import zv.i;
import zv.q;
import zv.z;
/* compiled from: Util.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f25755a;

    /* renamed from: b  reason: collision with root package name */
    public static final s f25756b = s.b.c(new String[0]);

    /* renamed from: c  reason: collision with root package name */
    public static final f0 f25757c;

    /* renamed from: d  reason: collision with root package name */
    public static final q f25758d;

    /* renamed from: e  reason: collision with root package name */
    public static final TimeZone f25759e;
    public static final e f;

    /* renamed from: g  reason: collision with root package name */
    public static final String f25760g;

    static {
        byte[] bArr = new byte[0];
        f25755a = bArr;
        zv.e eVar = new zv.e();
        eVar.y0(0, bArr, 0);
        long j10 = 0;
        f25757c = new f0(null, j10, eVar);
        c(j10, j10, j10);
        new b0(null, bArr, 0, 0);
        i iVar = i.f39888x;
        f25758d = q.a.b(i.a.b("efbbbf"), i.a.b("feff"), i.a.b("fffe"), i.a.b("0000ffff"), i.a.b("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        kotlin.jvm.internal.i.d(timeZone);
        f25759e = timeZone;
        f = new e("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f25760g = r.W0("Client", r.V0("okhttp3.", x.class.getName()));
    }

    public static final void A(IOException iOException, List list) {
        kotlin.jvm.internal.i.g(iOException, "<this>");
        if (list.size() > 1) {
            System.out.println(list);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ca.a.h(iOException, (Exception) it.next());
        }
    }

    public static final boolean a(t tVar, t other) {
        kotlin.jvm.internal.i.g(tVar, "<this>");
        kotlin.jvm.internal.i.g(other, "other");
        if (kotlin.jvm.internal.i.b(tVar.f24689d, other.f24689d) && tVar.f24690e == other.f24690e && kotlin.jvm.internal.i.b(tVar.f24686a, other.f24686a)) {
            return true;
        }
        return false;
    }

    public static final int b(TimeUnit timeUnit) {
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (timeUnit != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            long millis = timeUnit.toMillis(10L);
            if (millis <= 2147483647L) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (millis != 0) {
                    z12 = true;
                }
                if (z12) {
                    return (int) millis;
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.i.n(" too small.", "timeout").toString());
            }
            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(" too large.", "timeout").toString());
        }
        throw new IllegalStateException("unit == null".toString());
    }

    public static final void c(long j10, long j11, long j12) {
        if ((j11 | j12) >= 0 && j11 <= j10 && j10 - j11 >= j12) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static final void d(Closeable closeable) {
        kotlin.jvm.internal.i.g(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (kotlin.jvm.internal.i.b(e11.getMessage(), "bio == null")) {
                return;
            }
            throw e11;
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c10, int i6, int i10) {
        kotlin.jvm.internal.i.g(str, "<this>");
        while (i6 < i10) {
            int i11 = i6 + 1;
            if (str.charAt(i6) == c10) {
                return i6;
            }
            i6 = i11;
        }
        return i10;
    }

    public static final int g(String str, int i6, int i10, String str2) {
        kotlin.jvm.internal.i.g(str, "<this>");
        while (i6 < i10) {
            int i11 = i6 + 1;
            if (r.I0(str2, str.charAt(i6))) {
                return i6;
            }
            i6 = i11;
        }
        return i10;
    }

    public static final boolean h(z zVar, TimeUnit timeUnit) {
        kotlin.jvm.internal.i.g(zVar, "<this>");
        kotlin.jvm.internal.i.g(timeUnit, "timeUnit");
        try {
            return u(zVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... objArr) {
        kotlin.jvm.internal.i.g(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        kotlin.jvm.internal.i.f(format2, "format(locale, format, *args)");
        return format2;
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.i.g(strArr, "<this>");
        if (strArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && strArr2 != null) {
            if (strArr2.length == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                int length = strArr.length;
                int i6 = 0;
                while (i6 < length) {
                    String str = strArr[i6];
                    i6++;
                    is.b0 N = h.N(strArr2);
                    while (N.hasNext()) {
                        if (comparator.compare(str, (String) N.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(d0 d0Var) {
        String g5 = d0Var.f24588z.g("Content-Length");
        if (g5 != null) {
            try {
                return Long.parseLong(g5);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> l(T... elements) {
        kotlin.jvm.internal.i.g(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(ca.a.P0(Arrays.copyOf(objArr, objArr.length)));
        kotlin.jvm.internal.i.f(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            char charAt = str.charAt(i6);
            if (kotlin.jvm.internal.i.i(charAt, 31) > 0 && kotlin.jvm.internal.i.i(charAt, 127) < 0) {
                i6 = i10;
            } else {
                return i6;
            }
        }
        return -1;
    }

    public static final int n(int i6, int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.i.g(str, "<this>");
        while (i6 < i10) {
            int i11 = i6 + 1;
            char charAt = str.charAt(i6);
            boolean z13 = false;
            if (charAt == '\t' || charAt == '\n') {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || charAt == '\f') {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || charAt == '\r') {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 || charAt == ' ') {
                z13 = true;
            }
            if (z13) {
                i6 = i11;
            } else {
                return i6;
            }
        }
        return i10;
    }

    public static final int o(int i6, int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.i.g(str, "<this>");
        int i11 = i10 - 1;
        if (i6 <= i11) {
            while (true) {
                int i12 = i11 - 1;
                char charAt = str.charAt(i11);
                boolean z13 = false;
                if (charAt == '\t' || charAt == '\n') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10 || charAt == '\f') {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 || charAt == '\r') {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 || charAt == ' ') {
                    z13 = true;
                }
                if (z13) {
                    if (i11 == i6) {
                        break;
                    }
                    i11 = i12;
                } else {
                    return i11 + 1;
                }
            }
        }
        return i6;
    }

    public static final String[] p(String[] strArr, String[] other, Comparator<? super String> comparator) {
        kotlin.jvm.internal.i.g(other, "other");
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i6 = 0;
        while (i6 < length) {
            String str = strArr[i6];
            i6++;
            int length2 = other.length;
            int i10 = 0;
            while (true) {
                if (i10 < length2) {
                    String str2 = other[i10];
                    i10++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean q(String name) {
        kotlin.jvm.internal.i.g(name, "name");
        if (n.A0(name, "Authorization", true) || n.A0(name, "Cookie", true) || n.A0(name, "Proxy-Authorization", true) || n.A0(name, "Set-Cookie", true)) {
            return true;
        }
        return false;
    }

    public static final int r(char c10) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if ('0' <= c10 && c10 < ':') {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' <= c10 && c10 < 'g') {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            c11 = 'A';
            if (!(('A' > c10 || c10 >= 'G') ? false : false)) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final Charset s(zv.h hVar, Charset charset) {
        Charset charset2;
        kotlin.jvm.internal.i.g(hVar, "<this>");
        kotlin.jvm.internal.i.g(charset, "default");
        int F0 = hVar.F0(f25758d);
        if (F0 != -1) {
            if (F0 != 0) {
                if (F0 != 1) {
                    if (F0 != 2) {
                        if (F0 != 3) {
                            if (F0 == 4) {
                                gv.a.f16926a.getClass();
                                charset2 = gv.a.f16929d;
                                if (charset2 == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    kotlin.jvm.internal.i.f(charset2, "forName(\"UTF-32LE\")");
                                    gv.a.f16929d = charset2;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            gv.a.f16926a.getClass();
                            charset2 = gv.a.f16930e;
                            if (charset2 == null) {
                                charset2 = Charset.forName("UTF-32BE");
                                kotlin.jvm.internal.i.f(charset2, "forName(\"UTF-32BE\")");
                                gv.a.f16930e = charset2;
                            }
                        }
                        return charset2;
                    }
                    Charset UTF_16LE = StandardCharsets.UTF_16LE;
                    kotlin.jvm.internal.i.f(UTF_16LE, "UTF_16LE");
                    return UTF_16LE;
                }
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                kotlin.jvm.internal.i.f(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            kotlin.jvm.internal.i.f(UTF_8, "UTF_8");
            return UTF_8;
        }
        return charset;
    }

    public static final int t(zv.h hVar) {
        kotlin.jvm.internal.i.g(hVar, "<this>");
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static final boolean u(z zVar, int i6, TimeUnit timeUnit) {
        long j10;
        kotlin.jvm.internal.i.g(zVar, "<this>");
        kotlin.jvm.internal.i.g(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (zVar.d().e()) {
            j10 = zVar.d().c() - nanoTime;
        } else {
            j10 = Long.MAX_VALUE;
        }
        zVar.d().d(Math.min(j10, timeUnit.toNanos(i6)) + nanoTime);
        try {
            zv.e eVar = new zv.e();
            while (zVar.o0(eVar, 8192L) != -1) {
                eVar.a();
            }
            if (j10 == Long.MAX_VALUE) {
                zVar.d().a();
            } else {
                zVar.d().d(nanoTime + j10);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (j10 == Long.MAX_VALUE) {
                zVar.d().a();
            } else {
                zVar.d().d(nanoTime + j10);
            }
            return false;
        } catch (Throwable th2) {
            if (j10 == Long.MAX_VALUE) {
                zVar.d().a();
            } else {
                zVar.d().d(nanoTime + j10);
            }
            throw th2;
        }
    }

    public static final s v(List<sv.b> list) {
        s.a aVar = new s.a();
        for (sv.b bVar : list) {
            aVar.c(bVar.f32102a.u(), bVar.f32103b.u());
        }
        return aVar.d();
    }

    public static final String w(t tVar, boolean z10) {
        int i6;
        kotlin.jvm.internal.i.g(tVar, "<this>");
        String str = tVar.f24689d;
        if (r.J0(str, ":")) {
            str = "[" + str + ']';
        }
        int i10 = tVar.f24690e;
        if (!z10) {
            String scheme = tVar.f24686a;
            kotlin.jvm.internal.i.g(scheme, "scheme");
            if (kotlin.jvm.internal.i.b(scheme, "http")) {
                i6 = 80;
            } else if (kotlin.jvm.internal.i.b(scheme, "https")) {
                i6 = 443;
            } else {
                i6 = -1;
            }
            if (i10 == i6) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final <T> List<T> x(List<? extends T> list) {
        kotlin.jvm.internal.i.g(list, "<this>");
        List<T> unmodifiableList = Collections.unmodifiableList(u.J2(list));
        kotlin.jvm.internal.i.f(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int y(int i6, String str) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i6;
            }
        }
        if (valueOf == null) {
            return i6;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return SubsamplingScaleImageView.TILE_SIZE_AUTO;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String z(int i6, int i10, String str) {
        int n10 = n(i6, i10, str);
        String substring = str.substring(n10, o(n10, i10, str));
        kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
