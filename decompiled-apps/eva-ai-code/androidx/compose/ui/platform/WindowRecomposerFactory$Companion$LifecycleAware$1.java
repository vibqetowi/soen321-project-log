package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: WindowRecomposer.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "rootView", "Landroidx/compose/runtime/Recomposer;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
final class WindowRecomposerFactory$Companion$LifecycleAware$1 implements WindowRecomposerFactory {
    public static final WindowRecomposerFactory$Companion$LifecycleAware$1 INSTANCE = new WindowRecomposerFactory$Companion$LifecycleAware$1();

    WindowRecomposerFactory$Companion$LifecycleAware$1() {
    }

    @Override // androidx.compose.ui.platform.WindowRecomposerFactory
    public final Recomposer createRecomposer(View rootView) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        return WindowRecomposer_androidKt.createLifecycleAwareWindowRecomposer$default(rootView, null, null, 3, null);
    }
}
