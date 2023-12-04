package com.ifriend.data.memorycached.onboarding;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.common.InMemoryCachedSource;
import com.ifriend.data.networking.api.onboarding.OnboardingApi;
import com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource;
import com.ifriend.domain.logic.onboarding.OnboardingChatInfo;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
/* compiled from: OnboardingChatConfigsMemoryCachedSourceImpl.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u0016\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J%\u0010\u0019\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001cH\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\u001dJ@\u0010\u0019\u001a\u0002H\u001a\"\u0004\b\u0000\u0010\u001a2'\u0010\u001b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0 \u0012\u0006\u0012\u0004\u0018\u00010!0\u001e¢\u0006\u0002\b\"H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010#J\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010(\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/ifriend/data/memorycached/onboarding/OnboardingChatConfigsMemoryCachedSourceImpl;", "Lcom/ifriend/domain/data/memorycached/OnboardingChatConfigsMemoryCachedSource;", "Lcom/ifriend/data/common/CoreExecuteCatching;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "coreExecuteCatching", "onboardingApi", "Lcom/ifriend/data/networking/api/onboarding/OnboardingApi;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/core/tools/api/DispatcherProvider;Lcom/ifriend/data/common/CoreExecuteCatching;Lcom/ifriend/data/networking/api/onboarding/OnboardingApi;Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "CACHED_KEY", "", "kotlin.jvm.PlatformType", "cachedSource", "Lcom/ifriend/data/common/InMemoryCachedSource;", "", "Lcom/ifriend/domain/logic/onboarding/OnboardingChatInfo;", "getCachedSource", "()Lcom/ifriend/data/common/InMemoryCachedSource;", "cachedSource$delegate", "Lkotlin/Lazy;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeInBackground", ExifInterface.GPS_DIRECTION_TRUE, NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/reflect/KSuspendFunction0;", "(Lkotlin/reflect/KFunction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChatConfigs", "getChatConfigsFlow", "Lkotlinx/coroutines/flow/Flow;", "getRemoteConfigurations", "refresh", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingChatConfigsMemoryCachedSourceImpl implements OnboardingChatConfigsMemoryCachedSource, CoreExecuteCatching {
    private final String CACHED_KEY;
    private final AuthLocalDataSource authLocalDataSource;
    private final Lazy cachedSource$delegate;
    private final CoreExecuteCatching coreExecuteCatching;
    private final DispatcherProvider dispatcherProvider;
    private final OnboardingApi onboardingApi;

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(function2, continuation);
    }

    @Override // com.ifriend.data.common.CoreExecuteCatching
    public <T> Object executeInBackground(KFunction<? extends T> kFunction, Continuation<? super T> continuation) {
        return this.coreExecuteCatching.executeInBackground(kFunction, continuation);
    }

    @Inject
    public OnboardingChatConfigsMemoryCachedSourceImpl(DispatcherProvider dispatcherProvider, CoreExecuteCatching coreExecuteCatching, OnboardingApi onboardingApi, AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(coreExecuteCatching, "coreExecuteCatching");
        Intrinsics.checkNotNullParameter(onboardingApi, "onboardingApi");
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.dispatcherProvider = dispatcherProvider;
        this.coreExecuteCatching = coreExecuteCatching;
        this.onboardingApi = onboardingApi;
        this.authLocalDataSource = authLocalDataSource;
        this.CACHED_KEY = "OnboardingChatConfigsMemoryCachedSourceImpl";
        this.cachedSource$delegate = LazyKt.lazy(new OnboardingChatConfigsMemoryCachedSourceImpl$cachedSource$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InMemoryCachedSource<String, List<OnboardingChatInfo>> getCachedSource() {
        return (InMemoryCachedSource) this.cachedSource$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource
    public Object getChatConfigsFlow(Continuation<? super Flow<? extends List<OnboardingChatInfo>>> continuation) {
        return executeInBackground(new OnboardingChatConfigsMemoryCachedSourceImpl$getChatConfigsFlow$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource
    public Object getChatConfigs(Continuation<? super List<OnboardingChatInfo>> continuation) {
        return executeInBackground(new OnboardingChatConfigsMemoryCachedSourceImpl$getChatConfigs$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource
    public Object refresh(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new OnboardingChatConfigsMemoryCachedSourceImpl$refresh$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getRemoteConfigurations(Continuation<? super List<OnboardingChatInfo>> continuation) {
        return executeInBackground(new OnboardingChatConfigsMemoryCachedSourceImpl$getRemoteConfigurations$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.memorycached.OnboardingChatConfigsMemoryCachedSource
    public Object clear(Continuation<? super Unit> continuation) {
        Object executeInBackground = executeInBackground(new OnboardingChatConfigsMemoryCachedSourceImpl$clear$2(this, null), continuation);
        return executeInBackground == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? executeInBackground : Unit.INSTANCE;
    }
}
