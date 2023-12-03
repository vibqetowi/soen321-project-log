package com.theinnerhour.b2b.components.dashboard.experiment.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import androidx.appcompat.app.c;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.p000firebaseauthapi.qd;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import e.d;
import fl.w;
import java.util.LinkedHashMap;
import java.util.List;
import jl.u0;
import jl.u1;
import jl.w1;
import kc.f;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
import ss.l;
import ta.v;
import w5.i0;
/* compiled from: NotV4RecentActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/theinnerhour/b2b/components/dashboard/experiment/activity/NotV4RecentActivity;", "Landroidx/appcompat/app/c;", "Lcom/theinnerhour/b2b/persistence/SubscriptionPersistence$SubscriptionInitialiseListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class NotV4RecentActivity extends c implements SubscriptionPersistence.SubscriptionInitialiseListener {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public final String f10836v;

    /* renamed from: w  reason: collision with root package name */
    public w1 f10837w;

    /* renamed from: x  reason: collision with root package name */
    public SubscriptionModel f10838x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.activity.result.c<Intent> f10839y;

    /* renamed from: z  reason: collision with root package name */
    public qd f10840z;

    /* compiled from: NotV4RecentActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a extends k implements l<List<? extends NotV4RecentModel>, hs.k> {
        public a() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ss.l
        public final hs.k invoke(List<? extends NotV4RecentModel> list) {
            ProgressBar progressBar;
            RecyclerView.e eVar;
            RecyclerView.e eVar2;
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            RecyclerView recyclerView3;
            List<? extends NotV4RecentModel> list2 = list;
            if (list2 != null) {
                NotV4RecentActivity notV4RecentActivity = NotV4RecentActivity.this;
                qd qdVar = notV4RecentActivity.f10840z;
                gl.a aVar = null;
                RecyclerView recyclerView4 = null;
                if (qdVar != null) {
                    progressBar = (ProgressBar) qdVar.f8090x;
                } else {
                    progressBar = null;
                }
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                try {
                    qd qdVar2 = notV4RecentActivity.f10840z;
                    if (qdVar2 != null && (recyclerView3 = (RecyclerView) qdVar2.f8091y) != null) {
                        eVar = recyclerView3.getAdapter();
                    } else {
                        eVar = null;
                    }
                    if (eVar == null) {
                        qd qdVar3 = notV4RecentActivity.f10840z;
                        if (qdVar3 != null) {
                            recyclerView2 = (RecyclerView) qdVar3.f8091y;
                        } else {
                            recyclerView2 = null;
                        }
                        if (recyclerView2 != null) {
                            recyclerView2.setLayoutManager(new LinearLayoutManager(notV4RecentActivity, 1, false));
                        }
                        qd qdVar4 = notV4RecentActivity.f10840z;
                        if (qdVar4 != null) {
                            recyclerView4 = (RecyclerView) qdVar4.f8091y;
                        }
                        if (recyclerView4 != null) {
                            recyclerView4.setAdapter(new gl.a(list2, notV4RecentActivity, new w(notV4RecentActivity)));
                        }
                    } else {
                        qd qdVar5 = notV4RecentActivity.f10840z;
                        if (qdVar5 != null && (recyclerView = (RecyclerView) qdVar5.f8091y) != null) {
                            eVar2 = recyclerView.getAdapter();
                        } else {
                            eVar2 = null;
                        }
                        if (eVar2 instanceof gl.a) {
                            aVar = eVar2;
                        }
                        if (aVar != null) {
                            aVar.f16586x = list2;
                            aVar.i();
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(notV4RecentActivity.f10836v, e10);
                }
            }
            return hs.k.f19476a;
        }
    }

    public NotV4RecentActivity() {
        new LinkedHashMap();
        this.f10836v = LogHelper.INSTANCE.makeLogTag("NotV4RecentActivity");
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new d(), new am.w(14, this));
        i.f(registerForActivityResult, "registerForActivityResul…) initRecent(false)\n    }");
        this.f10839y = registerForActivityResult;
    }

    @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
    public final void initialiseComplete(boolean z10) {
        RecyclerView recyclerView;
        RecyclerView.e adapter;
        try {
            SubscriptionModel currentSubscriptionModel = SubscriptionPersistence.INSTANCE.getCurrentSubscriptionModel();
            String status = currentSubscriptionModel.getStatus();
            SubscriptionModel subscriptionModel = this.f10838x;
            if (subscriptionModel != null) {
                if (i.b(status, subscriptionModel.getStatus())) {
                    long expiryTime = currentSubscriptionModel.getExpiryTime();
                    SubscriptionModel subscriptionModel2 = this.f10838x;
                    if (subscriptionModel2 != null) {
                        if (expiryTime == subscriptionModel2.getExpiryTime()) {
                            String plan = currentSubscriptionModel.getPlan();
                            SubscriptionModel subscriptionModel3 = this.f10838x;
                            if (subscriptionModel3 != null) {
                                if (i.b(plan, subscriptionModel3.getPlan())) {
                                    this.f10838x = currentSubscriptionModel;
                                    return;
                                }
                            } else {
                                i.q("previousSubscriptionModel");
                                throw null;
                            }
                        }
                    } else {
                        i.q("previousSubscriptionModel");
                        throw null;
                    }
                }
                this.f10838x = currentSubscriptionModel;
                qd qdVar = this.f10840z;
                if (qdVar != null && (recyclerView = (RecyclerView) qdVar.f8091y) != null && (adapter = recyclerView.getAdapter()) != null) {
                    adapter.i();
                    return;
                }
                return;
            }
            i.q("previousSubscriptionModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10836v, e10);
        }
    }

    public final void n0(boolean z10) {
        try {
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            this.f10838x = subscriptionPersistence.previousSubscriptionModel();
            w1 w1Var = this.f10837w;
            ProgressBar progressBar = null;
            if (w1Var != null) {
                int i6 = 0;
                v.H(f.H(w1Var), null, 0, new u1(w1Var, null), 3);
                w1Var.getClass();
                qd qdVar = this.f10840z;
                if (qdVar != null) {
                    progressBar = (ProgressBar) qdVar.f8090x;
                }
                if (progressBar != null) {
                    if (!z10) {
                        i6 = 8;
                    }
                    progressBar.setVisibility(i6);
                }
                subscriptionPersistence.fetchData(this);
                return;
            }
            i.q("notv4RecentViewModel");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10836v, e10);
        }
    }

    public final void o0() {
        try {
            l0 a10 = new o0(this, new ok.c(new u0())).a(w1.class);
            ((androidx.lifecycle.w) ((w1) a10).f22383z.getValue()).e(this, new fl.k(4, new a()));
            w1 w1Var = (w1) a10;
            i.g(w1Var, "<set-?>");
            this.f10837w = w1Var;
            n0(true);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10836v, e10);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AppCompatImageView appCompatImageView;
        String str = this.f10836v;
        super.onCreate(bundle);
        try {
            qd b10 = qd.b(getLayoutInflater());
            this.f10840z = b10;
            setContentView(b10.a());
            try {
                Window window = getWindow();
                if (Build.VERSION.SDK_INT >= 23) {
                    new t0.u0(window.getDecorView(), window).a(true);
                }
                window.setStatusBarColor(g0.a.b(this, R.color.login_grey_background));
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str, "Error in setting custom status bar", e10);
            }
            o0();
            qd qdVar = this.f10840z;
            if (qdVar != null && (appCompatImageView = (AppCompatImageView) qdVar.f8089w) != null) {
                appCompatImageView.setOnClickListener(new i0(26, this));
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str, e11);
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        try {
            this.f10840z = null;
            SubscriptionPersistence.INSTANCE.removeSubscriptionInitialiseListener(this);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f10836v, e10);
        }
    }
}
