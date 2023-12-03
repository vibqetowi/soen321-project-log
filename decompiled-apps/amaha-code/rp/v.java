package rp;

import androidx.lifecycle.l0;
import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlinx.coroutines.d0;
import lv.c0;
import lv.v;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: TelecommunicationsProviderListViewModel.kt */
/* loaded from: classes2.dex */
public final class v extends l0 {

    /* renamed from: x  reason: collision with root package name */
    public final s f30909x;

    /* renamed from: y  reason: collision with root package name */
    public final androidx.lifecycle.w<ArrayList<TherapistPackagesModel>> f30910y;

    /* compiled from: TelecommunicationsProviderListViewModel.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.telecommunications.viewmodel.TelecommunicationsProviderListViewModel$fetchTeleEntryProvidersList$1", f = "TelecommunicationsProviderListViewModel.kt", l = {18}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public int f30911u;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ String f30913w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f30913w = str;
        }

        @Override // ns.a
        public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f30913w, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            ms.a aVar = ms.a.COROUTINE_SUSPENDED;
            int i6 = this.f30911u;
            v vVar = v.this;
            if (i6 != 0) {
                if (i6 == 1) {
                    sp.b.d0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                sp.b.d0(obj);
                s sVar = vVar.f30909x;
                String str = this.f30913w;
                this.f30911u = 1;
                sVar.getClass();
                ls.h hVar = new ls.h(ca.a.G0(this));
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(str);
                    hs.k kVar = hs.k.f19476a;
                    jSONObject.put("expertise", jSONArray);
                    jSONObject.put("experiment_name", "variant_d");
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.i.f(jSONObject2, "JSONObject().apply {\n   …\n            }.toString()");
                    Pattern pattern = lv.v.f24702d;
                    ((co.b) nr.b.a(co.b.class)).b("https://api.theinnerhour.com/v1/search/v2/therapists", c0.a.a(jSONObject2, v.a.b("application/json; charset=utf-8"))).I(new r(hVar));
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(sVar.f30899a, e10);
                }
                obj = hVar.b();
                if (obj == aVar) {
                    return aVar;
                }
            }
            vVar.f30910y.i((ArrayList) obj);
            return hs.k.f19476a;
        }
    }

    public v(s repository) {
        kotlin.jvm.internal.i.g(repository, "repository");
        this.f30909x = repository;
        LogHelper.INSTANCE.makeLogTag("TelecommunicationsProviderListViewModel");
        this.f30910y = new androidx.lifecycle.w<>();
    }

    public final void e(String str) {
        if (str == null) {
            return;
        }
        ta.v.H(kc.f.H(this), null, 0, new a(str, null), 3);
    }
}
