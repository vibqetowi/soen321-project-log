package oo;

import android.view.View;
import com.google.android.material.bottomsheet.e;
import com.theinnerhour.b2b.components.pro.tracker.activity.ProCourseTrackerActivity;
import com.theinnerhour.b2b.components.pro.tracker.activity.ProMultiTrackerActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import kotlin.jvm.internal.i;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f27693u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ e f27694v;

    public /* synthetic */ b(e eVar, int i6) {
        this.f27693u = i6;
        this.f27694v = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f27693u;
        e dialog = this.f27694v;
        switch (i6) {
            case 0:
                i.g(dialog, "$dialog");
                ApplicationPersistence.getInstance().setBooleanValue("pro_goal_alert_2", false);
                dialog.dismiss();
                return;
            case 1:
                int i10 = ProCourseTrackerActivity.A;
                i.g(dialog, "$dialog");
                ApplicationPersistence.getInstance().setBooleanValue("pro_course_tracker_alert_2", true);
                dialog.dismiss();
                return;
            default:
                int i11 = ProMultiTrackerActivity.A;
                i.g(dialog, "$dialog");
                ApplicationPersistence.getInstance().setBooleanValue("pro_multi_tracker_alert_2", true);
                dialog.dismiss();
                return;
        }
    }
}
