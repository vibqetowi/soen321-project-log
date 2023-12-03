package nv;

import gv.n;
import gv.r;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.k;
import ss.l;
import ta.v;
import zv.o;
import zv.s;
import zv.t;
import zv.x;
import zv.z;
/* compiled from: DiskLruCache.kt */
/* loaded from: classes2.dex */
public final class e implements Closeable, Flushable {
    public static final gv.e P = new gv.e("[a-z0-9_-]{1,120}");
    public static final String Q = "CLEAN";
    public static final String R = "DIRTY";
    public static final String S = "REMOVE";
    public static final String T = "READ";
    public final File A;
    public final File B;
    public long C;
    public zv.g D;
    public final LinkedHashMap<String, b> E;
    public int F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public final ov.c N;
    public final g O;

    /* renamed from: u  reason: collision with root package name */
    public final tv.b f26853u;

    /* renamed from: v  reason: collision with root package name */
    public final File f26854v;

    /* renamed from: w  reason: collision with root package name */
    public final int f26855w;

    /* renamed from: x  reason: collision with root package name */
    public final int f26856x;

    /* renamed from: y  reason: collision with root package name */
    public final long f26857y;

    /* renamed from: z  reason: collision with root package name */
    public final File f26858z;

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes2.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        public final b f26859a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f26860b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f26861c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e f26862d;

        /* compiled from: DiskLruCache.kt */
        /* renamed from: nv.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0442a extends k implements l<IOException, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ e f26863u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ a f26864v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0442a(e eVar, a aVar) {
                super(1);
                this.f26863u = eVar;
                this.f26864v = aVar;
            }

            @Override // ss.l
            public final hs.k invoke(IOException iOException) {
                IOException it = iOException;
                kotlin.jvm.internal.i.g(it, "it");
                e eVar = this.f26863u;
                a aVar = this.f26864v;
                synchronized (eVar) {
                    aVar.c();
                }
                return hs.k.f19476a;
            }
        }

        public a(e this$0, b bVar) {
            boolean[] zArr;
            kotlin.jvm.internal.i.g(this$0, "this$0");
            this.f26862d = this$0;
            this.f26859a = bVar;
            if (bVar.f26869e) {
                zArr = null;
            } else {
                zArr = new boolean[this$0.f26856x];
            }
            this.f26860b = zArr;
        }

        public final void a() {
            e eVar = this.f26862d;
            synchronized (eVar) {
                if (!this.f26861c) {
                    if (kotlin.jvm.internal.i.b(this.f26859a.f26870g, this)) {
                        eVar.e(this, false);
                    }
                    this.f26861c = true;
                    hs.k kVar = hs.k.f19476a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void b() {
            e eVar = this.f26862d;
            synchronized (eVar) {
                if (!this.f26861c) {
                    if (kotlin.jvm.internal.i.b(this.f26859a.f26870g, this)) {
                        eVar.e(this, true);
                    }
                    this.f26861c = true;
                    hs.k kVar = hs.k.f19476a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void c() {
            b bVar = this.f26859a;
            if (kotlin.jvm.internal.i.b(bVar.f26870g, this)) {
                e eVar = this.f26862d;
                if (eVar.H) {
                    eVar.e(this, false);
                } else {
                    bVar.f = true;
                }
            }
        }

        public final x d(int i6) {
            e eVar = this.f26862d;
            synchronized (eVar) {
                if (!this.f26861c) {
                    if (!kotlin.jvm.internal.i.b(this.f26859a.f26870g, this)) {
                        return new zv.d();
                    }
                    if (!this.f26859a.f26869e) {
                        boolean[] zArr = this.f26860b;
                        kotlin.jvm.internal.i.d(zArr);
                        zArr[i6] = true;
                    }
                    try {
                        return new i(eVar.f26853u.b((File) this.f26859a.f26868d.get(i6)), new C0442a(eVar, this));
                    } catch (FileNotFoundException unused) {
                        return new zv.d();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes2.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f26865a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f26866b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList f26867c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f26868d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f26869e;
        public boolean f;

        /* renamed from: g  reason: collision with root package name */
        public a f26870g;

        /* renamed from: h  reason: collision with root package name */
        public int f26871h;

        /* renamed from: i  reason: collision with root package name */
        public long f26872i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ e f26873j;

        public b(e this$0, String key) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            kotlin.jvm.internal.i.g(key, "key");
            this.f26873j = this$0;
            this.f26865a = key;
            int i6 = this$0.f26856x;
            this.f26866b = new long[i6];
            this.f26867c = new ArrayList();
            this.f26868d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < i6; i10++) {
                sb2.append(i10);
                this.f26867c.add(new File(this.f26873j.f26854v, sb2.toString()));
                sb2.append(".tmp");
                this.f26868d.add(new File(this.f26873j.f26854v, sb2.toString()));
                sb2.setLength(length);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v5, types: [nv.f] */
        public final c a() {
            byte[] bArr = mv.b.f25755a;
            if (!this.f26869e) {
                return null;
            }
            e eVar = this.f26873j;
            if (!eVar.H && (this.f26870g != null || this.f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f26866b.clone();
            try {
                int i6 = eVar.f26856x;
                int i10 = 0;
                while (i10 < i6) {
                    int i11 = i10 + 1;
                    o a10 = eVar.f26853u.a((File) this.f26867c.get(i10));
                    if (!eVar.H) {
                        this.f26871h++;
                        a10 = new f(a10, eVar, this);
                    }
                    arrayList.add(a10);
                    i10 = i11;
                }
                return new c(this.f26873j, this.f26865a, this.f26872i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    mv.b.d((z) it.next());
                }
                try {
                    eVar.J(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    /* loaded from: classes2.dex */
    public final class c implements Closeable {

        /* renamed from: u  reason: collision with root package name */
        public final String f26874u;

        /* renamed from: v  reason: collision with root package name */
        public final long f26875v;

        /* renamed from: w  reason: collision with root package name */
        public final List<z> f26876w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ e f26877x;

        public c(e this$0, String key, long j10, ArrayList arrayList, long[] lengths) {
            kotlin.jvm.internal.i.g(this$0, "this$0");
            kotlin.jvm.internal.i.g(key, "key");
            kotlin.jvm.internal.i.g(lengths, "lengths");
            this.f26877x = this$0;
            this.f26874u = key;
            this.f26875v = j10;
            this.f26876w = arrayList;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (z zVar : this.f26876w) {
                mv.b.d(zVar);
            }
        }
    }

    public e(File file, long j10, ov.d taskRunner) {
        tv.a aVar = tv.b.f33702a;
        kotlin.jvm.internal.i.g(taskRunner, "taskRunner");
        this.f26853u = aVar;
        this.f26854v = file;
        this.f26855w = 201105;
        this.f26856x = 2;
        this.f26857y = j10;
        this.E = new LinkedHashMap<>(0, 0.75f, true);
        this.N = taskRunner.f();
        this.O = new g(this, kotlin.jvm.internal.i.n(" Cache", mv.b.f25760g));
        if (j10 > 0) {
            this.f26858z = new File(file, "journal");
            this.A = new File(file, "journal.tmp");
            this.B = new File(file, "journal.bkp");
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public static void R(String str) {
        if (P.b(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final void G(String str) {
        String substring;
        int i6 = 0;
        int N0 = r.N0(str, ' ', 0, false, 6);
        if (N0 != -1) {
            int i10 = N0 + 1;
            int N02 = r.N0(str, ' ', i10, false, 4);
            LinkedHashMap<String, b> linkedHashMap = this.E;
            if (N02 == -1) {
                substring = str.substring(i10);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = S;
                if (N0 == str2.length() && n.H0(str, str2)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, N02);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            b bVar = linkedHashMap.get(substring);
            if (bVar == null) {
                bVar = new b(this, substring);
                linkedHashMap.put(substring, bVar);
            }
            if (N02 != -1) {
                String str3 = Q;
                if (N0 == str3.length() && n.H0(str, str3)) {
                    String substring2 = str.substring(N02 + 1);
                    kotlin.jvm.internal.i.f(substring2, "this as java.lang.String).substring(startIndex)");
                    List Z0 = r.Z0(substring2, new char[]{' '});
                    bVar.f26869e = true;
                    bVar.f26870g = null;
                    if (Z0.size() == bVar.f26873j.f26856x) {
                        try {
                            int size = Z0.size();
                            while (i6 < size) {
                                int i11 = i6 + 1;
                                bVar.f26866b[i6] = Long.parseLong((String) Z0.get(i6));
                                i6 = i11;
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            throw new IOException(kotlin.jvm.internal.i.n(Z0, "unexpected journal line: "));
                        }
                    }
                    throw new IOException(kotlin.jvm.internal.i.n(Z0, "unexpected journal line: "));
                }
            }
            if (N02 == -1) {
                String str4 = R;
                if (N0 == str4.length() && n.H0(str, str4)) {
                    bVar.f26870g = new a(this, bVar);
                    return;
                }
            }
            if (N02 == -1) {
                String str5 = T;
                if (N0 == str5.length() && n.H0(str, str5)) {
                    return;
                }
            }
            throw new IOException(kotlin.jvm.internal.i.n(str, "unexpected journal line: "));
        }
        throw new IOException(kotlin.jvm.internal.i.n(str, "unexpected journal line: "));
    }

    public final synchronized void I() {
        zv.g gVar = this.D;
        if (gVar != null) {
            gVar.close();
        }
        s h10 = v.h(this.f26853u.b(this.A));
        h10.T("libcore.io.DiskLruCache");
        h10.writeByte(10);
        h10.T("1");
        h10.writeByte(10);
        h10.E0(this.f26855w);
        h10.writeByte(10);
        h10.E0(this.f26856x);
        h10.writeByte(10);
        h10.writeByte(10);
        Iterator<b> it = this.E.values().iterator();
        while (true) {
            int i6 = 0;
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (next.f26870g != null) {
                h10.T(R);
                h10.writeByte(32);
                h10.T(next.f26865a);
                h10.writeByte(10);
            } else {
                h10.T(Q);
                h10.writeByte(32);
                h10.T(next.f26865a);
                long[] jArr = next.f26866b;
                int length = jArr.length;
                while (i6 < length) {
                    long j10 = jArr[i6];
                    i6++;
                    h10.writeByte(32);
                    h10.E0(j10);
                }
                h10.writeByte(10);
            }
        }
        hs.k kVar = hs.k.f19476a;
        ca.a.z(h10, null);
        if (this.f26853u.d(this.f26858z)) {
            this.f26853u.e(this.f26858z, this.B);
        }
        this.f26853u.e(this.A, this.f26858z);
        this.f26853u.f(this.B);
        this.D = v.h(new i(this.f26853u.g(this.f26858z), new h(this)));
        this.G = false;
        this.L = false;
    }

    public final void J(b entry) {
        zv.g gVar;
        kotlin.jvm.internal.i.g(entry, "entry");
        boolean z10 = this.H;
        String str = entry.f26865a;
        if (!z10) {
            if (entry.f26871h > 0 && (gVar = this.D) != null) {
                gVar.T(R);
                gVar.writeByte(32);
                gVar.T(str);
                gVar.writeByte(10);
                gVar.flush();
            }
            if (entry.f26871h > 0 || entry.f26870g != null) {
                entry.f = true;
                return;
            }
        }
        a aVar = entry.f26870g;
        if (aVar != null) {
            aVar.c();
        }
        for (int i6 = 0; i6 < this.f26856x; i6++) {
            this.f26853u.f((File) entry.f26867c.get(i6));
            long j10 = this.C;
            long[] jArr = entry.f26866b;
            this.C = j10 - jArr[i6];
            jArr[i6] = 0;
        }
        this.F++;
        zv.g gVar2 = this.D;
        if (gVar2 != null) {
            gVar2.T(S);
            gVar2.writeByte(32);
            gVar2.T(str);
            gVar2.writeByte(10);
        }
        this.E.remove(str);
        if (m()) {
            this.N.c(this.O, 0L);
        }
    }

    public final void O() {
        boolean z10;
        do {
            z10 = false;
            if (this.C > this.f26857y) {
                Iterator<b> it = this.E.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        b next = it.next();
                        if (!next.f) {
                            J(next);
                            z10 = true;
                            continue;
                            break;
                        }
                    }
                }
            } else {
                this.K = false;
                return;
            }
        } while (z10);
    }

    public final synchronized void a() {
        if (!(!this.J)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.I && !this.J) {
            Collection<b> values = this.E.values();
            kotlin.jvm.internal.i.f(values, "lruEntries.values");
            int i6 = 0;
            Object[] array = values.toArray(new b[0]);
            if (array != null) {
                b[] bVarArr = (b[]) array;
                int length = bVarArr.length;
                while (i6 < length) {
                    b bVar = bVarArr[i6];
                    i6++;
                    a aVar = bVar.f26870g;
                    if (aVar != null && aVar != null) {
                        aVar.c();
                    }
                }
                O();
                zv.g gVar = this.D;
                kotlin.jvm.internal.i.d(gVar);
                gVar.close();
                this.D = null;
                this.J = true;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        this.J = true;
    }

    public final synchronized void e(a editor, boolean z10) {
        kotlin.jvm.internal.i.g(editor, "editor");
        b bVar = editor.f26859a;
        if (kotlin.jvm.internal.i.b(bVar.f26870g, editor)) {
            int i6 = 0;
            if (z10 && !bVar.f26869e) {
                int i10 = this.f26856x;
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    boolean[] zArr = editor.f26860b;
                    kotlin.jvm.internal.i.d(zArr);
                    if (zArr[i11]) {
                        if (!this.f26853u.d((File) bVar.f26868d.get(i11))) {
                            editor.a();
                            return;
                        }
                        i11 = i12;
                    } else {
                        editor.a();
                        throw new IllegalStateException(kotlin.jvm.internal.i.n(Integer.valueOf(i11), "Newly created entry didn't create value for index "));
                    }
                }
            }
            int i13 = this.f26856x;
            int i14 = 0;
            while (i14 < i13) {
                int i15 = i14 + 1;
                File file = (File) bVar.f26868d.get(i14);
                if (z10 && !bVar.f) {
                    if (this.f26853u.d(file)) {
                        File file2 = (File) bVar.f26867c.get(i14);
                        this.f26853u.e(file, file2);
                        long j10 = bVar.f26866b[i14];
                        long h10 = this.f26853u.h(file2);
                        bVar.f26866b[i14] = h10;
                        this.C = (this.C - j10) + h10;
                    }
                } else {
                    this.f26853u.f(file);
                }
                i14 = i15;
            }
            bVar.f26870g = null;
            if (bVar.f) {
                J(bVar);
                return;
            }
            this.F++;
            zv.g gVar = this.D;
            kotlin.jvm.internal.i.d(gVar);
            if (!bVar.f26869e && !z10) {
                this.E.remove(bVar.f26865a);
                gVar.T(S).writeByte(32);
                gVar.T(bVar.f26865a);
                gVar.writeByte(10);
                gVar.flush();
                if (this.C <= this.f26857y || m()) {
                    this.N.c(this.O, 0L);
                }
                return;
            }
            bVar.f26869e = true;
            gVar.T(Q).writeByte(32);
            gVar.T(bVar.f26865a);
            long[] jArr = bVar.f26866b;
            int length = jArr.length;
            while (i6 < length) {
                long j11 = jArr[i6];
                i6++;
                gVar.writeByte(32).E0(j11);
            }
            gVar.writeByte(10);
            if (z10) {
                long j12 = this.M;
                this.M = 1 + j12;
                bVar.f26872i = j12;
            }
            gVar.flush();
            if (this.C <= this.f26857y) {
            }
            this.N.c(this.O, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.I) {
            return;
        }
        a();
        O();
        zv.g gVar = this.D;
        kotlin.jvm.internal.i.d(gVar);
        gVar.flush();
    }

    public final synchronized a g(long j10, String key) {
        a aVar;
        kotlin.jvm.internal.i.g(key, "key");
        j();
        a();
        R(key);
        b bVar = this.E.get(key);
        if (j10 != -1 && (bVar == null || bVar.f26872i != j10)) {
            return null;
        }
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f26870g;
        }
        if (aVar != null) {
            return null;
        }
        if (bVar != null && bVar.f26871h != 0) {
            return null;
        }
        if (!this.K && !this.L) {
            zv.g gVar = this.D;
            kotlin.jvm.internal.i.d(gVar);
            gVar.T(R).writeByte(32).T(key).writeByte(10);
            gVar.flush();
            if (this.G) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(this, key);
                this.E.put(key, bVar);
            }
            a aVar2 = new a(this, bVar);
            bVar.f26870g = aVar2;
            return aVar2;
        }
        this.N.c(this.O, 0L);
        return null;
    }

    public final synchronized c h(String key) {
        kotlin.jvm.internal.i.g(key, "key");
        j();
        a();
        R(key);
        b bVar = this.E.get(key);
        if (bVar == null) {
            return null;
        }
        c a10 = bVar.a();
        if (a10 == null) {
            return null;
        }
        this.F++;
        zv.g gVar = this.D;
        kotlin.jvm.internal.i.d(gVar);
        gVar.T(T).writeByte(32).T(key).writeByte(10);
        if (m()) {
            this.N.c(this.O, 0L);
        }
        return a10;
    }

    public final synchronized void j() {
        boolean z10;
        byte[] bArr = mv.b.f25755a;
        if (this.I) {
            return;
        }
        if (this.f26853u.d(this.B)) {
            if (this.f26853u.d(this.f26858z)) {
                this.f26853u.f(this.B);
            } else {
                this.f26853u.e(this.B, this.f26858z);
            }
        }
        tv.b bVar = this.f26853u;
        File file = this.B;
        kotlin.jvm.internal.i.g(bVar, "<this>");
        kotlin.jvm.internal.i.g(file, "file");
        zv.r b10 = bVar.b(file);
        try {
            bVar.f(file);
            ca.a.z(b10, null);
            z10 = true;
        } catch (IOException unused) {
            hs.k kVar = hs.k.f19476a;
            ca.a.z(b10, null);
            bVar.f(file);
            z10 = false;
        }
        this.H = z10;
        if (this.f26853u.d(this.f26858z)) {
            try {
                s();
                o();
                this.I = true;
                return;
            } catch (IOException e10) {
                uv.h hVar = uv.h.f34614a;
                uv.h.f34614a.getClass();
                uv.h.i(5, "DiskLruCache " + this.f26854v + " is corrupt: " + ((Object) e10.getMessage()) + ", removing", e10);
                close();
                this.f26853u.c(this.f26854v);
                this.J = false;
            }
        }
        I();
        this.I = true;
    }

    public final boolean m() {
        int i6 = this.F;
        if (i6 >= 2000 && i6 >= this.E.size()) {
            return true;
        }
        return false;
    }

    public final void o() {
        File file = this.A;
        tv.b bVar = this.f26853u;
        bVar.f(file);
        Iterator<b> it = this.E.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            kotlin.jvm.internal.i.f(next, "i.next()");
            b bVar2 = next;
            a aVar = bVar2.f26870g;
            int i6 = this.f26856x;
            int i10 = 0;
            if (aVar == null) {
                while (i10 < i6) {
                    this.C += bVar2.f26866b[i10];
                    i10++;
                }
            } else {
                bVar2.f26870g = null;
                while (i10 < i6) {
                    bVar.f((File) bVar2.f26867c.get(i10));
                    bVar.f((File) bVar2.f26868d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void s() {
        boolean z10;
        File file = this.f26858z;
        tv.b bVar = this.f26853u;
        t j10 = v.j(bVar.a(file));
        try {
            String j02 = j10.j0();
            String j03 = j10.j0();
            String j04 = j10.j0();
            String j05 = j10.j0();
            String j06 = j10.j0();
            if (kotlin.jvm.internal.i.b("libcore.io.DiskLruCache", j02) && kotlin.jvm.internal.i.b("1", j03) && kotlin.jvm.internal.i.b(String.valueOf(this.f26855w), j04) && kotlin.jvm.internal.i.b(String.valueOf(this.f26856x), j05)) {
                int i6 = 0;
                if (j06.length() > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    while (true) {
                        try {
                            G(j10.j0());
                            i6++;
                        } catch (EOFException unused) {
                            this.F = i6 - this.E.size();
                            if (!j10.B()) {
                                I();
                            } else {
                                this.D = v.h(new i(bVar.g(file), new h(this)));
                            }
                            hs.k kVar = hs.k.f19476a;
                            ca.a.z(j10, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + j02 + ", " + j03 + ", " + j05 + ", " + j06 + ']');
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ca.a.z(j10, th2);
                throw th3;
            }
        }
    }
}
