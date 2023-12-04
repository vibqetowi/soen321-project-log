package com.ifriend.presentation.features.chatcall.ui;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.ifriend.ui.theme.AppIcons;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.theme.icons.calls.IconEndCallKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatCallScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.chatcall.ui.ComposableSingletons$ChatCallScreenKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$ChatCallScreenKt$lambda1$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatCallScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$ChatCallScreenKt$lambda1$1();

    ComposableSingletons$ChatCallScreenKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope AppShadowButtonWithContent, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(AppShadowButtonWithContent, "$this$AppShadowButtonWithContent");
        if ((i & 14) == 0) {
            i2 = (composer.changed(AppShadowButtonWithContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1112419344, i, -1, "com.ifriend.presentation.features.chatcall.ui.ComposableSingletons$ChatCallScreenKt.lambda-1.<anonymous> (ChatCallScreen.kt:157)");
            }
            IconKt.m1829Iconww6aTOc(IconEndCallKt.getIconEndCall(AppIcons.INSTANCE), "", AppShadowButtonWithContent.align(Modifier.Companion, Alignment.Companion.getCenter()), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7100getLight0d7_KjU(), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
