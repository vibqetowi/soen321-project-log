package am;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.utils.UtilsKt;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import fm.g0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f611u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f612v;

    public /* synthetic */ a(FirestoreGoalsActivity firestoreGoalsActivity, int i6) {
        this.f611u = i6;
        this.f612v = firestoreGoalsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable editable;
        fm.a aVar;
        RobertoEditText robertoEditText;
        int i6 = this.f611u;
        AppCompatSeekBar appCompatSeekBar = null;
        FirestoreGoalsActivity this$0 = this.f612v;
        switch (i6) {
            case 0:
                int i10 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.o0(ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false), false);
                if (ApplicationPersistence.getInstance().getBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, false)) {
                    Utils.INSTANCE.showCustomToast(this$0, "Thank you for your feedback! Keep tracking your goals regularly!");
                    ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                    return;
                }
                return;
            case 1:
                int i11 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.o0(false, true);
                return;
            case 2:
                int i12 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.getOnBackPressedDispatcher().b();
                return;
            case 3:
                int i13 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                fm.a aVar2 = this$0.f11151x;
                if (aVar2 != null) {
                    if (aVar2.Q == 0) {
                        ((androidx.lifecycle.w) aVar2.O.getValue()).i(new SingleUseEvent(Boolean.TRUE));
                        return;
                    } else {
                        ((androidx.lifecycle.w) aVar2.N.getValue()).i(new SingleUseEvent(Boolean.TRUE));
                        return;
                    }
                }
                return;
            case 4:
                int i14 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar = this$0.f11150w;
                if (bVar != null) {
                    appCompatSeekBar = bVar.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(8);
                    return;
                }
                return;
            case 5:
                int i15 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar2 = this$0.f11150w;
                if (bVar2 != null) {
                    appCompatSeekBar = bVar2.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(9);
                    return;
                }
                return;
            case 6:
                int i16 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar3 = this$0.f11150w;
                if (bVar3 != null) {
                    appCompatSeekBar = bVar3.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(10);
                    return;
                }
                return;
            case 7:
                int i17 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar4 = this$0.f11150w;
                if (bVar4 != null) {
                    appCompatSeekBar = bVar4.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(0);
                    return;
                }
                return;
            case 8:
                int i18 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar5 = this$0.f11150w;
                if (bVar5 != null) {
                    appCompatSeekBar = bVar5.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(1);
                    return;
                }
                return;
            case 9:
                int i19 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar6 = this$0.f11150w;
                if (bVar6 != null) {
                    appCompatSeekBar = bVar6.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(2);
                    return;
                }
                return;
            case 10:
                int i20 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar7 = this$0.f11150w;
                if (bVar7 != null) {
                    appCompatSeekBar = bVar7.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(3);
                    return;
                }
                return;
            case 11:
                int i21 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar8 = this$0.f11150w;
                if (bVar8 != null) {
                    appCompatSeekBar = bVar8.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(4);
                    return;
                }
                return;
            case 12:
                int i22 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar9 = this$0.f11150w;
                if (bVar9 != null) {
                    appCompatSeekBar = bVar9.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(5);
                    return;
                }
                return;
            case 13:
                int i23 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar10 = this$0.f11150w;
                if (bVar10 != null) {
                    appCompatSeekBar = bVar10.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(6);
                    return;
                }
                return;
            case 14:
                int i24 = FirestoreGoalsActivity.E;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar11 = this$0.f11150w;
                if (bVar11 != null) {
                    appCompatSeekBar = bVar11.f38724p;
                }
                if (appCompatSeekBar != null) {
                    appCompatSeekBar.setProgress(7);
                    return;
                }
                return;
            case 15:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                yp.b bVar12 = this$0.f11150w;
                if (bVar12 != null && (robertoEditText = bVar12.f38711b) != null) {
                    editable = robertoEditText.getText();
                } else {
                    editable = null;
                }
                String valueOf = String.valueOf(editable);
                if (!gv.n.B0(valueOf) && !gv.n.B0(gv.r.i1(valueOf).toString())) {
                    if (Utils.INSTANCE.checkConnectivity(this$0) && (aVar = this$0.f11151x) != null) {
                        ta.v.H(kc.f.H(aVar), aVar.A, 0, new g0(aVar, valueOf, null), 2);
                        return;
                    }
                    return;
                }
                Toast.makeText(this$0, "Please enter some text", 0).show();
                return;
            case 16:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ApplicationPersistence.getInstance().setBooleanValue(Constants.PLAY_STORE_FEEDBACK_GIVEN, true);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + this$0.getPackageName()));
                intent.addFlags(1208483840);
                try {
                    this$0.startActivity(intent);
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e("dashboardactivity", "error in showing play store ", e10);
                    this$0.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + this$0.getPackageName())));
                }
                this$0.o0(true, false);
                ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                UtilsKt.fireAnalytics("goal_play_store_feedback_submit", UtilsKt.getAnalyticsBundle());
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                int i25 = FirestoreGoalsActivity.E;
                this$0.o0(true, false);
                ApplicationPersistence.getInstance().setBooleanValue("goal_feedback_shown", true);
                Toast.makeText(this$0, this$0.getString(R.string.surveyPageFeedbackNegativeToast), 0).show();
                UtilsKt.fireAnalytics("goal_play_store_feedback_cancel", UtilsKt.getAnalyticsBundle());
                return;
        }
    }
}
