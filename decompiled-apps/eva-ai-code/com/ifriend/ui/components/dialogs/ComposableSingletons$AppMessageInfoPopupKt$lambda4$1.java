package com.ifriend.ui.components.dialogs;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.ifriend.ui.R;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AppMessageInfoPopup.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.components.dialogs.ComposableSingletons$AppMessageInfoPopupKt$lambda-4$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$AppMessageInfoPopupKt$lambda4$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$AppMessageInfoPopupKt$lambda4$1 INSTANCE = new ComposableSingletons$AppMessageInfoPopupKt$lambda4$1();

    ComposableSingletons$AppMessageInfoPopupKt$lambda4$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope AppShadowButtonWithContent, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AppShadowButtonWithContent, "$this$AppShadowButtonWithContent");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-365734206, i, -1, "com.ifriend.ui.components.dialogs.ComposableSingletons$AppMessageInfoPopupKt.lambda-4.<anonymous> (AppMessageInfoPopup.kt:154)");
            }
            IconKt.m1828Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_close, composer, 0), "", (Modifier) null, AppTheme.INSTANCE.getColors(composer, 6).m7108getTextPrimary0d7_KjU(), composer, 56, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
