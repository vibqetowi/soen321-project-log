package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideJsonToGeneratedAvatarMapperFactory implements Factory<Mapper<JSONObject, GeneratedAvatars>> {
    @Override // javax.inject.Provider
    public Mapper<JSONObject, GeneratedAvatars> get() {
        return provideJsonToGeneratedAvatarMapper();
    }

    public static MessagesModule_Companion_ProvideJsonToGeneratedAvatarMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Mapper<JSONObject, GeneratedAvatars> provideJsonToGeneratedAvatarMapper() {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideJsonToGeneratedAvatarMapper());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final MessagesModule_Companion_ProvideJsonToGeneratedAvatarMapperFactory INSTANCE = new MessagesModule_Companion_ProvideJsonToGeneratedAvatarMapperFactory();

        private InstanceHolder() {
        }
    }
}
