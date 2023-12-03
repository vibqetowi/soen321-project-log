package wo;

import com.theinnerhour.b2b.model.AddFamilyMember;
import com.theinnerhour.b2b.utils.ApiNetworkStatus;
import com.theinnerhour.b2b.utils.LogHelper;
import e4.l;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
/* compiled from: ExperimentAddFamilyRepository.kt */
/* loaded from: classes2.dex */
public final class c<T> implements l.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ g f36872u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<ApiNetworkStatus> f36873v;

    public c(g gVar, ls.h hVar) {
        this.f36872u = gVar;
        this.f36873v = hVar;
    }

    @Override // e4.l.b
    public final void a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        ls.d<ApiNetworkStatus> dVar = this.f36873v;
        g gVar = this.f36872u;
        try {
            gVar.f36894d.i(jSONObject.optString("displaymsg"));
            Object b10 = new sf.i().b(AddFamilyMember[].class, jSONObject.getString("list"));
            kotlin.jvm.internal.i.f(b10, "gson.fromJson(response.g…amilyMember>::class.java)");
            AddFamilyMember[] addFamilyMemberArr = (AddFamilyMember[]) b10;
            gVar.f36892b.i(new ArrayList<>(ca.a.P0(Arrays.copyOf(addFamilyMemberArr, addFamilyMemberArr.length))));
            dVar.resumeWith(ApiNetworkStatus.SUCCESS);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(gVar.f36891a, "exception", e10);
            dVar.resumeWith(ApiNetworkStatus.EXCEPTION);
        }
    }
}
