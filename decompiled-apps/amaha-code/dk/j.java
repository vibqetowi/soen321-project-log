package dk;

import android.content.DialogInterface;
import com.theinnerhour.b2b.activity.MiniCourseActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.Utils;
import java.util.Calendar;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements DialogInterface.OnCancelListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f12933u;

    public /* synthetic */ j(int i6) {
        this.f12933u = i6;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.f12933u) {
            case 0:
                int i6 = MiniCourseActivity.O;
                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Calendar todayCalendar = Utils.INSTANCE.getTodayCalendar();
                    todayCalendar.add(5, 1);
                    ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_DATE, todayCalendar.getTimeInMillis());
                    return;
                }
                return;
            case 1:
                int i10 = bl.i.f4356f0;
                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Calendar todayCalendar2 = Utils.INSTANCE.getTodayCalendar();
                    todayCalendar2.add(5, 1);
                    ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_DATE, todayCalendar2.getTimeInMillis());
                    return;
                }
                return;
            default:
                int i11 = bl.p.f4381k0;
                if (!ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Calendar todayCalendar3 = Utils.INSTANCE.getTodayCalendar();
                    todayCalendar3.add(5, 1);
                    ApplicationPersistence.getInstance().setLongValue(Constants.APP_FEEDBACK_DASHBOARD_DATE, todayCalendar3.getTimeInMillis());
                    return;
                }
                return;
        }
    }
}
