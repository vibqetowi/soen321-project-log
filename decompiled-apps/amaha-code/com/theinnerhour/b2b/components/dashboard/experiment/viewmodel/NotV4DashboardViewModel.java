package com.theinnerhour.b2b.components.dashboard.experiment.viewmodel;

import android.app.Application;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.r;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.MyApplication;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dashboard.experiment.model.NotV4RecentModel;
import com.theinnerhour.b2b.components.dashboard.experiment.model.SuggestedCardItem;
import com.theinnerhour.b2b.components.journal.model.JournalModel;
import com.theinnerhour.b2b.components.journal.model.JournalQuestionModel;
import com.theinnerhour.b2b.components.pro.dashboard.model.ProCoachModel;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.model.Course;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.model.FirebaseCourseUpdateListener;
import com.theinnerhour.b2b.model.MiniCourse;
import com.theinnerhour.b2b.model.MiniCourseInfoMeta;
import com.theinnerhour.b2b.model.User;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.service.BootReceiverNotificationWorkManager;
import com.theinnerhour.b2b.service.PostLoginNotificationWorkManager;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.RoutingIntentHandler;
import com.theinnerhour.b2b.utils.SessionManager;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import jl.b1;
import jl.g1;
import jl.h1;
import jl.j1;
import jl.k1;
import jl.l1;
import jl.n0;
import jl.n1;
import jl.t1;
import jl.u0;
import jl.v0;
import jl.w0;
import jl.x0;
import jl.z0;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.x;
import kotlinx.coroutines.o0;
import lv.c0;
import lv.v;
import n2.a0;
import nf.c;
import org.json.JSONArray;
import org.json.JSONObject;
import ta.v;
/* compiled from: NotV4DashboardViewModel.kt */
/* loaded from: classes2.dex */
public final class NotV4DashboardViewModel extends androidx.lifecycle.b implements FirebaseCourseUpdateListener {
    public final String A;
    public final kotlinx.coroutines.scheduling.b B;
    public Course C;
    public boolean D;
    public final hs.i E;
    public final hs.i F;
    public final hs.i G;
    public final hs.i H;
    public final x I;
    public final hs.i J;
    public final hs.i K;
    public final hs.i L;
    public final CourseApiUtil M;
    public boolean N;
    public final Type O;
    public ArrayList<String> P;
    public final Type Q;
    public ArrayList<MiniCourseInfoMeta> R;
    public int S;
    public final w<RoutingIntentHandler> T;
    public final w<ProCoachModel> U;
    public final w<hs.f<Boolean, ArrayList<String>>> V;
    public final hs.i W;
    public final hs.i X;
    public final hs.i Y;
    public final hs.i Z;

    /* renamed from: a0  reason: collision with root package name */
    public final hs.i f10854a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f10855b0;
    public boolean c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f10856d0;
    public boolean e0;

    /* renamed from: f0  reason: collision with root package name */
    public final w<Boolean> f10857f0;

    /* renamed from: g0  reason: collision with root package name */
    public final hs.i f10858g0;

    /* renamed from: h0  reason: collision with root package name */
    public final tm.a f10859h0;

    /* renamed from: i0  reason: collision with root package name */
    public JournalQuestionModel f10860i0;

    /* renamed from: j0  reason: collision with root package name */
    public final w<Boolean> f10861j0;

    /* renamed from: k0  reason: collision with root package name */
    public final w<ArrayList<TherapistPackagesModel>> f10862k0;

    /* renamed from: l0  reason: collision with root package name */
    public final w<Boolean> f10863l0;

    /* renamed from: m0  reason: collision with root package name */
    public final w<Boolean> f10864m0;

    /* renamed from: n0  reason: collision with root package name */
    public final hs.i f10865n0;

    /* renamed from: o0  reason: collision with root package name */
    public final ArrayList<String> f10866o0;

    /* renamed from: y  reason: collision with root package name */
    public final u0 f10867y;

    /* renamed from: z  reason: collision with root package name */
    public final cn.t f10868z;

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$1", f = "NotV4DashboardViewModel.kt", l = {148}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f10869u;

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
            int i6 = this.f10869u;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                Utils.INSTANCE.updateFirebaseInstanceId();
                this.f10869u = 1;
                if (NotV4DashboardViewModel.g(NotV4DashboardViewModel.this, this) == aVar) {
                    return aVar;
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<rp.a> {

        /* renamed from: u  reason: collision with root package name */
        public static final b f10871u = new b();

        public b() {
            super(0);
        }

        @Override // ss.a
        public final rp.a invoke() {
            return new rp.a(0);
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<t1> {

        /* renamed from: u  reason: collision with root package name */
        public static final c f10872u = new c();

        public c() {
            super(0);
        }

        @Override // ss.a
        public final t1 invoke() {
            return new t1();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchLibraryContentOnDb$1", f = "NotV4DashboardViewModel.kt", l = {848}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f10873u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<String> f10875w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.jvm.internal.x<String> xVar, ls.d<? super d> dVar) {
            super(2, dVar);
            this.f10875w = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new d(this.f10875w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f10873u;
            NotV4DashboardViewModel notV4DashboardViewModel = NotV4DashboardViewModel.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    cn.q a10 = cn.t.a(notV4DashboardViewModel.f10868z, "top_pick", this.f10875w.f23469u);
                    this.f10873u = 1;
                    obj = v.s(a10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                List list = (List) obj;
                notV4DashboardViewModel.f10855b0 = true;
                NotV4DashboardViewModel.h(notV4DashboardViewModel);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(notV4DashboardViewModel.A, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchLibraryContentOnDb$2", f = "NotV4DashboardViewModel.kt", l = {859}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f10876u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<String> f10878w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(kotlin.jvm.internal.x<String> xVar, ls.d<? super e> dVar) {
            super(2, dVar);
            this.f10878w = xVar;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new e(this.f10878w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((e) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f10876u;
            NotV4DashboardViewModel notV4DashboardViewModel = NotV4DashboardViewModel.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    cn.q a10 = cn.t.a(notV4DashboardViewModel.f10868z, "collection", this.f10878w.f23469u);
                    this.f10876u = 1;
                    obj = v.s(a10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (((List) obj) != null) {
                    notV4DashboardViewModel.c0 = true;
                    NotV4DashboardViewModel.h(notV4DashboardViewModel);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(notV4DashboardViewModel.A, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchLibraryContentOnDb$3", f = "NotV4DashboardViewModel.kt", l = {869}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f10879u;

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

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f10879u;
            NotV4DashboardViewModel notV4DashboardViewModel = NotV4DashboardViewModel.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    cn.t tVar = notV4DashboardViewModel.f10868z;
                    String currentCourseName = FirebasePersistence.getInstance().getUser().getCurrentCourseName();
                    kotlin.jvm.internal.i.f(currentCourseName, "getInstance().user.currentCourseName");
                    cn.r b10 = tVar.b(currentCourseName);
                    this.f10879u = 1;
                    obj = v.s(b10, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (((List) obj) != null) {
                    notV4DashboardViewModel.f10856d0 = true;
                    NotV4DashboardViewModel.h(notV4DashboardViewModel);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(notV4DashboardViewModel.A, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchLibraryContentOnDb$4", f = "NotV4DashboardViewModel.kt", l = {879}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f10881u;

        public g(ls.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new g(dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((g) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f10881u;
            NotV4DashboardViewModel notV4DashboardViewModel = NotV4DashboardViewModel.this;
            try {
                if (i6 != 0) {
                    if (i6 == 1) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    cn.p pVar = new cn.p(new kotlinx.coroutines.flow.r(new cn.s(100L, notV4DashboardViewModel.f10868z.f5778b.b("mini_courses").m(Boolean.TRUE, "published"), null)));
                    this.f10881u = 1;
                    obj = v.s(pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                if (((List) obj) != null) {
                    notV4DashboardViewModel.e0 = true;
                    NotV4DashboardViewModel.h(notV4DashboardViewModel);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(notV4DashboardViewModel.A, e10);
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class h implements CourseApiUtil.MiniCourseFetchUtilInterface {
        public h() {
        }

        @Override // com.theinnerhour.b2b.utils.CourseApiUtil.MiniCourseFetchUtilInterface
        public final void miniCourseFetchComplete(boolean z10) {
            if (z10) {
                NotV4DashboardViewModel notV4DashboardViewModel = NotV4DashboardViewModel.this;
                notV4DashboardViewModel.getClass();
                if (notV4DashboardViewModel.N) {
                    notV4DashboardViewModel.n();
                }
            }
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$fetchTeleEntryPointProvidersList$1", f = "NotV4DashboardViewModel.kt", l = {483}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f10884u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f10886w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, ls.d<? super i> dVar) {
            super(2, dVar);
            this.f10886w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new i(this.f10886w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((i) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f10884u;
            NotV4DashboardViewModel notV4DashboardViewModel = NotV4DashboardViewModel.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                u0 u0Var = notV4DashboardViewModel.f10867y;
                this.f10884u = 1;
                u0Var.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(this.f10886w);
                hs.k kVar = hs.k.f19476a;
                jSONObject.put("expertise", jSONArray);
                jSONObject.put("experiment_name", "variant_d");
                String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.i.f(jSONObject2, "JSONObject().apply {\n   …_d\")\n        }.toString()");
                Pattern pattern = lv.v.f24702d;
                ((co.b) nr.b.a(co.b.class)).b("https://api.theinnerhour.com/v1/search/v2/therapists", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new n0(hVar));
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            notV4DashboardViewModel.f10862k0.i((ArrayList) obj);
            return hs.k.f19476a;
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class j extends kotlin.jvm.internal.k implements ss.a<w<String>> {

        /* renamed from: u  reason: collision with root package name */
        public static final j f10887u = new j();

        public j() {
            super(0);
        }

        @Override // ss.a
        public final w<String> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class k extends kotlin.jvm.internal.k implements ss.a<w<SingleUseEvent<? extends Boolean>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final k f10888u = new k();

        public k() {
            super(0);
        }

        @Override // ss.a
        public final w<SingleUseEvent<? extends Boolean>> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class l extends kotlin.jvm.internal.k implements ss.a<w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final l f10889u = new l();

        public l() {
            super(0);
        }

        @Override // ss.a
        public final w<Boolean> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class m extends kotlin.jvm.internal.k implements ss.a<w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final m f10890u = new m();

        public m() {
            super(0);
        }

        @Override // ss.a
        public final w<Boolean> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class n extends kotlin.jvm.internal.k implements ss.a<w<JournalModel>> {

        /* renamed from: u  reason: collision with root package name */
        public static final n f10891u = new n();

        public n() {
            super(0);
        }

        @Override // ss.a
        public final w<JournalModel> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class o extends kotlin.jvm.internal.k implements ss.a<w<String>> {

        /* renamed from: u  reason: collision with root package name */
        public static final o f10892u = new o();

        public o() {
            super(0);
        }

        @Override // ss.a
        public final w<String> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class p extends kotlin.jvm.internal.k implements ss.a<w<SingleUseEvent<? extends String>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final p f10893u = new p();

        public p() {
            super(0);
        }

        @Override // ss.a
        public final w<SingleUseEvent<? extends String>> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class q extends kotlin.jvm.internal.k implements ss.a<w<Boolean>> {

        /* renamed from: u  reason: collision with root package name */
        public static final q f10894u = new q();

        public q() {
            super(0);
        }

        @Override // ss.a
        public final w<Boolean> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class r extends kotlin.jvm.internal.k implements ss.a<w<SingleUseEvent<? extends Boolean>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final r f10895u = new r();

        public r() {
            super(0);
        }

        @Override // ss.a
        public final w<SingleUseEvent<? extends Boolean>> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class s extends kotlin.jvm.internal.k implements ss.a<w<SuggestedCardItem>> {

        /* renamed from: u  reason: collision with root package name */
        public static final s f10896u = new s();

        public s() {
            super(0);
        }

        @Override // ss.a
        public final w<SuggestedCardItem> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class t extends kotlin.jvm.internal.k implements ss.a<w<SingleUseEvent<? extends String>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final t f10897u = new t();

        public t() {
            super(0);
        }

        @Override // ss.a
        public final w<SingleUseEvent<? extends String>> invoke() {
            return new w<>();
        }
    }

    /* compiled from: NotV4DashboardViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class u extends kotlin.jvm.internal.k implements ss.a<w<List<? extends NotV4RecentModel>>> {

        /* renamed from: u  reason: collision with root package name */
        public static final u f10898u = new u();

        public u() {
            super(0);
        }

        @Override // ss.a
        public final w<List<? extends NotV4RecentModel>> invoke() {
            return new w<>();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotV4DashboardViewModel(u0 repository, cn.t fetchLibraryOnDbViewModelRepository, Application application) {
        super(application);
        HashMap<String, Object> appConfig;
        kotlin.jvm.internal.i.g(repository, "repository");
        kotlin.jvm.internal.i.g(fetchLibraryOnDbViewModelRepository, "fetchLibraryOnDbViewModelRepository");
        kotlin.jvm.internal.i.g(application, "application");
        this.f10867y = repository;
        this.f10868z = fetchLibraryOnDbViewModelRepository;
        this.A = LogHelper.INSTANCE.makeLogTag("NotV4DashboardViewModel");
        this.B = o0.f23642c;
        this.E = sp.b.O(l.f10889u);
        this.F = sp.b.O(m.f10890u);
        this.G = sp.b.O(j.f10887u);
        this.H = sp.b.O(o.f10892u);
        this.I = tr.r.f(0L);
        this.J = sp.b.O(u.f10898u);
        this.K = sp.b.O(s.f10896u);
        this.L = sp.b.O(q.f10894u);
        this.M = new CourseApiUtil();
        this.O = new TypeToken<ArrayList<String>>() { // from class: com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$arrayListStringType$1
        }.getType();
        this.P = new ArrayList<>();
        this.Q = new TypeToken<ArrayList<MiniCourseInfoMeta>>() { // from class: com.theinnerhour.b2b.components.dashboard.experiment.viewmodel.NotV4DashboardViewModel$arrayListMetaType$1
        }.getType();
        this.R = new ArrayList<>();
        this.T = new w<>();
        new w();
        new w();
        this.U = new w<>();
        this.V = new w<>(null);
        this.W = sp.b.O(r.f10895u);
        this.X = sp.b.O(p.f10893u);
        this.Y = sp.b.O(c.f10872u);
        this.Z = sp.b.O(t.f10897u);
        this.f10854a0 = sp.b.O(b.f10871u);
        this.f10857f0 = new w<>();
        this.f10858g0 = sp.b.O(n.f10891u);
        this.f10859h0 = new tm.a();
        this.f10861j0 = new w<>();
        this.f10862k0 = new w<>();
        this.f10863l0 = new w<>();
        this.f10864m0 = new w<>();
        this.f10865n0 = sp.b.O(k.f10888u);
        boolean z10 = true;
        try {
            long longValue = ApplicationPersistence.getInstance().getLongValue(Constants.APP_OPEN_DATE, 0L);
            Utils utils = Utils.INSTANCE;
            if (longValue != utils.getTodayCalendar().getTimeInMillis()) {
                ApplicationPersistence.getInstance().setLongValue(Constants.APP_OPEN_DATE, utils.getTodayCalendar().getTimeInMillis());
                ApplicationPersistence.getInstance().setIntValue(Constants.APP_OPEN_DAY, ApplicationPersistence.getInstance().getIntValue(Constants.APP_OPEN_DAY, 0) + 1);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
        try {
            ta.v.H(kc.f.H(this), null, 0, new b1(this, null), 3);
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(this.A, "exception", e11);
        }
        ta.v.H(kc.f.H(this), null, 0, new g1(this, null), 3);
        ta.v.H(kc.f.H(this), null, 0, new h1(this, null), 3);
        k();
        n();
        try {
            ta.v.H(kc.f.H(this), null, 0, new n1(null), 3);
        } catch (Exception e12) {
            LogHelper.INSTANCE.e(this.A, e12);
        }
        ta.v.H(kc.f.H(this), null, 0, new a(null), 3);
        j();
        ta.v.H(kc.f.H(this), o0.f23642c, 0, new z0(this, null), 2);
        if (kotlin.jvm.internal.i.b(SessionManager.getInstance().getStringValue(SessionManager.KEY_USERTYPE), "patient")) {
            User user = FirebasePersistence.getInstance().getUser();
            if ((user == null || (appConfig = user.getAppConfig()) == null || appConfig.containsKey(Constants.FIRESTORE_GOALS_EXPERIMENT)) ? false : false) {
                nf.b e13 = nf.b.e();
                kotlin.jvm.internal.i.f(e13, "getInstance()");
                e13.g(new nf.c(new c.a()));
                e13.b().addOnCompleteListener(new com.google.firebase.messaging.h(e13, 2, this));
            }
        }
        try {
            if (ApplicationPersistence.getInstance().containsKey(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT) && ApplicationPersistence.getInstance().getIntValue(PostLoginNotificationWorkManager.POST_LOGIN_NOTIFICATION_ATTEMPT, 0) < 3) {
                a0 e14 = a0.e(this.f2382x.getApplicationContext());
                e14.getClass();
                e14.c(Collections.singletonList(new r.a(PostLoginNotificationWorkManager.class).a())).M(Collections.singletonList(new r.a(BootReceiverNotificationWorkManager.class).a())).J();
            }
        } catch (Exception e15) {
            LogHelper.INSTANCE.e(this.A, e15);
        }
        this.f10866o0 = ca.a.k(Constants.TOPICAL_2022_HEALTH_ANXIETY, Constants.TOPICAL_2022_TIME_MANAGEMENT, Constants.TOPICAL_2022_MOTIVATION, Constants.TOPICAL_2022_NURTURING_RELATIONSHIP, Constants.TOPICAL_2022_CONFLICT_RESOLUTION_AND_EMPATHY, Constants.TOPICAL_2022_COVID);
    }

    public static final void e(NotV4DashboardViewModel notV4DashboardViewModel, hs.f fVar) {
        try {
            HashMap hashMap = new HashMap();
            kotlin.jvm.internal.u uVar = new kotlin.jvm.internal.u();
            for (String str : (Iterable) fVar.f19464u) {
                FireStoreUtilsKt.fetchTopicalCourse(str, new v0(hashMap, str, notV4DashboardViewModel, uVar, fVar));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(notV4DashboardViewModel.A, e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0054 A[Catch: Exception -> 0x0147, TRY_ENTER, TryCatch #0 {Exception -> 0x0147, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0017, B:22:0x0054, B:23:0x005d, B:25:0x0075, B:27:0x0083, B:33:0x0090, B:34:0x0094, B:36:0x009a, B:47:0x00d5, B:48:0x00d9, B:49:0x00ec, B:51:0x00f2, B:55:0x0105, B:57:0x0109, B:59:0x010f, B:64:0x011a, B:65:0x011f, B:39:0x00b6, B:40:0x00ba, B:42:0x00c0, B:70:0x0138, B:66:0x0124, B:67:0x0128, B:69:0x012e, B:10:0x001e, B:11:0x0022, B:13:0x0028), top: B:75:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: Exception -> 0x0147, TryCatch #0 {Exception -> 0x0147, blocks: (B:3:0x0005, B:5:0x0011, B:7:0x0017, B:22:0x0054, B:23:0x005d, B:25:0x0075, B:27:0x0083, B:33:0x0090, B:34:0x0094, B:36:0x009a, B:47:0x00d5, B:48:0x00d9, B:49:0x00ec, B:51:0x00f2, B:55:0x0105, B:57:0x0109, B:59:0x010f, B:64:0x011a, B:65:0x011f, B:39:0x00b6, B:40:0x00ba, B:42:0x00c0, B:70:0x0138, B:66:0x0124, B:67:0x0128, B:69:0x012e, B:10:0x001e, B:11:0x0022, B:13:0x0028), top: B:75:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hs.f f(NotV4DashboardViewModel notV4DashboardViewModel) {
        boolean z10;
        boolean z11;
        boolean z12;
        Object obj;
        boolean z13;
        ArrayList<CourseDayModelV1> plan;
        ArrayList<MiniCourse> topicalCourseList;
        boolean z14;
        notV4DashboardViewModel.getClass();
        try {
            User user = FirebasePersistence.getInstance().getUser();
            if (user != null && (topicalCourseList = user.getTopicalCourseList()) != null) {
                if (!topicalCourseList.isEmpty()) {
                    for (MiniCourse miniCourse : topicalCourseList) {
                        if (is.k.Q1(miniCourse.getDomain(), new String[]{"goal-setting-newyear", "building-hope-newyear", "self-love-newyear", "emotional-intimacy-newyear", "cultivating-resilience-covid", "loneliness-covid"})) {
                            z14 = true;
                            break;
                        }
                    }
                }
                z14 = false;
                if (z14) {
                    z10 = true;
                    ArrayList<String> arrayList = notV4DashboardViewModel.f10866o0;
                    if (!z10) {
                        return new hs.f(arrayList, Boolean.TRUE);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (FirebasePersistence.getInstance().getUser().getTopicalCourseList() != null) {
                        ArrayList<MiniCourse> topicalCourseList2 = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                        if (topicalCourseList2 != null && topicalCourseList2.isEmpty()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            for (String str : arrayList) {
                                ArrayList<MiniCourse> topicalCourseList3 = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                                kotlin.jvm.internal.i.f(topicalCourseList3, "getInstance().user.topicalCourseList");
                                if (!topicalCourseList3.isEmpty()) {
                                    for (MiniCourse miniCourse2 : topicalCourseList3) {
                                        if (kotlin.jvm.internal.i.b(miniCourse2.getDomain(), str)) {
                                            z12 = false;
                                            break;
                                        }
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    arrayList2.add(str);
                                } else {
                                    ArrayList<MiniCourse> topicalCourseList4 = FirebasePersistence.getInstance().getUser().getTopicalCourseList();
                                    kotlin.jvm.internal.i.f(topicalCourseList4, "getInstance().user.topicalCourseList");
                                    Iterator<T> it = topicalCourseList4.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            obj = it.next();
                                            if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), str)) {
                                                break;
                                            }
                                        } else {
                                            obj = null;
                                            break;
                                        }
                                    }
                                    MiniCourse miniCourse3 = (MiniCourse) obj;
                                    if (miniCourse3 != null && (plan = miniCourse3.getPlan()) != null && plan.isEmpty()) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        arrayList2.add(str);
                                    } else {
                                        arrayList3.add(str);
                                    }
                                }
                            }
                            arrayList.removeAll(is.u.M2(arrayList3));
                            return new hs.f(arrayList2, Boolean.FALSE);
                        }
                    }
                    for (String str2 : arrayList) {
                        arrayList2.add(str2);
                    }
                    arrayList.removeAll(is.u.M2(arrayList3));
                    return new hs.f(arrayList2, Boolean.FALSE);
                }
            }
            z10 = false;
            ArrayList<String> arrayList4 = notV4DashboardViewModel.f10866o0;
            if (!z10) {
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(notV4DashboardViewModel.A, e10);
            return new hs.f(new ArrayList(), Boolean.FALSE);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(2:10|11)(2:31|32))(5:33|34|(10:38|(1:40)(1:57)|(1:42)(1:56)|(6:47|(1:49)|(2:51|(2:53|54))|(2:17|(5:19|20|(1:22)|23|(1:25)))|30|(0))|55|(0)|(0)|(3:14|17|(0))|30|(0))|27|28)|12|(0)|30|(0)|27|28))|61|6|7|(0)(0)|12|(0)|30|(0)|27|28) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0139, code lost:
        com.theinnerhour.b2b.utils.LogHelper.INSTANCE.e(r10.A, "NotV4 preLoadWebViews not loading the web page", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007a A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:12:0x0031, B:40:0x008e, B:44:0x0097, B:50:0x00a3, B:53:0x00b0, B:54:0x00ef, B:56:0x00f9, B:17:0x0040, B:19:0x004a, B:21:0x0054, B:23:0x005f, B:26:0x0065, B:29:0x006b, B:37:0x007a), top: B:61:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:12:0x0031, B:40:0x008e, B:44:0x0097, B:50:0x00a3, B:53:0x00b0, B:54:0x00ef, B:56:0x00f9, B:17:0x0040, B:19:0x004a, B:21:0x0054, B:23:0x005f, B:26:0x0065, B:29:0x006b, B:37:0x007a), top: B:61:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3 A[Catch: Exception -> 0x0092, TRY_LEAVE, TryCatch #0 {Exception -> 0x0092, blocks: (B:12:0x0031, B:40:0x008e, B:44:0x0097, B:50:0x00a3, B:53:0x00b0, B:54:0x00ef, B:56:0x00f9, B:17:0x0040, B:19:0x004a, B:21:0x0054, B:23:0x005f, B:26:0x0065, B:29:0x006b, B:37:0x007a), top: B:61:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(NotV4DashboardViewModel notV4DashboardViewModel, ls.d dVar) {
        j1 j1Var;
        int i6;
        String str;
        MyApplication myApplication;
        String str2;
        boolean z10;
        boolean z11;
        notV4DashboardViewModel.getClass();
        if (dVar instanceof j1) {
            j1Var = (j1) dVar;
            int i10 = j1Var.f22255x;
            if ((i10 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                j1Var.f22255x = i10 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = j1Var.f22253v;
                ms.a aVar = ms.a.COROUTINE_SUSPENDED;
                i6 = j1Var.f22255x;
                if (i6 == 0) {
                    if (i6 == 1) {
                        notV4DashboardViewModel = j1Var.f22252u;
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.TELE_CACHED, false) || !ApplicationPersistence.getInstance().getBooleanValue(Constants.COMMUNITY_CACHED, false)) {
                        Context applicationContext = notV4DashboardViewModel.f2382x.getApplicationContext();
                        str = null;
                        if (applicationContext instanceof MyApplication) {
                            myApplication = (MyApplication) applicationContext;
                        } else {
                            myApplication = null;
                        }
                        if (myApplication != null) {
                            str2 = myApplication.O;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null && !gv.n.B0(str2)) {
                            z10 = false;
                            if (!z10) {
                                str = str2;
                            }
                            if (str == null) {
                                j1Var.f22252u = notV4DashboardViewModel;
                                j1Var.f22255x = 1;
                                obj = ((rp.a) notV4DashboardViewModel.f10854a0.getValue()).j(j1Var);
                                if (obj == aVar) {
                                    return aVar;
                                }
                            }
                            if (str != null && !gv.n.B0(str)) {
                                z11 = false;
                                if (!z11) {
                                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.TELE_CACHED, false)) {
                                        WebView webView = new WebView(notV4DashboardViewModel.f2382x);
                                        WebSettings settings = webView.getSettings();
                                        kotlin.jvm.internal.i.f(settings, "webview.settings");
                                        settings.setDomStorageEnabled(true);
                                        settings.setJavaScriptEnabled(true);
                                        settings.setCacheMode(-1);
                                        settings.setLoadsImagesAutomatically(true);
                                        settings.setGeolocationEnabled(false);
                                        settings.setNeedInitialFocus(false);
                                        settings.setMediaPlaybackRequiresUserGesture(false);
                                        webView.setWebViewClient(new k1());
                                        webView.loadUrl("https://www.amahahealth.com/therapy-psychiatry?token=" + str + "&platform=android&skipAnalytics=true");
                                    }
                                    if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.COMMUNITY_CACHED, false)) {
                                        WebView webView2 = new WebView(notV4DashboardViewModel.f2382x);
                                        WebSettings settings2 = webView2.getSettings();
                                        kotlin.jvm.internal.i.f(settings2, "webview.settings");
                                        settings2.setDomStorageEnabled(true);
                                        settings2.setJavaScriptEnabled(true);
                                        settings2.setCacheMode(-1);
                                        settings2.setLoadsImagesAutomatically(true);
                                        settings2.setGeolocationEnabled(false);
                                        settings2.setNeedInitialFocus(false);
                                        settings2.setMediaPlaybackRequiresUserGesture(false);
                                        webView2.setWebViewClient(new l1());
                                        webView2.loadUrl("https://community.amahahealth.com/switch?token=" + str + "&skipAnalytics=true");
                                    }
                                }
                            }
                            z11 = true;
                            if (!z11) {
                            }
                        }
                        z10 = true;
                        if (!z10) {
                        }
                        if (str == null) {
                        }
                        if (str != null) {
                            z11 = false;
                            if (!z11) {
                            }
                        }
                        z11 = true;
                        if (!z11) {
                        }
                    }
                    return hs.k.f19476a;
                }
                str = (String) obj;
                if (str != null) {
                }
                z11 = true;
                if (!z11) {
                }
                return hs.k.f19476a;
            }
        }
        j1Var = new j1(notV4DashboardViewModel, dVar);
        Object obj2 = j1Var.f22253v;
        ms.a aVar2 = ms.a.COROUTINE_SUSPENDED;
        i6 = j1Var.f22255x;
        if (i6 == 0) {
        }
        str = (String) obj2;
        if (str != null) {
        }
        z11 = true;
        if (!z11) {
        }
        return hs.k.f19476a;
    }

    public static final void h(NotV4DashboardViewModel notV4DashboardViewModel) {
        if (notV4DashboardViewModel.f10855b0 && notV4DashboardViewModel.c0 && notV4DashboardViewModel.f10856d0 && notV4DashboardViewModel.e0) {
            notV4DashboardViewModel.f10857f0.i(Boolean.TRUE);
        }
    }

    @Override // androidx.lifecycle.l0
    public final void c() {
        FirebasePersistence.getInstance().removeFirebaseCourseUpdateListener(this);
    }

    public final void i(int i6, String str) {
        boolean z10;
        CourseApiUtil courseApiUtil = this.M;
        try {
            courseApiUtil.setMiniCourseApiListener(new w0(this, str, i6));
            if (FirebasePersistence.getInstance().getUser().getMiniCourses().isEmpty()) {
                ApplicationPersistence.getInstance().setBooleanValue("new_user", true);
                courseApiUtil.setMiniCourseInitApiListener(new x0(this));
                courseApiUtil.addAllMiniCourses(this.P, this.R);
            } else if (i6 < this.P.size()) {
                ArrayList<MiniCourse> miniCourses = FirebasePersistence.getInstance().getUser().getMiniCourses();
                kotlin.jvm.internal.i.f(miniCourses, "getInstance().user.miniCourses");
                if (!miniCourses.isEmpty()) {
                    for (MiniCourse miniCourse : miniCourses) {
                        if (kotlin.jvm.internal.i.b(miniCourse.getDomain(), this.P.get(i6))) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (z10) {
                    String str2 = this.P.get(i6);
                    kotlin.jvm.internal.i.f(str2, "courseList[i]");
                    courseApiUtil.sendMiniCourseRequest(str2, this.R);
                    return;
                }
                ArrayList<MiniCourse> miniCourses2 = FirebasePersistence.getInstance().getUser().getMiniCourses();
                kotlin.jvm.internal.i.f(miniCourses2, "getInstance().user.miniCourses");
                ArrayList arrayList = new ArrayList();
                for (Object obj : miniCourses2) {
                    if (kotlin.jvm.internal.i.b(((MiniCourse) obj).getDomain(), this.P.get(i6))) {
                        arrayList.add(obj);
                    }
                }
                String domain = ((MiniCourse) arrayList.get(0)).getDomain();
                kotlin.jvm.internal.i.d(domain);
                if (!gv.r.J0(domain, "basic") || ((MiniCourse) arrayList.get(0)).getPlan().size() != 0) {
                    String domain2 = ((MiniCourse) arrayList.get(0)).getDomain();
                    kotlin.jvm.internal.i.d(domain2);
                    if (gv.r.J0(domain2, "basic") || ((MiniCourse) arrayList.get(0)).getPlan().size() != 0) {
                        i(i6 + 1, str);
                        return;
                    }
                }
                String str3 = this.P.get(i6);
                kotlin.jvm.internal.i.f(str3, "courseList[i]");
                courseApiUtil.sendMiniCourseRequest(str3, this.R);
            } else {
                if (is.k.Q1(FirebasePersistence.getInstance().getUser().getVersion(), new String[]{"v2.3", Constants.USER_VERSION})) {
                    Iterator<MiniCourse> it = FirebasePersistence.getInstance().getUser().getMiniCourses().iterator();
                    while (it.hasNext()) {
                        MiniCourse next = it.next();
                        if (kotlin.jvm.internal.i.b(next.getCourse(), FirebasePersistence.getInstance().getUser().getCurrentCourseName()) && next.getDomain() != null) {
                            String domain3 = next.getDomain();
                            kotlin.jvm.internal.i.d(domain3);
                            if (gv.r.J0(domain3, "basic")) {
                                FirebasePersistence.getInstance().getUser().setCurrentMiniCourse(next.getDomain());
                                FirebasePersistence.getInstance().updateUserOnFirebase();
                                return;
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    public final void j() {
        ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
        if (!applicationPersistence.getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
            long longValue = applicationPersistence.getLongValue(Constants.APP_FEEDBACK_DATE, 0L);
            Utils utils = Utils.INSTANCE;
            if (longValue != utils.getTodayCalendar().getTimeInMillis()) {
                if (applicationPersistence.getIntValue(Constants.APP_OPEN_DAY) - applicationPersistence.getIntValue(Constants.APP_FEEDBACK_DAY) >= 2 || applicationPersistence.getIntValue(Constants.APP_FEEDBACK_DAY, -1) == -1) {
                    if (applicationPersistence.getBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, false) || applicationPersistence.getBooleanValue(Constants.RESOURCES_SHOW_FEEDBACK, false)) {
                        applicationPersistence.setLongValue(Constants.APP_FEEDBACK_DATE, utils.getTodayCalendar().getTimeInMillis());
                        applicationPersistence.setIntValue(Constants.APP_FEEDBACK_DAY, applicationPersistence.getIntValue(Constants.APP_OPEN_DAY));
                        boolean booleanValue = applicationPersistence.getBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, false);
                        hs.i iVar = this.X;
                        if (booleanValue) {
                            applicationPersistence.setBooleanValue(Constants.NOT_V4_SHOW_FEEDBACK, false);
                            ((w) iVar.getValue()).i(new SingleUseEvent(Constants.FEEDBACK_ACTIVITY));
                            return;
                        }
                        applicationPersistence.setBooleanValue(Constants.RESOURCES_SHOW_FEEDBACK, false);
                        ((w) iVar.getValue()).i(new SingleUseEvent(Constants.LEARNING_HUB_READ));
                    }
                }
            }
        }
    }

    public final void k() {
        try {
            FirebasePersistence.getInstance().setFirebaseCourseUpdateListener(this);
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
            this.C = courseById;
            if (courseById.getPlanSuggested().size() > 0) {
                p().i(Boolean.FALSE);
                q().i(SuggestedCardItem.SUGGESTED);
                return;
            }
            Course course = this.C;
            if (course != null) {
                if (course.getAssessments().size() >= 1) {
                    q().i(SuggestedCardItem.RETRY);
                    return;
                } else {
                    q().i(SuggestedCardItem.ASSESSMENT);
                    return;
                }
            }
            kotlin.jvm.internal.i.q("course");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    public final void l() {
        JournalQuestionModel journalQuestionModel;
        BufferedReader bufferedReader;
        if (this.f10860i0 == null) {
            tm.a aVar = this.f10859h0;
            aVar.f33281a = 1;
            try {
                InputStream openRawResource = this.f2382x.getResources().openRawResource(aVar.e());
                kotlin.jvm.internal.i.f(openRawResource, "getApplication<Applicati…nalFlowUtils.getJSONId())");
                InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, gv.a.f16927b);
                if (inputStreamReader instanceof BufferedReader) {
                    bufferedReader = (BufferedReader) inputStreamReader;
                } else {
                    bufferedReader = new BufferedReader(inputStreamReader, 8192);
                }
                String c12 = ca.a.c1(bufferedReader);
                ca.a.z(bufferedReader, null);
                Object b10 = new sf.i().b(JournalQuestionModel.class, c12);
                kotlin.jvm.internal.i.f(b10, "{\n                val te…class.java)\n            }");
                journalQuestionModel = (JournalQuestionModel) b10;
            } catch (Exception unused) {
                journalQuestionModel = new JournalQuestionModel(null, null, null, null, 15, null);
            }
            this.f10860i0 = journalQuestionModel;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.String] */
    public final void m() {
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        Object d10 = ri.e.d(Constants.LIBRARY_EXPERIMENT_V3);
        if (kotlin.jvm.internal.i.b(d10, "default")) {
            d10 = null;
        }
        if (d10 == null) {
            d10 = "variant_a";
        }
        xVar.f23469u = (String) d10;
        d0 H = kc.f.H(this);
        kotlinx.coroutines.scheduling.b bVar = o0.f23642c;
        ta.v.H(H, bVar, 0, new d(xVar, null), 2);
        ta.v.H(kc.f.H(this), bVar, 0, new e(xVar, null), 2);
        ta.v.H(kc.f.H(this), bVar, 0, new f(null), 2);
        ta.v.H(kc.f.H(this), bVar, 0, new g(null), 2);
    }

    public final void n() {
        CourseApiUtil courseApiUtil = this.M;
        try {
            if (kotlin.jvm.internal.i.b(ApplicationPersistence.getInstance().getStringValue("mc_slug_list"), "")) {
                this.N = true;
                courseApiUtil.setMiniCourseFetchListener(new h());
                Context applicationContext = this.f2382x.getApplicationContext();
                kotlin.jvm.internal.i.f(applicationContext, "getApplication<Application>().applicationContext");
                courseApiUtil.checkMcSlugUpdate(0, applicationContext);
            } else {
                this.N = false;
                Object c10 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_slug_list"), this.O);
                kotlin.jvm.internal.i.f(c10, "Gson().fromJson(Applicat…t\"), arrayListStringType)");
                this.P = (ArrayList) c10;
                Object c11 = new sf.i().c(ApplicationPersistence.getInstance().getStringValue("mc_meta_list"), this.Q);
                kotlin.jvm.internal.i.f(c11, "Gson().fromJson(Applicat…ist\"), arrayListMetaType)");
                this.R = (ArrayList) c11;
                i(0, FirebasePersistence.getInstance().getUser().getCurrentCourseName());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, "exception", e10);
        }
    }

    @Override // com.theinnerhour.b2b.model.FirebaseCourseUpdateListener
    public final void newItemsAdded(boolean z10) {
        try {
            Course courseById = FirebasePersistence.getInstance().getCourseById(FirebasePersistence.getInstance().getUser().getCurrentCourse());
            kotlin.jvm.internal.i.f(courseById, "getInstance().getCourseB…nce().user.currentCourse)");
            this.C = courseById;
            if (z10 && courseById.getAssessments().size() >= 1) {
                Course course = this.C;
                if (course != null) {
                    if (!course.getPlanSuggested().isEmpty()) {
                        q().i(SuggestedCardItem.SUGGESTED);
                        p().l(Boolean.FALSE);
                        return;
                    }
                } else {
                    kotlin.jvm.internal.i.q("course");
                    throw null;
                }
            }
            Course course2 = this.C;
            if (course2 != null) {
                if (course2.getAssessments().size() >= 1) {
                    q().i(SuggestedCardItem.RETRY);
                    return;
                } else {
                    q().i(SuggestedCardItem.ASSESSMENT);
                    return;
                }
            }
            kotlin.jvm.internal.i.q("course");
            throw null;
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    public final void o(String str) {
        if (str == null) {
            return;
        }
        try {
            ta.v.H(kc.f.H(this), o0.f23640a, 0, new i(str, null), 2);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.A, e10);
        }
    }

    public final w<Boolean> p() {
        return (w) this.L.getValue();
    }

    public final w<SuggestedCardItem> q() {
        return (w) this.K.getValue();
    }

    public final Integer r(String str, String str2, hc.d dVar) {
        switch (str.hashCode()) {
            case -2114782937:
                if (str.equals(Constants.COURSE_HAPPINESS)) {
                    if (kotlin.jvm.internal.i.b(str2, "gratitude")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedHappinessSymptomGratitude);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "mindfulness")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedHappinessSymptomMindfulness);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "social-skills")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedHappinessSymptomSocial);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "self-esteem")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedHappinessSymptomSelfEsteem);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "thought-work")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedHappinessSymptomThinking);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "physical-activity")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedHappinessSymptomActivity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedHappinessSymptomRelaxation);
                    }
                }
                break;
            case -1617042330:
                if (str.equals(Constants.COURSE_DEPRESSION)) {
                    if (kotlin.jvm.internal.i.b(str2, "low-enjoyment")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedDepressionSymptomInterest);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "low-energy")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedDepressionSymptomFatigue);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "lack-of-concentration")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedDepressionSymptomFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "low-self-esteem")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedDepressionSymptomSelfEsteem);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "negative-thoughts")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedDepressionSymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "anxiety")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedDepressionSymptomAnxiety);
                    }
                }
                break;
            case -891989580:
                if (str.equals(Constants.COURSE_STRESS)) {
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedStressSymptomRelaxation);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "attention-training")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedStressSymptomFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "problem-solving")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedStressSymptomProblem);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "assertiveness")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedStressSymptomCommunication);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "thought-balancing")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedStressSymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "balancing-work-and-life")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedStressSymptomWorkLife);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "health")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedStressSymptomHealth);
                    }
                }
                break;
            case 92960775:
                if (str.equals(Constants.COURSE_ANGER)) {
                    if (kotlin.jvm.internal.i.b(str2, "understanding-anger")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedAngerSymptomUnderstanding);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "self-calming")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedAngerSymptomSelfCalm);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "mindfulness")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedAngerSymptomMindful);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "overcoming-rumination")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedAngerSymptomRumination);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "communication")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedAngerSymptomCommunication);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "thought-work")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedAngerSymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedAngerSymptomRelaxation);
                    }
                }
                break;
            case 109522647:
                if (str.equals(Constants.COURSE_SLEEP)) {
                    if (kotlin.jvm.internal.i.b(str2, "sleep-hygiene")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedSleepSymptomHygiene);
                    }
                    if (kotlin.jvm.internal.i.b(str2, Constants.SCREEN_THOUGHTS)) {
                        return Integer.valueOf((int) R.string.notV4SuggestedSleepSymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "stimulus-control-and-sleep-restriction")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedSleepSymptomRestrict);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedSleepSymptomRelaxation);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "mindfulness")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedSleepSymptomMindful);
                    }
                }
                break;
            case 113319009:
                if (str.equals(Constants.COURSE_WORRY)) {
                    if (kotlin.jvm.internal.i.b(str2, "managing-worry")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedWorrySymptomExcess);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "tolerating-uncertainty")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedWorrySymptomTolerance);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "relaxation")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedWorrySymptomMuscle);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "focus-and-attention")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedWorrySymptomFocus);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "thought-work")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedWorrySymptomNegativity);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "problem-solving-and-overcoming-avoidance")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedWorrySymptomProblem);
                    }
                    if (kotlin.jvm.internal.i.b(str2, "sleeping-well")) {
                        return Integer.valueOf((int) R.string.notV4SuggestedWorrySymptomSleep);
                    }
                }
                break;
        }
        return null;
    }
}
