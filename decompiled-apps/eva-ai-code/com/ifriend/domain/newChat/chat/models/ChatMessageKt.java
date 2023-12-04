package com.ifriend.domain.newChat.chat.models;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.newChat.chat.models.MessageInfo;
import com.ifriend.domain.newChat.chat.systems.distinct.UniqueComponent;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatMessage.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u0002\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u000b*\u00020\u0002\u001a\u0014\u0010\r\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u0002\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0011"}, d2 = {"id", "", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "getId", "(Lcom/ifriend/domain/newChat/chat/models/ChatMessage;)Ljava/lang/String;", ViewHierarchyConstants.TAG_KEY, "getTag", "baseComponentsSet", "", "Lcom/ifriend/common_entities_engine/Component;", "isFromBot", "", "isFromUser", "isPaid", CookieSpecs.DEFAULT, "toEntity", "Lcom/ifriend/common_entities_engine/Entity;", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatMessageKt {
    public static final Entity toEntity(ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        return new Entity(baseComponentsSet(chatMessage));
    }

    public static final Set<Component> baseComponentsSet(ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        return SetsKt.setOf((Object[]) new Component[]{new SortComponent.RegularMessage(chatMessage.getInfo().getTimestamp()), new UniqueComponent(chatMessage.getInfo().getTag().getValue()), chatMessage});
    }

    public static final String getId(ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        return chatMessage.getInfo().getIds().getMessageId();
    }

    public static final String getTag(ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        return chatMessage.getInfo().getTag().getValue();
    }

    public static final boolean isFromUser(ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        return chatMessage.getInfo().isFromUser();
    }

    public static final boolean isFromBot(ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        return !isFromUser(chatMessage);
    }

    public static final boolean isPaid(ChatMessage chatMessage, boolean z) {
        Boolean isPaid;
        Intrinsics.checkNotNullParameter(chatMessage, "<this>");
        MessageInfo.PaymentInfo paymentInfo = chatMessage.getInfo().getPaymentInfo();
        return (paymentInfo == null || (isPaid = paymentInfo.isPaid()) == null) ? z : isPaid.booleanValue();
    }

    public static /* synthetic */ boolean isPaid$default(ChatMessage chatMessage, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return isPaid(chatMessage, z);
    }
}
