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
/* compiled from: DailyPlanDetailFragment.kt */
/* loaded from: classes2.dex */
public final class g extends CountDownTimer {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f4351c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f4352a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f4353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, ConstraintLayout constraintLayout) {
        super(1000L, 20L);
        this.f4352a = iVar;
        this.f4353b = constraintLayout;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        i iVar = this.f4352a;
        try {
            ((Space) iVar._$_findCachedViewById(R.id.separatorViewBottom)).setVisibility(0);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            iVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            ((Space) iVar._$_findCachedViewById(R.id.separatorViewBottom)).getLayoutParams().height = (int) (displayMetrics.heightPixels * 0.3d);
            if (kotlin.jvm.internal.i.b(this.f4353b, (ConstraintLayout) iVar._$_findCachedViewById(R.id.trackerCardContainer))) {
                new Handler().postDelayed(new e(iVar, 1), 1000L);
            }
            ObjectAnimator.ofInt((ScrollView) iVar._$_findCachedViewById(R.id.scrollview), "scrollY", ((ScrollView) iVar._$_findCachedViewById(R.id.scrollview)).getBottom()).setDuration(1200L).start();
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(iVar.f4360u, e10);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
    }
}
