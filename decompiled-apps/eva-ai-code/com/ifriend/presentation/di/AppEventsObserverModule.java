package com.ifriend.presentation.di;

import com.ifriend.base.di.Feature;
import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.appevents.AppEvents;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.appevents.AppEventsObserver;
import com.ifriend.presentation.common.observers.purchases.PaymentResultEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import com.ifriend.presentation.common.observers.purchases.PaymentResultObserver;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AppEventsObserverModule.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001f\u0010\u0007\u001a\u0011\u0012\t\u0012\u00070\t¢\u0006\u0002\b\n0\bj\u0002`\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u0015"}, d2 = {"Lcom/ifriend/presentation/di/AppEventsObserverModule;", "", "()V", "provideAppEventsEmitter", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsEmitter;", "observer", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsObserver;", "provideAppEventsFlow", "Lcom/ifriend/presentation/common/observers/FlowObserver;", "Lcom/ifriend/presentation/common/observers/appevents/AppEvents;", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/appevents/AppEventsFlow;", "provideAppEventsObserver", "scope", "Lkotlinx/coroutines/CoroutineScope;", "providePaymentResultEmitter", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultEmitter;", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultObserver;", "providePaymentResultFlow", "Lcom/ifriend/presentation/common/observers/purchases/PaymentResultFlow;", "providePaymentResultObserver", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class AppEventsObserverModule {
    public static final int $stable = 0;

    @Provides
    @Feature
    public final AppEventsObserver provideAppEventsObserver(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new AppEventsObserver(scope);
    }

    @Provides
    @Feature
    public final FlowObserver<AppEvents> provideAppEventsFlow(AppEventsObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return observer;
    }

    @Provides
    @Feature
    public final AppEventsEmitter provideAppEventsEmitter(AppEventsObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return observer;
    }

    @Provides
    @Feature
    public final PaymentResultObserver providePaymentResultObserver(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new PaymentResultObserver(scope);
    }

    @Provides
    @Feature
    public final PaymentResultEmitter providePaymentResultEmitter(PaymentResultObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return observer;
    }

    @Provides
    @Feature
    public final PaymentResultFlow providePaymentResultFlow(PaymentResultObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        return observer;
    }
}
