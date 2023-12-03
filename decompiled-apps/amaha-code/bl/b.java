package bl;

import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.constraintlayout.widget.ConstraintLayout;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f4340u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ View f4341v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ AlphaAnimation f4342w;

    public /* synthetic */ b(ConstraintLayout constraintLayout, AlphaAnimation alphaAnimation, int i6) {
        this.f4340u = i6;
        this.f4341v = constraintLayout;
        this.f4342w = alphaAnimation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i6 = this.f4340u;
        AlphaAnimation animation = this.f4342w;
        View view = this.f4341v;
        switch (i6) {
            case 0:
                int i10 = i.f4356f0;
                kotlin.jvm.internal.i.g(view, "$view");
                kotlin.jvm.internal.i.g(animation, "$animation");
                view.startAnimation(animation);
                return;
            default:
                int i11 = p.f4381k0;
                kotlin.jvm.internal.i.g(view, "$view");
                kotlin.jvm.internal.i.g(animation, "$animation");
                view.startAnimation(animation);
                return;
        }
    }
}
