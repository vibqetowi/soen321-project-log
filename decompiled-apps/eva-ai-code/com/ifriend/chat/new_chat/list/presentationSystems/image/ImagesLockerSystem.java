package com.ifriend.chat.new_chat.list.presentationSystems.image;

import com.ifriend.base.di.Feature;
import com.ifriend.common_entities_engine.Component;
import com.ifriend.common_entities_engine.ComponentsHolderKt;
import com.ifriend.common_entities_engine.EntitiesState;
import com.ifriend.common_entities_engine.Entity;
import com.ifriend.common_entities_engine.System;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.models.profile.user.UserKt;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.domain.newChat.chat.models.MessageContent;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: ImageLockerSystem.kt */
@Feature
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0019\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/new_chat/list/presentationSystems/image/ImagesLockerSystem;", "Lcom/ifriend/common_entities_engine/System;", "Lcom/ifriend/common_entities_engine/EntitiesState;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "(Lcom/ifriend/domain/data/UserRepository;)V", "onUpdateState", "state", "(Lcom/ifriend/common_entities_engine/EntitiesState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "new_chat_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImagesLockerSystem extends System<EntitiesState> {
    public static final int $stable = 8;
    private final UserRepository userRepository;

    @Inject
    public ImagesLockerSystem(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userRepository = userRepository;
    }

    @Override // com.ifriend.common_entities_engine.System
    public Object onUpdateState(EntitiesState entitiesState, Continuation<? super EntitiesState> continuation) {
        User currentUser = this.userRepository.getCurrentUser();
        boolean z = false;
        if (currentUser != null && UserKt.isPremium(currentUser)) {
            z = true;
        }
        List<Entity> entities = entitiesState.getEntities();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entities, 10));
        for (Entity entity : entities) {
            ChatMessage chatMessage = (ChatMessage) entity.get(Reflection.getOrCreateKotlinClass(ChatMessage.class));
            if (chatMessage != null) {
                MessageContent content = chatMessage.getContent();
                if (content instanceof MessageContent.Image) {
                    MessageContent.Image image = (MessageContent.Image) content;
                    if (!z && !chatMessage.getInfo().isFromUser()) {
                        entity = entity.copy(ComponentsHolderKt.add(entity.getComponents(), ImageLockedComponent.INSTANCE));
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : entity.getComponents()) {
                            if (!(((Component) obj) instanceof ImageLockedComponent)) {
                                arrayList2.add(obj);
                            }
                        }
                        entity = entity.copy(CollectionsKt.toSet(arrayList2));
                    }
                }
            }
            arrayList.add(entity);
        }
        return EntitiesState.copy$default(entitiesState, arrayList, null, 2, null);
    }
}
