package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideSocketMessageToNeuronsChangeMapperFactory implements Factory<Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged>> {
    @Override // javax.inject.Provider
    public Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged> get() {
        return provideSocketMessageToNeuronsChangeMapper();
    }

    public static MessagesModule_Companion_ProvideSocketMessageToNeuronsChangeMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Mapper<JSONObject, MessagesSourceMessage.NeuronesChanged> provideSocketMessageToNeuronsChangeMapper() {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideSocketMessageToNeuronsChangeMapper());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final MessagesModule_Companion_ProvideSocketMessageToNeuronsChangeMapperFactory INSTANCE = new MessagesModule_Companion_ProvideSocketMessageToNeuronsChangeMapperFactory();

        private InstanceHolder() {
        }
    }
}
