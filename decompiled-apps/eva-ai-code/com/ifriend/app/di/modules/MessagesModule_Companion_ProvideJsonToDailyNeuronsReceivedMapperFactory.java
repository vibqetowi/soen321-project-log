package com.ifriend.app.di.modules;

import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideJsonToDailyNeuronsReceivedMapperFactory implements Factory<Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived>> {
    @Override // javax.inject.Provider
    public Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> get() {
        return provideJsonToDailyNeuronsReceivedMapper();
    }

    public static MessagesModule_Companion_ProvideJsonToDailyNeuronsReceivedMapperFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> provideJsonToDailyNeuronsReceivedMapper() {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideJsonToDailyNeuronsReceivedMapper());
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final MessagesModule_Companion_ProvideJsonToDailyNeuronsReceivedMapperFactory INSTANCE = new MessagesModule_Companion_ProvideJsonToDailyNeuronsReceivedMapperFactory();

        private InstanceHolder() {
        }
    }
}
