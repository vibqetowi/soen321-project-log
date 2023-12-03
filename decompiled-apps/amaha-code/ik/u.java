package ik;

import android.view.View;
import com.theinnerhour.b2b.components.assessments.model.AssessmentListener;
import com.theinnerhour.b2b.utils.UtilsKt;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20310u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f20311v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ x f20312w;

    public /* synthetic */ u(boolean z10, x xVar, int i6) {
        this.f20310u = i6;
        this.f20311v = z10;
        this.f20312w = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f20310u;
        boolean z10 = this.f20311v;
        x this$0 = this.f20312w;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (z10) {
                    AssessmentListener assessmentListener = this$0.f20326v;
                    if (assessmentListener != null) {
                        AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener, null, 1, null);
                        return;
                    }
                    return;
                }
                int i10 = x.K;
                UtilsKt.logError$default(this$0.f20325u, null, new c0(this$0), 2, null);
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (z10) {
                    AssessmentListener assessmentListener2 = this$0.f20326v;
                    if (assessmentListener2 != null) {
                        AssessmentListener.DefaultImpls.goToNextScreen$default(assessmentListener2, null, 1, null);
                        return;
                    }
                    return;
                }
                int i11 = x.K;
                UtilsKt.logError$default(this$0.f20325u, null, new c0(this$0), 2, null);
                return;
        }
    }
}
