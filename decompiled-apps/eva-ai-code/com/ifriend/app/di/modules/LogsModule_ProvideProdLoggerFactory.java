package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class LogsModule_ProvideProdLoggerFactory implements Factory<Logger> {
    private final LogsModule module;

    public LogsModule_ProvideProdLoggerFactory(LogsModule logsModule) {
        this.module = logsModule;
    }

    @Override // javax.inject.Provider
    public Logger get() {
        return provideProdLogger(this.module);
    }

    public static LogsModule_ProvideProdLoggerFactory create(LogsModule logsModule) {
        return new LogsModule_ProvideProdLoggerFactory(logsModule);
    }

    public static Logger provideProdLogger(LogsModule logsModule) {
        return (Logger) Preconditions.checkNotNullFromProvides(logsModule.provideProdLogger());
    }
}
