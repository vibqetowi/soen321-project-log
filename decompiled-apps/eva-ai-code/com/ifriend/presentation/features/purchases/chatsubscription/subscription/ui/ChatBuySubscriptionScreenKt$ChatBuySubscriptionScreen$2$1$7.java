package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$7 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$2$1$7(Object obj) {
        super(0, obj, ChatBuySubscriptionViewModel.class, "onRestoreClick", "onRestoreClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ChatBuySubscriptionViewModel) this.receiver).onRestoreClick();
    }
}
