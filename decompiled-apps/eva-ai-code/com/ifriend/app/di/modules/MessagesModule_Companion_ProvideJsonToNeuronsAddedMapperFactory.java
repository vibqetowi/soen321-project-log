package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideJsonToNeuronsAddedMapperFactory implements Factory<Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased>> {
    @Override // javax.inject.Provider
    public Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased> get() {
        return provideJsonToNeuronsAddedMapper();
    }

    public static MessagesModule_Companion_ProvideJsonToNeuronsAddedMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Mapper<JSONObject, MessagesSourceMessage.NeuronesPurchased> provideJsonToNeuronsAddedMapper() {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideJsonToNeuronsAddedMapper());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final MessagesModule_Companion_ProvideJsonToNeuronsAddedMapperFactory INSTANCE = new MessagesModule_Companion_ProvideJsonToNeuronsAddedMapperFactory();

        private InstanceHolder() {
        }
    }
}
