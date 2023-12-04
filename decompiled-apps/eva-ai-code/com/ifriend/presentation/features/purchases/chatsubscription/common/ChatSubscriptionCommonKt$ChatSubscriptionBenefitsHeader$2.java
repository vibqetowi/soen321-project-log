package com.ifriend.presentation.features.purchases.chatsubscription.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatSubscriptionCommon.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionCommonKt$ChatSubscriptionBenefitsHeader$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $chatName;
    final /* synthetic */ Function0<Unit> $onBackClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionCommonKt$ChatSubscriptionBenefitsHeader$2(Function0<Unit> function0, String str, int i) {
        super(2);
        this.$onBackClick = function0;
        this.$chatName = str;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatSubscriptionCommonKt.ChatSubscriptionBenefitsHeader(this.$onBackClick, this.$chatName, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
