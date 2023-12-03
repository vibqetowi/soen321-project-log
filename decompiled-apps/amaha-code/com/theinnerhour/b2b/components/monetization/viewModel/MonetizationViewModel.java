package com.theinnerhour.b2b.components.monetization.viewModel;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.assetDownloader.CampaignAssetDownloadJobScheduler;
import com.theinnerhour.b2b.components.monetization.models.CampaignModel;
import com.theinnerhour.b2b.model.OfflineAsset;
import com.theinnerhour.b2b.model.SkuModel;
import com.theinnerhour.b2b.model.SubscriptionModel;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.ConnectionStatusReceiver;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.PaymentUtils;
import gv.r;
import is.u;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import org.json.JSONObject;
import ss.p;
import ta.v;
/* compiled from: MonetizationViewModel.kt */
/* loaded from: classes2.dex */
public final class MonetizationViewModel extends androidx.lifecycle.b {
    public final String A;
    public CampaignModel B;
    public final w<Boolean> C;
    public final w<Boolean> D;
    public boolean E;
    public String F;
    public final ArrayList<String> G;
    public JobInfo.Builder H;
    public JobScheduler I;
    public int J;
    public int K;
    public boolean L;
    public boolean M;
    public ArrayList<CampaignModel> N;
    public SubscriptionModel O;
    public final boolean P;
    public final hs.i Q;
    public final hs.i R;
    public final hs.i S;
    public final hs.i T;
    public final hs.i U;
    public final hs.i V;
    public final hs.i W;
    public String X;
    public String Y;
    public SkuModel Z;

    /* renamed from: a0  reason: collision with root package name */
    public JSONObject f11451a0;

    /* renamed from: b0  reason: collision with root package name */
    public final hs.i f11452b0;
    public final hs.i c0;

    /* renamed from: d0  reason: collision with root package name */
    public final e f11453d0;
    public final b e0;

    /* renamed from: y  reason: collision with root package name */
    public final String f11454y;

    /* renamed from: z  reason: collision with root package name */
    public final qn.c f11455z;

    /* compiled from: MonetizationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$addSKUToList$2", f = "MonetizationViewModel.kt", l = {238}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11456u;

        /* compiled from: MonetizationViewModel.kt */
        @ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$addSKUToList$2$1", f = "MonetizationViewModel.kt", l = {239}, m = "invokeSuspend")
        /* renamed from: com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0166a extends ns.i implements p<d0, ls.d<? super List<? extends c4.h>>, Object> {

            /* renamed from: u  reason: collision with root package name */
            public int f11458u;

            /* renamed from: v  reason: collision with root package name */
            public final /* synthetic */ MonetizationViewModel f11459v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0166a(MonetizationViewModel monetizationViewModel, ls.d<? super C0166a> dVar) {
                super(2, dVar);
                this.f11459v = monetizationViewModel;
            }

            @Override // ns.a
            public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
                return new C0166a(this.f11459v, dVar);
            }

            @Override // ss.p
            public final Object invoke(d0 d0Var, ls.d<? super List<? extends c4.h>> dVar) {
                return ((C0166a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
            }

            @Override // ns.a
            public final Object invokeSuspend(Object obj) {
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                int i6 = this.f11458u;
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    MonetizationViewModel monetizationViewModel = this.f11459v;
                    qn.c cVar = monetizationViewModel.f11455z;
                    ArrayList<String> arrayList = monetizationViewModel.G;
                    this.f11458u = 1;
                    cVar.getClass();
                    obj = qn.c.a(arrayList, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return obj;
            }
        }

        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11456u;
            MonetizationViewModel monetizationViewModel = MonetizationViewModel.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                C0166a c0166a = new C0166a(monetizationViewModel, null);
                this.f11456u = 1;
                obj = v.S(bVar, c0166a, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            List<c4.h> list = (List) obj;
            if (list != null) {
                if (!list.isEmpty()) {
                    monetizationViewModel.M = true;
                    monetizationViewModel.s();
                    monetizationViewModel.i().i(list);
                } else {
                    int i10 = monetizationViewModel.K;
                    if (i10 < 2) {
                        monetizationViewModel.K = i10 + 1;
                        monetizationViewModel.e();
                    } else {
                        monetizationViewModel.D.i(Boolean.TRUE);
                    }
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Integer num;
            if (intent != null) {
                num = Integer.valueOf(intent.getIntExtra("asset_download_status", -1));
            } else {
                num = null;
            }
            MonetizationViewModel monetizationViewModel = MonetizationViewModel.this;
            if (num != null && num.intValue() == 2) {
                int i6 = monetizationViewModel.J;
                if (i6 <= 2) {
                    monetizationViewModel.J = i6 + 1;
                    monetizationViewModel.f();
                    return;
                }
                monetizationViewModel.D.l(Boolean.TRUE);
            } else if (is.k.Q1(num, new Integer[]{100, Integer.valueOf((int) R.styleable.AppCompatTheme_switchStyle)})) {
                monetizationViewModel.L = true;
                monetizationViewModel.s();
            }
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f11461u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final w<Boolean> invoke() {
            return new w<>();
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final d f11462u = new d();

        public d() {
            super(0);
        }

        @Override // ss.a
        public final w<Boolean> invoke() {
            return new w<>();
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$fetchData$1", f = "MonetizationViewModel.kt", l = {R.styleable.AppCompatTheme_textAppearanceSearchResultTitle}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f11463u;

        public f(ls.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new f(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((f) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
        @Override // ns.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11463u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                qn.c cVar = MonetizationViewModel.this.f11455z;
                this.f11463u = 1;
                cVar.getClass();
                kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(this));
                kVar.u();
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.APP_RESTART_ACKNOWLEDGE_PURCHASE, false)) {
                    MyApplication.a aVar2 = MyApplication.V;
                    if (!aVar2.a().E) {
                        c4.a aVar3 = new c4.a(true, aVar2.a(), f6.b.I);
                        aVar3.C(new qn.b(kVar, aVar3, cVar));
                        if (kVar.s() == aVar) {
                            return aVar;
                        }
                    }
                }
                if (kVar.a()) {
                    kVar.resumeWith(Boolean.FALSE);
                }
                if (kVar.s() == aVar) {
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final g f11466u = new g();

        public g() {
            super(0);
        }

        @Override // ss.a
        public final w<Boolean> invoke() {
            return new w<>();
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<w<List<? extends c4.h>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final h f11467u = new h();

        public h() {
            super(0);
        }

        @Override // ss.a
        public final w<List<? extends c4.h>> invoke() {
            return new w<>();
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<w<ArrayList<String>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final i f11468u = new i();

        public i() {
            super(0);
        }

        @Override // ss.a
        public final w<ArrayList<String>> invoke() {
            return new w<>();
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final j f11469u = new j();

        public j() {
            super(0);
        }

        @Override // ss.a
        public final w<Boolean> invoke() {
            return new w<>();
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<w<String>> {

        /* renamed from: u  reason: collision with root package name */
        public static final k f11470u = new k();

        public k() {
            super(0);
        }

        @Override // ss.a
        public final w<String> invoke() {
            return new w<>();
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$sendApiMessage$1", f = "MonetizationViewModel.kt", l = {332}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends ns.i implements p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public w f11471u;

        /* renamed from: v  reason: collision with root package name */
        public int f11472v;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f11474x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f11475y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ Bundle f11476z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, String str2, Bundle bundle, ls.d<? super l> dVar) {
            super(2, dVar);
            this.f11474x = str;
            this.f11475y = str2;
            this.f11476z = bundle;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new l(this.f11474x, this.f11475y, this.f11476z, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((l) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            w wVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f11472v;
            MonetizationViewModel monetizationViewModel = MonetizationViewModel.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    wVar = this.f11471u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                monetizationViewModel.k().i(Boolean.TRUE);
                w wVar2 = (w) monetizationViewModel.c0.getValue();
                this.f11471u = wVar2;
                this.f11472v = 1;
                Object b10 = monetizationViewModel.f11455z.b(this.f11474x, this.f11475y, this.f11476z, this);
                if (b10 == aVar) {
                    return aVar;
                }
                wVar = wVar2;
                obj = b10;
            }
            wVar.i(obj);
            monetizationViewModel.k().i(Boolean.FALSE);
            return hs.k.f19476a;
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final m f11477u = new m();

        public m() {
            super(0);
        }

        @Override // ss.a
        public final w<Boolean> invoke() {
            return new w<>();
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.a<w<String>> {

        /* renamed from: u  reason: collision with root package name */
        public static final n f11478u = new n();

        public n() {
            super(0);
        }

        @Override // ss.a
        public final w<String> invoke() {
            return new w<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonetizationViewModel(Application application, String str, qn.c repository) {
        super(application);
        boolean z10;
        Object obj;
        kotlin.jvm.internal.i.g(application, "application");
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f11454y = str;
        this.f11455z = repository;
        LogHelper logHelper = LogHelper.INSTANCE;
        this.A = logHelper.makeLogTag("MonetizationViewModel");
        this.C = new w<>();
        this.D = new w<>();
        this.F = "";
        logHelper.makeLogTag(on.b.class);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Constants.SUBSCRIPTION_BASIC_1);
        arrayList.add(Constants.SUBSCRIPTION_BASIC_2);
        arrayList.add(Constants.SUBSCRIPTION_BASIC_3);
        this.G = arrayList;
        this.N = new ArrayList<>();
        User user = FirebasePersistence.getInstance().getUser();
        boolean z11 = false;
        if (user != null) {
            HashMap<String, Object> appConfig = user.getAppConfig();
            if (appConfig != null && appConfig.containsKey(Constants.DASHBOARD_LIBRARY_EXPERIMENT)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                HashMap<String, Object> appConfig2 = user.getAppConfig();
                if (appConfig2 != null) {
                    obj = appConfig2.get(Constants.DASHBOARD_LIBRARY_EXPERIMENT);
                } else {
                    obj = null;
                }
                if (!kotlin.jvm.internal.i.b(obj, "default")) {
                    z11 = true;
                }
            }
        }
        this.P = z11;
        this.Q = sp.b.O(h.f11467u);
        this.R = sp.b.O(i.f11468u);
        this.S = sp.b.O(n.f11478u);
        this.T = sp.b.O(m.f11477u);
        this.U = sp.b.O(k.f11470u);
        this.V = sp.b.O(c.f11461u);
        this.W = sp.b.O(d.f11462u);
        this.f11451a0 = new JSONObject();
        this.f11452b0 = sp.b.O(g.f11466u);
        this.c0 = sp.b.O(j.f11469u);
        this.f11453d0 = new e();
        this.e0 = new b();
    }

    public final void e() {
        CampaignModel campaignModel = this.B;
        if (campaignModel != null) {
            this.G.addAll(campaignModel.getSkuListAndroid());
        }
        v.H(kc.f.H(this), null, 0, new a(null), 3);
    }

    public final void f() {
        hs.k kVar = null;
        if (ApplicationPersistence.getInstance().getBooleanValue(Constants.APP_RESTART_ACKNOWLEDGE_PURCHASE, false)) {
            v.H(kc.f.H(this), o0.f23642c, 0, new f(null), 2);
        }
        v.H(kc.f.H(this), o0.f23642c, 0, new MonetizationViewModel$fetchData$2(this, null), 2);
        SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
        SubscriptionModel currentSubscriptionModel = subscriptionPersistence.getCurrentSubscriptionModel();
        kotlin.jvm.internal.i.g(currentSubscriptionModel, "<set-?>");
        this.O = currentSubscriptionModel;
        if (!subscriptionPersistence.getSubscriptionEnabled() && (!kotlin.jvm.internal.i.b(m().getStatus(), Constants.STATE_ON_HOLD) || m().getExpiryTime() <= Calendar.getInstance().getTimeInMillis())) {
            String str = this.f11454y;
            if (str != null) {
                FireStoreUtilsKt.fetchSingleCampaign(str, new qn.j(this));
                kVar = hs.k.f19476a;
            }
            if (kVar == null) {
                String a10 = pn.a.a("campaign_list");
                boolean z10 = !gv.n.B0(a10);
                boolean z11 = this.P;
                if (z10) {
                    p(true, (ArrayList) new sf.i().c(a10, new TypeToken<ArrayList<CampaignModel>>() { // from class: com.theinnerhour.b2b.components.monetization.viewModel.MonetizationViewModel$fetchActiveCampaignsList$2$typeToken$1
                    }.getType()));
                    FireStoreUtilsKt.fetchActiveCampaigns(z11, qn.k.f29960u);
                    return;
                }
                FireStoreUtilsKt.fetchActiveCampaigns(z11, new qn.l(this));
                return;
            }
            return;
        }
        o();
    }

    public final void g() {
        ArrayList<CampaignModel> arrayList = this.N;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (r.J0(((CampaignModel) obj).getCampaignType(), "offer")) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            this.B = (CampaignModel) arrayList2.get(0);
            this.F = Constants.LINK_DYNAMIC_CAMPAIGN;
            this.E = true;
            e();
            SharedPreferences.Editor edit = pn.a.f28723a.edit();
            edit.putBoolean("campaign_active", true);
            edit.apply();
            return;
        }
        SharedPreferences.Editor edit2 = pn.a.f28723a.edit();
        edit2.putBoolean("campaign_active", false);
        edit2.apply();
        o();
    }

    public final w<Boolean> h() {
        return (w) this.W.getValue();
    }

    public final w<List<c4.h>> i() {
        return (w) this.Q.getValue();
    }

    public final w<ArrayList<String>> j() {
        return (w) this.R.getValue();
    }

    public final w<Boolean> k() {
        return (w) this.T.getValue();
    }

    public final w<String> l() {
        return (w) this.S.getValue();
    }

    public final SubscriptionModel m() {
        SubscriptionModel subscriptionModel = this.O;
        if (subscriptionModel != null) {
            return subscriptionModel;
        }
        kotlin.jvm.internal.i.q("subscriptionModel");
        throw null;
    }

    public final void n() {
        Application application = this.f2382x;
        n1.a.a(application.getApplicationContext()).b(this.f11453d0, new IntentFilter("com.theinnerhour.b2b.campaignAssetFileDownloadBroadcast"));
        n1.a.a(application.getApplicationContext()).b(this.e0, new IntentFilter("com.theinnerhour.b2b.campaignAllAssetDownloadBroadcast"));
        JobInfo.Builder builder = new JobInfo.Builder(Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID, new ComponentName(application.getApplicationContext().getPackageName(), CampaignAssetDownloadJobScheduler.class.getName()));
        this.H = builder;
        builder.setRequiredNetworkType(1);
        JobInfo.Builder builder2 = this.H;
        if (builder2 != null) {
            builder2.setRequiresCharging(false);
        }
        Object systemService = application.getApplicationContext().getSystemService("jobscheduler");
        kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        this.I = (JobScheduler) systemService;
    }

    public final void o() {
        String str;
        try {
            if (kotlin.jvm.internal.i.b(m().getStatus(), Constants.STATE_ON_HOLD) && m().getExpiryTime() > Calendar.getInstance().getTimeInMillis()) {
                if (kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(m().getPlan()), "pro")) {
                    str = Constants.HOLD_PRO_SELLING_SCREEN;
                } else {
                    str = Constants.HOLD_PLUS_SELLING_SCREEN;
                }
                this.F = str;
            } else if (kotlin.jvm.internal.i.b(m().getStatus(), Constants.STATE_GRACE_PERIOD) && m().getExpiryTime() > Calendar.getInstance().getTimeInMillis() && kotlin.jvm.internal.i.b(PaymentUtils.INSTANCE.getSubscriptionType(m().getPlan()), "plus")) {
                this.F = Constants.GRACE_PRO_SELLING_SCREEN;
            }
            e();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    public final void p(boolean z10, ArrayList arrayList) {
        boolean z11;
        if (z10) {
            if (arrayList != null) {
                try {
                    if (!arrayList.isEmpty()) {
                        z11 = false;
                        if (!z11 && !SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                            this.N = arrayList;
                            n();
                            g();
                            q();
                            return;
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this.A, e10);
                    return;
                }
            }
            z11 = true;
            if (!z11) {
                this.N = arrayList;
                n();
                g();
                q();
                return;
            }
        }
        o();
    }

    public final void q() {
        boolean z10;
        JobInfo.Builder builder;
        boolean z11;
        ArrayList<String> assetsUsed;
        JobScheduler jobScheduler;
        HashSet hashSet = new HashSet();
        Iterator<OfflineAsset> it = ApplicationPersistence.getInstance().getCampaignAssets().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFileUrl());
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = this.N.iterator();
        while (true) {
            z10 = false;
            if (!it2.hasNext()) {
                break;
            }
            CampaignModel campaignModel = (CampaignModel) it2.next();
            for (String str : campaignModel.getAssetsUsed()) {
                if (!hashSet.contains(str)) {
                    OfflineAsset offlineAsset = new OfflineAsset(str);
                    offlineAsset.setMetaInfo(ca.a.k(campaignModel.getCampaignType()));
                    arrayList.add(offlineAsset);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            if (applicationPersistence != null) {
                applicationPersistence.getCampaignAssets().addAll(arrayList);
                applicationPersistence.updateCampaignAssetsSP();
            }
            JobInfo.Builder builder2 = this.H;
            if (builder2 != null && (jobScheduler = this.I) != null) {
                kotlin.jvm.internal.i.d(builder2);
                jobScheduler.schedule(builder2.build());
                return;
            }
            return;
        }
        Iterator<OfflineAsset> it3 = ApplicationPersistence.getInstance().getCampaignAssets().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            OfflineAsset next = it3.next();
            CampaignModel campaignModel2 = (CampaignModel) u.i2(this.N);
            if (campaignModel2 != null && (assetsUsed = campaignModel2.getAssetsUsed()) != null && assetsUsed.contains(next.getFileUrl())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && !next.isDownloaded()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            if (ConnectionStatusReceiver.isConnected() && (builder = this.H) != null) {
                JobScheduler jobScheduler2 = this.I;
                if (jobScheduler2 != null) {
                    kotlin.jvm.internal.i.d(builder);
                    jobScheduler2.schedule(builder.build());
                    return;
                }
                return;
            }
            this.D.l(Boolean.TRUE);
            return;
        }
        this.L = true;
        s();
    }

    public final void r(String str, String str2, Bundle bundle) {
        v.H(kc.f.H(this), o0.f23642c, 0, new l(str, str2, bundle, null), 2);
    }

    public final void s() {
        boolean z10 = this.E;
        w<Boolean> wVar = this.D;
        w<Boolean> wVar2 = this.C;
        if (z10 && this.M && this.L && (wVar2.d() == null || kotlin.jvm.internal.i.b(wVar2.d(), Boolean.FALSE))) {
            wVar.l(Boolean.FALSE);
            wVar2.l(Boolean.TRUE);
        } else if (!this.E && this.M) {
            if (wVar2.d() == null || kotlin.jvm.internal.i.b(wVar2.d(), Boolean.FALSE)) {
                wVar.l(Boolean.FALSE);
                wVar2.l(Boolean.TRUE);
            }
        }
    }

    /* compiled from: MonetizationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
        }
    }
}
