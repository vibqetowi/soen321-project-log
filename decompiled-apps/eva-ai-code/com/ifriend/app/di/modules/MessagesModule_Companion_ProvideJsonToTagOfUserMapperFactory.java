package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.models.TagOfUser;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideJsonToTagOfUserMapperFactory implements Factory<Mapper<JSONObject, TagOfUser>> {
    @Override // javax.inject.Provider
    public Mapper<JSONObject, TagOfUser> get() {
        return provideJsonToTagOfUserMapper();
    }

    public static MessagesModule_Companion_ProvideJsonToTagOfUserMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Mapper<JSONObject, TagOfUser> provideJsonToTagOfUserMapper() {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideJsonToTagOfUserMapper());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final MessagesModule_Companion_ProvideJsonToTagOfUserMapperFactory INSTANCE = new MessagesModule_Companion_ProvideJsonToTagOfUserMapperFactory();

        private InstanceHolder() {
        }
    }
}
