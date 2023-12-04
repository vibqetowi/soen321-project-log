package com.ifriend.presentation.features.chat.panel.ui.topics;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.features.chat.panel.models.ChatTopicUi;
import com.ifriend.ui.features.text.TextWithDotsLoadingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatTopicContent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatTopicContentKt$ChatTopicContent$1$1 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {
    final /* synthetic */ ChatTopicUi $topic;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatTopicContentKt$ChatTopicContent$1$1(ChatTopicUi chatTopicUi) {
        super(3);
        this.$topic = chatTopicUi;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        invoke(boxScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxScope NeomorphicDarkLightButton, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(NeomorphicDarkLightButton, "$this$NeomorphicDarkLightButton");
        if ((i & 81) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1053689865, i, -1, "com.ifriend.presentation.features.chat.panel.ui.topics.ChatTopicContent.<anonymous>.<anonymous> (ChatTopicContent.kt:33)");
            }
            float f = 12;
            TextWithDotsLoadingKt.TextWithDotsLoading(PaddingKt.m752paddingqDBjuR0$default(Modifier.Companion, Dp.m5607constructorimpl(f), 0.0f, Dp.m5607constructorimpl(f), 0.0f, 10, null), this.$topic.getName(), this.$topic.isLoading(), null, composer, 6, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
