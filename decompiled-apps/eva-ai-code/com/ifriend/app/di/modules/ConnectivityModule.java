package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import com.ifriend.infrastructure.connectivity.InternetConnectionImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ConnectivityModule.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0007¨\u0006\u000e"}, d2 = {"Lcom/ifriend/app/di/modules/ConnectivityModule;", "", "()V", "provideInternetConnection", "Lcom/ifriend/domain/infrastucture/InternetConnection;", "context", "Landroid/content/Context;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "provideShowInternetConnectionDialogsUseCase", "Lcom/ifriend/domain/infrastucture/InternetConnectionDialogsManager;", "internetConnection", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class ConnectivityModule {
    @Provides
    @Singleton
    public final InternetConnection provideInternetConnection(Context context, CoroutineScope coroutineScope, CoroutineDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        return InternetConnectionImpl.Companion.instance(context, coroutineScope, dispatchers, new ConnectivityModule$provideInternetConnection$1(context));
    }

    @Provides
    @Singleton
    public final InternetConnectionDialogsManager provideShowInternetConnectionDialogsUseCase(CoroutineScope coroutineScope, InternetConnection internetConnection) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(internetConnection, "internetConnection");
        return new InternetConnectionDialogsManager(coroutineScope, internetConnection);
    }
}
