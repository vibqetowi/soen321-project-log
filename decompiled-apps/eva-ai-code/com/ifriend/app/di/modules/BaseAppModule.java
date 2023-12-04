package com.ifriend.app.di.modules;

import android.content.Context;
import android.content.res.Resources;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.AppCoroutineScope;
import com.ifriend.domain.CoroutineDispatchers;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BaseAppModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Lcom/ifriend/app/di/modules/BaseAppModule;", "", "()V", "provideAppCoroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "logger", "Lcom/ifriend/common_utils/Logger;", "provideCoroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "provideResources", "Landroid/content/res/Resources;", "context", "Landroid/content/Context;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class BaseAppModule {
    @Provides
    @Singleton
    public final CoroutineScope provideAppCoroutineScope(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new AppCoroutineScope(logger);
    }

    @Provides
    @Singleton
    public final CoroutineDispatchers provideCoroutineDispatchers() {
        return new CoroutineDispatchers();
    }

    @Provides
    public final Resources provideResources(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getApplicationContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }
}
