package x1;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import b2.c;
import is.w;
import is.x;
import is.y;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: RoomDatabase.kt */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public volatile b2.b f37515a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f37516b;

    /* renamed from: c  reason: collision with root package name */
    public v f37517c;

    /* renamed from: d  reason: collision with root package name */
    public b2.c f37518d;
    public boolean f;

    /* renamed from: g  reason: collision with root package name */
    public List<? extends b> f37520g;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f37524k;

    /* renamed from: l  reason: collision with root package name */
    public final LinkedHashMap f37525l;

    /* renamed from: e  reason: collision with root package name */
    public final h f37519e = d();

    /* renamed from: h  reason: collision with root package name */
    public final LinkedHashMap f37521h = new LinkedHashMap();

    /* renamed from: i  reason: collision with root package name */
    public final ReentrantReadWriteLock f37522i = new ReentrantReadWriteLock();

    /* renamed from: j  reason: collision with root package name */
    public final ThreadLocal<Integer> f37523j = new ThreadLocal<>();

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static class a<T extends n> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f37526a;

        /* renamed from: c  reason: collision with root package name */
        public final String f37528c;

        /* renamed from: g  reason: collision with root package name */
        public Executor f37531g;

        /* renamed from: h  reason: collision with root package name */
        public Executor f37532h;

        /* renamed from: i  reason: collision with root package name */
        public c.InterfaceC0074c f37533i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f37534j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f37537m;

        /* renamed from: q  reason: collision with root package name */
        public HashSet f37541q;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f37527b = WorkDatabase.class;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f37529d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f37530e = new ArrayList();
        public final ArrayList f = new ArrayList();

        /* renamed from: k  reason: collision with root package name */
        public final int f37535k = 1;

        /* renamed from: l  reason: collision with root package name */
        public boolean f37536l = true;

        /* renamed from: n  reason: collision with root package name */
        public final long f37538n = -1;

        /* renamed from: o  reason: collision with root package name */
        public final c f37539o = new c();

        /* renamed from: p  reason: collision with root package name */
        public final LinkedHashSet f37540p = new LinkedHashSet();

        public a(Context context, String str) {
            this.f37526a = context;
            this.f37528c = str;
        }

        public final void a(y1.a... aVarArr) {
            if (this.f37541q == null) {
                this.f37541q = new HashSet();
            }
            for (y1.a aVar : aVarArr) {
                HashSet hashSet = this.f37541q;
                kotlin.jvm.internal.i.d(hashSet);
                hashSet.add(Integer.valueOf(aVar.f38186a));
                HashSet hashSet2 = this.f37541q;
                kotlin.jvm.internal.i.d(hashSet2);
                hashSet2.add(Integer.valueOf(aVar.f38187b));
            }
            this.f37539o.a((y1.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
        }
    }

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f37542a = new LinkedHashMap();

        public final void a(y1.a... migrations) {
            kotlin.jvm.internal.i.g(migrations, "migrations");
            for (y1.a aVar : migrations) {
                int i6 = aVar.f38186a;
                LinkedHashMap linkedHashMap = this.f37542a;
                Integer valueOf = Integer.valueOf(i6);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new TreeMap();
                    linkedHashMap.put(valueOf, obj);
                }
                TreeMap treeMap = (TreeMap) obj;
                int i10 = aVar.f38187b;
                if (treeMap.containsKey(Integer.valueOf(i10))) {
                    Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i10)) + " with " + aVar);
                }
                treeMap.put(Integer.valueOf(i10), aVar);
            }
        }
    }

    public n() {
        Map<String, Object> synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        kotlin.jvm.internal.i.f(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f37524k = synchronizedMap;
        this.f37525l = new LinkedHashMap();
    }

    public static Object o(Class cls, b2.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof x1.c) {
            return o(cls, ((x1.c) cVar).a());
        }
        return null;
    }

    public final void a() {
        boolean z10;
        if (this.f) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return;
        }
        throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
    }

    public final void b() {
        boolean z10;
        if (!g().U().n0() && this.f37523j.get() != null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
    }

    public final void c() {
        a();
        a();
        b2.b U = g().U();
        this.f37519e.f(U);
        if (U.s0()) {
            U.Q();
        } else {
            U.beginTransaction();
        }
    }

    public abstract h d();

    public abstract b2.c e(x1.b bVar);

    public List f(LinkedHashMap autoMigrationSpecs) {
        kotlin.jvm.internal.i.g(autoMigrationSpecs, "autoMigrationSpecs");
        return w.f20676u;
    }

    public final b2.c g() {
        b2.c cVar = this.f37518d;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.i.q("internalOpenHelper");
        throw null;
    }

    public Set<Class<? extends df.b>> h() {
        return y.f20678u;
    }

    public Map<Class<?>, List<Class<?>>> i() {
        return x.f20677u;
    }

    public final void j() {
        g().U().endTransaction();
        if (!g().U().n0()) {
            h hVar = this.f37519e;
            if (hVar.f.compareAndSet(false, true)) {
                Executor executor = hVar.f37473a.f37516b;
                if (executor != null) {
                    executor.execute(hVar.f37485n);
                } else {
                    kotlin.jvm.internal.i.q("internalQueryExecutor");
                    throw null;
                }
            }
        }
    }

    public final boolean k() {
        Boolean bool;
        b2.b bVar = this.f37515a;
        if (bVar != null) {
            bool = Boolean.valueOf(bVar.isOpen());
        } else {
            bool = null;
        }
        return kotlin.jvm.internal.i.b(bool, Boolean.TRUE);
    }

    public final Cursor l(b2.e query, CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.i.g(query, "query");
        a();
        b();
        if (cancellationSignal != null) {
            return g().U().X(query, cancellationSignal);
        }
        return g().U().A(query);
    }

    public final <V> V m(Callable<V> callable) {
        c();
        try {
            V call = callable.call();
            n();
            return call;
        } finally {
            j();
        }
    }

    public final void n() {
        g().U().setTransactionSuccessful();
    }

    /* compiled from: RoomDatabase.kt */
    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(c2.b bVar) {
        }
    }
}
