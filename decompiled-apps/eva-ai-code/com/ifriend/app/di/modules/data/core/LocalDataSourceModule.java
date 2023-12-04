package com.ifriend.app.di.modules.data.core;

import android.content.Context;
import android.content.SharedPreferences;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.local.impl.common.LocalDataConst;
import com.ifriend.core.local.impl.datasource.AuthLocalDataSourceImpl;
import com.ifriend.core.local.impl.qualifier.UserPreferenceQualifier;
import com.ifriend.keychain.KeychainAdapter;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LocalDataSourceModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/ifriend/app/di/modules/data/core/LocalDataSourceModule;", "", "bindsAuthLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "impl", "Lcom/ifriend/core/local/impl/datasource/AuthLocalDataSourceImpl;", "Companion", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface LocalDataSourceModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Singleton
    @Binds
    AuthLocalDataSource bindsAuthLocalDataSource(AuthLocalDataSourceImpl authLocalDataSourceImpl);

    /* compiled from: LocalDataSourceModule.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\t"}, d2 = {"Lcom/ifriend/app/di/modules/data/core/LocalDataSourceModule$Companion;", "", "()V", "providerKeychainAdapter", "Lcom/ifriend/keychain/KeychainAdapter;", "context", "Landroid/content/Context;", "providerUserPreferences", "Landroid/content/SharedPreferences;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @UserPreferenceQualifier
        @Provides
        @Singleton
        public final SharedPreferences providerUserPreferences(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(LocalDataConst.USER_PREF_KEY, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            return sharedPreferences;
        }

        @Provides
        @Singleton
        public final KeychainAdapter providerKeychainAdapter(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new KeychainAdapter(context);
        }
    }
}
