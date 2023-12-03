package dl;

import android.app.Dialog;
import android.content.pm.PackageInfo;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.utils.Extensions;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: V2DashboardActivity.kt */
@ns.e(c = "com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity$sendAppFeedback$1", f = "V2DashboardActivity.kt", l = {2682, 2687}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class r extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f13097u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ V2DashboardActivity f13098v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f13099w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Dialog f13100x;

    /* compiled from: V2DashboardActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity$sendAppFeedback$1$1$1", f = "V2DashboardActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ V2DashboardActivity f13101u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ boolean f13102v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Dialog f13103w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(V2DashboardActivity v2DashboardActivity, boolean z10, Dialog dialog, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f13101u = v2DashboardActivity;
            this.f13102v = z10;
            this.f13103w = dialog;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f13101u, this.f13102v, this.f13103w, dVar);
        }

        @Override // ss.p
        public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            int i6;
            sp.b.d0(obj);
            Extensions extensions = Extensions.INSTANCE;
            V2DashboardActivity v2DashboardActivity = this.f13101u;
            if (this.f13102v) {
                i6 = R.string.feedback_submit_toast;
            } else {
                i6 = R.string.feedback_submit_fail_toast;
            }
            String string = v2DashboardActivity.getString(i6);
            kotlin.jvm.internal.i.f(string, "getString(if (it) R.stri…edback_submit_fail_toast)");
            Extensions.toast$default(extensions, v2DashboardActivity, string, 0, 2, null);
            this.f13103w.cancel();
            this.f13101u.O0().dismiss();
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(V2DashboardActivity v2DashboardActivity, String str, Dialog dialog, ls.d<? super r> dVar) {
        super(2, dVar);
        this.f13098v = v2DashboardActivity;
        this.f13099w = str;
        this.f13100x = dialog;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new r(this.f13098v, this.f13099w, this.f13100x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((r) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f13097u;
        V2DashboardActivity v2DashboardActivity = this.f13098v;
        try {
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(v2DashboardActivity.f10673v, "https://us-central1-gcpinnerhour.cloudfunctions.net/appFeedback", e10);
        }
        if (i6 != 0) {
            if (i6 != 1) {
                if (i6 == 2) {
                    sp.b.d0(obj);
                    return hs.k.f19476a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sp.b.d0(obj);
        } else {
            sp.b.d0(obj);
            String str = this.f13099w;
            MyApplication.a aVar2 = MyApplication.V;
            PackageInfo packageInfo = aVar2.a().getPackageManager().getPackageInfo(aVar2.a().getPackageName(), 0);
            kotlin.jvm.internal.i.f(packageInfo, "MyApplication.instance.p….instance.packageName, 0)");
            this.f13097u = 1;
            obj = ((jl.t1) v2DashboardActivity.f10670s0.getValue()).b(str, packageInfo, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Dialog dialog = this.f13100x;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        kotlinx.coroutines.scheduling.c cVar = kotlinx.coroutines.o0.f23640a;
        kotlinx.coroutines.k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
        a aVar3 = new a(v2DashboardActivity, booleanValue, dialog, null);
        this.f13097u = 2;
        if (ta.v.S(k1Var, aVar3, this) == aVar) {
            return aVar;
        }
        return hs.k.f19476a;
    }
}
