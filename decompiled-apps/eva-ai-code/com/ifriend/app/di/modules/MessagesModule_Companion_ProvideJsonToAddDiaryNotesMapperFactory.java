package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideJsonToAddDiaryNotesMapperFactory implements Factory<Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes>> {
    private final Provider<Logger> loggerProvider;

    public MessagesModule_Companion_ProvideJsonToAddDiaryNotesMapperFactory(Provider<Logger> provider) {
        this.loggerProvider = provider;
    }

    @Override // javax.inject.Provider
    public Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> get() {
        return provideJsonToAddDiaryNotesMapper(this.loggerProvider.get());
    }

    public static MessagesModule_Companion_ProvideJsonToAddDiaryNotesMapperFactory create(Provider<Logger> provider) {
        return new MessagesModule_Companion_ProvideJsonToAddDiaryNotesMapperFactory(provider);
    }

    public static Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> provideJsonToAddDiaryNotesMapper(Logger logger) {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideJsonToAddDiaryNotesMapper(logger));
    }
}
