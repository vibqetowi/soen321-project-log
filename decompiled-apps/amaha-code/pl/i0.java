package pl;

import androidx.core.widget.NestedScrollView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N3ScreenFragment;
import com.theinnerhour.b2b.utils.LogHelper;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f28606u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ N3ScreenFragment f28607v;

    public /* synthetic */ i0(N3ScreenFragment n3ScreenFragment, int i6) {
        this.f28606u = i6;
        this.f28607v = n3ScreenFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NestedScrollView nestedScrollView;
        NestedScrollView nestedScrollView2;
        int i6 = this.f28606u;
        N3ScreenFragment this$0 = this.f28607v;
        switch (i6) {
            case 0:
                int i10 = N3ScreenFragment.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (this$0.isAdded() && (nestedScrollView2 = (NestedScrollView) this$0._$_findCachedViewById(R.id.svN3ParentContainer)) != null) {
                        nestedScrollView2.post(new i0(this$0, 1));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    LogHelper.INSTANCE.e(this$0.f11052w, e10);
                    return;
                }
            default:
                int i11 = N3ScreenFragment.B;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                try {
                    if (this$0.isAdded() && (nestedScrollView = (NestedScrollView) this$0._$_findCachedViewById(R.id.svN3ParentContainer)) != null) {
                        nestedScrollView.fullScroll(130);
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    LogHelper.INSTANCE.e(this$0.f11052w, e11);
                    return;
                }
        }
    }
}
