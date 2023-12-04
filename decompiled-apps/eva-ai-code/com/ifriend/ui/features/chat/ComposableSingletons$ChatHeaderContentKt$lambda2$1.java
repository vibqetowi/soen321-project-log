package com.ifriend.ui.features.chat;

import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.ifriend.ui.theme.AppIcons;
import com.ifriend.ui.theme.AppTheme;
import com.ifriend.ui.theme.icons.IconBackKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatHeaderContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.ui.features.chat.ComposableSingletons$ChatHeaderContentKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes4.dex */
final class ComposableSingletons$ChatHeaderContentKt$lambda2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatHeaderContentKt$lambda2$1 INSTANCE = new ComposableSingletons$ChatHeaderContentKt$lambda2$1();

    ComposableSingletons$ChatHeaderContentKt$lambda2$1() {
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
                ComposerKt.traceEventStart(-359518493, i, -1, "com.ifriend.ui.features.chat.ComposableSingletons$ChatHeaderContentKt.lambda-2.<anonymous> (ChatHeaderContent.kt:69)");
            }
            IconKt.m1829Iconww6aTOc(IconBackKt.getIconBack(AppIcons.INSTANCE), "", (Modifier) null, AppTheme.INSTANCE.getColors(composer, 6).m7108getTextPrimary0d7_KjU(), composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
