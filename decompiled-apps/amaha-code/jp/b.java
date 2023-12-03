package jp;

import com.theinnerhour.b2b.components.splash.models.AppUpdateResponse;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import com.theinnerhour.b2b.utils.LogHelper;
import dw.z;
import hs.k;
import kotlin.jvm.internal.i;
import ls.h;
import sf.m;
/* compiled from: SplashScreenRepository.kt */
/* loaded from: classes2.dex */
public final class b implements CustomRetrofitCallback<m> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ls.d<AppUpdateResponse> f22542u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f22543v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ a f22544w;

    public b(h hVar, int i6, a aVar) {
        this.f22542u = hVar;
        this.f22543v = i6;
        this.f22544w = aVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<m> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        LogHelper.INSTANCE.e(this.f22544w.f22535b, "https://api.theinnerhour.com/v1/obsolete", t3);
        this.f22542u.resumeWith(AppUpdateResponse.NO_UPDATE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<m> call, z<m> response) {
        k kVar;
        m mVar;
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        ls.d<AppUpdateResponse> dVar = this.f22542u;
        if (a10) {
            m mVar2 = response.f13696b;
            if (mVar2 != null && (mVar = mVar2.g().f31511u.get("last_supported_version")) != null) {
                int e10 = mVar.e();
                ApplicationPersistence.getInstance().setIntValue("last_supported_version", e10);
                if (214 < e10) {
                    dVar.resumeWith(AppUpdateResponse.IMMEDIATE_UPDATE);
                } else {
                    int intValue = ApplicationPersistence.getInstance().getIntValue("previousVersion");
                    int i6 = this.f22543v;
                    if (intValue != i6) {
                        ApplicationPersistence.getInstance().setIntValue("previousVersion", i6);
                        dVar.resumeWith(AppUpdateResponse.FLEXIBLE_UPDATE);
                    } else {
                        dVar.resumeWith(AppUpdateResponse.NO_UPDATE);
                    }
                }
                kVar = k.f19476a;
            } else {
                kVar = null;
            }
            if (kVar == null) {
                dVar.resumeWith(AppUpdateResponse.NO_UPDATE);
                return;
            }
            return;
        }
        dVar.resumeWith(AppUpdateResponse.NO_UPDATE);
    }
}
