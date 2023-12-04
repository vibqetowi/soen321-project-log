package by.kirich1409.viewbindingdelegate;

import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FragmentViewBindings.kt */
@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FragmentViewBindings$viewBinding$3 extends FunctionReferenceImpl implements Function1<Fragment, View> {
    public static final FragmentViewBindings$viewBinding$3 INSTANCE = new FragmentViewBindings$viewBinding$3();

    public FragmentViewBindings$viewBinding$3() {
        super(1, Fragment.class, "requireView", "requireView()Landroid/view/View;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final View invoke(Fragment p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return p0.requireView();
    }
}
