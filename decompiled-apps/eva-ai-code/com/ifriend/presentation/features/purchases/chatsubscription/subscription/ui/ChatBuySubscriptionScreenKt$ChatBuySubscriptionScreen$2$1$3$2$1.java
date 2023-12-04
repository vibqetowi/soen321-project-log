package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatBuySubscriptionScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$2$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$3$2$1(Object obj) {
        super(1, obj, ChatBuySubscriptionViewModel.class, "onItemClick", "onItemClick(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ChatBuySubscriptionViewModel) this.receiver).onItemClick(p0);
    }
}
