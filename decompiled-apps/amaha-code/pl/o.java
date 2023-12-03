package pl;

import android.os.CountDownTimer;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N14AScreenFragment;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class o extends CountDownTimer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f28619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(N14AScreenFragment n14AScreenFragment) {
        super(4000L, 1000L);
        this.f28619a = n14AScreenFragment;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        Float f;
        MotionLayout motionLayout;
        N14AScreenFragment n14AScreenFragment = this.f28619a;
        try {
            MotionLayout motionLayout2 = (MotionLayout) n14AScreenFragment._$_findCachedViewById(R.id.mlN14AParentContainer);
            if (motionLayout2 != null) {
                f = Float.valueOf(motionLayout2.getProgress());
            } else {
                f = null;
            }
            if (!kotlin.jvm.internal.i.a(f, 1.0f) && (motionLayout = (MotionLayout) n14AScreenFragment._$_findCachedViewById(R.id.mlN14AParentContainer)) != null) {
                motionLayout.A();
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(n14AScreenFragment.f10949w, e10);
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j10) {
    }
}
