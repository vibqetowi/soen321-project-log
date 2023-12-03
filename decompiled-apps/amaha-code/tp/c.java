package tp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.topicalcourses.activity.TopicalCourseActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import java.util.HashMap;
import tr.r;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33402u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ TopicalCourseActivity f33403v;

    public /* synthetic */ c(TopicalCourseActivity topicalCourseActivity, int i6) {
        this.f33402u = i6;
        this.f33403v = topicalCourseActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f33402u;
        TopicalCourseActivity this$0 = this.f33403v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.finish();
                return;
            case 1:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.setType("text/plain");
                intent.putExtra("android.intent.extra.TEXT", "Hey there! Check out the Amaha App to live a happier life. https://innerhour.page.link/ih");
                this$0.startActivity(Intent.createChooser(intent, "Share using"));
                if (!FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges().containsKey(Constants.SHARE_APP_BADGE)) {
                    HashMap<String, String> badges = FirebasePersistence.getInstance().getUser().getUserGamificationModel().getBadges();
                    kotlin.jvm.internal.i.f(badges, "getInstance().user.userGamificationModel.badges");
                    badges.put(Constants.SHARE_APP_BADGE, Constants.BADGE_ATTAINED);
                    FirebasePersistence.getInstance().updateUserOnFirebase();
                }
                Bundle bundle = new Bundle();
                bundle.putString("course", rr.a.q0());
                bundle.putString("topicalCourse", this$0.A);
                gk.a.b(bundle, "topical_share_click");
                return;
            case 2:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.startActivityForResult(r.s(this$0, false).putExtra("source", "topical_course_activity"), this$0.B);
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
                applicationPersistence.setBooleanValue(this$0.A + "_welcome_dialog_hide", true);
                ((ConstraintLayout) this$0.u0(R.id.topicalCourseWelcomeScreen)).setVisibility(8);
                ((ConstraintLayout) this$0.u0(R.id.topicalBottomShareLayout)).setVisibility(0);
                return;
        }
    }
}
