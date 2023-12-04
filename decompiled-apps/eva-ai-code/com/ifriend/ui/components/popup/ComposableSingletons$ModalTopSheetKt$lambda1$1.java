package com.ifriend.ui.components.popup;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ModalTopSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.components.popup.ComposableSingletons$ModalTopSheetKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$ModalTopSheetKt$lambda1$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ModalTopSheetKt$lambda1$1 INSTANCE = new ComposableSingletons$ModalTopSheetKt$lambda1$1();

    ComposableSingletons$ModalTopSheetKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope ModalTopSheet, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(ModalTopSheet, "$this$ModalTopSheet");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(283698724, i, -1, "com.ifriend.ui.components.popup.ComposableSingletons$ModalTopSheetKt.lambda-1.<anonymous> (ModalTopSheet.kt:42)");
            }
            SpacerKt.Spacer(BackgroundKt.m420backgroundbw27NRU(SizeKt.m781height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), Dp.m5607constructorimpl(200)), Color.Companion.m3324getMagenta0d7_KjU(), CornerBasedShape.copy$default(AppTheme.INSTANCE.getShapes(composer, 6).getExtraLarge(), CornerSizeKt.CornerSize(0), CornerSizeKt.CornerSize(0), null, null, 12, null)), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
