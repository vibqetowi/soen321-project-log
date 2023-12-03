package wo;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.CourseDayDomainModelV1;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import kotlinx.coroutines.o0;
/* compiled from: ExperimentProfileActivityViewModel.kt */
/* loaded from: classes2.dex */
public final class n0 extends androidx.lifecycle.b {
    public final androidx.lifecycle.w<Long> A;
    public final androidx.lifecycle.w<Long> B;
    public final androidx.lifecycle.w<Long> C;
    public final androidx.lifecycle.w<Long> D;
    public final androidx.lifecycle.w<Long> E;
    public final androidx.lifecycle.w<Long> F;
    public final androidx.lifecycle.w<Integer[]> G;
    public final androidx.lifecycle.w<Boolean[]> H;
    public final androidx.lifecycle.w<Integer[]> I;
    public final androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> J;
    public final androidx.lifecycle.w<TherapistPackagesModel> K;
    public final androidx.lifecycle.w<Integer[]> L;
    public final androidx.lifecycle.w<hs.f<String, Boolean>> M;
    public final androidx.lifecycle.w<hs.f<String, Boolean>> N;
    public final androidx.lifecycle.w<ArrayList<CourseDayDomainModelV1>> O;
    public a P;
    public boolean Q;

    /* renamed from: y  reason: collision with root package name */
    public final e0 f36970y;

    /* renamed from: z  reason: collision with root package name */
    public final String f36971z;

    /* compiled from: ExperimentProfileActivityViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a extends BroadcastReceiver {
        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[Catch: Exception -> 0x004f, TryCatch #0 {Exception -> 0x004f, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x0013, B:11:0x0019, B:12:0x001f, B:16:0x002b, B:17:0x0038, B:20:0x0042), top: B:24:0x0003 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onReceive(Context context, Intent intent) {
            String string;
            boolean b10;
            Bundle extras;
            String str = null;
            if (intent != null) {
                try {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null) {
                        string = extras2.getString("asset_file_url");
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            str = extras.getString("asset_file_type");
                        }
                        b10 = kotlin.jvm.internal.i.b(str, "theme");
                        n0 n0Var = n0.this;
                        if (!b10) {
                            if (string != null) {
                                n0Var.M.i(new hs.f<>(string, Boolean.TRUE));
                                return;
                            }
                            return;
                        } else if (kotlin.jvm.internal.i.b(str, "avatar") && string != null) {
                            n0Var.N.i(new hs.f<>(string, Boolean.TRUE));
                            return;
                        } else {
                            return;
                        }
                    }
                } catch (Exception unused) {
                    LogHelper.INSTANCE.makeLogTag(a.class);
                    return;
                }
            }
            string = null;
            if (intent != null) {
                str = extras.getString("asset_file_type");
            }
            b10 = kotlin.jvm.internal.i.b(str, "theme");
            n0 n0Var2 = n0.this;
            if (!b10) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer[], java.io.Serializable] */
    public n0(e0 repository, Application application) {
        super(application);
        kotlin.jvm.internal.i.g(repository, "repository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f36970y = repository;
        this.f36971z = LogHelper.INSTANCE.makeLogTag(n0.class);
        this.A = new androidx.lifecycle.w<>(0L);
        this.B = new androidx.lifecycle.w<>(0L);
        this.C = new androidx.lifecycle.w<>(0L);
        this.D = new androidx.lifecycle.w<>(0L);
        this.E = new androidx.lifecycle.w<>(0L);
        this.F = new androidx.lifecycle.w<>(0L);
        this.G = new androidx.lifecycle.w<>(new Integer[0]);
        this.H = new androidx.lifecycle.w<>(new Boolean[0]);
        this.I = new androidx.lifecycle.w<>(new Integer[0]);
        this.J = new androidx.lifecycle.w<>();
        this.K = new androidx.lifecycle.w<>();
        this.L = new androidx.lifecycle.w<>(new Integer[]{0, 0, 0});
        this.M = new androidx.lifecycle.w<>();
        this.N = new androidx.lifecycle.w<>();
        this.O = new androidx.lifecycle.w<>();
        new fm.j0();
        g(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(8:5|6|7|(1:(2:10|11)(2:20|21))(5:22|23|(1:25)(1:29)|26|(1:28))|12|13|14|15))|31|6|7|(0)(0)|12|13|14|15|(1:(1:19))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.makeLogTag(r6.getClass());
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0063, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.makeLogTag(r6.getClass());
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(n0 n0Var, boolean z10, ls.d dVar) {
        f0 f0Var;
        int i6;
        boolean z11;
        n0Var.getClass();
        if (dVar instanceof f0) {
            f0Var = (f0) dVar;
            int i10 = f0Var.f36890y;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                f0Var.f36890y = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = f0Var.f36888w;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = f0Var.f36890y;
                if (i6 == 0) {
                    if (i6 == 1) {
                        z10 = f0Var.f36887v;
                        n0Var = f0Var.f36886u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    g0 g0Var = new g0(n0Var, z11, null);
                    f0Var.f36886u = n0Var;
                    f0Var.f36887v = z10;
                    f0Var.f36890y = 1;
                    if (ta.v.S(bVar, g0Var, f0Var) == aVar) {
                        return aVar;
                    }
                }
                n0Var.g(z10);
                hs.k kVar = hs.k.f19476a;
                return hs.k.f19476a;
            }
        }
        f0Var = new f0(n0Var, dVar);
        Object obj2 = f0Var.f36888w;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = f0Var.f36890y;
        if (i6 == 0) {
        }
        n0Var.g(z10);
        hs.k kVar2 = hs.k.f19476a;
        return hs.k.f19476a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(6:19|(1:21)(1:29)|22|(1:24)(1:28)|25|(1:27))|12|13|14))|32|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r6.f36971z, r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(n0 n0Var, boolean z10, ls.d dVar) {
        l0 l0Var;
        int i6;
        String str;
        boolean z11;
        n0Var.getClass();
        if (dVar instanceof l0) {
            l0Var = (l0) dVar;
            int i10 = l0Var.f36952x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                l0Var.f36952x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = l0Var.f36950v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = l0Var.f36952x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        n0 n0Var2 = l0Var.f36949u;
                        sp.b.d0(obj);
                        n0Var = n0Var2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    if (z10) {
                        str = "https://api.theinnerhour.com/v1/mytherapistsummary";
                    } else {
                        str = "https://api.theinnerhour.com/v1/mypsychiatristsummary";
                    }
                    kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
                    if (z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    m0 m0Var = new m0(n0Var, str, z11, null);
                    l0Var.f36949u = n0Var;
                    l0Var.f36952x = 1;
                    Object S = ta.v.S(bVar, m0Var, l0Var);
                    n0Var = S;
                    if (S == aVar) {
                        return aVar;
                    }
                }
                return hs.k.f19476a;
            }
        }
        l0Var = new l0(n0Var, dVar);
        Object obj2 = l0Var.f36950v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = l0Var.f36952x;
        if (i6 == 0) {
        }
        return hs.k.f19476a;
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        if (this.P != null) {
            n1.a a10 = n1.a.a(this.f2382x);
            a aVar = this.P;
            kotlin.jvm.internal.i.d(aVar);
            a10.d(aVar);
            this.P = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7 A[Catch: Exception -> 0x00fe, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fe, blocks: (B:3:0x0002, B:5:0x000d, B:10:0x001b, B:12:0x002d, B:17:0x003b, B:22:0x0046, B:24:0x0057, B:26:0x005d, B:28:0x0065, B:30:0x0069, B:32:0x006e, B:34:0x0080, B:38:0x008a, B:41:0x0094, B:45:0x00a5, B:49:0x00c1, B:51:0x00c7, B:54:0x00d6, B:56:0x00e4, B:58:0x00f0, B:47:0x00b2), top: B:63:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0 A[Catch: Exception -> 0x00fe, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fe, blocks: (B:3:0x0002, B:5:0x000d, B:10:0x001b, B:12:0x002d, B:17:0x003b, B:22:0x0046, B:24:0x0057, B:26:0x005d, B:28:0x0065, B:30:0x0069, B:32:0x006e, B:34:0x0080, B:38:0x008a, B:41:0x0094, B:45:0x00a5, B:49:0x00c1, B:51:0x00c7, B:54:0x00d6, B:56:0x00e4, B:58:0x00f0, B:47:0x00b2), top: B:63:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(boolean z10) {
        String str;
        boolean z11;
        Object obj;
        String[] strArr;
        String str2;
        HashMap<String, Object> appConfig;
        String[] strArr2;
        try {
            User user = FirebasePersistence.getInstance().getUser();
            String str3 = null;
            if (user != null) {
                str = user.getProfile_path();
            } else {
                str = null;
            }
            boolean z12 = false;
            String str4 = "";
            String str5 = (str == null || (strArr2 = (String[]) gv.r.a1(str, new String[]{"/"}, 0, 6).toArray(new String[0])) == null || (str5 = (String) is.k.a2(strArr2)) == null) ? "" : "";
            boolean z13 = true;
            if (str != null && gv.r.J0(str, ".jpg?")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                str5 = str5.substring(0, gv.r.O0(str5, ".jpg?", 0, false, 6) + 4);
                kotlin.jvm.internal.i.f(str5, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            if (user != null && (appConfig = user.getAppConfig()) != null) {
                obj = appConfig.get("profile_cover");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            }
            if (str3 != null && (strArr = (String[]) gv.r.a1(str3, new String[]{"/"}, 0, 6).toArray(new String[0])) != null && (str2 = (String) is.k.a2(strArr)) != null) {
                str4 = str2;
            }
            boolean B0 = gv.n.B0(str5);
            Application application = this.f2382x;
            if (!B0) {
                String[] fileList = application.fileList();
                kotlin.jvm.internal.i.f(fileList, "getApplication<Application>().fileList()");
                boolean Q1 = is.k.Q1(str5, fileList);
                androidx.lifecycle.w<hs.f<String, Boolean>> wVar = this.N;
                if (Q1 && !z10) {
                    wVar.i(new hs.f<>(str5, Boolean.TRUE));
                    if (!gv.n.B0(str4)) {
                        String[] fileList2 = application.fileList();
                        kotlin.jvm.internal.i.f(fileList2, "getApplication<Application>().fileList()");
                        boolean Q12 = is.k.Q1(str4, fileList2);
                        androidx.lifecycle.w<hs.f<String, Boolean>> wVar2 = this.M;
                        if (Q12) {
                            wVar2.i(new hs.f<>(str4, Boolean.TRUE));
                            z13 = z12;
                        } else if (str3 != null) {
                            wVar2.i(new hs.f<>(str3, Boolean.FALSE));
                        }
                    }
                    if (!z13) {
                        Utils utils = Utils.INSTANCE;
                        kotlin.jvm.internal.i.f(application, "getApplication()");
                        utils.checkAndDownloadProfileAssets(application);
                        h(application);
                        return;
                    }
                    return;
                } else if (str != null) {
                    wVar.i(new hs.f<>("https:".concat(str), Boolean.FALSE));
                }
            }
            z12 = true;
            if (!gv.n.B0(str4)) {
            }
            if (!z13) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f36971z, e10);
        }
    }

    public final void h(Application application) {
        try {
            if (this.Q) {
                return;
            }
            this.P = new a();
            n1.a a10 = n1.a.a(application);
            a aVar = this.P;
            kotlin.jvm.internal.i.d(aVar);
            a10.b(aVar, new IntentFilter("com.theinnerhour.b2b.campaignAssetFileDownloadBroadcast"));
            this.Q = true;
        } catch (Exception unused) {
            LogHelper.INSTANCE.makeLogTag(n0.class);
        }
    }
}
