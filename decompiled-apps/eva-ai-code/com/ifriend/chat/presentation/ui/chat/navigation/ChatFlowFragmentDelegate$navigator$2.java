package com.ifriend.chat.presentation.ui.chat.navigation;

import com.ifriend.chat.presentation.ui.chat.navigation.ChatFlowFragmentDelegate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatFlowFragmentDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00060\u0001R\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate$ChatFlowNavigator;", "Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatFlowFragmentDelegate$navigator$2 extends Lambda implements Function0<ChatFlowFragmentDelegate.ChatFlowNavigator> {
    final /* synthetic */ ChatFlowFragmentDelegate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFlowFragmentDelegate$navigator$2(ChatFlowFragmentDelegate chatFlowFragmentDelegate) {
        super(0);
        this.this$0 = chatFlowFragmentDelegate;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChatFlowFragmentDelegate.ChatFlowNavigator invoke() {
        return new ChatFlowFragmentDelegate.ChatFlowNavigator();
    }
}
