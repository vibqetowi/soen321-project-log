package wo;

import com.theinnerhour.b2b.components.telecommunications.model.TherapistPackagesModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import org.json.JSONObject;
/* compiled from: ExperimentProfileActivityViewModel.kt */
@ns.e(c = "com.theinnerhour.b2b.components.profile.experiment.viewModel.ExperimentProfileActivityViewModel$fetchTherapistInfo$2", f = "ExperimentProfileActivityViewModel.kt", l = {253}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class m0 extends ns.i implements ss.p<kotlinx.coroutines.d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f36955u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n0 f36956v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f36957w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ boolean f36958x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, String str, boolean z10, ls.d<? super m0> dVar) {
        super(2, dVar);
        this.f36956v = n0Var;
        this.f36957w = str;
        this.f36958x = z10;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new m0(this.f36956v, this.f36957w, this.f36958x, dVar);
    }

    @Override // ss.p
    public final Object invoke(kotlinx.coroutines.d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((m0) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0110, code lost:
        if (kotlin.jvm.internal.i.b(r14.getString("psychiatrist"), "null") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0112, code lost:
        r1 = com.theinnerhour.b2b.utils.Utils.INSTANCE;
        r14 = r14.getJSONObject("psychiatrist");
        kotlin.jvm.internal.i.f(r14, "obj.getJSONObject(\"psychiatrist\")");
        r1.parseTherapistObject(r8, r14);
        r7.i(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e A[Catch: Exception -> 0x00de, TryCatch #0 {Exception -> 0x00de, blocks: (B:15:0x005b, B:17:0x006b, B:19:0x0071, B:25:0x007d, B:27:0x0087, B:29:0x0098, B:31:0x009e, B:33:0x00a4, B:39:0x00b0, B:41:0x00ba, B:43:0x00ca, B:49:0x00d3, B:50:0x00da), top: B:75:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d2  */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f36955u;
        n0 n0Var = this.f36956v;
        boolean z13 = true;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            e0 e0Var = n0Var.f36970y;
            this.f36955u = 1;
            e0Var.getClass();
            ls.h hVar = new ls.h(ca.a.G0(this));
            ((or.i) nr.b.a(or.i.class)).k(this.f36957w).I(new d0(e0Var, hVar));
            obj = hVar.b();
            if (obj == aVar) {
                return aVar;
            }
        }
        JSONObject jSONObject = (JSONObject) obj;
        TherapistPackagesModel therapistPackagesModel = null;
        if (this.f36958x) {
            androidx.lifecycle.w<hs.f<TherapistPackagesModel, TherapistPackagesModel>> wVar = n0Var.J;
            try {
                if (jSONObject != null) {
                    TherapistPackagesModel therapistPackagesModel2 = new TherapistPackagesModel();
                    TherapistPackagesModel therapistPackagesModel3 = new TherapistPackagesModel();
                    if (jSONObject.has("therapist")) {
                        String optString = jSONObject.optString("therapist", "");
                        if (optString != null && !gv.n.B0(optString)) {
                            z12 = false;
                            if (!z12 && !kotlin.jvm.internal.i.b(jSONObject.optString("therapist", ""), "null")) {
                                Utils utils = Utils.INSTANCE;
                                JSONObject jSONObject2 = jSONObject.getJSONObject("therapist");
                                kotlin.jvm.internal.i.f(jSONObject2, "obj.getJSONObject(\"therapist\")");
                                utils.parseTherapistObject(therapistPackagesModel2, jSONObject2);
                                z10 = true;
                                if (jSONObject.has("couplestherapist")) {
                                    String optString2 = jSONObject.optString("couplestherapist", "");
                                    if (optString2 != null && !gv.n.B0(optString2)) {
                                        z11 = false;
                                        if (!z11 && !kotlin.jvm.internal.i.b(jSONObject.optString("couplestherapist", ""), "null")) {
                                            Utils utils2 = Utils.INSTANCE;
                                            JSONObject jSONObject3 = jSONObject.getJSONObject("couplestherapist");
                                            kotlin.jvm.internal.i.f(jSONObject3, "obj.getJSONObject(\"couplestherapist\")");
                                            utils2.parseTherapistObject(therapistPackagesModel3, jSONObject3);
                                            if (!z10) {
                                                therapistPackagesModel2 = null;
                                            }
                                            if (z13) {
                                                therapistPackagesModel = therapistPackagesModel3;
                                            }
                                            wVar.i(new hs.f<>(therapistPackagesModel2, therapistPackagesModel));
                                        }
                                    }
                                    z11 = true;
                                    if (!z11) {
                                        Utils utils22 = Utils.INSTANCE;
                                        JSONObject jSONObject32 = jSONObject.getJSONObject("couplestherapist");
                                        kotlin.jvm.internal.i.f(jSONObject32, "obj.getJSONObject(\"couplestherapist\")");
                                        utils22.parseTherapistObject(therapistPackagesModel3, jSONObject32);
                                        if (!z10) {
                                        }
                                        if (z13) {
                                        }
                                        wVar.i(new hs.f<>(therapistPackagesModel2, therapistPackagesModel));
                                    }
                                }
                                z13 = false;
                                if (!z10) {
                                }
                                if (z13) {
                                }
                                wVar.i(new hs.f<>(therapistPackagesModel2, therapistPackagesModel));
                            }
                        }
                        z12 = true;
                        if (!z12) {
                            Utils utils3 = Utils.INSTANCE;
                            JSONObject jSONObject22 = jSONObject.getJSONObject("therapist");
                            kotlin.jvm.internal.i.f(jSONObject22, "obj.getJSONObject(\"therapist\")");
                            utils3.parseTherapistObject(therapistPackagesModel2, jSONObject22);
                            z10 = true;
                            if (jSONObject.has("couplestherapist")) {
                            }
                            z13 = false;
                            if (!z10) {
                            }
                            if (z13) {
                            }
                            wVar.i(new hs.f<>(therapistPackagesModel2, therapistPackagesModel));
                        }
                    }
                    z10 = false;
                    if (jSONObject.has("couplestherapist")) {
                    }
                    z13 = false;
                    if (!z10) {
                    }
                    if (z13) {
                    }
                    wVar.i(new hs.f<>(therapistPackagesModel2, therapistPackagesModel));
                } else {
                    wVar.i(null);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(n0Var.f36971z, e10);
            }
        } else {
            androidx.lifecycle.w<TherapistPackagesModel> wVar2 = n0Var.K;
            try {
                if (jSONObject != null) {
                    TherapistPackagesModel therapistPackagesModel4 = new TherapistPackagesModel();
                    if (jSONObject.has("psychiatrist")) {
                        String optString3 = jSONObject.optString("psychiatrist", "");
                        if (optString3 != null && !gv.n.B0(optString3)) {
                            z13 = false;
                        }
                    }
                    wVar2.i(null);
                } else {
                    wVar2.i(null);
                }
            } catch (Exception e11) {
                LogHelper.INSTANCE.e(n0Var.f36971z, e11);
            }
        }
        return hs.k.f19476a;
    }
}
