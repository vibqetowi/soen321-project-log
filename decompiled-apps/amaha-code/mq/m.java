package mq;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.CountDownTimer;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoButton;
/* compiled from: DepressionExercisePlayFragment.kt */
/* loaded from: classes2.dex */
public final class m extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f25702a;

    /* compiled from: DepressionExercisePlayFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ n f25703a;

        public a(n nVar) {
            this.f25703a = nVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            n nVar = this.f25703a;
            ((RobertoButton) nVar._$_findCachedViewById(R.id.startCTA)).setAlpha(1.0f);
            ((RobertoButton) nVar._$_findCachedViewById(R.id.startCTA)).setOnClickListener(new l(nVar, 3));
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            kotlin.jvm.internal.i.g(animation, "animation");
            n nVar = this.f25703a;
            RobertoButton robertoButton = (RobertoButton) nVar._$_findCachedViewById(R.id.startCTA);
            if (robertoButton != null) {
                robertoButton.setOnClickListener(new l(nVar, 2));
            }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar) {
        super(20000L, 1000L);
        this.f25702a = nVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        n nVar = this.f25702a;
        RobertoButton robertoButton = (RobertoButton) nVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton != null) {
            robertoButton.setText(nVar.getString(R.string.depressionExercisesPlanSelectCTA));
        }
        RobertoButton robertoButton2 = (RobertoButton) nVar._$_findCachedViewById(R.id.startCTA);
        if (robertoButton2 != null) {
            robertoButton2.setVisibility(0);
        }
        ((RobertoButton) nVar._$_findCachedViewById(R.id.startCTA)).setAlpha(0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat((RobertoButton) nVar._$_findCachedViewById(R.id.startCTA), "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setStartDelay(1000L);
        ofFloat.addListener(new a(nVar));
        ofFloat.start();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
    }
}
