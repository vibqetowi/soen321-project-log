package mq;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionExerciseActivity;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f25700u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ n f25701v;

    public /* synthetic */ l(n nVar, int i6) {
        this.f25700u = i6;
        this.f25701v = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10 = false;
        int i6 = this.f25700u;
        n this$0 = this.f25701v;
        switch (i6) {
            case 0:
                int i10 = n.f25704z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                m mVar = new m(this$0);
                this$0.f25708x = mVar;
                mVar.start();
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.timeText)).setVisibility(0);
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.tipText)).setVisibility(0);
                ((RobertoButton) this$0._$_findCachedViewById(R.id.startCTA)).setVisibility(8);
                ((RobertoTextView) this$0._$_findCachedViewById(R.id.skipCTA)).setVisibility(0);
                ((LottieAnimationView) this$0._$_findCachedViewById(R.id.animationView)).h();
                this$0.f25707w = true;
                return;
            case 1:
                int i11 = n.f25704z;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                m mVar2 = this$0.f25708x;
                if (mVar2 != null) {
                    mVar2.cancel();
                }
                m3.d dVar = ((LottieAnimationView) this$0._$_findCachedViewById(R.id.animationView)).B.f208w;
                if (dVar != null) {
                    z10 = dVar.E;
                }
                if (z10) {
                    ((LottieAnimationView) this$0._$_findCachedViewById(R.id.animationView)).d();
                }
                int i12 = this$0.f25706v;
                if (i12 == 5 || i12 == 8 || i12 == 11) {
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                    ((DepressionExerciseActivity) activity).B = true;
                }
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                ((DepressionExerciseActivity) activity2).t0();
                return;
            case 2:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                ((DepressionExerciseActivity) activity3).t0();
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity4 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionExerciseActivity");
                ((DepressionExerciseActivity) activity4).t0();
                return;
        }
    }
}
