package sc;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.api.internal.b;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.theinnerhour.b2b.utils.SessionManager;
import hd.l;
import id.i;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import t.g;
import v9.m;
import v9.o;
/* compiled from: FirebaseApp.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f31430k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final t.b f31431l = new t.b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f31432a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31433b;

    /* renamed from: c  reason: collision with root package name */
    public final f f31434c;

    /* renamed from: d  reason: collision with root package name */
    public final hd.h f31435d;

    /* renamed from: g  reason: collision with root package name */
    public final l<we.a> f31437g;

    /* renamed from: h  reason: collision with root package name */
    public final re.b<pe.d> f31438h;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f31436e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();

    /* renamed from: i  reason: collision with root package name */
    public final CopyOnWriteArrayList f31439i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final CopyOnWriteArrayList f31440j = new CopyOnWriteArrayList();

    /* compiled from: FirebaseApp.java */
    /* loaded from: classes.dex */
    public interface a {
        void onBackgroundStateChanged(boolean z10);
    }

    /* compiled from: FirebaseApp.java */
    /* loaded from: classes.dex */
    public static class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static final AtomicReference<b> f31441a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.b.a
        public final void onBackgroundStateChanged(boolean z10) {
            synchronized (e.f31430k) {
                Iterator it = new ArrayList(e.f31431l.values()).iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    if (eVar.f31436e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = eVar.f31439i.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).onBackgroundStateChanged(z10);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: FirebaseApp.java */
    /* loaded from: classes.dex */
    public static class c extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static final AtomicReference<c> f31442b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f31443a;

        public c(Context context) {
            this.f31443a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (e.f31430k) {
                Iterator it = ((g.e) e.f31431l.values()).iterator();
                while (it.hasNext()) {
                    ((e) it.next()).h();
                }
            }
            this.f31443a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c0 A[LOOP:0: B:24:0x00ba->B:26:0x00c0, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e(Context context, f fVar, String str) {
        Bundle bundle;
        ?? arrayList;
        ArrayList arrayList2;
        PackageManager packageManager;
        this.f31432a = context;
        o.e(str);
        this.f31433b = str;
        this.f31434c = fVar;
        sc.a aVar = FirebaseInitProvider.f9804u;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList3 = new ArrayList();
        try {
            packageManager = context.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (packageManager == null) {
            Log.w("ComponentDiscovery", "Context has no PackageManager.");
        } else {
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, ComponentDiscoveryService.class), 128);
            if (serviceInfo == null) {
                Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
            } else {
                bundle = serviceInfo.metaData;
                if (bundle != null) {
                    Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                    for (String str2 : bundle.keySet()) {
                        if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                            arrayList.add(str2.substring(31));
                        }
                    }
                }
                for (String str3 : arrayList) {
                    arrayList3.add(new hd.d(0, str3));
                }
                Trace.endSection();
                Trace.beginSection("Runtime");
                i iVar = i.f19988u;
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList4.addAll(arrayList3);
                arrayList4.add(new hd.d(1, new FirebaseCommonRegistrar()));
                arrayList4.add(new hd.d(1, new ExecutorsRegistrar()));
                arrayList2.add(hd.b.b(context, Context.class, new Class[0]));
                arrayList2.add(hd.b.b(this, e.class, new Class[0]));
                arrayList2.add(hd.b.b(fVar, f.class, new Class[0]));
                pf.a aVar2 = new pf.a();
                if (o0.l.a(context) && FirebaseInitProvider.f9805v.get()) {
                    arrayList2.add(hd.b.b(aVar, g.class, new Class[0]));
                }
                hd.h hVar = new hd.h(iVar, arrayList4, arrayList2, aVar2);
                this.f31435d = hVar;
                Trace.endSection();
                this.f31437g = new l<>(new sc.c(this, 0, context));
                this.f31438h = hVar.b(pe.d.class);
                a(new a() { // from class: sc.d
                    @Override // sc.e.a
                    public final void onBackgroundStateChanged(boolean z10) {
                        e eVar = e.this;
                        if (!z10) {
                            eVar.f31438h.get().c();
                        } else {
                            eVar.getClass();
                        }
                    }
                });
                Trace.endSection();
            }
        }
        bundle = null;
        if (bundle != null) {
        }
        while (r0.hasNext()) {
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        i iVar2 = i.f19988u;
        ArrayList arrayList42 = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList42.addAll(arrayList3);
        arrayList42.add(new hd.d(1, new FirebaseCommonRegistrar()));
        arrayList42.add(new hd.d(1, new ExecutorsRegistrar()));
        arrayList2.add(hd.b.b(context, Context.class, new Class[0]));
        arrayList2.add(hd.b.b(this, e.class, new Class[0]));
        arrayList2.add(hd.b.b(fVar, f.class, new Class[0]));
        pf.a aVar22 = new pf.a();
        if (o0.l.a(context)) {
            arrayList2.add(hd.b.b(aVar, g.class, new Class[0]));
        }
        hd.h hVar2 = new hd.h(iVar2, arrayList42, arrayList2, aVar22);
        this.f31435d = hVar2;
        Trace.endSection();
        this.f31437g = new l<>(new sc.c(this, 0, context));
        this.f31438h = hVar2.b(pe.d.class);
        a(new a() { // from class: sc.d
            @Override // sc.e.a
            public final void onBackgroundStateChanged(boolean z10) {
                e eVar = e.this;
                if (!z10) {
                    eVar.f31438h.get().c();
                } else {
                    eVar.getClass();
                }
            }
        });
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f31430k) {
            Iterator it = ((g.e) f31431l.values()).iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                eVar.b();
                arrayList.add(eVar.f31433b);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static e e() {
        e eVar;
        synchronized (f31430k) {
            eVar = (e) f31431l.getOrDefault("[DEFAULT]", null);
            if (eVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + aa.h.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return eVar;
    }

    public static e f(String str) {
        e eVar;
        ArrayList d10;
        String str2;
        synchronized (f31430k) {
            eVar = (e) f31431l.getOrDefault(str.trim(), null);
            if (eVar != null) {
                eVar.f31438h.get().c();
            } else {
                if (d().isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", d10);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return eVar;
    }

    public static e i(Context context) {
        synchronized (f31430k) {
            if (f31431l.containsKey("[DEFAULT]")) {
                return e();
            }
            f a10 = f.a(context);
            if (a10 == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return j(context, a10);
        }
    }

    public static e j(Context context, f fVar) {
        e eVar;
        boolean z10;
        AtomicReference<b> atomicReference = b.f31441a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.f31441a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                while (true) {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        z10 = true;
                        break;
                    } else if (atomicReference2.get() != null) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    com.google.android.gms.common.api.internal.b.b(application);
                    com.google.android.gms.common.api.internal.b.f7338y.a(bVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f31430k) {
            t.b bVar2 = f31431l;
            boolean containsKey = true ^ bVar2.containsKey("[DEFAULT]");
            o.j("FirebaseApp name [DEFAULT] already exists!", containsKey);
            o.i(context, "Application context cannot be null.");
            eVar = new e(context, fVar, "[DEFAULT]");
            bVar2.put("[DEFAULT]", eVar);
        }
        eVar.h();
        return eVar;
    }

    public final void a(a aVar) {
        b();
        if (this.f31436e.get() && com.google.android.gms.common.api.internal.b.f7338y.f7339u.get()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f31439i.add(aVar);
    }

    public final void b() {
        o.j("FirebaseApp was deleted", !this.f.get());
    }

    public final <T> T c(Class<T> cls) {
        b();
        return (T) this.f31435d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.b();
        return this.f31433b.equals(eVar.f31433b);
    }

    public final String g() {
        String encodeToString;
        StringBuilder sb2 = new StringBuilder();
        b();
        byte[] bytes = this.f31433b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb2.append(encodeToString);
        sb2.append("+");
        b();
        byte[] bytes2 = this.f31434c.f31445b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb2.append(str);
        return sb2.toString();
    }

    public final void h() {
        HashMap hashMap;
        boolean z10 = true;
        if (!o0.l.a(this.f31432a)) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            b();
            sb2.append(this.f31433b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f31432a;
            AtomicReference<c> atomicReference = c.f31442b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (true) {
                    if (!atomicReference.compareAndSet(null, cVar)) {
                        if (atomicReference.get() != null) {
                            z10 = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z10) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        b();
        sb3.append(this.f31433b);
        Log.i("FirebaseApp", sb3.toString());
        hd.h hVar = this.f31435d;
        b();
        boolean equals = "[DEFAULT]".equals(this.f31433b);
        AtomicReference<Boolean> atomicReference2 = hVar.f17417e;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (!atomicReference2.compareAndSet(null, valueOf)) {
                if (atomicReference2.get() != null) {
                    z10 = false;
                    break;
                }
            } else {
                break;
            }
        }
        if (z10) {
            synchronized (hVar) {
                hashMap = new HashMap(hVar.f17413a);
            }
            hVar.h(hashMap, equals);
        }
        this.f31438h.get().c();
    }

    public final int hashCode() {
        return this.f31433b.hashCode();
    }

    public final boolean k() {
        boolean z10;
        b();
        we.a aVar = this.f31437g.get();
        synchronized (aVar) {
            z10 = aVar.f36687b;
        }
        return z10;
    }

    public final String toString() {
        m.a aVar = new m.a(this);
        aVar.a(this.f31433b, SessionManager.KEY_NAME);
        aVar.a(this.f31434c, "options");
        return aVar.toString();
    }
}
