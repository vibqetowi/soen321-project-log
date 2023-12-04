package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideJsonToAvatarAnimationGeneratedMapperFactory implements Factory<Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated>> {
    @Override // javax.inject.Provider
    public Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> get() {
        return provideJsonToAvatarAnimationGeneratedMapper();
    }

    public static MessagesModule_Companion_ProvideJsonToAvatarAnimationGeneratedMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> provideJsonToAvatarAnimationGeneratedMapper() {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideJsonToAvatarAnimationGeneratedMapper());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final MessagesModule_Companion_ProvideJsonToAvatarAnimationGeneratedMapperFactory INSTANCE = new MessagesModule_Companion_ProvideJsonToAvatarAnimationGeneratedMapperFactory();

        private InstanceHolder() {
        }
    }
}
