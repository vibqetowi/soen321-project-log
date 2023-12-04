package com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.ui;

import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: ChatActiveSubscriptionScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class ChatActiveSubscriptionScreenKt$ChatActiveSubscriptionScreen$1$1$2 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatActiveSubscriptionScreenKt$ChatActiveSubscriptionScreen$1$1$2(Object obj) {
        super(0, obj, ChatActiveSubscriptionViewModel.class, "onManageSubscriptionClick", "onManageSubscriptionClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ChatActiveSubscriptionViewModel) this.receiver).onManageSubscriptionClick();
    }
}
