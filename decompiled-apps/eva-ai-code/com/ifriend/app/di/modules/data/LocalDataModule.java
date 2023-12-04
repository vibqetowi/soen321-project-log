package com.ifriend.app.di.modules.data;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.ifriend.app.tools.ContextKt;
import com.ifriend.data.storages.bots.MainBotLocalDataSource;
import com.ifriend.data.storages.bots.MainBotLocalDataSourceImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
/* compiled from: LocalDataModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/ifriend/app/di/modules/data/LocalDataModule;", "", "bindsMainBotLocalDataSource", "Lcom/ifriend/data/storages/bots/MainBotLocalDataSource;", "impl", "Lcom/ifriend/data/storages/bots/MainBotLocalDataSourceImpl;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface LocalDataModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Singleton
    @Binds
    MainBotLocalDataSource bindsMainBotLocalDataSource(MainBotLocalDataSourceImpl mainBotLocalDataSourceImpl);

    /* compiled from: LocalDataModule.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/ifriend/app/di/modules/data/LocalDataModule$Companion;", "", "()V", "provideDataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "context", "Landroid/content/Context;", "provideJson", "Lkotlinx/serialization/json/Json;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Singleton
        public final DataStore<Preferences> provideDataStore(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return ContextKt.getDataStore(context);
        }

        @Provides
        @Singleton
        public final Json provideJson() {
            return JsonKt.Json$default(null, LocalDataModule$Companion$provideJson$1.INSTANCE, 1, null);
        }
    }
}
