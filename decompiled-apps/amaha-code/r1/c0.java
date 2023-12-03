package r1;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import r1.l;
/* compiled from: RegisteredMediaRouteProviderWatcher.java */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f30215a;

    /* renamed from: b  reason: collision with root package name */
    public final c f30216b;

    /* renamed from: d  reason: collision with root package name */
    public final PackageManager f30218d;
    public boolean f;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList<a0> f30219e = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public final a f30220g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final b f30221h = new b();

    /* renamed from: c  reason: collision with root package name */
    public final Handler f30217c = new Handler();

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            c0.this.a();
        }
    }

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c0.this.a();
        }
    }

    /* compiled from: RegisteredMediaRouteProviderWatcher.java */
    /* loaded from: classes.dex */
    public interface c {
    }

    public c0(Context context, l.d dVar) {
        this.f30215a = context;
        this.f30216b = dVar;
        this.f30218d = context.getPackageManager();
    }

    public final void a() {
        ArrayList<a0> arrayList;
        c cVar;
        boolean z10;
        int i6;
        boolean z11;
        boolean z12;
        if (!this.f) {
            return;
        }
        List<ServiceInfo> arrayList2 = new ArrayList();
        int i10 = Build.VERSION.SDK_INT;
        PackageManager packageManager = this.f30218d;
        if (i10 >= 30) {
            arrayList2 = (List) Collection$EL.stream(packageManager.queryIntentServices(new Intent("android.media.MediaRoute2ProviderService"), 0)).map(new r1.c(3)).collect(Collectors.toList());
        }
        Iterator<ResolveInfo> it = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
        int i11 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f30219e;
            boolean z13 = true;
            cVar = this.f30216b;
            if (!hasNext) {
                break;
            }
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null) {
                l.d dVar = l.f30291d;
                if (dVar == null) {
                    z10 = false;
                } else {
                    z10 = dVar.f30299b;
                }
                if (z10) {
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        for (ServiceInfo serviceInfo2 : arrayList2) {
                            if (serviceInfo.packageName.equals(serviceInfo2.packageName) && serviceInfo.name.equals(serviceInfo2.name)) {
                                z12 = true;
                                break;
                            }
                        }
                    }
                    z12 = false;
                    if (z12) {
                    }
                }
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                int size = arrayList.size();
                int i12 = 0;
                while (true) {
                    if (i12 < size) {
                        ComponentName componentName = arrayList.get(i12).C;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            break;
                        }
                        i12++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 < 0) {
                    a0 a0Var = new a0(this.f30215a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                    a0Var.J = new dd.a(this, 0, a0Var);
                    a0Var.v();
                    i6 = i11 + 1;
                    arrayList.add(i11, a0Var);
                    ((l.d) cVar).a(a0Var);
                } else if (i12 >= i11) {
                    a0 a0Var2 = arrayList.get(i12);
                    a0Var2.v();
                    if (a0Var2.H == null) {
                        if (!a0Var2.F || (a0Var2.f30262y == null && a0Var2.E.isEmpty())) {
                            z13 = false;
                        }
                        if (z13) {
                            a0Var2.w();
                            a0Var2.r();
                        }
                    }
                    i6 = i11 + 1;
                    Collections.swap(arrayList, i12, i11);
                }
                i11 = i6;
            }
        }
        if (i11 < arrayList.size()) {
            for (int size2 = arrayList.size() - 1; size2 >= i11; size2--) {
                a0 a0Var3 = arrayList.get(size2);
                l.d dVar2 = (l.d) cVar;
                l.f d10 = dVar2.d(a0Var3);
                if (d10 != null) {
                    a0Var3.getClass();
                    l.b();
                    a0Var3.f30261x = null;
                    a0Var3.q(null);
                    dVar2.n(d10, null);
                    if (l.f30290c) {
                        Log.d("MediaRouter", "Provider removed: " + d10);
                    }
                    dVar2.f30307k.b(514, d10);
                    dVar2.f30303g.remove(d10);
                }
                arrayList.remove(a0Var3);
                a0Var3.J = null;
                if (a0Var3.F) {
                    if (a0.K) {
                        Log.d("MediaRouteProviderProxy", a0Var3 + ": Stopping");
                    }
                    a0Var3.F = false;
                    a0Var3.x();
                }
            }
        }
    }
}
