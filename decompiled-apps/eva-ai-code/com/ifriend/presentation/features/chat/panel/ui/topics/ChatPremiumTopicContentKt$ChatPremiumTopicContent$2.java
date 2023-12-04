package com.ifriend.presentation.features.chat.panel.ui.topics;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.chat.panel.models.ChatPremiumTopicUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatPremiumTopicContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatPremiumTopicContentKt$ChatPremiumTopicContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onTopicClick;
    final /* synthetic */ ChatPremiumTopicUi $topic;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatPremiumTopicContentKt$ChatPremiumTopicContent$2(ChatPremiumTopicUi chatPremiumTopicUi, Function0<Unit> function0, int i) {
        super(2);
        this.$topic = chatPremiumTopicUi;
        this.$onTopicClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatPremiumTopicContentKt.ChatPremiumTopicContent(this.$topic, this.$onTopicClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
