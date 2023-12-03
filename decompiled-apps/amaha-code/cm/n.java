package cm;

import android.content.Intent;
import android.view.View;
import com.theinnerhour.b2b.components.goals.model.FirestoreGoal;
import com.theinnerhour.b2b.components.recommendedActivities.activity.RecommendedActivitiesExperimentActivity;
import com.theinnerhour.b2b.components.recommendedActivities.model.RecommendedActivityModel;
import com.theinnerhour.b2b.model.CustomDate;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f5363u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f5364v;

    public /* synthetic */ n(p pVar, int i6) {
        this.f5363u = i6;
        this.f5364v = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:10:0x002b, B:12:0x0030, B:17:0x0038, B:20:0x003f, B:22:0x005d, B:25:0x0066, B:28:0x006f, B:29:0x0073, B:31:0x0081, B:36:0x008d, B:38:0x00a6, B:39:0x00aa), top: B:44:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[Catch: Exception -> 0x00e0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e0, blocks: (B:10:0x002b, B:12:0x0030, B:17:0x0038, B:20:0x003f, B:22:0x005d, B:25:0x0066, B:28:0x006f, B:29:0x0073, B:31:0x0081, B:36:0x008d, B:38:0x00a6, B:39:0x00aa), top: B:44:0x002b }] */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, androidx.fragment.app.n, com.theinnerhour.b2b.utils.NotificationPermissionBottomSheet] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        RecommendedActivityModel recommendedActivityModel;
        String str;
        String str2;
        String str3;
        String goalType;
        int i6 = this.f5363u;
        p this$0 = this.f5364v;
        switch (i6) {
            case 0:
                int i10 = p.G;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                fm.a aVar = this$0.f5373y;
                if (aVar != null) {
                    aVar.z(new Intent(this$0.requireActivity(), RecommendedActivitiesExperimentActivity.class));
                    return;
                }
                return;
            default:
                int i11 = p.G;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                hs.i iVar = this$0.f5371w;
                try {
                    fm.a aVar2 = this$0.f5373y;
                    String str4 = null;
                    if (aVar2 != null) {
                        recommendedActivityModel = aVar2.Z;
                    } else {
                        recommendedActivityModel = null;
                    }
                    String courseId = UtilsKt.getCourseId((recommendedActivityModel == null || (r6 = recommendedActivityModel.getDomain()) == null) ? "" : "");
                    CustomDate customDate = new CustomDate();
                    customDate.setTime(Utils.INSTANCE.getTodayCalendar().getTimeInMillis() / 1000);
                    if (recommendedActivityModel != null) {
                        str = recommendedActivityModel.getGoalId();
                    } else {
                        str = null;
                    }
                    if (recommendedActivityModel != null) {
                        str2 = recommendedActivityModel.getDomain();
                    } else {
                        str2 = null;
                    }
                    if (recommendedActivityModel != null) {
                        str4 = recommendedActivityModel.getTitle();
                    }
                    String str5 = str4;
                    CustomDate customDate2 = new CustomDate();
                    if (recommendedActivityModel != null && (goalType = recommendedActivityModel.getGoalType()) != null) {
                        str3 = goalType;
                        FirestoreGoal firestoreGoal = new FirestoreGoal(courseId, str, str2, str5, "daily_plan", customDate, customDate, customDate, customDate2, false, null, str3, false, null);
                        ((yn.a) iVar.getValue()).getClass();
                        if (!yn.a.b()) {
                            this$0.F(firestoreGoal);
                            return;
                        }
                        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                        ?? notificationPermissionBottomSheet = new NotificationPermissionBottomSheet("goals_add_scroller", ((yn.a) iVar.getValue()).a(true), "goals", (yn.a) iVar.getValue(), new t(this$0, firestoreGoal, xVar));
                        xVar.f23469u = notificationPermissionBottomSheet;
                        notificationPermissionBottomSheet.show(this$0.requireActivity().getSupportFragmentManager(), "permission");
                        return;
                    }
                    str3 = "";
                    FirestoreGoal firestoreGoal2 = new FirestoreGoal(courseId, str, str2, str5, "daily_plan", customDate, customDate, customDate, customDate2, false, null, str3, false, null);
                    ((yn.a) iVar.getValue()).getClass();
                    if (!yn.a.b()) {
                    }
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f5369u, e10);
                    return;
                }
                break;
        }
    }
}
