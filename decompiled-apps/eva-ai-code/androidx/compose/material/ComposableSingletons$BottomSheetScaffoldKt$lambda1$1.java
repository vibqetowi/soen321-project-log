package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/SnackbarHostState;", "invoke", "(Landroidx/compose/material/SnackbarHostState;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$BottomSheetScaffoldKt$lambda1$1 extends Lambda implements Function3<SnackbarHostState, Composer, Integer, Unit> {
    public static final ComposableSingletons$BottomSheetScaffoldKt$lambda1$1 INSTANCE = new ComposableSingletons$BottomSheetScaffoldKt$lambda1$1();

    ComposableSingletons$BottomSheetScaffoldKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SnackbarHostState snackbarHostState, Composer composer, Integer num) {
        invoke(snackbarHostState, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(SnackbarHostState it, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "C419@16636L16:BottomSheetScaffold.kt#jmzs0o");
        if ((i & 14) == 0) {
            i |= composer.changed(it) ? 4 : 2;
        }
        if ((i & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(895288908, i, -1, "androidx.compose.material.ComposableSingletons$BottomSheetScaffoldKt.lambda-1.<anonymous> (BottomSheetScaffold.kt:419)");
        }
        SnackbarHostKt.SnackbarHost(it, null, null, composer, i & 14, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
