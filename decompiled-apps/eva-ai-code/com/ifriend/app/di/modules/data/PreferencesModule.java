package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.base.di.DeviceSharedPreferences;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.base.di.UserSharedPreferences;
import com.ifriend.data.storages.sharedPreferences.DynamicNameSharedPreferences;
import com.ifriend.data.storages.sharedPreferences.SecurePreferencesService;
import com.ifriend.domain.data.Preferences;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PreferencesModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Lcom/ifriend/app/di/modules/data/PreferencesModule;", "", "()V", "provideDeviceByUserSharedPreferences", "Lcom/ifriend/domain/data/Preferences;", "context", "Landroid/content/Context;", "userSessionSharedPreferences", "provideDeviceSharedPreferences", "provideSecurePreferences", "Lcom/ifriend/data/storages/sharedPreferences/SecurePreferencesService;", "provideUserSharedPreferences", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class PreferencesModule {
    @Provides
    @Singleton
    @UserSessionSharedPreferences
    public final Preferences provideUserSharedPreferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DynamicNameSharedPreferences(context, PreferencesModule$provideUserSharedPreferences$1.INSTANCE);
    }

    @DeviceSharedPreferences
    @Provides
    @Singleton
    public final Preferences provideDeviceSharedPreferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DynamicNameSharedPreferences(context, PreferencesModule$provideDeviceSharedPreferences$1.INSTANCE);
    }

    @Provides
    @Singleton
    @UserSharedPreferences
    public final Preferences provideDeviceByUserSharedPreferences(Context context, @UserSessionSharedPreferences Preferences userSessionSharedPreferences) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userSessionSharedPreferences, "userSessionSharedPreferences");
        return new DynamicNameSharedPreferences(context, new PreferencesModule$provideDeviceByUserSharedPreferences$1(userSessionSharedPreferences));
    }

    @Provides
    @Singleton
    public final SecurePreferencesService provideSecurePreferences(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new SecurePreferencesService(context);
    }
}
