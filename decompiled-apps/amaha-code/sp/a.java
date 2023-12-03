package sp;

import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import kotlin.jvm.internal.i;
import ls.h;
import sf.m;
/* compiled from: TemplateActivityRepository.kt */
/* loaded from: classes2.dex */
public final class a implements CustomRetrofitCallback<m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<Boolean> f31853u;

    public a(h hVar) {
        this.f31853u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<m> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        this.f31853u.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<m> call, z<m> response) {
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        if (response.a()) {
            this.f31853u.resumeWith(Boolean.TRUE);
        }
    }
}
