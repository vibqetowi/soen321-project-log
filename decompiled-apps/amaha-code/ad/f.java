package ad;

import android.app.ProgressDialog;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.theinnerhour.b2b.persistence.NpsPersistence$initialise$2$1$1;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import hr.l7;
import java.util.concurrent.TimeUnit;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements ya.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f497a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f498b;

    public /* synthetic */ f(int i6, Object obj) {
        this.f497a = i6;
        this.f498b = obj;
    }

    @Override // ya.e
    public final void onFailure(Exception it) {
        long j10;
        switch (this.f497a) {
            case 0:
                g gVar = (g) this.f498b;
                gVar.a();
                if (gVar.f503e == -1) {
                    j10 = 30;
                } else if (gVar.f503e * 2 < 960) {
                    j10 = gVar.f503e * 2;
                } else {
                    j10 = 960;
                }
                gVar.f503e = j10;
                gVar.f502d = gVar.f501c.schedule(new e(gVar, 1), gVar.f503e, TimeUnit.SECONDS);
                return;
            case 1:
                ((RemoteConfigManager) this.f498b).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(it);
                return;
            case 2:
                l7 this$0 = (l7) this.f498b;
                int i6 = l7.H;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(it, "it");
                LogHelper.INSTANCE.e(this$0.f18751u, "exception in upload file to storage", it);
                if (this$0.isAdded()) {
                    Utils.INSTANCE.showCustomToast(this$0.requireActivity(), "No internet connection");
                    ProgressDialog progressDialog = this$0.C;
                    if (progressDialog != null) {
                        progressDialog.dismiss();
                        return;
                    } else {
                        kotlin.jvm.internal.i.q("progressDialog");
                        throw null;
                    }
                }
                return;
            default:
                NpsPersistence$initialise$2$1$1.onDataChange$lambda$4((ss.l) this.f498b, it);
                return;
        }
    }
}
