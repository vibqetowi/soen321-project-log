package pq;

import android.view.View;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.widgets.CustomViewPager;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class z implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28841u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ a0 f28842v;

    public /* synthetic */ z(a0 a0Var, int i6) {
        this.f28841u = i6;
        this.f28842v = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f28841u;
        a0 this$0 = this.f28842v;
        switch (i6) {
            case 0:
                int i10 = a0.f28752x;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                ((CustomViewPager) this$0._$_findCachedViewById(R.id.a29ViewPager)).v(this$0.f28754v);
                this$0.f28754v++;
                return;
            case 1:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity).t0();
                return;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                androidx.fragment.app.p activity2 = this$0.getActivity();
                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                ((DepressionMasteryActivity) activity2).t0();
                return;
        }
    }
}
