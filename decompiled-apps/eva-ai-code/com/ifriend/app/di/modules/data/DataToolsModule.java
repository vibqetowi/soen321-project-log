package com.ifriend.app.di.modules.data;

import com.google.gson.Gson;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.CoreExecuteCatchingImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: DataToolsModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/ifriend/app/di/modules/data/DataToolsModule;", "", "bindsCoreExecuteCatching", "Lcom/ifriend/data/common/CoreExecuteCatching;", "coreExecuteCatching", "Lcom/ifriend/data/common/CoreExecuteCatchingImpl;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface DataToolsModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Singleton
    @Binds
    CoreExecuteCatching bindsCoreExecuteCatching(CoreExecuteCatchingImpl coreExecuteCatchingImpl);

    /* compiled from: DataToolsModule.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"Lcom/ifriend/app/di/modules/data/DataToolsModule$Companion;", "", "()V", "provideGson", "Lcom/google/gson/Gson;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Singleton
        public final Gson provideGson() {
            return new Gson();
        }
    }
}
