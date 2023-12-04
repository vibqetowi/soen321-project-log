package com.ifriend.ui.features.photo;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PhotoModalPopup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/RowScope;", "invoke", "(Landroidx/compose/foundation/layout/RowScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.features.photo.ComposableSingletons$PhotoModalPopupKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$PhotoModalPopupKt$lambda1$1 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$PhotoModalPopupKt$lambda1$1 INSTANCE = new ComposableSingletons$PhotoModalPopupKt$lambda1$1();

    ComposableSingletons$PhotoModalPopupKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
        invoke(rowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(RowScope Button, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        if ((i & 81) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1902837279, i, -1, "com.ifriend.ui.features.photo.ComposableSingletons$PhotoModalPopupKt.lambda-1.<anonymous> (PhotoModalPopup.kt:63)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
