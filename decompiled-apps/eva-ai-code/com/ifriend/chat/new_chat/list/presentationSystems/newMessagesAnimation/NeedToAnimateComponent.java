package com.ifriend.chat.new_chat.list.presentationSystems.newMessagesAnimation;

import com.ifriend.common_entities_engine.Component;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NeedToAnimateComponent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/NeedToAnimateComponent;", "Lcom/ifriend/common_entities_engine/Component;", "animation", "Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/ChatItemAnimation;", "(Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/ChatItemAnimation;)V", "getAnimation", "()Lcom/ifriend/chat/new_chat/list/presentationSystems/newMessagesAnimation/ChatItemAnimation;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NeedToAnimateComponent implements Component {
    public static final int $stable = 8;
    private final ChatItemAnimation animation;

    public NeedToAnimateComponent(ChatItemAnimation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.animation = animation;
    }

    public final ChatItemAnimation getAnimation() {
        return this.animation;
    }
}
