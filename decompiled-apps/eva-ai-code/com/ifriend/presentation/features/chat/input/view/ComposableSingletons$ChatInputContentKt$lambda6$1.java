package com.ifriend.presentation.features.chat.input.view;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.R;
import com.ifriend.ui.theme.AppTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatInputContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.chat.input.view.ComposableSingletons$ChatInputContentKt$lambda-6$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$ChatInputContentKt$lambda6$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatInputContentKt$lambda6$1 INSTANCE = new ComposableSingletons$ChatInputContentKt$lambda6$1();

    ComposableSingletons$ChatInputContentKt$lambda6$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope TranslucentButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TranslucentButton, "$this$TranslucentButton");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1004623811, i, -1, "com.ifriend.presentation.features.chat.input.view.ComposableSingletons$ChatInputContentKt.lambda-6.<anonymous> (ChatInputContent.kt:633)");
            }
            IconKt.m1828Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_send_image_message, composer, 0), StringResources_androidKt.stringResource(R.string.content_description__send_image_button, composer, 0), SizeKt.m795size3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(24)), AppTheme.INSTANCE.getColors(composer, AppTheme.$stable).m7099getIconPrimary0d7_KjU(), composer, 392, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
