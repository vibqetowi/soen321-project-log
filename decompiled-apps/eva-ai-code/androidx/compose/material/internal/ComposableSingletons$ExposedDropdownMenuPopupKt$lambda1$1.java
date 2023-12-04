package androidx.compose.material.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes.dex */
final class ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1 INSTANCE = new ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1();

    ComposableSingletons$ExposedDropdownMenuPopupKt$lambda1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C:ExposedDropdownMenuPopup.kt#mnwmf7");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1627646060, i, -1, "androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.lambda-1.<anonymous> (ExposedDropdownMenuPopup.kt:285)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
