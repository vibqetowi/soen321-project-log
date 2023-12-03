package x1;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import is.e0;
import is.y;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: InvalidationTracker.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: o  reason: collision with root package name */
    public static final String[] f37472o = {"UPDATE", "DELETE", "INSERT"};

    /* renamed from: a  reason: collision with root package name */
    public final n f37473a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f37474b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Set<String>> f37475c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f37476d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f37477e;
    public final AtomicBoolean f;

    /* renamed from: g  reason: collision with root package name */
    public volatile boolean f37478g;

    /* renamed from: h  reason: collision with root package name */
    public volatile b2.f f37479h;

    /* renamed from: i  reason: collision with root package name */
    public final b f37480i;

    /* renamed from: j  reason: collision with root package name */
    public final androidx.appcompat.widget.l f37481j;

    /* renamed from: k  reason: collision with root package name */
    public final n.b<c, d> f37482k;

    /* renamed from: l  reason: collision with root package name */
    public final Object f37483l;

    /* renamed from: m  reason: collision with root package name */
    public final Object f37484m;

    /* renamed from: n  reason: collision with root package name */
    public final i f37485n;

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static String a(String tableName, String triggerType) {
            kotlin.jvm.internal.i.g(tableName, "tableName");
            kotlin.jvm.internal.i.g(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final long[] f37486a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f37487b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f37488c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f37489d;

        public b(int i6) {
            this.f37486a = new long[i6];
            this.f37487b = new boolean[i6];
            this.f37488c = new int[i6];
        }

        public final int[] a() {
            boolean z10;
            synchronized (this) {
                if (!this.f37489d) {
                    return null;
                }
                long[] jArr = this.f37486a;
                int length = jArr.length;
                int i6 = 0;
                int i10 = 0;
                while (i6 < length) {
                    int i11 = i10 + 1;
                    int i12 = 1;
                    if (jArr[i6] > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean[] zArr = this.f37487b;
                    if (z10 != zArr[i10]) {
                        int[] iArr = this.f37488c;
                        if (!z10) {
                            i12 = 2;
                        }
                        iArr[i10] = i12;
                    } else {
                        this.f37488c[i10] = 0;
                    }
                    zArr[i10] = z10;
                    i6++;
                    i10 = i11;
                }
                this.f37489d = false;
                return (int[]) this.f37488c.clone();
            }
        }

        public final boolean b(int... tableIds) {
            boolean z10;
            kotlin.jvm.internal.i.g(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i6 : tableIds) {
                    long[] jArr = this.f37486a;
                    long j10 = jArr[i6];
                    jArr[i6] = 1 + j10;
                    if (j10 == 0) {
                        z10 = true;
                        this.f37489d = true;
                    }
                }
                hs.k kVar = hs.k.f19476a;
            }
            return z10;
        }

        public final boolean c(int... tableIds) {
            boolean z10;
            kotlin.jvm.internal.i.g(tableIds, "tableIds");
            synchronized (this) {
                z10 = false;
                for (int i6 : tableIds) {
                    long[] jArr = this.f37486a;
                    long j10 = jArr[i6];
                    jArr[i6] = j10 - 1;
                    if (j10 == 1) {
                        z10 = true;
                        this.f37489d = true;
                    }
                }
                hs.k kVar = hs.k.f19476a;
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f37487b, false);
                this.f37489d = true;
                hs.k kVar = hs.k.f19476a;
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f37490a;

        public c(String[] tables) {
            kotlin.jvm.internal.i.g(tables, "tables");
            this.f37490a = tables;
        }

        public abstract void a(Set<String> set);
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final c f37491a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f37492b;

        /* renamed from: c  reason: collision with root package name */
        public final String[] f37493c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f37494d;

        public d(c cVar, int[] iArr, String[] strArr) {
            boolean z10;
            Set<String> set;
            this.f37491a = cVar;
            this.f37492b = iArr;
            this.f37493c = strArr;
            if (strArr.length == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                set = ca.a.l1(strArr[0]);
            } else {
                set = y.f20678u;
            }
            this.f37494d = set;
            if (iArr.length == strArr.length) {
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v3, types: [js.g] */
        public final void a(Set<Integer> set) {
            int[] iArr = this.f37492b;
            int length = iArr.length;
            Set set2 = y.f20678u;
            Set set3 = set2;
            if (length != 0) {
                int i6 = 0;
                if (length != 1) {
                    ?? gVar = new js.g();
                    int length2 = iArr.length;
                    int i10 = 0;
                    while (i6 < length2) {
                        int i11 = i10 + 1;
                        if (set.contains(Integer.valueOf(iArr[i6]))) {
                            gVar.add(this.f37493c[i10]);
                        }
                        i6++;
                        i10 = i11;
                    }
                    ca.a.q(gVar);
                    set3 = gVar;
                } else {
                    set3 = set2;
                    if (set.contains(Integer.valueOf(iArr[0]))) {
                        set3 = this.f37494d;
                    }
                }
            }
            if (!set3.isEmpty()) {
                this.f37491a.a(set3);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v3, types: [x1.h$c] */
        /* JADX WARN: Type inference failed for: r2v0, types: [is.y] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection, java.util.Set] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r2v3, types: [js.g] */
        public final void b(String[] strArr) {
            String[] strArr2 = this.f37493c;
            int length = strArr2.length;
            ?? r22 = y.f20678u;
            if (length != 0) {
                boolean z10 = false;
                if (length != 1) {
                    r22 = new js.g();
                    for (String str : strArr) {
                        for (String str2 : strArr2) {
                            if (gv.n.A0(str2, str, true)) {
                                r22.add(str2);
                            }
                        }
                    }
                    ca.a.q(r22);
                } else {
                    int length2 = strArr.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= length2) {
                            break;
                        } else if (gv.n.A0(strArr[i6], strArr2[0], true)) {
                            z10 = true;
                            break;
                        } else {
                            i6++;
                        }
                    }
                    if (z10) {
                        r22 = this.f37494d;
                    }
                }
            }
            if (!r22.isEmpty()) {
                this.f37491a.a(r22);
            }
        }
    }

    /* compiled from: InvalidationTracker.kt */
    /* loaded from: classes.dex */
    public static final class e extends c {

        /* renamed from: b  reason: collision with root package name */
        public final h f37495b;

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<c> f37496c;

        public e(h hVar, r rVar) {
            super(rVar.f37490a);
            this.f37495b = hVar;
            this.f37496c = new WeakReference<>(rVar);
        }

        @Override // x1.h.c
        public final void a(Set<String> tables) {
            kotlin.jvm.internal.i.g(tables, "tables");
            c cVar = this.f37496c.get();
            if (cVar == null) {
                this.f37495b.c(this);
            } else {
                cVar.a(tables);
            }
        }
    }

    public h(n database, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        kotlin.jvm.internal.i.g(database, "database");
        this.f37473a = database;
        this.f37474b = hashMap;
        this.f37475c = hashMap2;
        this.f = new AtomicBoolean(false);
        this.f37480i = new b(strArr.length);
        this.f37481j = new androidx.appcompat.widget.l(database);
        this.f37482k = new n.b<>();
        this.f37483l = new Object();
        this.f37484m = new Object();
        this.f37476d = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i6 = 0; i6 < length; i6++) {
            String str2 = strArr[i6];
            Locale locale = Locale.US;
            String e10 = ri.e.e(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)");
            this.f37476d.put(e10, Integer.valueOf(i6));
            String str3 = this.f37474b.get(strArr[i6]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                kotlin.jvm.internal.i.f(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                e10 = str;
            }
            strArr2[i6] = e10;
        }
        this.f37477e = strArr2;
        for (Map.Entry<String, String> entry : this.f37474b.entrySet()) {
            Locale locale2 = Locale.US;
            String e11 = ri.e.e(locale2, "US", entry.getValue(), locale2, "this as java.lang.String).toLowerCase(locale)");
            if (this.f37476d.containsKey(e11)) {
                String lowerCase = entry.getKey().toLowerCase(locale2);
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.f37476d;
                linkedHashMap.put(lowerCase, e0.r0(linkedHashMap, e11));
            }
        }
        this.f37485n = new i(this);
    }

    public final void a(c cVar) {
        d g5;
        String[] d10 = d(cVar.f37490a);
        ArrayList arrayList = new ArrayList(d10.length);
        for (String str : d10) {
            LinkedHashMap linkedHashMap = this.f37476d;
            Locale US = Locale.US;
            kotlin.jvm.internal.i.f(US, "US");
            String lowerCase = str.toLowerCase(US);
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) linkedHashMap.get(lowerCase);
            if (num != null) {
                arrayList.add(Integer.valueOf(num.intValue()));
            } else {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
        }
        int[] H2 = is.u.H2(arrayList);
        d dVar = new d(cVar, H2, d10);
        synchronized (this.f37482k) {
            g5 = this.f37482k.g(cVar, dVar);
        }
        if (g5 == null && this.f37480i.b(Arrays.copyOf(H2, H2.length))) {
            n nVar = this.f37473a;
            if (nVar.k()) {
                f(nVar.g().U());
            }
        }
    }

    public final boolean b() {
        if (!this.f37473a.k()) {
            return false;
        }
        if (!this.f37478g) {
            this.f37473a.g().U();
        }
        if (!this.f37478g) {
            Log.e("ROOM", "database is not initialized even though it is open");
            return false;
        }
        return true;
    }

    public final void c(c observer) {
        d m10;
        kotlin.jvm.internal.i.g(observer, "observer");
        synchronized (this.f37482k) {
            m10 = this.f37482k.m(observer);
        }
        if (m10 != null) {
            b bVar = this.f37480i;
            int[] iArr = m10.f37492b;
            if (bVar.c(Arrays.copyOf(iArr, iArr.length))) {
                n nVar = this.f37473a;
                if (nVar.k()) {
                    f(nVar.g().U());
                }
            }
        }
    }

    public final String[] d(String[] strArr) {
        js.g gVar = new js.g();
        for (String str : strArr) {
            Locale locale = Locale.US;
            String e10 = ri.e.e(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
            Map<String, Set<String>> map = this.f37475c;
            if (map.containsKey(e10)) {
                String lowerCase = str.toLowerCase(locale);
                kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                Set<String> set = map.get(lowerCase);
                kotlin.jvm.internal.i.d(set);
                gVar.addAll(set);
            } else {
                gVar.add(str);
            }
        }
        ca.a.q(gVar);
        Object[] array = gVar.toArray(new String[0]);
        kotlin.jvm.internal.i.e(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (String[]) array;
    }

    public final void e(b2.b bVar, int i6) {
        String str;
        bVar.q("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i6 + ", 0)");
        String str2 = this.f37477e[i6];
        String[] strArr = f37472o;
        for (int i10 = 0; i10 < 3; i10++) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + a.a(str2, str) + " AFTER " + strArr[i10] + " ON `" + str2 + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i6 + " AND invalidated = 0; END";
            kotlin.jvm.internal.i.f(str3, "StringBuilder().apply(builderAction).toString()");
            bVar.q(str3);
        }
    }

    public final void f(b2.b database) {
        kotlin.jvm.internal.i.g(database, "database");
        if (database.n0()) {
            return;
        }
        try {
            ReentrantReadWriteLock.ReadLock readLock = this.f37473a.f37522i.readLock();
            kotlin.jvm.internal.i.f(readLock, "readWriteLock.readLock()");
            readLock.lock();
            synchronized (this.f37483l) {
                int[] a10 = this.f37480i.a();
                if (a10 == null) {
                    readLock.unlock();
                    return;
                }
                if (database.s0()) {
                    database.Q();
                } else {
                    database.beginTransaction();
                }
                int length = a10.length;
                int i6 = 0;
                int i10 = 0;
                while (i6 < length) {
                    int i11 = a10[i6];
                    int i12 = i10 + 1;
                    if (i11 != 1) {
                        if (i11 == 2) {
                            String str = this.f37477e[i10];
                            String[] strArr = f37472o;
                            for (int i13 = 0; i13 < 3; i13++) {
                                String str2 = strArr[i13];
                                String str3 = "DROP TRIGGER IF EXISTS " + a.a(str, str2);
                                kotlin.jvm.internal.i.f(str3, "StringBuilder().apply(builderAction).toString()");
                                database.q(str3);
                            }
                        }
                    } else {
                        e(database, i10);
                    }
                    i6++;
                    i10 = i12;
                }
                database.setTransactionSuccessful();
                database.endTransaction();
                hs.k kVar = hs.k.f19476a;
                readLock.unlock();
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
