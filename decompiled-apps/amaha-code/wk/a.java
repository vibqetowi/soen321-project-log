package wk;

import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import kotlin.jvm.internal.i;
import ls.h;
import org.json.JSONObject;
import sf.m;
/* compiled from: CommunitiesPwaRepository.kt */
/* loaded from: classes2.dex */
public final class a implements CustomRetrofitCallback<m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f36739u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ ls.d<String> f36740v;

    public a(b bVar, h hVar) {
        this.f36739u = bVar;
        this.f36740v = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<m> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        LogHelper logHelper = LogHelper.INSTANCE;
        b bVar = this.f36739u;
        logHelper.e(bVar.f36742b, t3);
        bVar.f36743c.l(t3.getMessage());
        bVar.f36744d.l(Boolean.TRUE);
        this.f36740v.resumeWith(null);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<m> call, z<m> response) {
        String mVar;
        boolean z10;
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<String> dVar = this.f36740v;
        b bVar = this.f36739u;
        if (a10) {
            try {
                m mVar2 = response.f13696b;
                if (mVar2 != null && (mVar = mVar2.toString()) != null) {
                    String tt2 = new JSONObject(mVar).optString("serialtoken", "");
                    i.f(tt2, "tt");
                    if (tt2.length() == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        tt2 = null;
                    }
                    dVar.resumeWith(tt2);
                    return;
                }
                return;
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(bVar.f36742b, e10);
                bVar.f36744d.l(Boolean.TRUE);
                dVar.resumeWith(null);
                return;
            }
        }
        bVar.f36743c.l(bVar.f36741a.getString(R.string.something_went_wrong));
        bVar.f36744d.l(Boolean.TRUE);
        dVar.resumeWith(null);
    }
}
