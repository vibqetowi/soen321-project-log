package com.ifriend.chat.new_chat.list.presentationSystems.image;

import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: ImageLockerSystem.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ai\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00020\u00012K\u0010\u0003\u001aG\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00020\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"mapImageMessages", "", "Lcom/ifriend/common_entities_engine/Entity;", "mapper", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "entity", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Lcom/ifriend/domain/newChat/chat/models/MessageContent$Image;", FirebaseAnalytics.Param.CONTENT, "new_chat_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageLockerSystemKt {
    public static final List<Entity> mapImageMessages(List<Entity> list, Function3<? super Entity, ? super ChatMessage, ? super MessageContent.Image, Entity> mapper) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        List<Entity> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Entity entity : list2) {
            ChatMessage chatMessage = (ChatMessage) entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (chatMessage != null) {
                MessageContent content = chatMessage.getContent();
                if (content instanceof MessageContent.Image) {
                    entity = mapper.invoke(entity, chatMessage, content);
                }
            }
            arrayList.add(entity);
        }
        return arrayList;
    }
}
