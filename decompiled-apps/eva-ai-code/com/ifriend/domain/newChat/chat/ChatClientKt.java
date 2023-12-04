package com.ifriend.domain.newChat.chat;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.ChatMessageKt;
import com.ifriend.domain.newChat.chat.systems.messages.reading.MessageIsReadComponent;
import com.ifriend.domain.newChat.chat.systems.sorting.SortComponent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.apache.http.cookie.ClientCookie;
/* compiled from: ChatClient.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0002H\u0086\b\u001a\u0010\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004*\u00020\u0002\u001a\f\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0002¨\u0006\n"}, d2 = {"countOfUnreadMessages", "", "Lcom/ifriend/common_entities_engine/EntitiesState;", "getComponents", "", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/ifriend/common_entities_engine/Component;", "getMessages", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "lastMessage", ClientCookie.DOMAIN_ATTR}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatClientKt {
    public static final /* synthetic */ <T extends Component> List<T> getComponents(EntitiesState entitiesState) {
        Intrinsics.checkNotNullParameter(entitiesState, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Entity entity : entitiesState.getEntities()) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            Component component = entity.get(Reflection.getOrCreateKotlinClass(Component.class));
            if (component != null) {
                arrayList.add(component);
            }
        }
        return arrayList;
    }

    public static final ChatMessage lastMessage(EntitiesState entitiesState) {
        Object next;
        Intrinsics.checkNotNullParameter(entitiesState, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entitiesState.getEntities().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entity entity = (Entity) it.next();
            Component component = entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            Pair pair = component != null ? TuplesKt.to(entity, component) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Iterator it2 = CollectionsKt.reversed(arrayList).iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Pair pair2 = (Pair) next;
                ChatMessage chatMessage = (ChatMessage) pair2.component2();
                Component component2 = ((Entity) pair2.component1()).get(Reflection.getOrCreateKotlinClass(SortComponent.class));
                Intrinsics.checkNotNull(component2);
                SortComponent sortComponent = (SortComponent) component2;
                do {
                    Object next2 = it2.next();
                    Pair pair3 = (Pair) next2;
                    ChatMessage chatMessage2 = (ChatMessage) pair3.component2();
                    Component component3 = ((Entity) pair3.component1()).get(Reflection.getOrCreateKotlinClass(SortComponent.class));
                    Intrinsics.checkNotNull(component3);
                    SortComponent sortComponent2 = (SortComponent) component3;
                    if (sortComponent.compareTo(sortComponent2) < 0) {
                        next = next2;
                        sortComponent = sortComponent2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Pair pair4 = (Pair) next;
        if (pair4 != null) {
            return (ChatMessage) pair4.getSecond();
        }
        return null;
    }

    public static final int countOfUnreadMessages(EntitiesState entitiesState) {
        Intrinsics.checkNotNullParameter(entitiesState, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Entity entity : entitiesState.getEntities()) {
            Component component = entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            Pair pair = component == null ? null : TuplesKt.to(entity, component);
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        ArrayList<Pair> arrayList2 = arrayList;
        if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
            return 0;
        }
        int i = 0;
        for (Pair pair2 : arrayList2) {
            Entity entity2 = (Entity) pair2.component1();
            ChatMessage chatMessage = (ChatMessage) pair2.component2();
            if ((!chatMessage.getInfo().getRead() && entity2.get(Reflection.getOrCreateKotlinClass(MessageIsReadComponent.class)) == null && ChatMessageKt.isFromBot(chatMessage)) && (i = i + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i;
    }

    public static final List<ChatMessage> getMessages(EntitiesState entitiesState) {
        Intrinsics.checkNotNullParameter(entitiesState, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Entity entity : entitiesState.getEntities()) {
            Component component = entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (component != null) {
                arrayList.add(component);
            }
        }
        return arrayList;
    }
}
