package com.ifriend.app.di.modules;

import com.ifriend.common_utils.Logger;
import com.ifriend.infrastructure.ProdLogger;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: LogsModule.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ifriend/app/di/modules/LogsModule;", "", "()V", "provideProdLogger", "Lcom/ifriend/common_utils/Logger;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class LogsModule {
    @Provides
    @Singleton
    public final Logger provideProdLogger() {
        return ProdLogger.INSTANCE;
    }
}
