package hk;

import android.os.Build;
import android.view.Window;
import com.theinnerhour.b2b.components.assessments.activity.ExptInitialAssessmentActivity;
import t0.u0;
/* compiled from: ExptInitialAssessmentActivity.kt */
/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.k implements ss.a<hs.k> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ExptInitialAssessmentActivity f17645u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Integer f17646v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ExptInitialAssessmentActivity exptInitialAssessmentActivity, Integer num) {
        super(0);
        this.f17645u = exptInitialAssessmentActivity;
        this.f17646v = num;
    }

    @Override // ss.a
    public final hs.k invoke() {
        ExptInitialAssessmentActivity exptInitialAssessmentActivity = this.f17645u;
        Window window = exptInitialAssessmentActivity.getWindow();
        if (Build.VERSION.SDK_INT >= 23) {
            new u0(window.getDecorView(), window).a(true);
        }
        Integer num = this.f17646v;
        if (num != null) {
            window.setStatusBarColor(g0.a.b(exptInitialAssessmentActivity, num.intValue()));
        }
        return hs.k.f19476a;
    }
}
