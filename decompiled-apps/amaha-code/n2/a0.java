package n2;

import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.q;
import b2.c;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import m.a;
import x1.n;
/* compiled from: WorkManagerImpl.java */
/* loaded from: classes.dex */
public final class a0 extends androidx.work.v {

    /* renamed from: k  reason: collision with root package name */
    public static a0 f25789k;

    /* renamed from: l  reason: collision with root package name */
    public static a0 f25790l;

    /* renamed from: m  reason: collision with root package name */
    public static final Object f25791m;

    /* renamed from: a  reason: collision with root package name */
    public Context f25792a;

    /* renamed from: b  reason: collision with root package name */
    public androidx.work.b f25793b;

    /* renamed from: c  reason: collision with root package name */
    public WorkDatabase f25794c;

    /* renamed from: d  reason: collision with root package name */
    public y2.a f25795d;

    /* renamed from: e  reason: collision with root package name */
    public List<r> f25796e;
    public p f;

    /* renamed from: g  reason: collision with root package name */
    public w2.m f25797g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f25798h;

    /* renamed from: i  reason: collision with root package name */
    public BroadcastReceiver.PendingResult f25799i;

    /* renamed from: j  reason: collision with root package name */
    public final v.c f25800j;

    /* compiled from: WorkManagerImpl.java */
    /* loaded from: classes.dex */
    public static class a {
        public static boolean a(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    static {
        androidx.work.q.f("WorkManagerImpl");
        f25789k = null;
        f25790l = null;
        f25791m = new Object();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ed A[LOOP:6: B:132:0x03b9->B:147:0x03ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03f7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a0(Context context, androidx.work.b bVar, y2.b bVar2) {
        n.a aVar;
        int i6;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        r rVar;
        char c10;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        final Context context2 = context.getApplicationContext();
        w2.o queryExecutor = bVar2.f38188a;
        kotlin.jvm.internal.i.g(context2, "context");
        kotlin.jvm.internal.i.g(queryExecutor, "queryExecutor");
        if (z16) {
            aVar = new n.a(context2, null);
            aVar.f37534j = true;
        } else if (!gv.n.B0("androidx.work.workdb")) {
            n.a aVar2 = new n.a(context2, "androidx.work.workdb");
            aVar2.f37533i = new c.InterfaceC0074c() { // from class: n2.v
                @Override // b2.c.InterfaceC0074c
                public final b2.c d(c.b bVar3) {
                    boolean z17;
                    Context context3 = context2;
                    kotlin.jvm.internal.i.g(context3, "$context");
                    String str2 = bVar3.f3939b;
                    c.a callback = bVar3.f3940c;
                    kotlin.jvm.internal.i.g(callback, "callback");
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    } else {
                        z17 = true;
                    }
                    if (true ^ z17) {
                        return new c2.c(context3, str2, callback, true, true);
                    }
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
            };
            aVar = aVar2;
        } else {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder".toString());
        }
        aVar.f37531g = queryExecutor;
        b callback = b.f25801a;
        kotlin.jvm.internal.i.g(callback, "callback");
        ArrayList arrayList = aVar.f37529d;
        arrayList.add(callback);
        aVar.a(g.f25823c);
        aVar.a(new q(context2, 2, 3));
        aVar.a(h.f25824c);
        aVar.a(i.f25825c);
        aVar.a(new q(context2, 5, 6));
        aVar.a(j.f25826c);
        aVar.a(k.f25827c);
        aVar.a(l.f25828c);
        aVar.a(new q(context2));
        aVar.a(new q(context2, 10, 11));
        aVar.a(d.f25806c);
        aVar.a(e.f25821c);
        aVar.a(f.f25822c);
        aVar.f37536l = false;
        aVar.f37537m = true;
        Executor executor = aVar.f37531g;
        if (executor == null && aVar.f37532h == null) {
            a.ExecutorC0397a executorC0397a = m.a.f24762x;
            aVar.f37532h = executorC0397a;
            aVar.f37531g = executorC0397a;
        } else if (executor != null && aVar.f37532h == null) {
            aVar.f37532h = executor;
        } else if (executor == null) {
            aVar.f37531g = aVar.f37532h;
        }
        HashSet hashSet = aVar.f37541q;
        LinkedHashSet linkedHashSet = aVar.f37540p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (!(!linkedHashSet.contains(Integer.valueOf(intValue)))) {
                    throw new IllegalArgumentException(defpackage.c.p("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", intValue).toString());
                }
            }
        }
        c.InterfaceC0074c interfaceC0074c = aVar.f37533i;
        c.InterfaceC0074c rVar2 = interfaceC0074c == null ? new tr.r() : interfaceC0074c;
        if (aVar.f37538n > 0) {
            if (aVar.f37528c != null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
        }
        String str2 = aVar.f37528c;
        n.c cVar = aVar.f37539o;
        boolean z17 = aVar.f37534j;
        int i10 = aVar.f37535k;
        if (i10 != 0) {
            Context context3 = aVar.f37526a;
            kotlin.jvm.internal.i.g(context3, "context");
            if (i10 != 1) {
                i6 = i10;
            } else {
                Object systemService = context3.getSystemService(Constants.SCREEN_ACTIVITY);
                kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                if (!((ActivityManager) systemService).isLowRamDevice()) {
                    i6 = 3;
                } else {
                    i6 = 2;
                }
            }
            Executor executor2 = aVar.f37531g;
            if (executor2 != null) {
                Executor executor3 = aVar.f37532h;
                if (executor3 != null) {
                    x1.b bVar3 = new x1.b(context3, str2, rVar2, cVar, arrayList, z17, i6, executor2, executor3, aVar.f37536l, aVar.f37537m, linkedHashSet, aVar.f37530e, aVar.f);
                    Class<T> klass = aVar.f37527b;
                    kotlin.jvm.internal.i.g(klass, "klass");
                    Package r22 = klass.getPackage();
                    kotlin.jvm.internal.i.d(r22);
                    String fullPackage = r22.getName();
                    String canonicalName = klass.getCanonicalName();
                    kotlin.jvm.internal.i.d(canonicalName);
                    kotlin.jvm.internal.i.f(fullPackage, "fullPackage");
                    if (fullPackage.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        canonicalName = canonicalName.substring(fullPackage.length() + 1);
                        kotlin.jvm.internal.i.f(canonicalName, "this as java.lang.String).substring(startIndex)");
                    }
                    String concat = gv.n.E0(canonicalName, '.', '_').concat("_Impl");
                    try {
                        if (fullPackage.length() == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            str = concat;
                        } else {
                            str = fullPackage + '.' + concat;
                        }
                        Class<?> cls = Class.forName(str, true, klass.getClassLoader());
                        kotlin.jvm.internal.i.e(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                        x1.n nVar = (x1.n) cls.newInstance();
                        nVar.getClass();
                        nVar.f37518d = nVar.e(bVar3);
                        Set<Class<? extends df.b>> h10 = nVar.h();
                        BitSet bitSet = new BitSet();
                        Iterator<Class<? extends df.b>> it2 = h10.iterator();
                        while (true) {
                            boolean hasNext = it2.hasNext();
                            LinkedHashMap linkedHashMap = nVar.f37521h;
                            List<df.b> list = bVar3.f37467p;
                            int i11 = -1;
                            if (hasNext) {
                                Class<? extends df.b> next = it2.next();
                                int size = list.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i12 = size - 1;
                                        if (next.isAssignableFrom(list.get(size).getClass())) {
                                            bitSet.set(size);
                                            i11 = size;
                                            break;
                                        } else if (i12 < 0) {
                                            break;
                                        } else {
                                            size = i12;
                                        }
                                    }
                                }
                                if (i11 >= 0) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                if (z15) {
                                    linkedHashMap.put(next, list.get(i11));
                                } else {
                                    throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                                }
                            } else {
                                int size2 = list.size() - 1;
                                if (size2 >= 0) {
                                    while (true) {
                                        int i13 = size2 - 1;
                                        if (bitSet.get(size2)) {
                                            if (i13 < 0) {
                                                break;
                                            }
                                            size2 = i13;
                                        } else {
                                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.".toString());
                                        }
                                    }
                                }
                                for (y1.a aVar3 : nVar.f(linkedHashMap)) {
                                    int i14 = aVar3.f38186a;
                                    n.c cVar2 = bVar3.f37456d;
                                    LinkedHashMap linkedHashMap2 = cVar2.f37542a;
                                    if (linkedHashMap2.containsKey(Integer.valueOf(i14))) {
                                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i14));
                                        z14 = (map == null ? is.x.f20677u : map).containsKey(Integer.valueOf(aVar3.f38187b));
                                    } else {
                                        z14 = false;
                                    }
                                    if (!z14) {
                                        cVar2.a(aVar3);
                                    }
                                }
                                x1.t tVar = (x1.t) x1.n.o(x1.t.class, nVar.g());
                                if (tVar != null) {
                                    tVar.f37568u = bVar3;
                                }
                                x1.a aVar4 = (x1.a) x1.n.o(x1.a.class, nVar.g());
                                x1.h hVar = nVar.f37519e;
                                if (aVar4 == null) {
                                    if (bVar3.f37458g == 3) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    nVar.g().setWriteAheadLoggingEnabled(z12);
                                    nVar.f37520g = bVar3.f37457e;
                                    nVar.f37516b = bVar3.f37459h;
                                    nVar.f37517c = new x1.v(bVar3.f37460i);
                                    nVar.f = bVar3.f;
                                    Intent intent = bVar3.f37461j;
                                    if (intent != null) {
                                        String str3 = bVar3.f37454b;
                                        if (str3 != null) {
                                            hVar.getClass();
                                            Context context4 = bVar3.f37453a;
                                            kotlin.jvm.internal.i.g(context4, "context");
                                            Executor executor4 = hVar.f37473a.f37516b;
                                            if (executor4 != null) {
                                                new x1.k(context4, str3, intent, hVar, executor4);
                                            } else {
                                                kotlin.jvm.internal.i.q("internalQueryExecutor");
                                                throw null;
                                            }
                                        } else {
                                            throw new IllegalArgumentException("Required value was null.".toString());
                                        }
                                    }
                                    Map<Class<?>, List<Class<?>>> i15 = nVar.i();
                                    BitSet bitSet2 = new BitSet();
                                    Iterator<Map.Entry<Class<?>, List<Class<?>>>> it3 = i15.entrySet().iterator();
                                    while (true) {
                                        boolean hasNext2 = it3.hasNext();
                                        List<Object> list2 = bVar3.f37466o;
                                        if (hasNext2) {
                                            Map.Entry<Class<?>, List<Class<?>>> next2 = it3.next();
                                            Class<?> key = next2.getKey();
                                            for (Class<?> cls2 : next2.getValue()) {
                                                int size3 = list2.size() - 1;
                                                if (size3 >= 0) {
                                                    while (true) {
                                                        int i16 = size3 - 1;
                                                        if (cls2.isAssignableFrom(list2.get(size3).getClass())) {
                                                            bitSet2.set(size3);
                                                            break;
                                                        } else if (i16 < 0) {
                                                            break;
                                                        } else {
                                                            size3 = i16;
                                                        }
                                                    }
                                                    if (size3 < 0) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    if (!z13) {
                                                        nVar.f37525l.put(cls2, list2.get(size3));
                                                    } else {
                                                        throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                                                    }
                                                }
                                                size3 = -1;
                                                if (size3 < 0) {
                                                }
                                                if (!z13) {
                                                }
                                            }
                                        } else {
                                            int size4 = list2.size() - 1;
                                            if (size4 >= 0) {
                                                while (true) {
                                                    int i17 = size4 - 1;
                                                    if (bitSet2.get(size4)) {
                                                        if (i17 < 0) {
                                                            break;
                                                        }
                                                        size4 = i17;
                                                    } else {
                                                        throw new IllegalArgumentException("Unexpected type converter " + list2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                                    }
                                                }
                                            }
                                            WorkDatabase workDatabase = (WorkDatabase) nVar;
                                            Context applicationContext = context.getApplicationContext();
                                            q.a aVar5 = new q.a(bVar.f);
                                            synchronized (androidx.work.q.f3333a) {
                                                try {
                                                    androidx.work.q.f3334b = aVar5;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    while (true) {
                                                        try {
                                                            break;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            }
                                            v.c cVar3 = new v.c(applicationContext, bVar2, 0);
                                            this.f25800j = cVar3;
                                            r[] rVarArr = new r[2];
                                            int i18 = Build.VERSION.SDK_INT;
                                            String str4 = s.f25850a;
                                            if (i18 >= 23) {
                                                rVar = new q2.b(applicationContext, this);
                                                c10 = 1;
                                                w2.l.a(applicationContext, SystemJobService.class, true);
                                                androidx.work.q.d().a(str4, "Created SystemJobScheduler and enabled SystemJobService");
                                            } else {
                                                try {
                                                    rVar = (r) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext);
                                                    androidx.work.q.d().a(str4, "Created androidx.work.impl.background.gcm.GcmScheduler");
                                                } catch (Throwable th4) {
                                                    if (((q.a) androidx.work.q.d()).f3335c <= 3) {
                                                        Log.d(str4, "Unable to create GCM Scheduler", th4);
                                                    }
                                                    rVar = null;
                                                }
                                                if (rVar == null) {
                                                    rVar = new p2.c(applicationContext);
                                                    c10 = 1;
                                                    w2.l.a(applicationContext, SystemAlarmService.class, true);
                                                    androidx.work.q.d().a(str4, "Created SystemAlarmScheduler");
                                                } else {
                                                    c10 = 1;
                                                }
                                            }
                                            rVarArr[0] = rVar;
                                            rVarArr[c10] = new o2.c(applicationContext, bVar, cVar3, this);
                                            List<r> asList = Arrays.asList(rVarArr);
                                            p pVar = new p(context, bVar, bVar2, workDatabase, asList);
                                            Context applicationContext2 = context.getApplicationContext();
                                            this.f25792a = applicationContext2;
                                            this.f25793b = bVar;
                                            this.f25795d = bVar2;
                                            this.f25794c = workDatabase;
                                            this.f25796e = asList;
                                            this.f = pVar;
                                            this.f25797g = new w2.m(workDatabase);
                                            this.f25798h = false;
                                            if (Build.VERSION.SDK_INT >= 24 && a.a(applicationContext2)) {
                                                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
                                            }
                                            ((y2.b) this.f25795d).a(new ForceStopRunnable(applicationContext2, this));
                                            return;
                                        }
                                    }
                                } else {
                                    hVar.getClass();
                                    kotlin.jvm.internal.i.g(null, "autoCloser");
                                    throw null;
                                }
                            }
                        }
                    } catch (ClassNotFoundException unused) {
                        throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + concat + " does not exist");
                    } catch (IllegalAccessException unused2) {
                        throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
                    } catch (InstantiationException unused3) {
                        throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        } else {
            throw null;
        }
    }

    public static a0 e(Context context) {
        a0 f;
        synchronized (f25791m) {
            f = f();
            if (f == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof b.InterfaceC0040b) {
                    g(applicationContext, ((b.InterfaceC0040b) applicationContext).a());
                    f = e(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return f;
    }

    @Deprecated
    public static a0 f() {
        synchronized (f25791m) {
            a0 a0Var = f25789k;
            if (a0Var != null) {
                return a0Var;
            }
            return f25790l;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (n2.a0.f25790l != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        n2.a0.f25790l = new n2.a0(r4, r5, new y2.b(r5.f3215b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        n2.a0.f25789k = n2.a0.f25790l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g(Context context, androidx.work.b bVar) {
        synchronized (f25791m) {
            a0 a0Var = f25789k;
            if (a0Var != null && f25790l != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    @Override // androidx.work.v
    public final androidx.work.s a(String str, List list) {
        return new u(this, str, androidx.work.f.REPLACE, list, null).J();
    }

    @Override // androidx.work.v
    public final androidx.lifecycle.u b(UUID uuid) {
        x1.s r = this.f25794c.u().r(Collections.singletonList(uuid.toString()));
        z zVar = new z();
        y2.a aVar = this.f25795d;
        Object obj = new Object();
        androidx.lifecycle.u uVar = new androidx.lifecycle.u();
        uVar.m(r, new w2.h(aVar, obj, zVar, uVar));
        return uVar;
    }

    public final u c(List list) {
        if (!list.isEmpty()) {
            return new u(this, list);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    public final androidx.work.s d(List<? extends androidx.work.w> list) {
        if (!list.isEmpty()) {
            return new u(this, list).J();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void h() {
        synchronized (f25791m) {
            this.f25798h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f25799i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f25799i = null;
            }
        }
    }

    public final void i() {
        ArrayList f;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f25792a;
            String str = q2.b.f29115y;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (f = q2.b.f(context, jobScheduler)) != null && !f.isEmpty()) {
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    q2.b.a(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        this.f25794c.u().v();
        s.a(this.f25793b, this.f25794c, this.f25796e);
    }

    public final void j(t tVar, WorkerParameters.a aVar) {
        ((y2.b) this.f25795d).a(new w2.p(this, tVar, aVar));
    }

    public final void k(t tVar) {
        ((y2.b) this.f25795d).a(new w2.q(this, tVar, false));
    }
}
