package jo;

import hs.k;
import kotlinx.coroutines.d0;
import ls.d;
import ns.e;
import ns.i;
import org.json.JSONArray;
import org.json.JSONObject;
import ss.p;
/* compiled from: ProAssessmentViewModel.kt */
@e(c = "com.theinnerhour.b2b.components.pro.assessment.viewmodel.ProAssessmentViewModel$sortResponse$2", f = "ProAssessmentViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ c f22530u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(2, dVar);
        this.f22530u = cVar;
    }

    @Override // ns.a
    public final d<k> create(Object obj, d<?> dVar) {
        return new b(this.f22530u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        sp.b.d0(obj);
        c cVar = this.f22530u;
        cVar.A.i(cVar.f22532y.optJSONObject("pro_assessment"));
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        int length = cVar.f22532y.getJSONArray("assigned_assessments").length();
        for (int i6 = 0; i6 < length; i6++) {
            JSONObject jSONObject = cVar.f22532y.getJSONArray("assigned_assessments").getJSONObject(i6);
            if (jSONObject.getBoolean("assessment_complete")) {
                jSONArray.put(jSONObject);
            } else {
                jSONArray2.put(jSONObject);
            }
        }
        int length2 = jSONArray.length();
        for (int i10 = 0; i10 < length2; i10++) {
            jSONArray2.put(jSONArray.getJSONObject(i10));
        }
        cVar.B.i(jSONArray2);
        return k.f19476a;
    }
}
