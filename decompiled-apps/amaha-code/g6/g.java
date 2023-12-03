package g6;

import android.app.Dialog;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.appsflyer.R;
import com.theinnerhour.b2b.activity.ActivitiesInfoActivity;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.activity.DepressionHopeActivity;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.activity.DepressionThoughtsActivity;
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g6.p;
import hr.l7;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f16262u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f16263v;

    public /* synthetic */ g(int i6, Object obj) {
        this.f16262u = i6;
        this.f16263v = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i6) {
        int i10 = this.f16262u;
        Object obj = this.f16263v;
        switch (i10) {
            case 0:
                h this$0 = (h) obj;
                int i11 = h.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                View J = this$0.J(false);
                Dialog dialog = this$0.getDialog();
                if (dialog != null) {
                    dialog.setContentView(J);
                }
                p.d dVar = this$0.E;
                if (dVar != null) {
                    this$0.U(dVar);
                    return;
                }
                return;
            case 1:
                int i12 = ActivitiesInfoActivity.A;
                ((ActivitiesInfoActivity) obj).finish();
                return;
            case 2:
                DepressionExerciseActivity this$02 = (DepressionExerciseActivity) obj;
                int i13 = DepressionExerciseActivity.C;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                this$02.finish();
                return;
            case 3:
                DepressionGoodthingsActivity this$03 = (DepressionGoodthingsActivity) obj;
                int i14 = DepressionGoodthingsActivity.D;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                this$03.finish();
                return;
            case 4:
                DepressionHopeActivity this$04 = (DepressionHopeActivity) obj;
                int i15 = DepressionHopeActivity.C;
                kotlin.jvm.internal.i.g(this$04, "this$0");
                this$04.finish();
                return;
            case 5:
                DepressionMasteryActivity this$05 = (DepressionMasteryActivity) obj;
                int i16 = DepressionMasteryActivity.F;
                kotlin.jvm.internal.i.g(this$05, "this$0");
                this$05.finish();
                return;
            case 6:
                DepressionPleasurableActivity this$06 = (DepressionPleasurableActivity) obj;
                int i17 = DepressionPleasurableActivity.G;
                kotlin.jvm.internal.i.g(this$06, "this$0");
                this$06.finish();
                return;
            case 7:
                DepressionThoughtsActivity this$07 = (DepressionThoughtsActivity) obj;
                int i18 = DepressionThoughtsActivity.E;
                kotlin.jvm.internal.i.g(this$07, "this$0");
                this$07.finish();
                return;
            case 8:
                DepressionTimeoutActivity this$08 = (DepressionTimeoutActivity) obj;
                int i19 = DepressionTimeoutActivity.C;
                kotlin.jvm.internal.i.g(this$08, "this$0");
                this$08.finish();
                return;
            case 9:
                MultiTrackerActivity this$09 = (MultiTrackerActivity) obj;
                int i20 = MultiTrackerActivity.J;
                kotlin.jvm.internal.i.g(this$09, "this$0");
                if (this$09.f11482z == 0) {
                    this$09.finish();
                    return;
                } else {
                    this$09.n0();
                    return;
                }
            case 10:
                ExperimentEditProfileActivity this$010 = (ExperimentEditProfileActivity) obj;
                int i21 = ExperimentEditProfileActivity.P;
                kotlin.jvm.internal.i.g(this$010, "this$0");
                f0.a.e(this$010, this$010.E, R.styleable.AppCompatTheme_textColorSearchUrl);
                return;
            case 11:
                zo.p this$011 = (zo.p) obj;
                int i22 = zo.p.R;
                kotlin.jvm.internal.i.g(this$011, "this$0");
                this$011.f39760y = false;
                this$011.f39759x = 0;
                ((LottieAnimationView) this$011._$_findCachedViewById(com.theinnerhour.b2b.R.id.lavRAAnimation)).g();
                ((RobertoTextView) this$011._$_findCachedViewById(com.theinnerhour.b2b.R.id.tvRAProgress)).setText("00:00");
                if (this$011.f39761z) {
                    this$011.M();
                }
                ((AppCompatImageView) this$011._$_findCachedViewById(com.theinnerhour.b2b.R.id.ivRAStop)).setVisibility(8);
                try {
                    Object systemService = this$011.requireActivity().getSystemService("notification");
                    kotlin.jvm.internal.i.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    ((NotificationManager) systemService).cancel(Constants.AUDIO_NOTIFICATION_ID);
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$011.f39756u, "exception", e10);
                    return;
                }
            case 12:
                l7 this$012 = (l7) obj;
                int i23 = l7.H;
                kotlin.jvm.internal.i.g(this$012, "this$0");
                f0.a.e(this$012.requireActivity(), this$012.f18754x, this$012.f18755y);
                return;
            default:
                int i24 = rr.a.f30996v;
                ((rr.a) obj).finish();
                return;
        }
    }
}
