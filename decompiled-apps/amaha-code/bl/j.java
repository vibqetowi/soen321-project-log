package bl;

import android.widget.Space;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DailyPlanOverviewV3;
import com.theinnerhour.b2b.utils.Utils;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4368u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p f4369v;

    public /* synthetic */ j(p pVar, int i6) {
        this.f4368u = i6;
        this.f4369v = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f4368u;
        p this$0 = this.f4369v;
        switch (i6) {
            case 0:
                int i10 = p.f4381k0;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (this$0.isAdded()) {
                    Utils.INSTANCE.showCustomToast(this$0.getActivity(), "Keep following your plan each day!");
                    androidx.fragment.app.p activity = this$0.getActivity();
                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DailyPlanOverviewV3");
                    ((DailyPlanOverviewV3) activity).n0();
                    return;
                }
                return;
            default:
                int i11 = n.f4376c;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (((Space) this$0._$_findCachedViewById(R.id.separatorViewTop)) != null) {
                    ((Space) this$0._$_findCachedViewById(R.id.separatorViewTop)).setVisibility(8);
                    return;
                }
                return;
        }
    }
}
