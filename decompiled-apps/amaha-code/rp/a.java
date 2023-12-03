package rp;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.model.UpcomingSessionModel;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationModel;
import com.theinnerhour.b2b.network.model.CrossProviderRecommendationNotificationModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.CustomVolleyStringRequest;
import com.theinnerhour.b2b.utils.DefaultDispatcherProvider;
import com.theinnerhour.b2b.utils.DispatcherProvider;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import e4.l;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProviderDashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final DispatcherProvider f30846a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30847b;

    /* renamed from: c  reason: collision with root package name */
    public final String f30848c;

    /* renamed from: d  reason: collision with root package name */
    public final String f30849d;

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* renamed from: rp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0523a implements CustomRetrofitCallback<CrossProviderRecommendationModel> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<CrossProviderRecommendationNotificationModel> f30850u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ a f30851v;

        public C0523a(a aVar, ls.h hVar) {
            this.f30850u = hVar;
            this.f30851v = aVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<CrossProviderRecommendationModel> call, Throwable t3) {
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(t3, "t");
            this.f30850u.resumeWith(null);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<CrossProviderRecommendationModel> call, z<CrossProviderRecommendationModel> response) {
            CrossProviderRecommendationNotificationModel crossProviderRecommendationNotificationModel;
            ls.d<CrossProviderRecommendationNotificationModel> dVar = this.f30850u;
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(response, "response");
            try {
                CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
                if (response.a()) {
                    CrossProviderRecommendationModel crossProviderRecommendationModel = response.f13696b;
                    if (crossProviderRecommendationModel != null) {
                        crossProviderRecommendationNotificationModel = crossProviderRecommendationModel.getNotification();
                    } else {
                        crossProviderRecommendationNotificationModel = null;
                    }
                    dVar.resumeWith(crossProviderRecommendationNotificationModel);
                    return;
                }
                dVar.resumeWith(null);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(this.f30851v.f30847b, e10);
                dVar.resumeWith(null);
            }
        }
    }

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class b<T> implements l.b {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<ArrayList<UpcomingSessionModel>> f30852u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ a f30853v;

        public b(a aVar, kotlinx.coroutines.k kVar) {
            this.f30852u = kVar;
            this.f30853v = aVar;
        }

        @Override // e4.l.b
        public final void a(Object obj) {
            String str = (String) obj;
            kotlinx.coroutines.j<ArrayList<UpcomingSessionModel>> jVar = this.f30852u;
            a aVar = this.f30853v;
            try {
                Object b10 = new sf.i().b(UpcomingSessionModel[].class, new JSONObject(str).getString("bookings"));
                kotlin.jvm.internal.i.f(b10, "Gson().fromJson(jsonObje…essionModel>::class.java)");
                UpcomingSessionModel[] upcomingSessionModelArr = (UpcomingSessionModel[]) b10;
                ArrayList arrayList = new ArrayList(ca.a.P0(Arrays.copyOf(upcomingSessionModelArr, upcomingSessionModelArr.length)));
                if (jVar.a()) {
                    jVar.v(new rp.d(aVar), arrayList);
                }
            } catch (JSONException e10) {
                LogHelper.INSTANCE.e(aVar.f30847b, "exception in response fetch upcoming list", (Exception) e10);
            }
        }
    }

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class c extends CustomVolleyErrorListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<ArrayList<UpcomingSessionModel>> f30855v;

        /* compiled from: ProviderDashboardViewModelRepository.kt */
        /* renamed from: rp.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0524a extends kotlin.jvm.internal.k implements ss.l<Throwable, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ a f30856u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0524a(a aVar) {
                super(1);
                this.f30856u = aVar;
            }

            @Override // ss.l
            public final hs.k invoke(Throwable th2) {
                Throwable it = th2;
                kotlin.jvm.internal.i.g(it, "it");
                LogHelper.INSTANCE.e(this.f30856u.f30847b, it);
                return hs.k.f19476a;
            }
        }

        public c(kotlinx.coroutines.k kVar) {
            this.f30855v = kVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            a aVar = a.this;
            kotlin.jvm.internal.i.g(error, "error");
            try {
                super.onErrorResponse(error);
                LogHelper.INSTANCE.e(aVar.f30847b, "https://api.theinnerhour.com/v1/customer/upcomingsessions", error);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(aVar.f30847b, "https://api.theinnerhour.com/v1/customer/upcomingsessions", e10);
            }
            kotlinx.coroutines.j<ArrayList<UpcomingSessionModel>> jVar = this.f30855v;
            if (jVar.a()) {
                jVar.v(new C0524a(aVar), null);
            }
        }
    }

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class d<T> implements l.b {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<JSONObject> f30858v;

        public d(kotlinx.coroutines.k kVar) {
            this.f30858v = kVar;
        }

        @Override // e4.l.b
        public final void a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            kotlinx.coroutines.j<JSONObject> jVar = this.f30858v;
            a aVar = a.this;
            try {
                ApplicationPersistence.getInstance().setStringValue(aVar.f30849d, jSONObject.toString());
                if (jVar.a()) {
                    jVar.v(new h(aVar), jSONObject);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(aVar.f30847b, "exception in my therapist response", e10);
                if (jVar.a()) {
                    jVar.v(new i(aVar), null);
                }
            }
        }
    }

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class e extends CustomVolleyErrorListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<JSONObject> f30860v;

        /* compiled from: ProviderDashboardViewModelRepository.kt */
        /* renamed from: rp.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0525a extends kotlin.jvm.internal.k implements ss.l<Throwable, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ a f30861u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0525a(a aVar) {
                super(1);
                this.f30861u = aVar;
            }

            @Override // ss.l
            public final hs.k invoke(Throwable th2) {
                Throwable it = th2;
                kotlin.jvm.internal.i.g(it, "it");
                LogHelper.INSTANCE.e(this.f30861u.f30847b, it);
                return hs.k.f19476a;
            }
        }

        public e(kotlinx.coroutines.k kVar) {
            this.f30860v = kVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            a aVar = a.this;
            kotlin.jvm.internal.i.g(error, "error");
            try {
                LogHelper.INSTANCE.e(aVar.f30847b, "https://api.theinnerhour.com/v1/mypsychiatristsummary", error);
                super.onErrorResponse(error);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(aVar.f30847b, "https://api.theinnerhour.com/v1/mypsychiatristsummary", e10);
            }
            kotlinx.coroutines.j<JSONObject> jVar = this.f30860v;
            if (jVar.a()) {
                jVar.v(new C0525a(aVar), null);
            }
        }
    }

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class f<T> implements l.b {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<JSONObject> f30863v;

        public f(kotlinx.coroutines.k kVar) {
            this.f30863v = kVar;
        }

        @Override // e4.l.b
        public final void a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            a aVar = a.this;
            kotlinx.coroutines.j<JSONObject> jVar = this.f30863v;
            if (jSONObject == null) {
                try {
                    if (!(!gv.n.B0(String.valueOf(jSONObject)))) {
                        if (jVar.a()) {
                            jVar.v(new l(aVar), null);
                        }
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(aVar.f30847b, "exception in my therapist response", e10);
                    if (jVar.a()) {
                        jVar.v(new m(aVar), null);
                        return;
                    }
                    return;
                }
            }
            ApplicationPersistence.getInstance().setStringValue(aVar.f30848c, jSONObject.toString());
            if (jVar.a()) {
                jVar.v(new k(aVar), jSONObject);
            }
        }
    }

    /* compiled from: ProviderDashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class g extends CustomVolleyErrorListener {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.j<JSONObject> f30865v;

        /* compiled from: ProviderDashboardViewModelRepository.kt */
        /* renamed from: rp.a$g$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0526a extends kotlin.jvm.internal.k implements ss.l<Throwable, hs.k> {

            /* renamed from: u  reason: collision with root package name */
            public final /* synthetic */ a f30866u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0526a(a aVar) {
                super(1);
                this.f30866u = aVar;
            }

            @Override // ss.l
            public final hs.k invoke(Throwable th2) {
                Throwable it = th2;
                kotlin.jvm.internal.i.g(it, "it");
                LogHelper.INSTANCE.e(this.f30866u.f30847b, it);
                return hs.k.f19476a;
            }
        }

        public g(kotlinx.coroutines.k kVar) {
            this.f30865v = kVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            a aVar = a.this;
            kotlin.jvm.internal.i.g(error, "error");
            try {
                LogHelper.INSTANCE.e(aVar.f30847b, "https://api.theinnerhour.com/v1/mytherapistsummary", error);
                super.onErrorResponse(error);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(aVar.f30847b, "https://api.theinnerhour.com/v1/mytherapistsummary", e10);
            }
            kotlinx.coroutines.j<JSONObject> jVar = this.f30865v;
            if (jVar.a()) {
                jVar.v(new C0526a(aVar), null);
            }
        }
    }

    public a() {
        this(0);
    }

    public final Object a(String str, ls.d<? super CrossProviderRecommendationNotificationModel> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ((or.i) nr.b.a(or.i.class)).h(str).I(new C0523a(this, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30847b, e10);
        }
        return hVar.b();
    }

    public final Object b(ls.d dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ((or.i) nr.b.a(or.i.class)).g("https://api.theinnerhour.com/v1/get_tele_nps").I(new rp.b(this, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30847b, e10);
        }
        return hVar.b();
    }

    public final Object c(ls.d<? super ArrayList<UpcomingSessionModel>> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        VolleySingleton.getInstance().add(new CustomVolleyStringRequest(0, "https://api.theinnerhour.com/v1/customer/upcomingsessions", new b(this, kVar), new c(kVar)));
        return kVar.s();
    }

    public final Object d(ls.d dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ((or.i) nr.b.a(or.i.class)).b("https://api.theinnerhour.com/v1/customer/completedsessions").I(new rp.f(this, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30847b, e10);
        }
        return hVar.b();
    }

    public final Object e(boolean z10, boolean z11, int i6, ls.d dVar) {
        String str;
        String str2;
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            or.m mVar = (or.m) nr.b.a(or.m.class);
            if (z11) {
                str = "therapist";
            } else {
                str = "psychiatrist";
            }
            String str3 = str;
            if (z10) {
                str2 = "pending";
            } else {
                str2 = "completed";
            }
            mVar.f("https://api.theinnerhour.com/v1/bse/assigned_tools", null, 1, i6, str3, str2, null).I(new rp.g(this, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30847b, e10);
            hVar.resumeWith(null);
        }
        return hVar.b();
    }

    public final Object f(ls.d<? super JSONObject> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/mypsychiatristsummary", null, new d(kVar), new e(kVar)));
        return kVar.s();
    }

    public final Object g(boolean z10, int i6, ls.d dVar) {
        Integer num;
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            or.i iVar = (or.i) nr.b.a(or.i.class);
            Integer num2 = null;
            if (z10) {
                num = new Integer(i6);
            } else {
                num = null;
            }
            if (!z10) {
                num2 = new Integer(i6);
            }
            iVar.f("https://api.theinnerhour.com/v1/customer/suggestedsessions", num, num2).I(new j(this, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30847b, e10);
        }
        return hVar.b();
    }

    public final Object h(ls.d<? super JSONObject> dVar) {
        kotlinx.coroutines.k kVar = new kotlinx.coroutines.k(1, ca.a.G0(dVar));
        kVar.u();
        VolleySingleton.getInstance().add(new CustomVolleyJsonObjectRequest(0, "https://api.theinnerhour.com/v1/mytherapistsummary", null, new f(kVar), new g(kVar)));
        return kVar.s();
    }

    public final Object i(ls.d dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ((or.i) nr.b.a(or.i.class)).j("https://api.theinnerhour.com/v1/customer/upcomingsessions").I(new n(this, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30847b, e10);
        }
        return hVar.b();
    }

    public final Object j(ls.d dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        try {
            ((or.i) nr.b.a(or.i.class)).l("https://api.theinnerhour.com/v1/giveaccesstoken").I(new o(this, hVar));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f30847b, e10);
        }
        return hVar.b();
    }

    public final Object k(String str, ls.d dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        ((or.i) nr.b.a(or.i.class)).i("https://api.theinnerhour.com/v1/bse/notifications/".concat(str)).I(new q(this, hVar));
        return hVar.b();
    }

    public a(int i6) {
        this.f30846a = new DefaultDispatcherProvider();
        this.f30847b = LogHelper.INSTANCE.makeLogTag("ProviderDBVMRepository");
        this.f30848c = "therapist_data_cache";
        this.f30849d = "psychiatrist_data_cache";
    }
}
