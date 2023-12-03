package pl;

import android.view.View;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N24ScreenFragment;
/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class d0 implements View.OnLayoutChangeListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N24ScreenFragment f28560u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f28561v;

    public d0(N24ScreenFragment n24ScreenFragment, c0 c0Var) {
        this.f28560u = n24ScreenFragment;
        this.f28561v = c0Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        kotlin.jvm.internal.i.g(view, "view");
        view.removeOnLayoutChangeListener(this);
        N24ScreenFragment n24ScreenFragment = this.f28560u;
        ta.v.H(ca.a.m0(n24ScreenFragment), null, 0, new e0(n24ScreenFragment, this.f28561v, null), 3);
        n24ScreenFragment.requireActivity().runOnUiThread(new je.o(27, n24ScreenFragment));
    }
}
