package lm;

import android.app.Dialog;
import android.view.View;
import com.theinnerhour.b2b.components.journal.activity.JournalParentActivity;
import com.theinnerhour.b2b.components.login.activity.LoginSignupReworkActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.ManageSubscriptionActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MiniMonetizationActivity;
import com.theinnerhour.b2b.components.monetization.activitiy.MonetizationActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentEditProfileActivity;
import com.theinnerhour.b2b.components.profile.experiment.activities.ExperimentProfileActivity;
import com.theinnerhour.b2b.components.resetprogram.activity.ResetProgrammeActivity;
import ho.z;
import kotlin.jvm.internal.i;
import kp.l;
import mq.g;
import mq.s;
import nn.g1;
import nn.h;
import nn.q;
import nn.s0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f24442u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Dialog f24443v;

    public /* synthetic */ f(Dialog dialog, int i6) {
        this.f24442u = i6;
        this.f24443v = dialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f24442u;
        Dialog dialog = this.f24443v;
        switch (i6) {
            case 0:
                int i10 = JournalParentActivity.C;
                i.g(dialog, "$templateChangeDialog");
                dialog.dismiss();
                return;
            case 1:
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 2:
                int i11 = LoginSignupReworkActivity.C;
                i.g(dialog, "$errorDialog");
                dialog.dismiss();
                return;
            case 3:
                int i12 = LoginSignupReworkActivity.C;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 4:
                int i13 = ManageSubscriptionActivity.f11392y;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 5:
                int i14 = MiniMonetizationActivity.f11396b0;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 6:
                int i15 = MiniMonetizationActivity.f11396b0;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 7:
                int i16 = MonetizationActivity.c0;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 8:
                int i17 = MonetizationActivity.c0;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 9:
                int i18 = h.L;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 10:
                int i19 = q.C;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 11:
                int i20 = q.C;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 12:
                int i21 = s0.G;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 13:
                int i22 = g1.B;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 14:
                int i23 = g1.B;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 15:
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 16:
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 17:
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 18:
                int i24 = z.f18069x;
                i.g(dialog, "$errorDialog");
                dialog.dismiss();
                return;
            case 19:
                int i25 = z.f18069x;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 20:
                int i26 = z.f18069x;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 21:
                int i27 = ExperimentEditProfileActivity.P;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 22:
                int i28 = ExperimentProfileActivity.S;
                i.g(dialog, "$newProfileDialog");
                dialog.dismiss();
                return;
            case 23:
                int i29 = ResetProgrammeActivity.f11615y;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 24:
                int i30 = kp.e.f23737z;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 25:
                int i31 = l.f23764z;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 26:
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 27:
                int i32 = com.theinnerhour.b2b.fragment.coping.a.f11685k0;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            case 28:
                int i33 = g.f25685w;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
            default:
                int i34 = s.f25721w;
                i.g(dialog, "$dialog");
                dialog.dismiss();
                return;
        }
    }
}
