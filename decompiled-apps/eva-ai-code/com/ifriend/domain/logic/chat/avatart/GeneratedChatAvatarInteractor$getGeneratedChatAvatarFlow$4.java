package com.ifriend.domain.logic.chat.avatart;

import com.ifriend.domain.logic.chat.models.ChatInfo;
import com.ifriend.domain.models.avatar.GeneratedAvatar;
import com.ifriend.domain.models.profile.Gender;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.AdaptedFunctionReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneratedChatAvatarInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public /* synthetic */ class GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$4 extends AdaptedFunctionReference implements Function6<Gender, Boolean, GeneratedAvatar, Boolean, ChatInfo, Continuation<? super GeneratedChatAvatar>, Object>, SuspendFunction {
    /* JADX INFO: Access modifiers changed from: package-private */
    public GeneratedChatAvatarInteractor$getGeneratedChatAvatarFlow$4(Object obj) {
        super(6, obj, GeneratedChatAvatarInteractor.class, "getAvatarState", "getAvatarState(Lcom/ifriend/domain/models/profile/Gender;ZLcom/ifriend/domain/models/avatar/GeneratedAvatar;ZLcom/ifriend/domain/logic/chat/models/ChatInfo;)Lcom/ifriend/domain/logic/chat/avatart/GeneratedChatAvatar;", 4);
    }

    public final Object invoke(Gender gender, boolean z, GeneratedAvatar generatedAvatar, boolean z2, ChatInfo chatInfo, Continuation<? super GeneratedChatAvatar> continuation) {
        Object avatarState;
        avatarState = ((GeneratedChatAvatarInteractor) this.receiver).getAvatarState(gender, z, generatedAvatar, z2, chatInfo);
        return avatarState;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Gender gender, Boolean bool, GeneratedAvatar generatedAvatar, Boolean bool2, ChatInfo chatInfo, Continuation<? super GeneratedChatAvatar> continuation) {
        return invoke(gender, bool.booleanValue(), generatedAvatar, bool2.booleanValue(), chatInfo, continuation);
    }
}
