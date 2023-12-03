package pl;

import android.os.Bundle;
import android.view.View;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N3ScreenFragment;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28601u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ N3ScreenFragment f28602v;

    public /* synthetic */ h0(N3ScreenFragment n3ScreenFragment, int i6) {
        this.f28601u = i6;
        this.f28602v = n3ScreenFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NewDynamicParentActivity newDynamicParentActivity;
        int i6 = this.f28601u;
        N3ScreenFragment this$0 = this.f28602v;
        switch (i6) {
            case 0:
                int i10 = N3ScreenFragment.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle.putString("activity_name", this$0.P().T);
                bundle.putBoolean("main_activity", this$0.P().K);
                bundle.putBoolean("is_revamped", true);
                gk.a.b(bundle, "activity_add_more_click");
                this$0.P().V.clear();
                this$0.P().M++;
                androidx.fragment.app.p requireActivity = this$0.requireActivity();
                if (requireActivity instanceof NewDynamicParentActivity) {
                    newDynamicParentActivity = (NewDynamicParentActivity) requireActivity;
                } else {
                    newDynamicParentActivity = null;
                }
                if (newDynamicParentActivity != null) {
                    newDynamicParentActivity.B0(this$0.P().D);
                    return;
                }
                return;
            default:
                int i11 = N3ScreenFragment.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                this$0.requireActivity().finish();
                return;
        }
    }
}
