package com.ifriend.ui.components.buttons;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ButtonWidgets.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.components.buttons.ComposableSingletons$ButtonWidgetsKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$ButtonWidgetsKt$lambda1$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ButtonWidgetsKt$lambda1$1 INSTANCE = new ComposableSingletons$ButtonWidgetsKt$lambda1$1();

    ComposableSingletons$ButtonWidgetsKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope AppShadowButtonWithContent, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AppShadowButtonWithContent, "$this$AppShadowButtonWithContent");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(607148515, i, -1, "com.ifriend.ui.components.buttons.ComposableSingletons$ButtonWidgetsKt.lambda-1.<anonymous> (ButtonWidgets.kt:44)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
