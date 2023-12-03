package yi;

import android.content.DialogInterface;
import com.theinnerhour.b2b.activity.ActivitiesInfoActivity;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.activity.DepressionGoodthingsActivity;
import com.theinnerhour.b2b.activity.DepressionHopeActivity;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
import com.theinnerhour.b2b.activity.DepressionThoughtsActivity;
import com.theinnerhour.b2b.activity.DepressionTimeoutActivity;
import com.theinnerhour.b2b.components.multiTracker.activity.MultiTrackerActivity;
import hr.u6;
import zo.p;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements DialogInterface.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f38636u;

    public /* synthetic */ d(int i6) {
        this.f38636u = i6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialog, int i6) {
        switch (this.f38636u) {
            case 0:
                kotlin.jvm.internal.i.g(dialog, "dialog");
                dialog.dismiss();
                return;
            case 1:
                int i10 = ActivitiesInfoActivity.A;
                return;
            case 2:
                int i11 = DepressionExerciseActivity.C;
                return;
            case 3:
                int i12 = DepressionGoodthingsActivity.D;
                return;
            case 4:
                int i13 = DepressionHopeActivity.C;
                return;
            case 5:
                int i14 = DepressionMasteryActivity.F;
                return;
            case 6:
                int i15 = DepressionPleasurableActivity.G;
                return;
            case 7:
                int i16 = DepressionThoughtsActivity.E;
                return;
            case 8:
                int i17 = DepressionTimeoutActivity.C;
                return;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return;
            case 14:
                int i18 = MultiTrackerActivity.J;
                return;
            case 15:
                int i19 = p.R;
                return;
            case 16:
                return;
            case 17:
                int i20 = u6.f19243z;
                dialog.cancel();
                return;
            default:
                int i21 = rr.a.f30996v;
                return;
        }
    }
}
