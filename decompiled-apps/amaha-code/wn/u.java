package wn;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.UiUtils;
/* compiled from: TrackerDialogUtils.kt */
/* loaded from: classes2.dex */
public final class u {

    /* compiled from: TrackerDialogUtils.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f36860a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ LottieAnimationView f36861b;

        public a(Dialog dialog, LottieAnimationView lottieAnimationView) {
            this.f36860a = dialog;
            this.f36861b = lottieAnimationView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            this.f36860a.dismiss();
            this.f36861b.i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            this.f36860a.dismiss();
            this.f36861b.i();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
        }
    }

    public static Dialog a(int i6, Context context) {
        int i10;
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_tracker_check, context, R.style.Theme_Dialog_Fullscreen);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) styledDialog.findViewById(R.id.trackerCheckAnimation);
        CardView cardView = (CardView) styledDialog.findViewById(R.id.trackerCardCheck);
        if (Build.VERSION.SDK_INT < 25) {
            if (lottieAnimationView != null) {
                lottieAnimationView.setRenderMode(a3.t.SOFTWARE);
            }
        } else if (lottieAnimationView != null) {
            lottieAnimationView.setRenderMode(a3.t.HARDWARE);
        }
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 == 5) {
                            i10 = R.color.trackerYellow;
                        }
                    } else {
                        i10 = R.color.trackerBlue;
                    }
                } else {
                    i10 = R.color.trackerPink;
                }
            } else {
                i10 = R.color.trackerPurple;
            }
            cardView.setCardBackgroundColor(g0.a.b(context, i10));
            lottieAnimationView.c(new a(styledDialog, lottieAnimationView));
            styledDialog.setCancelable(false);
            lottieAnimationView.h();
            return styledDialog;
        }
        i10 = R.color.trackerGrey;
        cardView.setCardBackgroundColor(g0.a.b(context, i10));
        lottieAnimationView.c(new a(styledDialog, lottieAnimationView));
        styledDialog.setCancelable(false);
        lottieAnimationView.h();
        return styledDialog;
    }
}
