package com.ifriend.presentation.features.chat.intro.view;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatIntroPopup.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.chat.intro.view.ComposableSingletons$ChatIntroPopupKt$lambda-4$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$ChatIntroPopupKt$lambda4$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ChatIntroPopupKt$lambda4$1 INSTANCE = new ComposableSingletons$ChatIntroPopupKt$lambda4$1();

    ComposableSingletons$ChatIntroPopupKt$lambda4$1() {
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
                ComposerKt.traceEventStart(-1401565798, i, -1, "com.ifriend.presentation.features.chat.intro.view.ComposableSingletons$ChatIntroPopupKt.lambda-4.<anonymous> (ChatIntroPopup.kt:293)");
            }
            SurfaceKt.m2067SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), null, Color.Companion.m3328getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableSingletons$ChatIntroPopupKt.INSTANCE.m6911getLambda3$presentation_release(), composer, 12583302, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
