package ml;

import android.content.Context;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: DashboardViewModelRepository.kt */
/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final String f25590a = LogHelper.INSTANCE.makeLogTag("DashboardViewModelRepository");

    /* compiled from: DashboardViewModelRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CustomRetrofitCallback<sf.m> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ ls.d<ArrayList<String>> f25592v;

        public a(ls.h hVar) {
            this.f25592v = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<sf.m> call, Throwable t3) {
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(t3, "t");
            LogHelper.INSTANCE.e(u.this.f25590a, t3);
            this.f25592v.resumeWith(new ArrayList());
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<sf.m> call, dw.z<sf.m> response) {
            String mVar;
            kotlin.jvm.internal.i.g(call, "call");
            kotlin.jvm.internal.i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            boolean a10 = response.a();
            ls.d<ArrayList<String>> dVar = this.f25592v;
            if (a10) {
                try {
                    sf.m mVar2 = response.f13696b;
                    if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                        JSONArray jSONArray = new JSONObject(mVar).getJSONArray("data");
                        int length = jSONArray.length();
                        ArrayList arrayList = new ArrayList();
                        for (int i6 = 0; i6 < length; i6++) {
                            Object obj = jSONArray.get(i6);
                            if (obj instanceof String) {
                                arrayList.add(obj);
                            }
                        }
                        dVar.resumeWith(arrayList);
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(u.this.f25590a, e10);
                    dVar.resumeWith(new ArrayList());
                    return;
                }
            }
            dVar.resumeWith(new ArrayList());
        }
    }

    public u(Context context) {
    }

    public static final void a(u uVar, String str) {
        String j02;
        uVar.getClass();
        try {
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null && (j02 = fVar.j0()) != null) {
                DatabaseReference reference = FirebaseDatabase.getInstance().getReference("userLibraryProgress/".concat(j02));
                kotlin.jvm.internal.i.f(reference, "getInstance().getReferen…serLibraryProgress/$uid\")");
                reference.orderByChild("id").equalTo(str).addListenerForSingleValueEvent(new kc.f());
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(uVar.f25590a, e10);
        }
    }

    public final Object b(String str, ls.d<? super ArrayList<String>> dVar) {
        ls.h hVar = new ls.h(ca.a.G0(dVar));
        ((or.i) nr.b.a(or.i.class)).m(str).I(new a(hVar));
        return hVar.b();
    }
}
