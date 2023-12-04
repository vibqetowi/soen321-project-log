package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideJsonToLevelInfoUpdateMapperFactory implements Factory<Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate>> {
    @Override // javax.inject.Provider
    public Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> get() {
        return provideJsonToLevelInfoUpdateMapper();
    }

    public static MessagesModule_Companion_ProvideJsonToLevelInfoUpdateMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> provideJsonToLevelInfoUpdateMapper() {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideJsonToLevelInfoUpdateMapper());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final MessagesModule_Companion_ProvideJsonToLevelInfoUpdateMapperFactory INSTANCE = new MessagesModule_Companion_ProvideJsonToLevelInfoUpdateMapperFactory();

        private InstanceHolder() {
        }
    }
}
