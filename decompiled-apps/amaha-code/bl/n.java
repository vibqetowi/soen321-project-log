package bl;

import android.animation.ObjectAnimator;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: DailyPlanDetailFragmentV3.kt */
/* loaded from: classes2.dex */
public final class n extends CountDownTimer {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4376c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f4377a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f4378b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, ConstraintLayout constraintLayout) {
        super(1000L, 20L);
        this.f4377a = pVar;
        this.f4378b = constraintLayout;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        p pVar = this.f4377a;
        try {
            ((Space) pVar._$_findCachedViewById(R.id.separatorViewBottom)).setVisibility(0);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            pVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            ((Space) pVar._$_findCachedViewById(R.id.separatorViewBottom)).getLayoutParams().height = (int) (displayMetrics.heightPixels * 0.3d);
            if (kotlin.jvm.internal.i.b(this.f4378b, (ConstraintLayout) pVar._$_findCachedViewById(R.id.trackerCardContainer))) {
                new Handler().postDelayed(new j(pVar, 1), 1000L);
            }
            ObjectAnimator.ofInt((ScrollView) pVar._$_findCachedViewById(R.id.scrollview), "scrollY", ((ScrollView) pVar._$_findCachedViewById(R.id.scrollview)).getBottom()).setDuration(1200L).start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(pVar.f4390u, e10);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
    }
}
