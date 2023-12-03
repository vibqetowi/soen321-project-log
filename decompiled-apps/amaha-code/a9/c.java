package a9;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.chat.activity.CoachChatActivity;
import com.theinnerhour.b2b.libPackage.circularProgressBar.ArcProgressBar;
import com.theinnerhour.b2b.libPackage.circularProgressBar.CircularProgressBar;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f383a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f384b;

    public /* synthetic */ c(int i6, Object obj) {
        this.f383a = i6;
        this.f384b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i6 = this.f383a;
        Object obj = this.f384b;
        switch (i6) {
            case 0:
                com.google.android.exoplayer2.ui.b bVar = (com.google.android.exoplayer2.ui.b) obj;
                bVar.getClass();
                bVar.f7085b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bVar.invalidate(bVar.f7092u);
                return;
            case 1:
                dc.k kVar = (dc.k) obj;
                kVar.getClass();
                kVar.f12767d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                CoachChatActivity this$0 = (CoachChatActivity) obj;
                int i10 = CoachChatActivity.K;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(valueAnimator, "valueAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.i.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = ((ConstraintLayout) this$0.n0(R.id.attachLinear)).getLayoutParams();
                layoutParams.height = intValue;
                ((ConstraintLayout) this$0.n0(R.id.attachLinear)).setLayoutParams(layoutParams);
                return;
            case 3:
                ArcProgressBar this$02 = (ArcProgressBar) obj;
                int i11 = ArcProgressBar.N;
                kotlin.jvm.internal.i.g(this$02, "this$0");
                kotlin.jvm.internal.i.g(valueAnimator, "animation");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.i.e(animatedValue2, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue2).floatValue();
                this$02.b(floatValue, true);
                if (this$02.C) {
                    float f = (floatValue * this$02.f11728w) / 100;
                    float f2 = this$02.D;
                    if (!this$02.B) {
                        f = -f;
                    }
                    this$02.E = f2 + f;
                    return;
                }
                return;
            case 4:
                CircularProgressBar this$03 = (CircularProgressBar) obj;
                int i12 = CircularProgressBar.L;
                kotlin.jvm.internal.i.g(this$03, "this$0");
                kotlin.jvm.internal.i.g(valueAnimator, "animation");
                Object animatedValue3 = valueAnimator.getAnimatedValue();
                kotlin.jvm.internal.i.e(animatedValue3, "null cannot be cast to non-null type kotlin.Float");
                float floatValue2 = ((Float) animatedValue3).floatValue();
                this$03.b(floatValue2, true);
                if (this$03.B) {
                    float f10 = (floatValue2 * 360) / 100;
                    if (!this$03.A) {
                        f10 = -f10;
                    }
                    this$03.C = f10 + 270.0f;
                    return;
                }
                return;
            default:
                Utils.slideAnimator$lambda$6((View) obj, valueAnimator);
                return;
        }
    }
}
