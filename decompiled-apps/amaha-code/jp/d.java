package jp;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.lifecycle.w;
import com.appsflyer.R;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.components.splash.models.AppUpdateResponse;
import com.theinnerhour.b2b.components.splash.models.SplashScreenIntentParams;
import com.theinnerhour.b2b.model.FirebaseInitialiseListener;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.LocationPersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import java.util.ArrayList;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ns.i;
import qg.g0;
import ss.p;
import ta.v;
/* compiled from: SplashScreenViewModel.kt */
/* loaded from: classes2.dex */
public final class d extends androidx.lifecycle.b implements FirebaseInitialiseListener {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public final w<Boolean> I;
    public final w<Boolean> J;
    public final w<Boolean> K;
    public final w<SplashScreenIntentParams> L;
    public final w<AppUpdateResponse> M;
    public final w<Boolean> N;
    public final e O;

    /* renamed from: y  reason: collision with root package name */
    public final String f22546y;

    /* renamed from: z  reason: collision with root package name */
    public final jp.a f22547z;

    /* compiled from: SplashScreenViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.splash.viewModel.SplashScreenViewModel$1", f = "SplashScreenViewModel.kt", l = {R.styleable.AppCompatTheme_colorPrimaryDark}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22548u;

        public a(ls.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22548u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                this.f22548u = 1;
                d dVar = d.this;
                dVar.getClass();
                Object S = v.S(o0.f23642c, new f(dVar, null), this);
                if (S != obj2) {
                    S = k.f19476a;
                }
                if (S == obj2) {
                    return obj2;
                }
            }
            return k.f19476a;
        }
    }

    /* compiled from: SplashScreenViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.splash.viewModel.SplashScreenViewModel$fetchRemoteConfig$1", f = "SplashScreenViewModel.kt", l = {160, 161}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public d f22550u;

        /* renamed from: v  reason: collision with root package name */
        public int f22551v;

        public b(ls.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22551v;
            d dVar2 = d.this;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        dVar = this.f22550u;
                        sp.b.d0(obj);
                        dVar.G = ((Boolean) obj).booleanValue();
                        dVar2.g();
                        return k.f19476a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sp.b.d0(obj);
            } else {
                sp.b.d0(obj);
                jp.a aVar2 = dVar2.f22547z;
                this.f22551v = 1;
                aVar2.getClass();
                if (jp.a.c(this) == aVar) {
                    return aVar;
                }
            }
            jp.a aVar3 = dVar2.f22547z;
            this.f22550u = dVar2;
            this.f22551v = 2;
            obj = aVar3.b(this);
            if (obj == aVar) {
                return aVar;
            }
            dVar = dVar2;
            dVar.G = ((Boolean) obj).booleanValue();
            dVar2.g();
            return k.f19476a;
        }
    }

    /* compiled from: SplashScreenViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.splash.viewModel.SplashScreenViewModel$fetchRemoteConfig$2", f = "SplashScreenViewModel.kt", l = {166}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f22553u;

        public c(ls.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new c(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22553u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                jp.a aVar2 = d.this.f22547z;
                this.f22553u = 1;
                aVar2.getClass();
                if (jp.a.c(this) == aVar) {
                    return aVar;
                }
            }
            return k.f19476a;
        }
    }

    /* compiled from: SplashScreenViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.splash.viewModel.SplashScreenViewModel$fetchRemoteConfig$3", f = "SplashScreenViewModel.kt", l = {169}, m = "invokeSuspend")
    /* renamed from: jp.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0340d extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public d f22555u;

        /* renamed from: v  reason: collision with root package name */
        public int f22556v;

        public C0340d(ls.d<? super C0340d> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new C0340d(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((C0340d) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f22556v;
            d dVar2 = d.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    dVar = this.f22555u;
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                jp.a aVar2 = dVar2.f22547z;
                this.f22555u = dVar2;
                this.f22556v = 1;
                obj = aVar2.b(this);
                if (obj == aVar) {
                    return aVar;
                }
                dVar = dVar2;
            }
            dVar.G = ((Boolean) obj).booleanValue();
            dVar2.g();
            return k.f19476a;
        }
    }

    /* compiled from: SplashScreenViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e implements SubscriptionPersistence.SubscriptionInitialiseListener {
        public e() {
        }

        @Override // com.theinnerhour.b2b.persistence.SubscriptionPersistence.SubscriptionInitialiseListener
        public final void initialiseComplete(boolean z10) {
            SubscriptionPersistence subscriptionPersistence = SubscriptionPersistence.INSTANCE;
            if (ca.a.k(Constants.STATE_GRACE_PERIOD, Constants.STATE_ON_HOLD, Constants.STATE_CANCELLED).contains(subscriptionPersistence.getCurrentSubscriptionModel().getStatus())) {
                ApplicationPersistence.getInstance().setBooleanValue(Constants.SHOW_MESSAGING_PAGES, true);
            }
            subscriptionPersistence.removeSubscriptionInitialiseListener(this);
            d dVar = d.this;
            dVar.B = true;
            dVar.g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Application application) {
        super(application);
        kotlin.jvm.internal.i.g(application, "application");
        this.f22546y = LogHelper.INSTANCE.makeLogTag("SplashScreenViewModel");
        this.f22547z = new jp.a(0);
        this.I = new w<>();
        this.J = new w<>();
        this.K = new w<>();
        this.L = new w<>();
        this.M = new w<>();
        this.N = new w<>();
        this.O = new e();
        v.H(kc.f.H(this), null, 0, new a(null), 3);
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        FirebasePersistence.getInstance().removeFirebaseInitialiseListener(this);
    }

    public final void e() {
        if (!this.G) {
            if (kotlin.jvm.internal.i.b(LocationPersistence.INSTANCE.getCurrentCountry(), "")) {
                v.H(kc.f.H(this), null, 0, new b(null), 3);
                return;
            }
            v.H(kc.f.H(this), null, 0, new c(null), 3);
            v.H(kc.f.H(this), null, 0, new C0340d(null), 3);
            return;
        }
        g();
    }

    public final void f() {
        this.C = true;
        g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0084, code lost:
        if (r3.getPackageManager().getPackageInfo(r3.getPackageName(), 0).firstInstallTime == r3.getPackageManager().getPackageInfo(r3.getPackageName(), 0).lastUpdateTime) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177 A[Catch: Exception -> 0x0189, TryCatch #3 {Exception -> 0x0189, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0014, B:14:0x0018, B:17:0x0032, B:19:0x0046, B:21:0x004e, B:23:0x005a, B:24:0x0066, B:32:0x008e, B:48:0x00f5, B:35:0x009c, B:40:0x00c3, B:43:0x00cf, B:29:0x0088, B:49:0x0100, B:51:0x010a, B:53:0x0112, B:55:0x011e, B:63:0x0150, B:58:0x012a, B:64:0x0157, B:66:0x0163, B:69:0x016b, B:75:0x0177, B:76:0x0180, B:59:0x0135, B:36:0x00a7, B:44:0x00da), top: B:83:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0180 A[Catch: Exception -> 0x0189, TRY_LEAVE, TryCatch #3 {Exception -> 0x0189, blocks: (B:2:0x0000, B:4:0x0004, B:6:0x0008, B:8:0x000c, B:10:0x0010, B:12:0x0014, B:14:0x0018, B:17:0x0032, B:19:0x0046, B:21:0x004e, B:23:0x005a, B:24:0x0066, B:32:0x008e, B:48:0x00f5, B:35:0x009c, B:40:0x00c3, B:43:0x00cf, B:29:0x0088, B:49:0x0100, B:51:0x010a, B:53:0x0112, B:55:0x011e, B:63:0x0150, B:58:0x012a, B:64:0x0157, B:66:0x0163, B:69:0x016b, B:75:0x0177, B:76:0x0180, B:59:0x0135, B:36:0x00a7, B:44:0x00da), top: B:83:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        boolean z10;
        fi.b bVar;
        Application application;
        String str;
        boolean z11;
        try {
            if (this.F && this.A && this.B && this.C && this.D && this.G) {
                z10 = false;
                this.H = false;
                fd.f fVar = FirebaseAuth.getInstance().f;
                bVar = fi.b.UPDATE;
                w<SplashScreenIntentParams> wVar = this.L;
                application = this.f2382x;
                if (fVar == null) {
                    wVar.i(new SplashScreenIntentParams(false, false));
                    this.H = false;
                    MyApplication.a aVar = MyApplication.V;
                    if (aVar.a().Q && aVar.a().P) {
                        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                        ArrayList<String> arrayList = fk.g.f15127b;
                        if (!applicationPersistence.getBooleanValue("moengage_status_set", false)) {
                            jp.a aVar2 = this.f22547z;
                            Context applicationContext = application.getApplicationContext();
                            kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                            aVar2.getClass();
                            try {
                            } catch (PackageManager.NameNotFoundException e10) {
                                e10.printStackTrace();
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    MyApplication.a aVar3 = MyApplication.V;
                    if (aVar3.a().Q && aVar3.a().P) {
                        ApplicationPersistence applicationPersistence2 = ApplicationPersistence.getInstance();
                        ArrayList<String> arrayList2 = fk.g.f15127b;
                        if (!applicationPersistence2.getBooleanValue("moengage_status_set", false)) {
                            Context applicationContext2 = application.getApplicationContext();
                            kotlin.jvm.internal.i.f(applicationContext2, "getApplication<Application>().applicationContext");
                            ih.p pVar = g0.f29558c;
                            if (pVar != null) {
                                qg.w.f29578a.getClass();
                                qg.g d10 = qg.w.d(pVar);
                                d10.f29546a.f20106e.c(new ah.e("INSTALL_UPDATE_TASK", true, new androidx.emoji2.text.g(21, d10, applicationContext2, bVar)));
                            }
                            ApplicationPersistence.getInstance().setBooleanValue("moengage_status_set", true);
                        }
                    }
                    this.H = true;
                    User user = FirebasePersistence.getInstance().getUser();
                    if (user != null) {
                        str = user.getCurrentCourse();
                    } else {
                        str = null;
                    }
                    if (str != null && str.length() != 0) {
                        z11 = false;
                        if (!z11) {
                            wVar.i(new SplashScreenIntentParams(true, true));
                            return;
                        } else {
                            wVar.i(new SplashScreenIntentParams(true, false));
                            return;
                        }
                    }
                    z11 = true;
                    if (!z11) {
                    }
                }
            } else {
                return;
            }
            z10 = true;
            if (z10) {
                Context applicationContext3 = application.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext3, "getApplication<Application>().applicationContext");
                fi.b bVar2 = fi.b.INSTALL;
                ih.p pVar2 = g0.f29558c;
                if (pVar2 != null) {
                    qg.w.f29578a.getClass();
                    qg.g d11 = qg.w.d(pVar2);
                    d11.f29546a.f20106e.c(new ah.e("INSTALL_UPDATE_TASK", true, new androidx.emoji2.text.g(21, d11, applicationContext3, bVar2)));
                }
            } else {
                Context applicationContext4 = application.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext4, "getApplication<Application>().applicationContext");
                ih.p pVar3 = g0.f29558c;
                if (pVar3 != null) {
                    qg.w.f29578a.getClass();
                    qg.g d12 = qg.w.d(pVar3);
                    d12.f29546a.f20106e.c(new ah.e("INSTALL_UPDATE_TASK", true, new androidx.emoji2.text.g(21, d12, applicationContext4, bVar)));
                }
            }
            ApplicationPersistence applicationPersistence3 = ApplicationPersistence.getInstance();
            ArrayList<String> arrayList3 = fk.g.f15127b;
            applicationPersistence3.setBooleanValue("moengage_status_set", true);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.f22546y, "exception", e11);
            this.I.l(Boolean.TRUE);
        }
    }

    @Override // com.theinnerhour.b2b.model.FirebaseInitialiseListener
    public final void initiliseComplete(boolean z10) {
        boolean z11 = this.A;
        this.A = true;
        if (z10) {
            if (!z11) {
                e();
                return;
            }
            return;
        }
        this.I.l(Boolean.TRUE);
    }
}
