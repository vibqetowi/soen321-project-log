package i5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.theinnerhour.b2b.model.GamificationModel;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import i5.i;
import ik.k1;
import ik.m1;
import j5.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import w5.a;
import w5.l;
import w5.w;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f19835u;

    public /* synthetic */ b(int i6) {
        this.f19835u = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015e, code lost:
        if (r10 != false) goto L101;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0167 A[Catch: all -> 0x0185, Exception -> 0x0189, TryCatch #21 {Exception -> 0x0189, all -> 0x0185, blocks: (B:73:0x0100, B:75:0x0110, B:81:0x011c, B:83:0x0127, B:86:0x0137, B:88:0x013d, B:105:0x017e, B:101:0x0160, B:104:0x0167, B:82:0x0122, B:94:0x014c), top: B:264:0x0100 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        String str;
        o5.f fVar;
        Class<?> b10;
        JSONObject jSONObject;
        boolean c10;
        r5.c cVar;
        boolean z11;
        Set<a> set = null;
        set = null;
        r9 = null;
        r9 = null;
        q5.l lVar = null;
        r9 = null;
        r9 = null;
        q5.j jVar = null;
        ArrayList<String> arrayList = null;
        ArrayList<String> a10 = null;
        boolean z12 = false;
        switch (this.f19835u) {
            case 0:
                c.f19836a.getClass();
                c.a();
                return;
            case 1:
                String str2 = f.f19852a;
                if (!b6.a.b(f.class)) {
                    try {
                        f.f19856e = null;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = i.f19861c;
                        if (i.a.b() != h.EXPLICIT_ONLY) {
                            f.d(l.TIMER);
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        b6.a.a(f.class, th2);
                        return;
                    }
                }
                return;
            case 2:
                String str3 = f.f19852a;
                if (!b6.a.b(f.class)) {
                    try {
                        int i6 = g.f19857a;
                        g.b(f.f19854c);
                        f.f19854c = new w.d(1);
                        return;
                    } catch (Throwable th3) {
                        b6.a.a(f.class, th3);
                        return;
                    }
                }
                return;
            case 3:
                HashSet hashSet = new HashSet();
                String str4 = f.f19852a;
                if (!b6.a.b(f.class)) {
                    try {
                        set = f.f19854c.f();
                    } catch (Throwable th4) {
                        b6.a.a(f.class, th4);
                    }
                }
                for (a aVar : set) {
                    hashSet.add(aVar.f19831u);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    w5.p.f((String) it.next(), true);
                }
                return;
            case 4:
                j5.a aVar2 = j5.a.f21671a;
                if (!b6.a.b(j5.a.class)) {
                    try {
                        Context a11 = h5.p.a();
                        w5.a aVar3 = w5.a.f;
                        w5.a a12 = a.C0610a.a(a11);
                        if (a12 != null && a12.f36430e) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            j5.a aVar4 = j5.a.f21671a;
                            aVar4.getClass();
                            if (!b6.a.b(aVar4)) {
                                w5.p pVar = w5.p.f36526a;
                                w5.o f = w5.p.f(h5.p.b(), false);
                                if (f != null && (str = f.f36521k) != null) {
                                    try {
                                        j5.c.a().clear();
                                        c.a.a(new JSONObject(str));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            j5.a.f21672b = true;
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        b6.a.a(j5.a.class, th5);
                        return;
                    }
                }
                return;
            case 5:
                Context a13 = h5.p.a();
                o5.f fVar2 = o5.f.f27154a;
                o5.c.a(o5.c.f27119a, a13, o5.f.f(a13, o5.c.f27126i), false);
                Object obj = o5.c.f27126i;
                if (!b6.a.b(o5.f.class)) {
                    try {
                        o5.f fVar3 = o5.f.f27154a;
                        a10 = fVar3.a(fVar3.e(a13, obj, "subs"));
                    } catch (Throwable th6) {
                        b6.a.a(o5.f.class, th6);
                    }
                }
                o5.c.a(o5.c.f27119a, a13, a10, true);
                return;
            case 6:
                Context a14 = h5.p.a();
                o5.f fVar4 = o5.f.f27154a;
                ArrayList<String> f2 = o5.f.f(a14, o5.c.f27126i);
                if (f2.isEmpty()) {
                    Object obj2 = o5.c.f27126i;
                    if (!b6.a.b(o5.f.class)) {
                        try {
                            ArrayList<String> arrayList2 = new ArrayList<>();
                            if (obj2 != null && (b10 = (fVar = o5.f.f27154a).b(a14, "com.android.vending.billing.IInAppBillingService")) != null && fVar.c(b10, "getPurchaseHistory") != null) {
                                arrayList = fVar.a(fVar.d(a14, obj2));
                            }
                            arrayList = arrayList2;
                        } catch (Throwable th7) {
                            b6.a.a(o5.f.class, th7);
                        }
                    }
                } else {
                    arrayList = f2;
                }
                o5.c.a(o5.c.f27119a, a14, arrayList, false);
                return;
            case 7:
                o5.d dVar = o5.d.f27127a;
                if (!b6.a.b(o5.d.class)) {
                    try {
                        o5.d.f27127a.a();
                        return;
                    } catch (Throwable th8) {
                        b6.a.a(o5.d.class, th8);
                        return;
                    }
                }
                return;
            case 8:
                o5.d dVar2 = o5.d.f27127a;
                if (!b6.a.b(o5.d.class)) {
                    try {
                        o5.d.f27127a.a();
                        return;
                    } catch (Throwable th9) {
                        b6.a.a(o5.d.class, th9);
                        return;
                    }
                }
                return;
            case 9:
                if (q5.c.f29142g == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(h5.p.a());
                    long j10 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0L);
                    long j11 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0L);
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j10 != 0 && j11 != 0 && string != null) {
                        q5.j jVar2 = new q5.j(Long.valueOf(j10), Long.valueOf(j11));
                        jVar2.f29172d = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(h5.p.a());
                        if (defaultSharedPreferences2.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                            lVar = new q5.l(defaultSharedPreferences2.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                        }
                        jVar2.f = lVar;
                        jVar2.f29173e = Long.valueOf(System.currentTimeMillis());
                        UUID fromString = UUID.fromString(string);
                        kotlin.jvm.internal.i.f(fromString, "fromString(sessionIDStr)");
                        jVar2.f29171c = fromString;
                        jVar = jVar2;
                    }
                    q5.c.f29142g = jVar;
                    return;
                }
                return;
            case 10:
                r5.c cVar2 = r5.c.f30467a;
                if (!b6.a.b(r5.c.class)) {
                    try {
                        SharedPreferences sharedPreferences = h5.p.a().getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
                        String string2 = sharedPreferences.getString("models", null);
                        if (string2 != null) {
                            if (string2.length() == 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (!z11) {
                                jSONObject = new JSONObject(string2);
                                long j12 = sharedPreferences.getLong("model_request_timestamp", 0L);
                                w5.l lVar2 = w5.l.f36497a;
                                c10 = w5.l.c(l.b.ModelRequest);
                                cVar = r5.c.f30467a;
                                if (c10 && jSONObject.length() != 0) {
                                    cVar.getClass();
                                    if (!b6.a.b(cVar) && j12 != 0 && System.currentTimeMillis() - j12 < 259200000) {
                                        z12 = true;
                                        break;
                                    }
                                }
                                jSONObject = cVar.c();
                                if (jSONObject == null) {
                                    sharedPreferences.edit().putString("models", jSONObject.toString()).putLong("model_request_timestamp", System.currentTimeMillis()).apply();
                                    cVar.a(jSONObject);
                                    cVar.b();
                                    return;
                                }
                                return;
                            }
                        }
                        jSONObject = new JSONObject();
                        long j122 = sharedPreferences.getLong("model_request_timestamp", 0L);
                        w5.l lVar22 = w5.l.f36497a;
                        c10 = w5.l.c(l.b.ModelRequest);
                        cVar = r5.c.f30467a;
                        if (c10) {
                            cVar.getClass();
                            if (!b6.a.b(cVar)) {
                                z12 = true;
                            }
                        }
                        jSONObject = cVar.c();
                        if (jSONObject == null) {
                        }
                    } catch (Exception unused2) {
                        return;
                    } catch (Throwable th10) {
                        b6.a.a(r5.c.class, th10);
                        return;
                    }
                }
                return;
            case 11:
                r5.c cVar3 = r5.c.f30467a;
                if (!b6.a.b(r5.c.class)) {
                    try {
                        u5.d.a();
                        return;
                    } catch (Throwable th11) {
                        b6.a.a(r5.c.class, th11);
                        return;
                    }
                }
                return;
            case 12:
                r5.c cVar4 = r5.c.f30467a;
                if (!b6.a.b(r5.c.class)) {
                    try {
                        p5.a aVar5 = p5.a.f27903a;
                        if (!b6.a.b(p5.a.class)) {
                            p5.a.f27904b = true;
                            w5.n nVar = w5.n.f36507a;
                            p5.a.f27905c = w5.n.b("FBSDKFeatureIntegritySample", h5.p.b(), false);
                            return;
                        }
                        return;
                    } catch (Throwable th12) {
                        b6.a.a(r5.c.class, th12);
                        return;
                    }
                }
                return;
            case 13:
                u5.d dVar3 = u5.d.f33819a;
                if (!b6.a.b(u5.d.class)) {
                    try {
                        AtomicBoolean atomicBoolean = u5.d.f33820b;
                        if (!atomicBoolean.get()) {
                            atomicBoolean.set(true);
                            u5.d.f33819a.b();
                            return;
                        }
                        return;
                    } catch (Throwable th13) {
                        b6.a.a(u5.d.class, th13);
                        return;
                    }
                }
                return;
            case 14:
                AtomicBoolean atomicBoolean2 = w.f36552d;
                if (!b6.a.b(w.class)) {
                    try {
                        for (w.e eVar : w.f36551c) {
                            eVar.a(true);
                        }
                        atomicBoolean2.set(false);
                        return;
                    } catch (Throwable th14) {
                        b6.a.a(w.class, th14);
                        return;
                    }
                }
                return;
            case 15:
                int i10 = z5.a.f39190a;
                if (!b6.a.b(z5.a.class)) {
                    try {
                        Object systemService = h5.p.a().getSystemService(Constants.SCREEN_ACTIVITY);
                        if (systemService != null) {
                            z5.a.a((ActivityManager) systemService);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
                    } catch (Exception unused3) {
                        return;
                    } catch (Throwable th15) {
                        b6.a.a(z5.a.class, th15);
                        return;
                    }
                }
                return;
            case 16:
                int i11 = AlarmManagerSchedulerBroadcastReceiver.f6152a;
                return;
            case 17:
                eh.o.a();
                return;
            case 18:
                int i12 = k1.I;
                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(20, Constants.GAMIFICATION_COMPLETING_INITIAL_ASSESSMENT_TASK, defpackage.b.g(), defpackage.b.g()));
                return;
            default:
                int i13 = m1.J;
                FirebasePersistence.getInstance().addUserGamificationPointsToFirebase(new GamificationModel(20, Constants.GAMIFICATION_COMPLETING_INITIAL_ASSESSMENT_TASK, defpackage.b.g(), defpackage.b.g()));
                return;
        }
    }
}
