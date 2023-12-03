package hn;

import com.theinnerhour.b2b.components.login.model.LoginLoading;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.CourseApiUtil;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SessionManager;
/* compiled from: LoginSignupReworkViewModel.kt */
/* loaded from: classes2.dex */
public final class z implements CourseApiUtil.CourseApiUtilInterface {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ q f17960u;

    public z(q qVar) {
        this.f17960u = qVar;
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void courseApiComplete(boolean z10) {
        q qVar = this.f17960u;
        qVar.F.i(LoginLoading.HIDE_LOADING);
        qVar.X.i(Constants.SCREEN_DASHBOARD);
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void errorLoadingData(Exception error) {
        kotlin.jvm.internal.i.g(error, "error");
        q qVar = this.f17960u;
        qVar.F.i(LoginLoading.HIDE_LOADING);
        SessionManager.getInstance().clearData();
        FirebasePersistence.getInstance().logout();
        LogHelper.INSTANCE.e(qVar.f17891y, "error while initialising users course", error);
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void audioDownloadComplete() {
    }

    @Override // com.theinnerhour.b2b.utils.CourseApiUtil.CourseApiUtilInterface
    public final void notificationFetchComplete(boolean z10) {
    }
}
