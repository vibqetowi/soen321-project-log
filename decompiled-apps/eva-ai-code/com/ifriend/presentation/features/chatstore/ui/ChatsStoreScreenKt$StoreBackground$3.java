package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.chatstore.models.ChatStoreUi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreScreenKt$StoreBackground$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $avatarOffset;
    final /* synthetic */ ChatStoreUi $currentBot;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsStoreScreenKt$StoreBackground$3(ChatStoreUi chatStoreUi, float f, int i) {
        super(2);
        this.$currentBot = chatStoreUi;
        this.$avatarOffset = f;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatsStoreScreenKt.StoreBackground(this.$currentBot, this.$avatarOffset, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
