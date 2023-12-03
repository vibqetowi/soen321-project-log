package cp;

import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.network.model.CourseResetModel;
import com.theinnerhour.b2b.network.model.CourseResetResult;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import ls.h;
/* compiled from: ResetProgrammeRepository.kt */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f11865a = LogHelper.INSTANCE.makeLogTag("ResetProgrammeRepository");

    /* compiled from: ResetProgrammeRepository.kt */
    /* loaded from: classes2.dex */
    public static final class a implements CustomRetrofitCallback<CourseResetResult> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ ls.d<Boolean> f11866u;

        public a(h hVar) {
            this.f11866u = hVar;
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onFailure(dw.b<CourseResetResult> call, Throwable t3) {
            i.g(call, "call");
            i.g(t3, "t");
            this.f11866u.resumeWith(Boolean.FALSE);
        }

        @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
        public final void onResponse(dw.b<CourseResetResult> call, z<CourseResetResult> response) {
            i.g(call, "call");
            i.g(response, "response");
            CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
            this.f11866u.resumeWith(Boolean.valueOf(response.a()));
        }
    }

    public static Object a(ArrayList arrayList, ls.d dVar) {
        h hVar = new h(ca.a.G0(dVar));
        String a10 = FirebaseAuth.getInstance().a();
        i.d(a10);
        ((or.a) nr.b.a(or.a.class)).b("https://us-central1-gcpinnerhour.cloudfunctions.net/resetProgrammev2", new CourseResetModel(arrayList, a10)).I(new a(hVar));
        return hVar.b();
    }
}
