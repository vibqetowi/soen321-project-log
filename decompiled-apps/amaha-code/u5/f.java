package u5;

import a7.h;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import d7.n;
import d7.s;
import e7.l;
import hh.g;
import ih.p;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.u;
import mi.a2;
import mi.f0;
import mi.h1;
import mi.i1;
import mi.t1;
import mi.x1;
import mi.y1;
import mi.z0;
import mi.z1;
import org.json.JSONObject;
import qg.w;
import r5.c;
import u5.g;
import vi.o;
import w5.e0;
import ya.k;
import yg.c0;
import yg.j;
import yi.m;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33827u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f33828v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f33829w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f33830x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ Object f33831y;

    public /* synthetic */ f(Context context, p pVar, String str) {
        ri.d dVar = ri.d.f30734u;
        this.f33827u = 5;
        this.f33828v = context;
        this.f33830x = pVar;
        this.f33831y = dVar;
        this.f33829w = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0203, code lost:
        if (r0 == false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x015e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015b A[Catch: Exception -> 0x019a, TryCatch #6 {Exception -> 0x019a, blocks: (B:28:0x0106, B:31:0x0116, B:32:0x012f, B:34:0x0135, B:36:0x0142, B:41:0x015b, B:43:0x0161, B:46:0x0168, B:49:0x0187, B:52:0x0192), top: B:126:0x0106 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        int i6 = this.f33827u;
        boolean z12 = false;
        Object obj = this.f33830x;
        Object obj2 = this.f33831y;
        Object obj3 = this.f33829w;
        Object obj4 = this.f33828v;
        switch (i6) {
            case 0:
                JSONObject viewData = (JSONObject) obj4;
                String buttonText = (String) obj3;
                g this$0 = (g) obj2;
                String pathID = (String) obj;
                if (!b6.a.b(g.class)) {
                    try {
                        i.g(viewData, "$viewData");
                        i.g(buttonText, "$buttonText");
                        i.g(this$0, "this$0");
                        i.g(pathID, "$pathID");
                        try {
                            e0 e0Var = e0.f36453a;
                            String m10 = e0.m(h5.p.a());
                            if (m10 != null) {
                                String lowerCase = m10.toLowerCase();
                                i.f(lowerCase, "(this as java.lang.String).toLowerCase()");
                                float[] a10 = a.a(viewData, lowerCase);
                                String c10 = a.c(buttonText, this$0.f33836x, lowerCase);
                                if (a10 != null) {
                                    r5.c cVar = r5.c.f30467a;
                                    String[] f = r5.c.f(c.a.MTML_APP_EVENT_PREDICTION, new float[][]{a10}, new String[]{c10});
                                    if (f != null) {
                                        String str = f[0];
                                        b.a(pathID, str);
                                        if (!i.b(str, "other")) {
                                            HashSet hashSet = g.f33832y;
                                            g.a.c(str, buttonText, a10);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        } catch (Exception unused) {
                            return;
                        }
                    } catch (Throwable th2) {
                        b6.a.a(g.class, th2);
                        return;
                    }
                }
                return;
            case 1:
                i7.b bVar = (i7.b) obj4;
                s sVar = (s) obj3;
                h hVar = (h) obj;
                n nVar = (n) obj2;
                Logger logger = i7.b.f;
                bVar.getClass();
                Logger logger2 = i7.b.f;
                try {
                    l a11 = bVar.f19900c.a(sVar.b());
                    if (a11 == null) {
                        String format = String.format("Transport backend '%s' is not registered", sVar.b());
                        logger2.warning(format);
                        hVar.b(new IllegalArgumentException(format));
                    } else {
                        bVar.f19902e.e(new i7.a(0, bVar, sVar, a11.b(nVar)));
                        hVar.b(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger2.warning("Error scheduling event " + e10.getMessage());
                    hVar.b(e10);
                    return;
                }
            case 2:
                he.n nVar2 = (he.n) obj4;
                ya.i iVar = (ya.i) obj3;
                Context context = (Context) obj;
                com.google.firebase.firestore.c cVar2 = (com.google.firebase.firestore.c) obj2;
                nVar2.getClass();
                try {
                    nVar2.a(context, (ge.e) k.a(iVar.f38392a), cVar2);
                    return;
                } catch (InterruptedException | ExecutionException e11) {
                    throw new RuntimeException(e11);
                }
            case 3:
                u isSyncSuccessful = (u) obj4;
                p instance = (p) obj3;
                Context context2 = (Context) obj;
                CountDownLatch countDownLatch = (CountDownLatch) obj2;
                ScheduledExecutorService scheduledExecutorService = yg.n.f38599a;
                i.g(isSyncSuccessful, "$isSyncSuccessful");
                i.g(instance, "$instance");
                i.g(context2, "$context");
                i.g(countDownLatch, "$countDownLatch");
                hh.a aVar = hh.g.f17610d;
                g.a.b(0, new c0(instance), 3);
                if (!isSyncSuccessful.f23466u) {
                    w.f29578a.getClass();
                    j e12 = w.e(instance);
                    p pVar = e12.f38580a;
                    try {
                        hh.g.b(pVar.f20105d, 0, new yg.k(e12), 3);
                        e12.f38582c.b(context2, w.a(context2, pVar).f31524g);
                        z10 = e12.c(context2);
                        break;
                    } catch (Throwable th3) {
                        hh.a aVar2 = hh.g.f17610d;
                        g.a.a(1, th3, new yg.l(e12));
                        z10 = false;
                        break;
                    }
                }
                z12 = true;
                isSyncSuccessful.f23466u = z12;
                countDownLatch.countDown();
                return;
            case 4:
                Context context3 = (Context) obj4;
                p sdkInstance = (p) obj3;
                ih.i event = (ih.i) obj;
                defpackage.e.t(obj2);
                i.g(context3, "$context");
                i.g(sdkInstance, "$sdkInstance");
                hh.g gVar = sdkInstance.f20105d;
                i.g(event, "$event");
                a2 a2Var = new a2(context3, sdkInstance);
                JSONObject jSONObject = event.f20089b;
                String str2 = event.f20088a;
                try {
                    hh.g.b(gVar, 0, new x1(a2Var), 3);
                    if (t1.b(context3, sdkInstance)) {
                        t1.j(context3, sdkInstance);
                        List<si.e> E = a2Var.f25137e.E(str2);
                        JSONObject a12 = xg.h.a(jSONObject);
                        a2Var.a(a12);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : E) {
                            si.e eVar = (si.e) obj5;
                            if (eVar.f31592d.f31578h != null) {
                                f0 f0Var = new f0(sdkInstance);
                                si.g gVar2 = eVar.f31592d.f31578h;
                                i.f(gVar2, "campaign.campaignMeta.trigger");
                                if (f0Var.a(gVar2, a12)) {
                                    z11 = true;
                                    if (!z11) {
                                        arrayList.add(obj5);
                                    }
                                }
                            }
                            z11 = false;
                            if (!z11) {
                            }
                        }
                        si.e c11 = a2Var.c(arrayList);
                        if (c11 != null) {
                            hh.g.b(sdkInstance.f20105d, 0, new y1(a2Var, c11), 3);
                            pi.d b10 = a2Var.b(c11, new s1.s(str2, sp.b.m(), xg.h.a(jSONObject)));
                            if (b10 != null && !i.b(b10.g(), "SELF_HANDLED")) {
                                a2Var.f25136d.f25200d.b(context3, c11, b10);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    gVar.a(1, e13, new z1(a2Var));
                    return;
                }
            case 5:
                Context context4 = (Context) obj4;
                p sdkInstance2 = (p) obj;
                ri.d updateType = (ri.d) obj2;
                String campaignId = (String) obj3;
                i.g(context4, "$context");
                i.g(sdkInstance2, "$sdkInstance");
                hh.g gVar3 = sdkInstance2.f20105d;
                i.g(updateType, "$updateType");
                i.g(campaignId, "$campaignId");
                m mVar = new m(context4, sdkInstance2, updateType, campaignId);
                try {
                    hh.g.b(gVar3, 0, new yi.j(mVar), 3);
                    long n10 = sp.b.n();
                    i1.f25206a.getClass();
                    o d10 = i1.d(context4, sdkInstance2);
                    pi.c g5 = d10.g(campaignId);
                    if (g5 != null) {
                        si.e g10 = df.b.g(g5);
                        si.a aVar3 = g10.f31592d;
                        d10.o(n10);
                        f8.g gVar4 = g10.f31593e;
                        f8.g gVar5 = new f8.g(gVar4.f14907b + 1, n10, gVar4.f14909d);
                        String str3 = aVar3.f31572a;
                        i.f(str3, "campaign.campaignMeta.campaignId");
                        int t3 = d10.f35208a.t(gVar5, str3);
                        d10.H();
                        hh.g.b(sdkInstance2.f20105d, 0, new yi.k(mVar, t3), 3);
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    gVar3.a(1, e14, new yi.l(mVar));
                    return;
                }
            case 6:
                ri.b lifecycleType = (ri.b) obj4;
                zi.a listener = (zi.a) obj3;
                aj.b data = (aj.b) obj;
                h1 this$02 = (h1) obj2;
                i.g(lifecycleType, "$lifecycleType");
                i.g(listener, "$listener");
                i.g(data, "$data");
                i.g(this$02, "this$0");
                try {
                    if (lifecycleType == ri.b.DISMISS) {
                        listener.b(data);
                    } else {
                        listener.a(data);
                    }
                    return;
                } catch (Exception e15) {
                    this$02.f25197a.f20105d.a(1, e15, new z0(this$02));
                    return;
                }
            case 7:
                fj.e this$03 = (fj.e) obj4;
                Context context5 = (Context) obj3;
                p sdkInstance3 = (p) obj;
                Bundle pushPayload = (Bundle) obj2;
                i.g(this$03, "this$0");
                i.g(context5, "$context");
                i.g(sdkInstance3, "$sdkInstance");
                i.g(pushPayload, "$pushPayload");
                this$03.e(context5, pushPayload, sdkInstance3);
                return;
            default:
                tj.a this$04 = (tj.a) obj4;
                String imageUrl = (String) obj3;
                vj.a fileManager = (vj.a) obj;
                int[] successCount = (int[]) obj2;
                i.g(this$04, "this$0");
                p pVar2 = this$04.f33043d;
                i.g(imageUrl, "$imageUrl");
                i.g(fileManager, "$fileManager");
                i.g(successCount, "$successCount");
                try {
                    hh.g.b(pVar2.f20105d, 0, new tj.f(this$04, imageUrl), 3);
                    Bitmap e16 = di.b.e(imageUrl);
                    if (e16 != null && fileManager.b(e16, this$04.f33042c.f22066a.f28527b, imageUrl)) {
                        hh.g.b(pVar2.f20105d, 0, new tj.g(this$04, imageUrl), 3);
                        successCount[0] = successCount[0] + 1;
                        return;
                    }
                    return;
                } catch (Throwable th4) {
                    pVar2.f20105d.a(1, th4, new tj.h(this$04));
                    return;
                }
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i6) {
        this.f33827u = i6;
        this.f33828v = obj;
        this.f33829w = obj2;
        this.f33830x = obj3;
        this.f33831y = obj4;
    }

    public /* synthetic */ f(JSONObject jSONObject, String str, g gVar, String str2) {
        this.f33827u = 0;
        this.f33828v = jSONObject;
        this.f33829w = str;
        this.f33831y = gVar;
        this.f33830x = str2;
    }
}
