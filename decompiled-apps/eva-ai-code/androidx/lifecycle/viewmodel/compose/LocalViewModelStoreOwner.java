package androidx.lifecycle.viewmodel.compose;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LocalViewModelStoreOwner.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\u000b\u001a\u00020\u0005H\u0086\u0004R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/viewmodel/compose/LocalViewModelStoreOwner;", "", "()V", "LocalViewModelStoreOwner", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/lifecycle/ViewModelStoreOwner;", "current", "getCurrent", "(Landroidx/compose/runtime/Composer;I)Landroidx/lifecycle/ViewModelStoreOwner;", "provides", "Landroidx/compose/runtime/ProvidedValue;", "viewModelStoreOwner", "lifecycle-viewmodel-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LocalViewModelStoreOwner {
    public static final int $stable = 0;
    public static final LocalViewModelStoreOwner INSTANCE = new LocalViewModelStoreOwner();
    private static final ProvidableCompositionLocal<ViewModelStoreOwner> LocalViewModelStoreOwner = CompositionLocalKt.compositionLocalOf$default(null, LocalViewModelStoreOwner$LocalViewModelStoreOwner$1.INSTANCE, 1, null);

    private LocalViewModelStoreOwner() {
    }

    public final ViewModelStoreOwner getCurrent(Composer composer, int i) {
        composer.startReplaceableGroup(-584162872);
        ComposerKt.sourceInformation(composer, "C40@1555L7,41@1588L7:LocalViewModelStoreOwner.kt#3tja67");
        ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
        Object consume = composer.consume(LocalViewModelStoreOwner);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) consume;
        if (viewModelStoreOwner == null) {
            ComposerKt.sourceInformationMarkerStart(composer, 103361330, "C:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
            ComposerKt.sourceInformationMarkerEnd(composer);
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.get((View) consume2);
        }
        composer.endReplaceableGroup();
        return viewModelStoreOwner;
    }

    public final ProvidedValue<ViewModelStoreOwner> provides(ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        return LocalViewModelStoreOwner.provides(viewModelStoreOwner);
    }
}
