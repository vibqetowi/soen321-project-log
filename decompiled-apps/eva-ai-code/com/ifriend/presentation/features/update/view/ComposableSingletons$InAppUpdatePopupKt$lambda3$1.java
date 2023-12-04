package com.ifriend.presentation.features.update.view;

import androidx.compose.material3.SnackbarData;
import androidx.compose.material3.SnackbarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InAppUpdatePopup.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/SnackbarData;", "invoke", "(Landroidx/compose/material3/SnackbarData;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.update.view.ComposableSingletons$InAppUpdatePopupKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$InAppUpdatePopupKt$lambda3$1 extends Lambda implements Function3<SnackbarData, Composer, Integer, Unit> {
    public static final ComposableSingletons$InAppUpdatePopupKt$lambda3$1 INSTANCE = new ComposableSingletons$InAppUpdatePopupKt$lambda3$1();

    ComposableSingletons$InAppUpdatePopupKt$lambda3$1() {
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
        if ((i & 14) == 0) {
            i2 = i | (composer.changed(it) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1067523156, i2, -1, "com.ifriend.presentation.features.update.view.ComposableSingletons$InAppUpdatePopupKt.lambda-3.<anonymous> (InAppUpdatePopup.kt:233)");
            }
            SnackbarKt.m1983SnackbarsDKtq54(it, null, false, null, 0L, 0L, 0L, 0L, 0L, composer, i2 & 14, TypedValues.PositionType.TYPE_POSITION_TYPE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
