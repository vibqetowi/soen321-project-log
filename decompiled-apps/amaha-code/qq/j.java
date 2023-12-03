package qq;

import android.view.View;
import com.theinnerhour.b2b.activity.DepressionPleasurableActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f30042u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ l f30043v;

    public /* synthetic */ j(l lVar, int i6) {
        this.f30042u = i6;
        this.f30043v = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f30042u;
        l this$0 = this.f30043v;
        switch (i6) {
            case 0:
                int i10 = l.f30045w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity).t0();
                return;
            case 1:
                int i11 = l.f30045w;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity2).t0();
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity3 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionPleasurableActivity");
                ((DepressionPleasurableActivity) activity3).t0();
                return;
        }
    }
}
