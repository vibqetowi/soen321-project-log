package ll;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.components.dashboard.activity.V3DashboardActivity;
import com.theinnerhour.b2b.components.dashboard.utils.V3DashboardUtils;
import com.theinnerhour.b2b.model.CourseDayModelV1;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.persistence.SubscriptionPersistence;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f24421u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f24422v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ V3DashboardUtils f24423w;

    public /* synthetic */ e(Dialog dialog, V3DashboardUtils v3DashboardUtils, int i6) {
        this.f24421u = i6;
        this.f24422v = dialog;
        this.f24423w = v3DashboardUtils;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f24421u;
        boolean z10 = true;
        V3DashboardUtils this$0 = this.f24423w;
        Dialog dialog = this.f24422v;
        switch (i6) {
            case 0:
                i.g(dialog, "$dialog");
                i.g(this$0, "this$0");
                String str = this$0.f10899a;
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    gk.a.b(bundle, "welocme_main_cta");
                    dialog.dismiss();
                    if (SubscriptionPersistence.INSTANCE.getSubscriptionEnabled()) {
                        FirebasePersistence.getInstance().getUser();
                        V3DashboardActivity f = this$0.f();
                        CourseDayModelV1 dayPlanForDateV3 = CourseUtilKt.getDayPlanForDateV3(this$0.f().N0().getPlanV3(), Utils.INSTANCE.getTodayTimeInSeconds());
                        i.d(dayPlanForDateV3);
                        f.t0(dayPlanForDateV3);
                    } else {
                        try {
                            if (this$0.f().G == null) {
                                z10 = false;
                            }
                            if (z10 && !this$0.f().U0().isEmpty()) {
                                V3DashboardActivity f2 = this$0.f();
                                Intent intent = new Intent(this$0.f(), MiniCourseActivity.class);
                                String domain = this$0.f().U0().get(0).getDomain();
                                i.d(domain);
                                f2.startActivityForResult(intent.putExtra("mccourse", domain), this$0.f().L);
                            }
                        } catch (UninitializedPropertyAccessException e10) {
                            LogHelper.INSTANCE.e(str, e10);
                        }
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(str, "exception", e11);
                    return;
                }
            case 1:
                i.g(dialog, "$dialog");
                i.g(this$0, "this$0");
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                    gk.a.b(bundle2, "welcome_secondary_cta");
                    dialog.dismiss();
                    return;
                } catch (Exception e12) {
                    LogHelper.INSTANCE.e(this$0.f10899a, "exception", e12);
                    return;
                }
            case 2:
                i.g(this$0, "this$0");
                i.g(dialog, "$dialog");
                V3DashboardActivity f10 = this$0.f();
                Intent putExtra = new Intent(this$0.f(), MiniCourseActivity.class).putExtra("tutorial", true).putExtra("newTut", true);
                String domain2 = this$0.f().U0().get(0).getDomain();
                i.d(domain2);
                f10.startActivityForResult(putExtra.putExtra("mccourse", domain2), this$0.f().L);
                new Handler().postDelayed(new dl.d(dialog, 2), 750L);
                return;
            default:
                i.g(this$0, "this$0");
                i.g(dialog, "$dialog");
                this$0.f().f10719d0 = true;
                V3DashboardActivity f11 = this$0.f();
                CourseDayModelV1 courseDayModelV1 = this$0.f().f10717b0;
                i.d(courseDayModelV1);
                f11.t0(courseDayModelV1);
                new Handler().postDelayed(new dl.d(dialog, 3), 750L);
                return;
        }
    }

    public /* synthetic */ e(V3DashboardUtils v3DashboardUtils, Dialog dialog, int i6) {
        this.f24421u = i6;
        this.f24423w = v3DashboardUtils;
        this.f24422v = dialog;
    }
}
