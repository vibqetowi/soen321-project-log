package w5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.google.firebase.FirebaseException;
import com.google.firebase.database.collection.ImmutableSortedMap;
import com.google.firebase.database.collection.ImmutableSortedSet;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Callable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f36541u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f36542v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f36543w;

    public /* synthetic */ u(Object obj, int i6, Object obj2) {
        this.f36541u = i6;
        this.f36542v = obj;
        this.f36543w = obj2;
    }

    private final void a() {
        nf.c cVar = (nf.c) this.f36543w;
        com.google.firebase.remoteconfig.internal.b bVar = ((nf.b) this.f36542v).f26295h;
        synchronized (bVar.f9829b) {
            bVar.f9828a.edit().putLong("fetch_timeout_in_seconds", cVar.f26297a).putLong("minimum_fetch_interval_in_seconds", cVar.f26298b).commit();
        }
    }

    private final void b() {
        of.c cVar = (of.c) this.f36543w;
        of.e eVar = ((of.b) this.f36542v).f27440b;
        synchronized (eVar) {
            FileOutputStream openFileOutput = eVar.f27454a.openFileOutput(eVar.f27455b, 0);
            openFileOutput.write(cVar.toString().getBytes("UTF-8"));
            openFileOutput.close();
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z10;
        boolean z11;
        ke.n b10;
        ServiceInfo serviceInfo;
        String str;
        int i6;
        ComponentName startService;
        String str2 = null;
        switch (this.f36541u) {
            case 0:
                androidx.appcompat.widget.l this$0 = (androidx.appcompat.widget.l) this.f36542v;
                Callable callable = (Callable) this.f36543w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(callable, "$callable");
                try {
                    this$0.f1471v = callable.call();
                    return null;
                } finally {
                    CountDownLatch countDownLatch = (CountDownLatch) this$0.f1472w;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            case 1:
                ed.c cVar = (ed.c) this.f36542v;
                cVar.getClass();
                ((tr.r) this.f36543w).getClass();
                byte[] bytes = new JSONObject().toString().getBytes("UTF-8");
                ad.i iVar = cVar.f13940c;
                iVar.getClass();
                ad.j jVar = cVar.f;
                long j10 = jVar.f513c;
                jVar.f511a.getClass();
                if (j10 <= System.currentTimeMillis()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    JSONObject jSONObject = new JSONObject(iVar.b(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:generatePlayIntegrityChallenge?key=%s", iVar.f509d, iVar.f508c, iVar.f507b)), bytes, jVar));
                    String a10 = aa.i.a(jSONObject.optString("challenge"));
                    String a11 = aa.i.a(jSONObject.optString("ttl"));
                    if (a10 != null && a11 != null) {
                        return new ed.a(a10, a11);
                    }
                    throw new FirebaseException("Unexpected server response.");
                }
                throw new FirebaseException("Too many attempts.");
            case 2:
                ed.c cVar2 = (ed.c) this.f36542v;
                s5 s5Var = (s5) this.f36543w;
                cVar2.getClass();
                s5Var.getClass();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playIntegrityToken", s5Var.f8126v);
                byte[] bytes2 = jSONObject2.toString().getBytes("UTF-8");
                ad.i iVar2 = cVar2.f13940c;
                iVar2.getClass();
                ad.j jVar2 = cVar2.f;
                long j11 = jVar2.f513c;
                jVar2.f511a.getClass();
                if (j11 <= System.currentTimeMillis()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    JSONObject jSONObject3 = new JSONObject(iVar2.b(new URL(String.format("https://firebaseappcheck.googleapis.com/v1/projects/%s/apps/%s:exchangePlayIntegrityToken?key=%s", iVar2.f509d, iVar2.f508c, iVar2.f507b)), bytes2, jVar2));
                    String a12 = aa.i.a(jSONObject3.optString("token"));
                    String a13 = aa.i.a(jSONObject3.optString("ttl"));
                    if (a12 != null && a13 != null) {
                        return new ad.a(a12, a13);
                    }
                    throw new FirebaseException("Unexpected server response.");
                }
                throw new FirebaseException("Too many attempts.");
            case 3:
                he.y yVar = (he.y) this.f36543w;
                nd.z a14 = ((he.n) this.f36542v).f.a(yVar, true);
                he.g0 g0Var = new he.g0(yVar, (ImmutableSortedSet) a14.f26149c);
                return (he.h0) g0Var.a(g0Var.c((ImmutableSortedMap) a14.f26148b, null), null).f26148b;
            case 4:
                ke.i iVar3 = (ke.i) this.f36543w;
                je.h hVar = ((he.n) this.f36542v).f.f;
                le.j b11 = hVar.f21832c.b(iVar3);
                if (b11 != null && !(b11.c() instanceof le.k)) {
                    b10 = ke.n.m(iVar3);
                } else {
                    b10 = hVar.f21830a.b(iVar3);
                }
                if (b11 != null) {
                    b11.c().a(b10, le.d.f24211b, new sc.h(new Date()));
                }
                return b10;
            case 5:
                Context context = (Context) this.f36542v;
                Intent intent = (Intent) this.f36543w;
                Object obj = com.google.firebase.messaging.k.f9742c;
                com.google.firebase.messaging.a0 a15 = com.google.firebase.messaging.a0.a();
                a15.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                a15.f9677d.offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (a15) {
                    String str3 = a15.f9674a;
                    if (str3 != null) {
                        str2 = str3;
                    } else {
                        ResolveInfo resolveService = context.getPackageManager().resolveService(intent2, 0);
                        if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                                if (str.startsWith(".")) {
                                    a15.f9674a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    a15.f9674a = serviceInfo.name;
                                }
                                str2 = a15.f9674a;
                            }
                            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                        }
                        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (a15.c(context)) {
                        startService = com.google.firebase.messaging.k0.c(context, intent2);
                    } else {
                        startService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (startService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i6 = 404;
                    } else {
                        i6 = -1;
                    }
                } catch (IllegalStateException e10) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e10);
                    i6 = 402;
                } catch (SecurityException e11) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e11);
                    i6 = 401;
                }
                return Integer.valueOf(i6);
            case 6:
                a();
                return null;
            default:
                b();
                return null;
        }
    }
}
