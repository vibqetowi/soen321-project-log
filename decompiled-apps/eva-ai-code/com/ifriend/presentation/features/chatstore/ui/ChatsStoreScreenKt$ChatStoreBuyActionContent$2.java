package com.ifriend.presentation.features.chatstore.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatsStoreScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsStoreScreenKt$ChatStoreBuyActionContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $actionMessage;
    final /* synthetic */ Function0<Unit> $onBuyChat;
    final /* synthetic */ String $price;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsStoreScreenKt$ChatStoreBuyActionContent$2(Function0<Unit> function0, String str, String str2, int i) {
        super(2);
        this.$onBuyChat = function0;
        this.$actionMessage = str;
        this.$price = str2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatsStoreScreenKt.ChatStoreBuyActionContent(this.$onBuyChat, this.$actionMessage, this.$price, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
