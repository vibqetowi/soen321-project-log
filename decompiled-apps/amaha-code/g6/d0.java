package g6;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import g6.p;
import org.json.JSONException;
import org.json.JSONObject;
import w5.e0;
import w5.j0;
/* compiled from: WebViewLoginMethodHandler.kt */
/* loaded from: classes.dex */
public final class d0 extends c0 {
    public static final Parcelable.Creator<d0> CREATOR = new b();
    public final h5.g A;

    /* renamed from: x  reason: collision with root package name */
    public j0 f16243x;

    /* renamed from: y  reason: collision with root package name */
    public String f16244y;

    /* renamed from: z  reason: collision with root package name */
    public final String f16245z;

    /* compiled from: WebViewLoginMethodHandler.kt */
    /* loaded from: classes.dex */
    public final class a extends j0.a {

        /* renamed from: e  reason: collision with root package name */
        public String f16246e;
        public o f;

        /* renamed from: g  reason: collision with root package name */
        public a0 f16247g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f16248h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f16249i;

        /* renamed from: j  reason: collision with root package name */
        public String f16250j;

        /* renamed from: k  reason: collision with root package name */
        public String f16251k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d0 this$0, androidx.fragment.app.p pVar, String applicationId, Bundle bundle) {
            super(pVar, applicationId, bundle);
            kotlin.jvm.internal.i.g(this$0, "this$0");
            kotlin.jvm.internal.i.g(applicationId, "applicationId");
            this.f16246e = "fbconnect://success";
            this.f = o.NATIVE_WITH_FALLBACK;
            this.f16247g = a0.FACEBOOK;
        }

        public final j0 a() {
            String str;
            Bundle bundle = this.f36486d;
            if (bundle != null) {
                bundle.putString("redirect_uri", this.f16246e);
                bundle.putString("client_id", this.f36484b);
                String str2 = this.f16250j;
                if (str2 != null) {
                    bundle.putString("e2e", str2);
                    if (this.f16247g == a0.INSTAGRAM) {
                        str = "token,signed_request,graph_domain,granted_scopes";
                    } else {
                        str = "token,signed_request,graph_domain";
                    }
                    bundle.putString("response_type", str);
                    bundle.putString("return_scopes", "true");
                    String str3 = this.f16251k;
                    if (str3 != null) {
                        bundle.putString("auth_type", str3);
                        bundle.putString("login_behavior", this.f.name());
                        if (this.f16248h) {
                            bundle.putString("fx_app", this.f16247g.f16230u);
                        }
                        if (this.f16249i) {
                            bundle.putString("skip_dedupe", "true");
                        }
                        int i6 = j0.G;
                        Context context = this.f36483a;
                        if (context != null) {
                            a0 targetApp = this.f16247g;
                            j0.c cVar = this.f36485c;
                            kotlin.jvm.internal.i.g(targetApp, "targetApp");
                            j0.b(context);
                            return new j0(context, "oauth", bundle, targetApp, cVar);
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
                    }
                    kotlin.jvm.internal.i.q("authType");
                    throw null;
                }
                kotlin.jvm.internal.i.q("e2e");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.os.Bundle");
        }
    }

    /* compiled from: WebViewLoginMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel source) {
            kotlin.jvm.internal.i.g(source, "source");
            return new d0(source);
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i6) {
            return new d0[i6];
        }
    }

    /* compiled from: WebViewLoginMethodHandler.kt */
    /* loaded from: classes.dex */
    public static final class c implements j0.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ p.d f16253b;

        public c(p.d dVar) {
            this.f16253b = dVar;
        }

        @Override // w5.j0.c
        public final void a(Bundle bundle, FacebookException facebookException) {
            d0 d0Var = d0.this;
            d0Var.getClass();
            p.d request = this.f16253b;
            kotlin.jvm.internal.i.g(request, "request");
            d0Var.n(request, bundle, facebookException);
        }
    }

    public d0(p pVar) {
        super(pVar);
        this.f16245z = "web_view";
        this.A = h5.g.WEB_VIEW;
    }

    @Override // g6.y
    public final void b() {
        j0 j0Var = this.f16243x;
        if (j0Var != null) {
            if (j0Var != null) {
                j0Var.cancel();
            }
            this.f16243x = null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // g6.y
    public final String e() {
        return this.f16245z;
    }

    @Override // g6.y
    public final int k(p.d dVar) {
        String str;
        Bundle l2 = l(dVar);
        c cVar = new c(dVar);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "e2e.toString()");
        this.f16244y = jSONObject2;
        a(jSONObject2, "e2e");
        androidx.fragment.app.p e10 = d().e();
        if (e10 == null) {
            return 0;
        }
        boolean x10 = e0.x(e10);
        a aVar = new a(this, e10, dVar.f16305x, l2);
        String str2 = this.f16244y;
        if (str2 != null) {
            aVar.f16250j = str2;
            if (x10) {
                str = "fbconnect://chrome_os_success";
            } else {
                str = "fbconnect://success";
            }
            aVar.f16246e = str;
            String authType = dVar.B;
            kotlin.jvm.internal.i.g(authType, "authType");
            aVar.f16251k = authType;
            o loginBehavior = dVar.f16302u;
            kotlin.jvm.internal.i.g(loginBehavior, "loginBehavior");
            aVar.f = loginBehavior;
            a0 targetApp = dVar.F;
            kotlin.jvm.internal.i.g(targetApp, "targetApp");
            aVar.f16247g = targetApp;
            aVar.f16248h = dVar.G;
            aVar.f16249i = dVar.H;
            aVar.f36485c = cVar;
            this.f16243x = aVar.a();
            w5.h hVar = new w5.h();
            hVar.setRetainInstance(true);
            hVar.f36466u = this.f16243x;
            hVar.show(e10.getSupportFragmentManager(), "FacebookDialogFragment");
            return 1;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // g6.c0
    public final h5.g m() {
        return this.A;
    }

    @Override // g6.y, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i6) {
        kotlin.jvm.internal.i.g(dest, "dest");
        super.writeToParcel(dest, i6);
        dest.writeString(this.f16244y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Parcel source) {
        super(source);
        kotlin.jvm.internal.i.g(source, "source");
        this.f16245z = "web_view";
        this.A = h5.g.WEB_VIEW;
        this.f16244y = source.readString();
    }
}
