package lv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* compiled from: Headers.kt */
/* loaded from: classes2.dex */
public final class s implements Iterable<hs.f<? extends String, ? extends String>>, ts.a {

    /* renamed from: u  reason: collision with root package name */
    public final String[] f24683u;

    /* compiled from: Headers.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f24684a = new ArrayList(20);

        public final void a(String name, String value) {
            kotlin.jvm.internal.i.g(name, "name");
            kotlin.jvm.internal.i.g(value, "value");
            b.a(name);
            b.b(value, name);
            c(name, value);
        }

        public final void b(String line) {
            kotlin.jvm.internal.i.g(line, "line");
            int N0 = gv.r.N0(line, ':', 1, false, 4);
            if (N0 != -1) {
                String substring = line.substring(0, N0);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                String substring2 = line.substring(N0 + 1);
                kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
                c(substring, substring2);
            } else if (line.charAt(0) == ':') {
                String substring3 = line.substring(1);
                kotlin.jvm.internal.i.f(substring3, "this as java.lang.String).substring(startIndex)");
                c("", substring3);
            } else {
                c("", line);
            }
        }

        public final void c(String name, String value) {
            kotlin.jvm.internal.i.g(name, "name");
            kotlin.jvm.internal.i.g(value, "value");
            ArrayList arrayList = this.f24684a;
            arrayList.add(name);
            arrayList.add(gv.r.i1(value).toString());
        }

        public final s d() {
            Object[] array = this.f24684a.toArray(new String[0]);
            if (array != null) {
                return new s((String[]) array);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String e(String name) {
            kotlin.jvm.internal.i.g(name, "name");
            ArrayList arrayList = this.f24684a;
            int size = arrayList.size() - 2;
            int F = sp.b.F(size, 0, -2);
            if (F > size) {
                return null;
            }
            while (true) {
                int i6 = size - 2;
                if (gv.n.A0(name, (String) arrayList.get(size), true)) {
                    return (String) arrayList.get(size + 1);
                }
                if (size != F) {
                    size = i6;
                } else {
                    return null;
                }
            }
        }

        public final void f(String name) {
            kotlin.jvm.internal.i.g(name, "name");
            int i6 = 0;
            while (true) {
                ArrayList arrayList = this.f24684a;
                if (i6 < arrayList.size()) {
                    if (gv.n.A0(name, (String) arrayList.get(i6), true)) {
                        arrayList.remove(i6);
                        arrayList.remove(i6);
                        i6 -= 2;
                    }
                    i6 += 2;
                } else {
                    return;
                }
            }
        }
    }

    /* compiled from: Headers.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public static void a(String str) {
            boolean z10;
            boolean z11;
            if (str.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int length = str.length();
                int i6 = 0;
                while (i6 < length) {
                    int i10 = i6 + 1;
                    char charAt = str.charAt(i6);
                    if ('!' <= charAt && charAt < 127) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        i6 = i10;
                    } else {
                        throw new IllegalArgumentException(mv.b.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i6), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[LOOP:0: B:3:0x0006->B:23:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0026 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void b(String str, String str2) {
            boolean z10;
            String n10;
            boolean z11;
            int length = str.length();
            int i6 = 0;
            while (i6 < length) {
                int i10 = i6 + 1;
                char charAt = str.charAt(i6);
                if (charAt != '\t') {
                    if (' ' <= charAt && charAt < 127) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        z10 = false;
                        if (z10) {
                            String i11 = mv.b.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i6), str2);
                            if (mv.b.q(str2)) {
                                n10 = "";
                            } else {
                                n10 = kotlin.jvm.internal.i.n(str, ": ");
                            }
                            throw new IllegalArgumentException(kotlin.jvm.internal.i.n(n10, i11).toString());
                        }
                        i6 = i10;
                    }
                }
                z10 = true;
                if (z10) {
                }
            }
        }

        public static s c(String... strArr) {
            boolean z10;
            boolean z11;
            int i6 = 0;
            if (strArr.length % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i10 = 0;
                while (i10 < length) {
                    int i11 = i10 + 1;
                    String str = strArr2[i10];
                    if (str != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        strArr2[i10] = gv.r.i1(str).toString();
                        i10 = i11;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int F = sp.b.F(0, strArr2.length - 1, 2);
                if (F >= 0) {
                    while (true) {
                        int i12 = i6 + 2;
                        String str2 = strArr2[i6];
                        String str3 = strArr2[i6 + 1];
                        a(str2);
                        b(str3, str2);
                        if (i6 == F) {
                            break;
                        }
                        i6 = i12;
                    }
                }
                return new s(strArr2);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }

    public s(String[] strArr) {
        this.f24683u = strArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            if (Arrays.equals(this.f24683u, ((s) obj).f24683u)) {
                return true;
            }
        }
        return false;
    }

    public final String g(String name) {
        kotlin.jvm.internal.i.g(name, "name");
        String[] strArr = this.f24683u;
        int length = strArr.length - 2;
        int F = sp.b.F(length, 0, -2);
        if (F <= length) {
            while (true) {
                int i6 = length - 2;
                if (gv.n.A0(name, strArr[length], true)) {
                    return strArr[length + 1];
                }
                if (length == F) {
                    break;
                }
                length = i6;
            }
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f24683u);
    }

    @Override // java.lang.Iterable
    public final Iterator<hs.f<? extends String, ? extends String>> iterator() {
        int length = this.f24683u.length / 2;
        hs.f[] fVarArr = new hs.f[length];
        for (int i6 = 0; i6 < length; i6++) {
            fVarArr[i6] = new hs.f(m(i6), q(i6));
        }
        return kotlin.jvm.internal.h.N(fVarArr);
    }

    public final String m(int i6) {
        return this.f24683u[i6 * 2];
    }

    public final a o() {
        a aVar = new a();
        ArrayList arrayList = aVar.f24684a;
        kotlin.jvm.internal.i.g(arrayList, "<this>");
        String[] elements = this.f24683u;
        kotlin.jvm.internal.i.g(elements, "elements");
        arrayList.addAll(is.i.G1(elements));
        return aVar;
    }

    public final String q(int i6) {
        return this.f24683u[(i6 * 2) + 1];
    }

    public final List<String> r(String name) {
        kotlin.jvm.internal.i.g(name, "name");
        int length = this.f24683u.length / 2;
        ArrayList arrayList = null;
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            if (gv.n.A0(name, m(i6), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(q(i6));
            }
            i6 = i10;
        }
        if (arrayList != null) {
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.i.f(unmodifiableList, "{\n      Collections.unmodifiableList(result)\n    }");
            return unmodifiableList;
        }
        return is.w.f20676u;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int length = this.f24683u.length / 2;
        int i6 = 0;
        while (i6 < length) {
            int i10 = i6 + 1;
            String m10 = m(i6);
            String q10 = q(i6);
            sb2.append(m10);
            sb2.append(": ");
            if (mv.b.q(m10)) {
                q10 = "██";
            }
            sb2.append(q10);
            sb2.append("\n");
            i6 = i10;
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.i.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
