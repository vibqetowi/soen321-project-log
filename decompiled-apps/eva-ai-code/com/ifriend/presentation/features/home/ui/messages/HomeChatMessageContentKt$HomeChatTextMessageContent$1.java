package com.ifriend.presentation.features.home.ui.messages;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.home.ui.models.HomeLastChatMessageUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HomeChatMessageContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HomeChatMessageContentKt$HomeChatTextMessageContent$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ HomeLastChatMessageUi.Text $message;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeChatMessageContentKt$HomeChatTextMessageContent$1(HomeLastChatMessageUi.Text text, int i) {
        super(2);
        this.$message = text;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        HomeChatMessageContentKt.HomeChatTextMessageContent(this.$message, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
