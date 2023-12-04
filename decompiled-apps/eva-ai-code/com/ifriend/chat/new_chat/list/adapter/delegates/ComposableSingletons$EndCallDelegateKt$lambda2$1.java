package com.ifriend.chat.new_chat.list.adapter.delegates;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: EndCallDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.chat.new_chat.list.adapter.delegates.ComposableSingletons$EndCallDelegateKt$lambda-2$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$EndCallDelegateKt$lambda2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$EndCallDelegateKt$lambda2$1 INSTANCE = new ComposableSingletons$EndCallDelegateKt$lambda2$1();

    ComposableSingletons$EndCallDelegateKt$lambda2$1() {
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
                ComposerKt.traceEventStart(1091096022, i, -1, "com.ifriend.chat.new_chat.list.adapter.delegates.ComposableSingletons$EndCallDelegateKt.lambda-2.<anonymous> (EndCallDelegate.kt:36)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableSingletons$EndCallDelegateKt.INSTANCE.m6801getLambda1$new_chat_release(), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
