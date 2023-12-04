package com.ifriend.app.di.modules.platform;

import com.ifriend.core.tools.api.AppIdentityConverter;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.core.tools.impl.AppIdentityConverterImpl;
import com.ifriend.core.tools.impl.DispatcherProviderImpl;
import com.ifriend.logger.api.logic.AppLoggerInteractor;
import com.ifriend.logger.impl.logic.AppLoggerInteractorImpl;
import dagger.Binds;
import dagger.Module;
import dagger.Reusable;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: ToolsModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\bH'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u000bH'¨\u0006\f"}, d2 = {"Lcom/ifriend/app/di/modules/platform/ToolsModule;", "", "bindsAppIdentityConverter", "Lcom/ifriend/core/tools/api/AppIdentityConverter;", "impl", "Lcom/ifriend/core/tools/impl/AppIdentityConverterImpl;", "bindsAppLoggerInteractor", "Lcom/ifriend/logger/api/logic/AppLoggerInteractor;", "Lcom/ifriend/logger/impl/logic/AppLoggerInteractorImpl;", "bindsDispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "Lcom/ifriend/core/tools/impl/DispatcherProviderImpl;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface ToolsModule {
    @Reusable
    @Binds
    AppIdentityConverter bindsAppIdentityConverter(AppIdentityConverterImpl appIdentityConverterImpl);

    @Singleton
    @Binds
    AppLoggerInteractor bindsAppLoggerInteractor(AppLoggerInteractorImpl appLoggerInteractorImpl);

    @Singleton
    @Binds
    DispatcherProvider bindsDispatcherProvider(DispatcherProviderImpl dispatcherProviderImpl);
}
