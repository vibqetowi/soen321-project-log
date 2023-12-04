package com.ifriend.chat.new_chat.list;

import android.os.Bundle;
import com.ifriend.common_utils.extensions.ommonKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatListFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatListFragment$shouldShowKeyboardOnStart$2 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ ChatListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListFragment$shouldShowKeyboardOnStart$2(ChatListFragment chatListFragment) {
        super(0);
        this.this$0 = chatListFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Bundle arguments = this.this$0.getArguments();
        return Boolean.valueOf(ommonKt.orFalse(arguments != null ? Boolean.valueOf(arguments.getBoolean("show_keyboard")) : null));
    }
}
