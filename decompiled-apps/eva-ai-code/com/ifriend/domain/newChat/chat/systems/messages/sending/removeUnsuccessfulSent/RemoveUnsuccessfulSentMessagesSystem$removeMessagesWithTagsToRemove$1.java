package com.ifriend.domain.newChat.chat.systems.messages.sending.removeUnsuccessfulSent;

import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RemoveUnsuccessfulSentMessagesSystem.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/ifriend/common_entities_engine/Entity;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RemoveUnsuccessfulSentMessagesSystem$removeMessagesWithTagsToRemove$1 extends Lambda implements Function1<List<Entity>, Unit> {
    final /* synthetic */ RemoveUnsuccessfulSentMessagesSystem this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveUnsuccessfulSentMessagesSystem$removeMessagesWithTagsToRemove$1(RemoveUnsuccessfulSentMessagesSystem removeUnsuccessfulSentMessagesSystem) {
        super(1);
        this.this$0 = removeUnsuccessfulSentMessagesSystem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<Entity> list) {
        invoke2(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoveUnsuccessfulSentMessagesSystem.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/common_entities_engine/Entity;", "invoke", "(Lcom/ifriend/common_entities_engine/Entity;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.domain.newChat.chat.systems.messages.sending.removeUnsuccessfulSent.RemoveUnsuccessfulSentMessagesSystem$removeMessagesWithTagsToRemove$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<Entity, Boolean> {
        final /* synthetic */ RemoveUnsuccessfulSentMessagesSystem this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RemoveUnsuccessfulSentMessagesSystem removeUnsuccessfulSentMessagesSystem) {
            super(1);
            this.this$0 = removeUnsuccessfulSentMessagesSystem;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Entity it) {
            Set set;
            Intrinsics.checkNotNullParameter(it, "it");
            ChatMessage chatMessage = (ChatMessage) it.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (chatMessage != null) {
                set = this.this$0.tagsToRemove;
                return Boolean.valueOf(set.contains(chatMessage.getInfo().getTag()));
            }
            return false;
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<Entity> update) {
        Intrinsics.checkNotNullParameter(update, "$this$update");
        CollectionsKt.removeAll((List) update, (Function1) new AnonymousClass1(this.this$0));
    }
}
