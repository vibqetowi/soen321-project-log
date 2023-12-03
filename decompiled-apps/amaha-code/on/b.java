package on;

import com.android.volley.VolleyError;
import com.theinnerhour.b2b.model.VolleySingleton;
import com.theinnerhour.b2b.utils.CustomVolleyErrorListener;
import com.theinnerhour.b2b.utils.CustomVolleyJsonObjectRequest;
import com.theinnerhour.b2b.utils.LogHelper;
import hs.k;
import kotlin.jvm.internal.i;
import nn.a0;
import nn.b0;
import nn.c;
import nn.c0;
import nn.d;
import nn.d0;
import nn.e0;
import nn.f0;
import nn.g0;
import nn.g1;
import nn.i0;
import nn.i1;
import nn.j0;
import nn.j1;
import nn.k0;
import nn.k1;
import nn.l0;
import nn.l1;
import nn.m0;
import nn.n0;
import nn.o0;
import nn.p0;
import nn.r1;
import nn.s0;
import nn.s1;
import nn.t;
import nn.t1;
import nn.u;
import nn.u0;
import nn.u1;
import nn.v1;
import nn.w0;
import nn.w1;
import nn.y;
import nn.z;
import org.json.JSONObject;
import ss.q;
/* compiled from: MonetizationHelper.kt */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f27686a = LogHelper.INSTANCE.makeLogTag(b.class);

    /* compiled from: MonetizationHelper.kt */
    /* loaded from: classes2.dex */
    public static final class a extends CustomVolleyErrorListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ q<Boolean, JSONObject, VolleyError, k> f27687u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ b f27688v;

        /* JADX WARN: Multi-variable type inference failed */
        public a(q<? super Boolean, ? super JSONObject, ? super VolleyError, k> qVar, b bVar) {
            this.f27687u = qVar;
            this.f27688v = bVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            b bVar = this.f27688v;
            i.g(error, "error");
            try {
                this.f27687u.invoke(Boolean.FALSE, null, error);
                super.onErrorResponse(error);
                LogHelper.INSTANCE.e(bVar.f27686a, "https://api.theinnerhour.com/v1/app_coupon_apply_v2", error);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(bVar.f27686a, "https://api.theinnerhour.com/v1/app_coupon_apply_v2", e10);
            }
        }
    }

    /* compiled from: MonetizationHelper.kt */
    /* renamed from: on.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0460b extends CustomVolleyErrorListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ q<Boolean, JSONObject, VolleyError, k> f27689u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ b f27690v;

        /* JADX WARN: Multi-variable type inference failed */
        public C0460b(q<? super Boolean, ? super JSONObject, ? super VolleyError, k> qVar, b bVar) {
            this.f27689u = qVar;
            this.f27690v = bVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomVolleyErrorListener, e4.l.a
        public final void onErrorResponse(VolleyError error) {
            b bVar = this.f27690v;
            i.g(error, "error");
            try {
                this.f27689u.invoke(Boolean.FALSE, null, error);
                super.onErrorResponse(error);
                LogHelper.INSTANCE.e(bVar.f27686a, "https://api.theinnerhour.com/v1/android_sub_free", error);
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(bVar.f27686a, "https://api.theinnerhour.com/v1/android_sub_free", e10);
            }
        }
    }

    public static rn.b a(String slug) {
        i.g(slug, "slug");
        int hashCode = slug.hashCode();
        switch (hashCode) {
            case 64560:
                if (slug.equals("AB1")) {
                    return new nn.a();
                }
                break;
            case 64561:
                if (slug.equals("AB2")) {
                    return new nn.b();
                }
                break;
            default:
                switch (hashCode) {
                    case 66482:
                        if (slug.equals("CB1")) {
                            return new g0();
                        }
                        break;
                    case 66483:
                        if (slug.equals("CB2")) {
                            return new i0();
                        }
                        break;
                    case 66484:
                        if (slug.equals("CB3")) {
                            return new j0();
                        }
                        break;
                    case 66485:
                        if (slug.equals("CB4")) {
                            return new k0();
                        }
                        break;
                    case 66486:
                        if (slug.equals("CB5")) {
                            return new l0();
                        }
                        break;
                    case 66487:
                        if (slug.equals("CB6")) {
                            return new m0();
                        }
                        break;
                    case 66488:
                        if (slug.equals("CB7")) {
                            return new n0();
                        }
                        break;
                    case 66489:
                        if (slug.equals("CB8")) {
                            return new o0();
                        }
                        break;
                    case 66490:
                        if (slug.equals("CB9")) {
                            return new p0();
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case 66513:
                                if (slug.equals("CC1")) {
                                    return new s0();
                                }
                                break;
                            case 66514:
                                if (slug.equals("CC2")) {
                                    return new u0();
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 69365:
                                        if (slug.equals("FB1")) {
                                            return new i1();
                                        }
                                        break;
                                    case 83160:
                                        if (slug.equals("TM1")) {
                                            return new w1();
                                        }
                                        break;
                                    case 2078785:
                                        if (slug.equals("CTA1")) {
                                            return new w0();
                                        }
                                        break;
                                    case 2150395:
                                        if (slug.equals("FAQ1")) {
                                            return new g1();
                                        }
                                        break;
                                    case 2547415:
                                        if (slug.equals("SKU4")) {
                                            return new t1();
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 72248:
                                                if (slug.equals("IB1")) {
                                                    return new j1();
                                                }
                                                break;
                                            case 72249:
                                                if (slug.equals("IB2")) {
                                                    return new k1();
                                                }
                                                break;
                                            case 72250:
                                                if (slug.equals("IB3")) {
                                                    return new l1();
                                                }
                                                break;
                                            default:
                                                switch (hashCode) {
                                                    case 82819:
                                                        if (slug.equals("TB1")) {
                                                            return new u1();
                                                        }
                                                        break;
                                                    case 82820:
                                                        if (slug.equals("TB2")) {
                                                            return new v1();
                                                        }
                                                        break;
                                                    default:
                                                        switch (hashCode) {
                                                            case 2002897:
                                                                if (slug.equals("ACB1")) {
                                                                    return new c();
                                                                }
                                                                break;
                                                            case 2002898:
                                                                if (slug.equals("ACB2")) {
                                                                    return new d();
                                                                }
                                                                break;
                                                            default:
                                                                switch (hashCode) {
                                                                    case 2060990:
                                                                        if (slug.equals("CB10")) {
                                                                            return new t();
                                                                        }
                                                                        break;
                                                                    case 2060991:
                                                                        if (slug.equals("CB11")) {
                                                                            return new u();
                                                                        }
                                                                        break;
                                                                    case 2060992:
                                                                        if (slug.equals("CB12")) {
                                                                            return new y();
                                                                        }
                                                                        break;
                                                                    case 2060993:
                                                                        if (slug.equals("CB13")) {
                                                                            return new z();
                                                                        }
                                                                        break;
                                                                    case 2060994:
                                                                        if (slug.equals("CB14")) {
                                                                            return new a0();
                                                                        }
                                                                        break;
                                                                    case 2060995:
                                                                        if (slug.equals("CB15")) {
                                                                            return new b0();
                                                                        }
                                                                        break;
                                                                    case 2060996:
                                                                        if (slug.equals("CB16")) {
                                                                            return new c0();
                                                                        }
                                                                        break;
                                                                    case 2060997:
                                                                        if (slug.equals("CB17")) {
                                                                            return new d0();
                                                                        }
                                                                        break;
                                                                    case 2060998:
                                                                        if (slug.equals("CB18")) {
                                                                            return new e0();
                                                                        }
                                                                        break;
                                                                    case 2060999:
                                                                        if (slug.equals("CB19")) {
                                                                            return new f0();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 2547412:
                                                                                if (slug.equals("SKU1")) {
                                                                                    return new r1();
                                                                                }
                                                                                break;
                                                                            case 2547413:
                                                                                if (slug.equals("SKU2")) {
                                                                                    return new s1();
                                                                                }
                                                                                break;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
        return null;
    }

    public final void b(String str, q<? super Boolean, ? super JSONObject, ? super VolleyError, k> qVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coupon", str);
        CustomVolleyJsonObjectRequest customVolleyJsonObjectRequest = new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/app_coupon_apply_v2", jSONObject, new on.a(qVar, 0), new a(qVar, this));
        customVolleyJsonObjectRequest.setRetryPolicy(new e4.d(0, 1));
        VolleySingleton.getInstance().add(customVolleyJsonObjectRequest);
    }

    public final void c(String str, q<? super Boolean, ? super JSONObject, ? super VolleyError, k> qVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("coupon_id", str);
        CustomVolleyJsonObjectRequest customVolleyJsonObjectRequest = new CustomVolleyJsonObjectRequest(1, "https://api.theinnerhour.com/v1/android_sub_free", jSONObject, new on.a(qVar, 1), new C0460b(qVar, this));
        customVolleyJsonObjectRequest.setRetryPolicy(new e4.d(0, 1));
        VolleySingleton.getInstance().add(customVolleyJsonObjectRequest);
    }
}
