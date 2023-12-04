package com.ifriend.chat.presentation.ui.chat.presentation.chat.ui;

import com.ifriend.chat.presentation.ui.chat.navigation.ChatFlowFragmentDelegate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFragment$flowFragmentDelegate$2 extends Lambda implements Function0<ChatFlowFragmentDelegate> {
    final /* synthetic */ ChatFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$flowFragmentDelegate$2(ChatFragment chatFragment) {
        super(0);
        this.this$0 = chatFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final ChatFlowFragmentDelegate invoke() {
        return new ChatFlowFragmentDelegate(this.this$0, 0, 2, null);
    }
}
