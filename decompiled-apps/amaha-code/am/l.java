package am;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.goals.activity.FirestoreGoalsActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.SingleUseEvent;
import com.theinnerhour.b2b.utils.UiUtils;
/* compiled from: FirestoreGoalsActivity.kt */
/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.k implements ss.l<SingleUseEvent<? extends Boolean>, hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ FirestoreGoalsActivity f654u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(FirestoreGoalsActivity firestoreGoalsActivity) {
        super(1);
        this.f654u = firestoreGoalsActivity;
    }

    @Override // ss.l
    public final hs.k invoke(SingleUseEvent<? extends Boolean> singleUseEvent) {
        Boolean contentIfNotHandled;
        SingleUseEvent<? extends Boolean> singleUseEvent2 = singleUseEvent;
        if (singleUseEvent2 != null && (contentIfNotHandled = singleUseEvent2.getContentIfNotHandled()) != null) {
            boolean booleanValue = contentIfNotHandled.booleanValue();
            int i6 = FirestoreGoalsActivity.E;
            FirestoreGoalsActivity firestoreGoalsActivity = this.f654u;
            firestoreGoalsActivity.getClass();
            try {
                View inflate = firestoreGoalsActivity.getLayoutInflater().inflate(R.layout.dialog_goal_check, (ViewGroup) null, false);
                if (inflate != null) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate;
                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_goal_check, firestoreGoalsActivity, R.style.Theme_Dialog_Fullscreen);
                    styledDialog.setContentView(lottieAnimationView);
                    if (booleanValue) {
                        lottieAnimationView.setAnimation(R.raw.goal_check_custom);
                    }
                    if (Build.VERSION.SDK_INT < 25) {
                        lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
                    } else {
                        lottieAnimationView.setRenderMode(a3.t.HARDWARE);
                    }
                    lottieAnimationView.c(new r(styledDialog, lottieAnimationView));
                    styledDialog.setCancelable(false);
                    styledDialog.show();
                    lottieAnimationView.h();
                } else {
                    throw new NullPointerException("rootView");
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(firestoreGoalsActivity.f11149v, e10);
            }
        }
        return hs.k.f19476a;
    }
}
