package pl;

import android.graphics.drawable.Drawable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.load.engine.GlideException;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.fragments.N24ScreenFragment;
/* compiled from: N24ScreenFragment.kt */
/* loaded from: classes2.dex */
public final class f0 implements z4.e<Drawable> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N24ScreenFragment f28593u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ c0 f28594v;

    public f0(N24ScreenFragment n24ScreenFragment, c0 c0Var) {
        this.f28593u = n24ScreenFragment;
        this.f28594v = c0Var;
    }

    @Override // z4.e
    public final void a(Object obj) {
        Drawable drawable = (Drawable) obj;
        N24ScreenFragment n24ScreenFragment = this.f28593u;
        ConstraintLayout clN24ScreenLayoutGenerator = (ConstraintLayout) n24ScreenFragment._$_findCachedViewById(R.id.clN24ScreenLayoutGenerator);
        kotlin.jvm.internal.i.f(clN24ScreenLayoutGenerator, "clN24ScreenLayoutGenerator");
        clN24ScreenLayoutGenerator.addOnLayoutChangeListener(new d0(n24ScreenFragment, this.f28594v));
    }

    @Override // z4.e
    public final void b(GlideException glideException) {
        int i6 = N24ScreenFragment.F;
        N24ScreenFragment n24ScreenFragment = this.f28593u;
        n24ScreenFragment.requireActivity().runOnUiThread(new je.o(27, n24ScreenFragment));
    }
}
