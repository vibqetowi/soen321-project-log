package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/SnackbarData;", "invoke", "(Landroidx/compose/material/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material.ComposableSingletons$SnackbarHostKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$SnackbarHostKt$lambda1$1 extends Lambda implements Function3<SnackbarData, Composer, Integer, Unit> {
    public static final ComposableSingletons$SnackbarHostKt$lambda1$1 INSTANCE = new ComposableSingletons$SnackbarHostKt$lambda1$1();

    ComposableSingletons$SnackbarHostKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SnackbarData snackbarData, Composer composer, Integer num) {
        invoke(snackbarData, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(SnackbarData it, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation(composer, "C153@6325L12:SnackbarHost.kt#jmzs0o");
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(it) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(996639038, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:153)");
        }
        SnackbarKt.m1454SnackbarsPrSdHI(it, null, false, null, 0L, 0L, 0L, 0.0f, composer, i2 & 14, 254);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
