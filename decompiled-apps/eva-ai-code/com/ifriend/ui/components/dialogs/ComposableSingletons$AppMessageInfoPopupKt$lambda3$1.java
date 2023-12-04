package com.ifriend.ui.components.dialogs;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppMessageInfoPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.components.dialogs.ComposableSingletons$AppMessageInfoPopupKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$AppMessageInfoPopupKt$lambda3$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AppMessageInfoPopupKt$lambda3$1 INSTANCE = new ComposableSingletons$AppMessageInfoPopupKt$lambda3$1();

    ComposableSingletons$AppMessageInfoPopupKt$lambda3$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(755922068, i, -1, "com.ifriend.ui.components.dialogs.ComposableSingletons$AppMessageInfoPopupKt.lambda-3.<anonymous> (AppMessageInfoPopup.kt:36)");
            }
            SurfaceKt.m2067SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AppMessageInfoPopupKt.INSTANCE.m7036getLambda2$common_ui_release(), composer, 12582912, 127);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
