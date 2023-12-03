package q7;

import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import c9.w;
import com.google.android.exoplayer2.audio.a;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.activity.NewDynamicParentActivity;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f29270u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ boolean f29271v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f29272w;

    public /* synthetic */ k(int i6, Object obj, boolean z10) {
        this.f29270u = i6;
        this.f29272w = obj;
        this.f29271v = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6;
        ProgressBar progressBar;
        int i10 = this.f29270u;
        boolean z10 = this.f29271v;
        Object obj = this.f29272w;
        switch (i10) {
            case 0:
                a.C0132a c0132a = (a.C0132a) obj;
                c0132a.getClass();
                int i11 = w.f5205a;
                c0132a.f6254b.g(z10);
                return;
            case 1:
                oj.a listener = (oj.a) obj;
                kotlin.jvm.internal.i.g(listener, "$listener");
                listener.a();
                return;
            default:
                NewDynamicParentActivity this$0 = (NewDynamicParentActivity) obj;
                int i12 = NewDynamicParentActivity.F;
                kotlin.jvm.internal.i.g(this$0, "this$0");
                if (z10) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) this$0.u0(R.id.parentNavBarContainer);
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(i6);
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this$0.u0(R.id.parentCtaContainer);
                if (constraintLayout2 != null) {
                    constraintLayout2.setVisibility(i6);
                }
                if (!z10 && (progressBar = (ProgressBar) this$0.u0(R.id.pbParentProgress)) != null) {
                    progressBar.setVisibility(i6);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ k(boolean z10, NewDynamicParentActivity newDynamicParentActivity) {
        this.f29270u = 2;
        this.f29271v = z10;
        this.f29272w = newDynamicParentActivity;
    }
}
