package ik;

import android.view.View;
import com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20274u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f20275v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ s0 f20276w;

    public /* synthetic */ q0(boolean z10, s0 s0Var, int i6) {
        this.f20274u = i6;
        this.f20275v = z10;
        this.f20276w = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f20274u;
        boolean z10 = this.f20275v;
        s0 this$0 = this.f20276w;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (z10) {
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                    ((InitialAssessmentActivity) activity).t0();
                    return;
                }
                s0.O(this$0);
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (z10) {
                    androidx.fragment.app.p activity2 = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.assessments.activity.InitialAssessmentActivity");
                    ((InitialAssessmentActivity) activity2).t0();
                    return;
                }
                s0.O(this$0);
                return;
        }
    }
}
