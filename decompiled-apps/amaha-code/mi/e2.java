package mi;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.moengage.inapp.internal.exceptions.ImageNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: ViewHandler.kt */
/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f25171a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25172b;

    /* renamed from: c  reason: collision with root package name */
    public f6.a f25173c;

    /* compiled from: ViewHandler.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ si.e f25175v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(si.e eVar) {
            super(0);
            this.f25175v = eVar;
        }

        @Override // ss.a
        public final String invoke() {
            return e2.this.f25172b + " buildAndShowInApp() : Could not create view for in-app campaign " + ((Object) this.f25175v.f31592d.f31572a) + ')';
        }
    }

    /* compiled from: ViewHandler.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" removeViewFromHierarchy() : ", e2.this.f25172b);
        }
    }

    public e2(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f25171a = sdkInstance;
        this.f25172b = "InApp_6.5.0_ViewHandler";
    }

    public final void a(Activity activity, RelativeLayout relativeLayout, pi.d dVar, boolean z10) {
        bh.b.f4298b.post(new b2(this, activity, relativeLayout, dVar, z10));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Context context, si.e eVar, pi.d dVar) {
        boolean z10;
        kotlin.jvm.internal.i.g(context, "context");
        RelativeLayout c10 = c(dVar, t1.e(context));
        ih.p pVar = this.f25171a;
        if (c10 == null) {
            hh.g.b(pVar.f20105d, 0, new a(eVar), 3);
            return;
        }
        i1.f25206a.getClass();
        c0 c11 = i1.c(pVar);
        boolean z11 = j1.f;
        hh.g gVar = pVar.f20105d;
        if (z11) {
            hh.g.b(gVar, 3, new g2(this, dVar), 2);
            c11.c(dVar, sp.b.m(), "IMP_ANTR_CMP_VISB");
        } else {
            f0 f0Var = new f0(pVar);
            is.y yVar = i1.a(pVar).f35174g;
            String c12 = j1.c();
            if (c12 == null) {
                c12 = "";
            }
            ri.a b10 = f0Var.b(eVar, yVar, c12, i1.d(context, pVar).x(), t1.d(context), di.b.q(context));
            if (b10 != ri.a.SUCCESS) {
                hh.g.b(gVar, 3, new h2(this), 2);
                String str = (String) d0.f25163b.get(b10);
                if (str != null) {
                    dVar.a();
                    c11.b(dVar.a(), sp.b.m(), str);
                }
            } else if (t1.f(context, c10)) {
                hh.g.b(gVar, 3, new i2(this), 2);
                c11.c(dVar, sp.b.m(), "IMP_HGT_EXD_DEVC");
            } else {
                z10 = true;
                if (!z10) {
                    hh.g.b(gVar, 0, new l2(this, dVar), 3);
                    Activity b11 = j1.b();
                    if (b11 != null) {
                        a(b11, c10, dVar, false);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (!z10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RelativeLayout c(pi.d dVar, i5.n nVar) {
        final vi.c cVar;
        String str;
        String str2;
        boolean z10;
        int i6;
        Activity b10 = j1.b();
        ih.p pVar = this.f25171a;
        if (b10 == null) {
            hh.g.b(pVar.f20105d, 0, new f2(this, dVar), 3);
            return null;
        }
        int d10 = v.h.d(dVar.e());
        if (d10 != 0) {
            if (d10 == 1) {
                final ni.x xVar = new ni.x(b10, pVar, (pi.m) dVar, nVar);
                pi.m mVar = xVar.f26363c;
                try {
                    hh.g gVar = pVar.f20105d;
                    gVar.a(5, null, new ss.a() { // from class: ni.o
                        @Override // ss.a
                        public final Object invoke() {
                            int i10 = r2;
                            x xVar2 = xVar;
                            switch (i10) {
                                case 0:
                                    return "InApp_6.5.0_ViewEngine createInApp() : Will try to create in-app view for campaign-id: " + xVar2.f26363c.f28493h;
                                default:
                                    return "InApp_6.5.0_ViewEngine createInApp() : Device Dimensions: " + xVar2.f + " Status Bar height: " + xVar2.f26367h;
                            }
                        }
                    });
                    gVar.a(5, null, new ss.a() { // from class: ni.o
                        @Override // ss.a
                        public final Object invoke() {
                            int i10 = r2;
                            x xVar2 = xVar;
                            switch (i10) {
                                case 0:
                                    return "InApp_6.5.0_ViewEngine createInApp() : Will try to create in-app view for campaign-id: " + xVar2.f26363c.f28493h;
                                default:
                                    return "InApp_6.5.0_ViewEngine createInApp() : Device Dimensions: " + xVar2.f + " Status Bar height: " + xVar2.f26367h;
                            }
                        }
                    });
                    RelativeLayout e10 = xVar.e(mVar.f28500o);
                    xVar.f26371l = e10;
                    xVar.j(e10);
                    gVar.a(5, null, new xg.i(25));
                    pi.a aVar = ((ui.c) mVar.f28500o.f28480c).f34169h;
                    if (aVar != null && (i6 = aVar.f28441a) != -1) {
                        Animation loadAnimation = AnimationUtils.loadAnimation(xVar.f26364d, i6);
                        loadAnimation.setFillAfter(true);
                        xVar.f26371l.setAnimation(loadAnimation);
                    }
                    xVar.f26371l.setClickable(true);
                    return xVar.f26371l;
                } catch (Exception e11) {
                    pVar.f20105d.a(1, e11, new xg.i(26));
                    if (e11 instanceof UnsupportedOperationException) {
                        ni.a.a(mVar, "IMP_GIF_LIB_MIS", pVar);
                        return null;
                    } else if (!(e11 instanceof ImageNotFoundException)) {
                        return null;
                    } else {
                        ni.a.a(mVar, "IMP_IMG_FTH_FLR", pVar);
                        return null;
                    }
                }
            }
            throw new NoWhenBranchMatchedException();
        }
        ni.n nVar2 = new ni.n(b10, pVar, (pi.h) dVar, nVar);
        ih.p pVar2 = nVar2.f26340c;
        hh.g.b(pVar2.f20105d, 0, new ni.d(nVar2), 3);
        ni.e eVar = new ni.e(nVar2);
        hh.g gVar2 = pVar2.f20105d;
        hh.g.b(gVar2, 0, eVar, 3);
        Context applicationContext = b10.getApplicationContext();
        kotlin.jvm.internal.i.f(applicationContext, "activity.applicationContext");
        if (!di.b.c(applicationContext)) {
            hh.g.b(gVar2, 0, new ni.f(nVar2), 3);
            return null;
        }
        pi.h hVar = nVar2.f26341d;
        androidx.lifecycle.v vVar = hVar.f28478p;
        final String campaignId = hVar.f28470h;
        String str3 = "campaignId";
        if (vVar == null) {
            str = "campaignId";
            str2 = campaignId;
        } else {
            vi.c cVar2 = new vi.c(b10, pVar2);
            kotlin.jvm.internal.i.g(campaignId, "campaignId");
            Map assets = vVar.f2470a;
            kotlin.jvm.internal.i.g(assets, "assets");
            ih.p pVar3 = cVar2.f35183a;
            hh.g.b(pVar3.f20105d, 0, new vi.g(cVar2, campaignId), 3);
            final int[] iArr = {0};
            try {
                final CountDownLatch countDownLatch = new CountDownLatch(assets.size());
                ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(assets.size(), 5));
                for (Map.Entry entry : assets.entrySet()) {
                    final String str4 = (String) entry.getKey();
                    final String str5 = (String) entry.getValue();
                    cVar = cVar2;
                    str = str3;
                    str2 = campaignId;
                    try {
                        newFixedThreadPool.submit(new Runnable() { // from class: vi.b
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z11;
                                boolean z12;
                                c this$0 = c.this;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                String campaignId2 = campaignId;
                                kotlin.jvm.internal.i.g(campaignId2, "$campaignId");
                                String key = str4;
                                kotlin.jvm.internal.i.g(key, "$key");
                                String value = str5;
                                kotlin.jvm.internal.i.g(value, "$value");
                                int[] successCount = iArr;
                                kotlin.jvm.internal.i.g(successCount, "$successCount");
                                CountDownLatch countDownLatch2 = countDownLatch;
                                kotlin.jvm.internal.i.g(countDownLatch2, "$countDownLatch");
                                ai.d dVar2 = this$0.f35185c;
                                ih.p pVar4 = this$0.f35183a;
                                try {
                                    String substring = key.substring(gv.r.R0(key, "/", 0, 6) + 1);
                                    kotlin.jvm.internal.i.f(substring, "this as java.lang.String).substring(startIndex)");
                                    String F0 = gv.n.F0(key, substring, "");
                                    if (F0.length() > 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z12) {
                                        F0 = campaignId2 + "/html/" + F0;
                                    }
                                    if (dVar2.e(F0, substring)) {
                                        hh.g.b(pVar4.f20105d, 0, new d(this$0, key), 3);
                                        z11 = true;
                                    } else {
                                        InputStream inputStream = FirebasePerfUrlConnection.openStream(new URL(value));
                                        kotlin.jvm.internal.i.f(inputStream, "inputStream");
                                        if (dVar2.g(F0, substring, inputStream) != null) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        hh.g.b(pVar4.f20105d, 0, new e(this$0, z11, key, value), 3);
                                        inputStream.close();
                                    }
                                } catch (Exception e12) {
                                    pVar4.f20105d.a(1, e12, new f(this$0));
                                    z11 = false;
                                }
                                if (z11) {
                                    successCount[0] = successCount[0] + 1;
                                }
                                countDownLatch2.countDown();
                            }
                        });
                        cVar2 = cVar;
                        str3 = str;
                        campaignId = str2;
                    } catch (Exception e12) {
                        e = e12;
                        pVar3.f20105d.a(1, e, new vi.h(cVar));
                        if (iArr[0] != assets.size()) {
                        }
                        z10 = true;
                        if (z10) {
                        }
                        return nVar2.f;
                    }
                }
                cVar = cVar2;
                str = str3;
                str2 = campaignId;
                countDownLatch.await();
                newFixedThreadPool.shutdown();
            } catch (Exception e13) {
                e = e13;
                cVar = cVar2;
                str = str3;
                str2 = campaignId;
            }
            if (iArr[0] != assets.size()) {
                ni.a.a(nVar2.f26319b, "IMP_FILE_DWNLD_FLR", pVar2);
                hh.g.b(gVar2, 1, new ni.g(nVar2), 2);
                z10 = false;
                if (z10) {
                    RelativeLayout relativeLayout = new RelativeLayout(b10);
                    relativeLayout.setId(20001);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(nVar2.f26344h.f17480b, -1);
                    layoutParams.setMargins(0, nVar2.f26343g, 0, 0);
                    relativeLayout.setLayoutParams(layoutParams);
                    ai.d dVar2 = new ai.d(b10, pVar2);
                    String str6 = str2;
                    kotlin.jvm.internal.i.g(str6, str);
                    b10.runOnUiThread(new ni.c(0, nVar2, dVar2.f(kotlin.jvm.internal.i.n("/html", str6), ""), relativeLayout));
                    relativeLayout.setClickable(true);
                    relativeLayout.setFocusable(true);
                    relativeLayout.setFocusableInTouchMode(true);
                    relativeLayout.requestFocus();
                    relativeLayout.setOnFocusChangeListener(new dc.b(2, nVar2));
                    relativeLayout.setOnKeyListener(new ni.b(nVar2, 0));
                    nVar2.f = relativeLayout;
                }
                return nVar2.f;
            }
        }
        z10 = true;
        if (z10) {
        }
        return nVar2.f;
    }

    public final void d(pi.d campaignPayload) {
        a0 a0Var;
        kotlin.jvm.internal.i.g(campaignPayload, "campaignPayload");
        j1.e(false);
        a0 a0Var2 = a0.f25129c;
        if (a0Var2 == null) {
            synchronized (a0.class) {
                a0Var = a0.f25129c;
                if (a0Var == null) {
                    a0Var = new a0();
                }
                a0.f25129c = a0Var;
            }
            a0Var2 = a0Var;
        }
        a0Var2.f25131b.f30640c = null;
        i1 i1Var = i1.f25206a;
        ih.p pVar = this.f25171a;
        i1Var.getClass();
        i1.a(pVar).f.remove(campaignPayload.b());
        i1.b(this.f25171a).a(campaignPayload, ri.b.DISMISS);
    }

    public final void e(Context context, View inAppView, pi.d campaignPayload) {
        int i6;
        kotlin.jvm.internal.i.g(inAppView, "inAppView");
        kotlin.jvm.internal.i.g(campaignPayload, "campaignPayload");
        try {
            if (campaignPayload.e() == 2) {
                pi.i iVar = ((pi.m) campaignPayload).f28500o;
                if (iVar == null) {
                    return;
                }
                ui.e eVar = iVar.f28480c;
                if (eVar != null) {
                    pi.a aVar = ((ui.c) eVar).f34169h;
                    if (aVar != null && (i6 = aVar.f28442b) != -1) {
                        inAppView.setAnimation(AnimationUtils.loadAnimation(context, i6));
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.moengage.inapp.internal.model.style.ContainerStyle");
                }
            }
            ViewParent parent = inAppView.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(inAppView);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        } catch (Exception e10) {
            this.f25171a.f20105d.a(1, e10, new b());
        }
    }
}
