package vn;

import com.theinnerhour.b2b.components.multiTracker.model.BackupResponse;
import com.theinnerhour.b2b.utils.CustomRetrofitCallback;
import dw.z;
import kotlin.jvm.internal.i;
import ls.d;
import ls.h;
/* compiled from: UserNodeModifyRepository.kt */
/* loaded from: classes2.dex */
public final class a implements CustomRetrofitCallback<BackupResponse> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ d<Boolean> f35289u;

    public a(h hVar) {
        this.f35289u = hVar;
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onFailure(dw.b<BackupResponse> call, Throwable t3) {
        i.g(call, "call");
        i.g(t3, "t");
        this.f35289u.resumeWith(Boolean.FALSE);
    }

    @Override // com.theinnerhour.b2b.utils.CustomRetrofitCallback, dw.d
    public final void onResponse(dw.b<BackupResponse> call, z<BackupResponse> response) {
        Boolean bool;
        i.g(call, "call");
        i.g(response, "response");
        CustomRetrofitCallback.DefaultImpls.onResponse(this, call, response);
        boolean a10 = response.a();
        d<Boolean> dVar = this.f35289u;
        if (a10) {
            BackupResponse backupResponse = response.f13696b;
            if (backupResponse != null) {
                bool = Boolean.valueOf(backupResponse.isDataBackup());
            } else {
                bool = null;
            }
            dVar.resumeWith(bool);
            return;
        }
        dVar.resumeWith(Boolean.FALSE);
    }
}
