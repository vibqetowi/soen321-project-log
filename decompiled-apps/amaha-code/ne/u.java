package ne;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.service.notification.StatusBarNotification;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.moengage.core.internal.exception.NetworkRequestDisabledException;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.experiment.activity.SuggestedActivityDetailsActivity;
import com.theinnerhour.b2b.components.journal.activity.JournalActivity;
import com.theinnerhour.b2b.components.logs.model.LogModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import gl.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.Callable;
import lf.m;
import mi.e2;
import mi.i1;
import mi.j1;
import mi.k2;
import mi.t1;
import ne.f;
import zm.f;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f26269u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f26270v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f26271w;

    public /* synthetic */ u(Object obj, int i6, Object obj2) {
        this.f26269u = i6;
        this.f26270v = obj;
        this.f26271w = obj2;
    }

    private final void a() {
        StatusBarNotification[] activeNotifications;
        StatusBarNotification statusBarNotification;
        boolean z10;
        fj.e eVar;
        boolean z11;
        ih.p instance = (ih.p) this.f26270v;
        sj.m this$0 = (sj.m) this.f26271w;
        kotlin.jvm.internal.i.g(instance, "$instance");
        kotlin.jvm.internal.i.g(this$0, "this$0");
        hh.g.b(instance.f20105d, 0, new sj.h(this$0), 3);
        String str = this$0.f31618b;
        if (kotlin.jvm.internal.i.b(str, "action_progress_update")) {
            Context context = this$0.f31617a;
            Bundle bundle = this$0.f31619c;
            hh.g.b(instance.f20105d, 0, new sj.j(this$0), 3);
            int i6 = bundle.getInt("MOE_NOTIFICATION_ID");
            Bundle a10 = sj.m.a(context, instance, bundle.getString("gcm_campaign_id"));
            if (a10 != null) {
                Object systemService = context.getSystemService("notification");
                if (systemService != null) {
                    activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
                    kotlin.jvm.internal.i.f(activeNotifications, "notificationManager.activeNotifications");
                    int length = activeNotifications.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            statusBarNotification = activeNotifications[i10];
                            i10++;
                            if (statusBarNotification.getId() == i6) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (z11) {
                                break;
                            }
                        } else {
                            statusBarNotification = null;
                            break;
                        }
                    }
                    if (statusBarNotification != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        hh.g.b(instance.f20105d, 0, new sj.k(this$0, i6), 3);
                        sj.q.a(context, bundle, instance);
                        return;
                    }
                    a10.putBoolean("moe_re_notify", true);
                    fj.e eVar2 = fj.e.f15075b;
                    if (eVar2 == null) {
                        synchronized (fj.e.class) {
                            eVar = fj.e.f15075b;
                            if (eVar == null) {
                                eVar = new fj.e();
                            }
                            fj.e.f15075b = eVar;
                        }
                        eVar2 = eVar;
                    }
                    eVar2.d(context, a10);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            }
        } else if (kotlin.jvm.internal.i.b(str, "action_timer_on_expiry")) {
            this$0.b(this$0.f31617a, this$0.f31619c, instance);
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView.e eVar;
        zm.f fVar;
        f.b v10;
        NestedScrollView nestedScrollView;
        View childAt;
        mi.a0 a0Var;
        HorizontalScrollView horizontalScrollView;
        RecyclerView.e eVar2;
        gl.e eVar3;
        e.a w10;
        yp.i iVar;
        NestedScrollView nestedScrollView2;
        RecyclerView recyclerView;
        View childAt2;
        RecyclerView recyclerView2;
        NestedScrollView nestedScrollView3;
        NestedScrollView nestedScrollView4;
        float f = 25.0f;
        Float f2 = null;
        switch (this.f26269u) {
            case 0:
                x xVar = (x) this.f26270v;
                f.a aVar = (f.a) this.f26271w;
                xVar.getClass();
                boolean equals = aVar.equals(f.a.REACHABLE);
                s sVar = xVar.f26277d;
                if (!equals || !sVar.f26262a.equals(he.w.ONLINE)) {
                    if ((!aVar.equals(f.a.UNREACHABLE) || !sVar.f26262a.equals(he.w.OFFLINE)) && xVar.f26278e) {
                        kc.f.A(1, "RemoteStore", "Restarting streams for network reachability change.", new Object[0]);
                        xVar.d();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ya.i iVar2 = (ya.i) this.f26270v;
                try {
                    iVar2.b(((Callable) this.f26271w).call());
                    return;
                } catch (Exception e10) {
                    iVar2.a(e10);
                    throw new RuntimeException(e10);
                }
            case 2:
                oe.c cVar = (oe.c) this.f26270v;
                cVar.getClass();
                ((Runnable) this.f26271w).run();
                cVar.f27401u.release();
                return;
            case 3:
                oe.h hVar = (oe.h) this.f26270v;
                hVar.getClass();
                hVar.f27428g = new Date().getTime();
                ((Runnable) this.f26271w).run();
                return;
            case 4:
                oe.m mVar = (oe.m) this.f26270v;
                mVar.getClass();
                ((Runnable) this.f26271w).run();
                mVar.f27431v.release();
                return;
            case 5:
                ((com.google.firebase.messaging.l) this.f26270v).getClass();
                com.google.firebase.messaging.l.a((Intent) this.f26271w);
                return;
            case 6:
                com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) this.f26270v;
                ya.i iVar3 = (ya.i) this.f26271w;
                sVar2.getClass();
                try {
                    iVar3.b(sVar2.a());
                    return;
                } catch (Exception e11) {
                    iVar3.a(e11);
                    return;
                }
            case 7:
                bf.v vVar = (bf.v) this.f26270v;
                Context context = (Context) this.f26271w;
                if (vVar.f4278a == null && context != null) {
                    vVar.f4278a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                    return;
                }
                return;
            case 8:
                AppStartTrace appStartTrace = (AppStartTrace) this.f26270v;
                kf.i iVar4 = AppStartTrace.Q;
                appStartTrace.getClass();
                appStartTrace.f9791v.c(((m.a) this.f26271w).r(), lf.d.FOREGROUND_BACKGROUND);
                return;
            case 9:
                jf.e eVar4 = (jf.e) this.f26270v;
                jf.b bVar = (jf.b) this.f26271w;
                df.a aVar2 = jf.e.L;
                eVar4.getClass();
                eVar4.d(bVar.f21985a, bVar.f21986b);
                return;
            case 10:
                Context context2 = (Context) this.f26270v;
                qg.d this$0 = (qg.d) this.f26271w;
                kotlin.jvm.internal.i.g(context2, "$context");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                qg.w wVar = qg.w.f29578a;
                ih.p pVar = this$0.f29536a;
                wVar.getClass();
                qg.w.f(context2, pVar).u();
                return;
            case 11:
                sg.a this$02 = (sg.a) this.f26270v;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                this$02.d((jh.a) this.f26271w);
                return;
            case 12:
                vg.d this$03 = (vg.d) this.f26270v;
                Context context3 = (Context) this.f26271w;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(context3, "$context");
                ih.p sdkInstance = this$03.f35081a;
                kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
                try {
                    if (gv.n.B0(sdkInstance.f20103b.f12855a)) {
                        hh.g.b(sdkInstance.f20105d, 0, new vg.a(this$03), 3);
                    } else {
                        qg.w.f29578a.getClass();
                        this$03.b(context3, qg.w.f(context3, sdkInstance).j0());
                    }
                    return;
                } catch (Throwable th2) {
                    if (th2 instanceof NetworkRequestDisabledException) {
                        hh.g.b(sdkInstance.f20105d, 1, new vg.b(this$03), 2);
                        return;
                    } else {
                        sdkInstance.f20105d.a(1, th2, new vg.c(this$03));
                        return;
                    }
                }
            case 13:
                hh.h this$04 = (hh.h) this.f26270v;
                List<nh.a> logs = (List) this.f26271w;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                kotlin.jvm.internal.i.g(logs, "$logs");
                try {
                    qg.w wVar2 = qg.w.f29578a;
                    Context context4 = this$04.f17614a;
                    ih.p pVar2 = this$04.f17615b;
                    wVar2.getClass();
                    qg.w.f(context4, pVar2).k0(logs);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 14:
                Activity activity = (Activity) this.f26270v;
                ih.p sdkInstance2 = (ih.p) this.f26271w;
                kotlin.jvm.internal.i.g(activity, "$activity");
                kotlin.jvm.internal.i.g(sdkInstance2, "$sdkInstance");
                mi.a0 a0Var2 = mi.a0.f25129c;
                if (a0Var2 == null) {
                    synchronized (mi.a0.class) {
                        a0Var = mi.a0.f25129c;
                        if (a0Var == null) {
                            a0Var = new mi.a0();
                        }
                        mi.a0.f25129c = a0Var;
                    }
                    a0Var2 = a0Var;
                }
                r9.o oVar = a0Var2.f25131b;
                hh.g.b(sdkInstance2.f20105d, 0, new mi.v(a0Var2), 3);
                try {
                    pi.d dVar = (pi.d) oVar.f30640c;
                    if (dVar != null) {
                        i1.f25206a.getClass();
                        e2 e2Var = i1.b(sdkInstance2).f25200d;
                        String campaignId = dVar.b();
                        e2Var.getClass();
                        kotlin.jvm.internal.i.g(campaignId, "campaignId");
                        hh.g.b(e2Var.f25171a.f20105d, 0, new k2(e2Var, campaignId), 3);
                        f6.a aVar3 = e2Var.f25173c;
                        if (aVar3 != null) {
                            bh.b.f4298b.removeCallbacks(aVar3);
                        }
                        if (!t1.c(oVar.f30639b, dVar.f())) {
                            hh.g.b(sdkInstance2.f20105d, 0, new mi.w(a0Var2, dVar), 3);
                            j1.e(false);
                            a0Var2.f25131b.f30640c = null;
                            return;
                        }
                        e2 e2Var2 = i1.b(sdkInstance2).f25200d;
                        Context applicationContext = activity.getApplicationContext();
                        kotlin.jvm.internal.i.f(applicationContext, "activity.applicationContext");
                        RelativeLayout c10 = e2Var2.c(dVar, t1.e(applicationContext));
                        if (c10 != null && kotlin.jvm.internal.i.b(activity.getClass().getName(), j1.c())) {
                            i1.b(sdkInstance2).f25200d.a(activity, c10, dVar, true);
                            return;
                        }
                        j1.e(false);
                        a0Var2.f25131b.f30640c = null;
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    sdkInstance2.f20105d.a(1, e12, new mi.x(a0Var2));
                    return;
                }
            case 15:
                a();
                return;
            case 16:
                ik.k this$05 = (ik.k) this.f26270v;
                RecyclerView this_apply = (RecyclerView) this.f26271w;
                int i6 = ik.k.f20213y;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                try {
                    if (this$05.isAdded()) {
                        this_apply.h0(5000);
                        this_apply.k0(10, 0, false);
                        Timer timer = new Timer();
                        this$05.f20215v = timer;
                        timer.scheduleAtFixedRate(new ik.i(this$05), 5000L, 5000L);
                        this_apply.h(new ik.j(this$05));
                        return;
                    }
                    return;
                } catch (Exception e13) {
                    LogHelper.INSTANCE.e(this$05.f20214u, e13);
                    return;
                }
            case 17:
                bl.i this$06 = (bl.i) this.f26270v;
                View view = (View) this.f26271w;
                int i10 = bl.i.f4356f0;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                kotlin.jvm.internal.i.g(view, "$view");
                if (this$06.isAdded()) {
                    Drawable background = view.getBackground();
                    if (background instanceof RippleDrawable) {
                        background.setHotspot(0.0f, 0.0f);
                        ((RippleDrawable) background).setState(new int[]{16842919, 16842910});
                        new Handler().postDelayed(new u(this$06, 18, background), 150L);
                        return;
                    }
                    return;
                }
                return;
            case 18:
                bl.i this$07 = (bl.i) this.f26270v;
                Drawable drawable = (Drawable) this.f26271w;
                int i11 = bl.i.f4356f0;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                if (this$07.isAdded()) {
                    drawable.setState(new int[0]);
                    return;
                }
                return;
            case 19:
                bl.p this$08 = (bl.p) this.f26270v;
                View view2 = (View) this.f26271w;
                int i12 = bl.p.f4381k0;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                kotlin.jvm.internal.i.g(view2, "$view");
                if (this$08.isAdded()) {
                    Drawable background2 = view2.getBackground();
                    if (background2 instanceof RippleDrawable) {
                        background2.setHotspot(0.0f, 0.0f);
                        ((RippleDrawable) background2).setState(new int[]{16842919, 16842910});
                        new Handler().postDelayed(new u(this$08, 20, background2), 150L);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                bl.p this$09 = (bl.p) this.f26270v;
                Drawable drawable2 = (Drawable) this.f26271w;
                int i13 = bl.p.f4381k0;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                if (this$09.isAdded()) {
                    drawable2.setState(new int[0]);
                    return;
                }
                return;
            case 21:
                RecyclerView this_apply2 = (RecyclerView) this.f26270v;
                V3DashboardActivity this$010 = (V3DashboardActivity) this.f26271w;
                int i14 = V3DashboardActivity.f10714r1;
                kotlin.jvm.internal.i.g(this_apply2, "$this_apply");
                kotlin.jvm.internal.i.g(this$010, "this$0");
                try {
                    this_apply2.h0(1);
                    this_apply2.k0(10, 0, false);
                    return;
                } catch (Exception e14) {
                    LogHelper.INSTANCE.e(this$010.f10748v, e14);
                    return;
                }
            case 22:
                SuggestedActivityDetailsActivity this$011 = (SuggestedActivityDetailsActivity) this.f26270v;
                Chip it = (Chip) this.f26271w;
                int i15 = SuggestedActivityDetailsActivity.Q;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                kotlin.jvm.internal.i.g(it, "$it");
                try {
                    int i16 = Resources.getSystem().getDisplayMetrics().widthPixels;
                    Rect rect = new Rect();
                    it.getGlobalVisibleRect(rect);
                    Rect rect2 = new Rect();
                    it.getDrawingRect(rect2);
                    yp.i iVar5 = this$011.P;
                    if (iVar5 != null && (horizontalScrollView = iVar5.f) != null) {
                        horizontalScrollView.smoothScrollBy(rect.right - (i16 - rect2.left), 0);
                        return;
                    }
                    return;
                } catch (Exception e15) {
                    LogHelper.INSTANCE.e(this$011.f10842w, e15);
                    return;
                }
            case 23:
                SuggestedActivityDetailsActivity this$012 = (SuggestedActivityDetailsActivity) this.f26270v;
                String it2 = (String) this.f26271w;
                int i17 = SuggestedActivityDetailsActivity.Q;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                kotlin.jvm.internal.i.g(it2, "$it");
                try {
                    if (!this$012.isFinishing()) {
                        yp.i iVar6 = this$012.P;
                        if (iVar6 != null && (recyclerView2 = iVar6.f38815k) != null) {
                            eVar2 = recyclerView2.getAdapter();
                        } else {
                            eVar2 = null;
                        }
                        if (eVar2 instanceof gl.e) {
                            eVar3 = (gl.e) eVar2;
                        } else {
                            eVar3 = null;
                        }
                        if (eVar3 != null && (w10 = eVar3.w(it2)) != null) {
                            yp.i iVar7 = this$012.P;
                            if (iVar7 != null && (recyclerView = iVar7.f38815k) != null && (childAt2 = recyclerView.getChildAt(w10.f16605a)) != null) {
                                float y10 = childAt2.getY();
                                if (w10.f16606b) {
                                    f = 50.0f;
                                }
                                f2 = Float.valueOf(y10 + f);
                            }
                            if (f2 != null && (iVar = this$012.P) != null && (nestedScrollView2 = iVar.f38814j) != null) {
                                nestedScrollView2.post(new u(this$012, 24, f2));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e16) {
                    LogHelper.INSTANCE.e(this$012.f10842w, e16);
                    return;
                }
            case 24:
                SuggestedActivityDetailsActivity this$013 = (SuggestedActivityDetailsActivity) this.f26270v;
                Float f10 = (Float) this.f26271w;
                int i18 = SuggestedActivityDetailsActivity.Q;
                kotlin.jvm.internal.i.g(this$013, "this$0");
                try {
                    yp.i iVar8 = this$013.P;
                    if (iVar8 != null && (nestedScrollView4 = iVar8.f38814j) != null) {
                        nestedScrollView4.fling(0);
                    }
                    yp.i iVar9 = this$013.P;
                    if (iVar9 != null && (nestedScrollView3 = iVar9.f38814j) != null) {
                        nestedScrollView3.smoothScrollTo(0, (int) f10.floatValue());
                        return;
                    }
                    return;
                } catch (Exception e17) {
                    LogHelper.INSTANCE.e(this$013.f10842w, e17);
                    return;
                }
            case 25:
                RecyclerView this_apply3 = (RecyclerView) this.f26270v;
                hl.s this$014 = (hl.s) this.f26271w;
                int i19 = hl.s.f17728g0;
                kotlin.jvm.internal.i.g(this_apply3, "$this_apply");
                kotlin.jvm.internal.i.g(this$014, "this$0");
                try {
                    this_apply3.h0(1);
                    this_apply3.k0(10, 0, false);
                    return;
                } catch (Exception e18) {
                    LogHelper.INSTANCE.e(this$014.f17733u, e18);
                    return;
                }
            case 26:
                JournalActivity this$015 = (JournalActivity) this.f26270v;
                hs.f notificationStatus = (hs.f) this.f26271w;
                int i20 = JournalActivity.D;
                kotlin.jvm.internal.i.g(this$015, "this$0");
                kotlin.jvm.internal.i.g(notificationStatus, "$notificationStatus");
                try {
                    if (this$015.f11214y) {
                        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("journal", notificationStatus, "journal", this$015.f11215z, new JournalActivity.a(xVar2));
                        xVar2.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$015.getSupportFragmentManager(), "permission");
                        return;
                    }
                    return;
                } catch (Exception e19) {
                    LogHelper.INSTANCE.e(this$015.f11211v, e19);
                    return;
                }
            case 27:
                an.f this$016 = (an.f) this.f26270v;
                kotlin.jvm.internal.x filterStr = (kotlin.jvm.internal.x) this.f26271w;
                int i21 = an.f.C;
                kotlin.jvm.internal.i.g(this$016, "this$0");
                kotlin.jvm.internal.i.g(filterStr, "$filterStr");
                ArrayList<LogModel> arrayList = kn.a.f23436a;
                View findViewWithTag = ((ChipGroup) this$016._$_findCachedViewById(R.id.cgResourcesFilters)).findViewWithTag(kn.a.j((String) filterStr.f23469u));
                kotlin.jvm.internal.i.f(findViewWithTag, "cgResourcesFilters.findV…eSpecificName(filterStr))");
                Chip chip = (Chip) findViewWithTag;
                ((ChipGroup) this$016._$_findCachedViewById(R.id.cgResourcesFilters)).b(chip.getId());
                ((HorizontalScrollView) this$016._$_findCachedViewById(R.id.hsvResourcesFilterContainer)).smoothScrollTo(chip.getLeft() - (((ChipGroup) this$016._$_findCachedViewById(R.id.cgResourcesFilters)).getPaddingLeft() + chip.getPaddingLeft()), chip.getTop());
                return;
            case 28:
                an.h this$017 = (an.h) this.f26270v;
                kotlin.jvm.internal.x filterStr2 = (kotlin.jvm.internal.x) this.f26271w;
                int i22 = an.h.F;
                kotlin.jvm.internal.i.g(this$017, "this$0");
                kotlin.jvm.internal.i.g(filterStr2, "$filterStr");
                View findViewWithTag2 = ((ChipGroup) this$017._$_findCachedViewById(R.id.cgShortCoursesFilters)).findViewWithTag(filterStr2.f23469u);
                kotlin.jvm.internal.i.f(findViewWithTag2, "cgShortCoursesFilters.findViewWithTag(filterStr)");
                Chip chip2 = (Chip) findViewWithTag2;
                ((ChipGroup) this$017._$_findCachedViewById(R.id.cgShortCoursesFilters)).b(chip2.getId());
                ((HorizontalScrollView) this$017._$_findCachedViewById(R.id.hsvShortCoursesDBFilterContainer)).smoothScrollTo(chip2.getLeft() - (((ChipGroup) this$017._$_findCachedViewById(R.id.cgShortCoursesFilters)).getPaddingLeft() + chip2.getPaddingLeft()), chip2.getTop());
                return;
            default:
                an.n this$018 = (an.n) this.f26270v;
                String it3 = (String) this.f26271w;
                int i23 = an.n.I;
                kotlin.jvm.internal.i.g(this$018, "this$0");
                kotlin.jvm.internal.i.g(it3, "$it");
                try {
                    RecyclerView recyclerView3 = (RecyclerView) this$018._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                    if (recyclerView3 != null) {
                        eVar = recyclerView3.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar instanceof zm.f) {
                        fVar = (zm.f) eVar;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null && (v10 = fVar.v(it3)) != null) {
                        RecyclerView recyclerView4 = (RecyclerView) this$018._$_findCachedViewById(R.id.rvCollectionActivitiesRecycler);
                        if (recyclerView4 != null && (childAt = recyclerView4.getChildAt(v10.f39646a)) != null) {
                            float y11 = childAt.getY();
                            if (!v10.f39648c) {
                                f = 0.0f;
                            }
                            f2 = Float.valueOf(y11 + f);
                        }
                        if (f2 != null && (nestedScrollView = (NestedScrollView) this$018._$_findCachedViewById(R.id.nsvAcScrollContainer)) != null) {
                            nestedScrollView.post(new ni.c(10, this$018, f2, v10));
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e20) {
                    LogHelper.INSTANCE.e(this$018.f744u, e20);
                    return;
                }
        }
    }
}
