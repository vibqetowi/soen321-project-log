package rk;

import com.theinnerhour.b2b.components.dashboard.activity.V2DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.splash.activity.SplashScreenActivity;
import com.theinnerhour.b2b.persistence.NpsPersistence$initialise$2$1$1;
import com.theinnerhour.b2b.utils.FireStoreUtilsKt;
import hr.l7;
import kotlin.jvm.internal.i;
import ss.l;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ya.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30770a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f30771b;

    public /* synthetic */ b(int i6, l lVar) {
        this.f30770a = i6;
        this.f30771b = lVar;
    }

    @Override // ya.f
    public final void onSuccess(Object obj) {
        int i6 = this.f30770a;
        l tmp0 = this.f30771b;
        switch (i6) {
            case 0:
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 1:
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 2:
                int i10 = V2DashboardActivity.F0;
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 3:
                int i11 = V3DashboardActivity.f10714r1;
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 4:
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 5:
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 6:
                tmp0.invoke(obj);
                return;
            case 7:
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 8:
                int i12 = SplashScreenActivity.G;
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 9:
                int i13 = SplashScreenActivity.G;
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 10:
                int i14 = l7.H;
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 11:
                i.g(tmp0, "$tmp0");
                tmp0.invoke(obj);
                return;
            case 12:
                NpsPersistence$initialise$2$1$1.onDataChange$lambda$3(tmp0, obj);
                return;
            case 13:
                FireStoreUtilsKt.fetchTopicalCourse$lambda$10(tmp0, obj);
                return;
            case 14:
                FireStoreUtilsKt.fetchTopicalCourseSlugs$lambda$12(tmp0, obj);
                return;
            case 15:
                FireStoreUtilsKt.fetchArticle$lambda$16(tmp0, obj);
                return;
            case 16:
                FireStoreUtilsKt.fetchMiniCourseMeta$lambda$6(tmp0, obj);
                return;
            case 17:
                FireStoreUtilsKt.fetchMiniCourseMeta$lambda$8(tmp0, obj);
                return;
            case 18:
                FireStoreUtilsKt.fetchMiniCourseSlugList$lambda$4(tmp0, obj);
                return;
            default:
                FireStoreUtilsKt.fetchSingleCampaign$lambda$26(tmp0, obj);
                return;
        }
    }
}
