package wo;

import com.theinnerhour.b2b.model.AddFamilyMember;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.LogHelper;
import e4.l;
import org.json.JSONObject;
/* compiled from: ExperimentAddFamilyRepository.kt */
/* loaded from: classes2.dex */
public final class a<T> implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f36862u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ AddFamilyMember f36863v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ ls.d<ApiNetworkStatus> f36864w;

    public a(g gVar, AddFamilyMember addFamilyMember, ls.h hVar) {
        this.f36862u = gVar;
        this.f36863v = addFamilyMember;
        this.f36864w = hVar;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        ls.d<ApiNetworkStatus> dVar = this.f36864w;
        g gVar = this.f36862u;
        try {
            androidx.lifecycle.w<String> wVar = gVar.f36893c;
            wVar.i(this.f36863v.getEmailId() + " has been removed.");
            dVar.resumeWith(ApiNetworkStatus.SUCCESS);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(gVar.f36891a, "exception", e10);
            dVar.resumeWith(ApiNetworkStatus.EXCEPTION);
        }
    }
}
