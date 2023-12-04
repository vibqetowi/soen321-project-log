package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* compiled from: DialogNavigator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$DialogNavigatorKt$lambda1$1 extends Lambda implements Function3<NavBackStackEntry, Composer, Integer, Unit> {
    public static final ComposableSingletons$DialogNavigatorKt$lambda1$1 INSTANCE = new ComposableSingletons$DialogNavigatorKt$lambda1$1();

    ComposableSingletons$DialogNavigatorKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(NavBackStackEntry navBackStackEntry, Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:DialogNavigator.kt#opm8kd");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1092249270, i, -1, "androidx.navigation.compose.ComposableSingletons$DialogNavigatorKt.lambda-1.<anonymous> (DialogNavigator.kt:59)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
