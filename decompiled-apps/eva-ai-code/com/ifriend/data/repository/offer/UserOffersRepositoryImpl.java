package com.ifriend.data.repository.offer;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.ifriend.analytics.AnalyticsConstants;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.storages.common.DataStorePreferenceDelegateImpl;
import com.ifriend.domain.data.offers.UserOffersRepository;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
/* compiled from: UserOffersRepositoryImpl.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0013\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/ifriend/data/repository/offer/UserOffersRepositoryImpl;", "Lcom/ifriend/domain/data/offers/UserOffersRepository;", "dispatchers", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Lcom/ifriend/core/tools/api/DispatcherProvider;Landroidx/datastore/core/DataStore;)V", "chatSubscriptionOfferDelegate", "Lcom/ifriend/data/storages/common/DataStorePreferenceDelegateImpl;", "", "getChatSubscriptionOfferDelegate", "()Lcom/ifriend/data/storages/common/DataStorePreferenceDelegateImpl;", "chatSubscriptionOfferDelegate$delegate", "Lkotlin/Lazy;", "shouldShowChatSubscriptionOfferAfterOnboardingDelegate", "", "getShouldShowChatSubscriptionOfferAfterOnboardingDelegate", "shouldShowChatSubscriptionOfferAfterOnboardingDelegate$delegate", "getLastChatSubscriptionOfferTimestamp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getShouldShowChatSubscriptionOfferAfterOnboarding", "setLastChatSubscriptionOfferTimestamp", "", AnalyticsConstants.TIMESTAMP, "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setShouldShowChatSubscriptionOfferAfterOnboarding", "shouldShow", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserOffersRepositoryImpl implements UserOffersRepository {
    private final Lazy chatSubscriptionOfferDelegate$delegate;
    private final DispatcherProvider dispatchers;
    private final Lazy shouldShowChatSubscriptionOfferAfterOnboardingDelegate$delegate;

    @Inject
    public UserOffersRepositoryImpl(DispatcherProvider dispatchers, DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.dispatchers = dispatchers;
        this.chatSubscriptionOfferDelegate$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new UserOffersRepositoryImpl$chatSubscriptionOfferDelegate$2(dataStore));
        this.shouldShowChatSubscriptionOfferAfterOnboardingDelegate$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new UserOffersRepositoryImpl$shouldShowChatSubscriptionOfferAfterOnboardingDelegate$2(dataStore));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataStorePreferenceDelegateImpl<Long> getChatSubscriptionOfferDelegate() {
        return (DataStorePreferenceDelegateImpl) this.chatSubscriptionOfferDelegate$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DataStorePreferenceDelegateImpl<Boolean> getShouldShowChatSubscriptionOfferAfterOnboardingDelegate() {
        return (DataStorePreferenceDelegateImpl) this.shouldShowChatSubscriptionOfferAfterOnboardingDelegate$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.offers.UserOffersRepository
    public Object getLastChatSubscriptionOfferTimestamp(Continuation<? super Long> continuation) {
        return BuildersKt.withContext(this.dispatchers.background(), new UserOffersRepositoryImpl$getLastChatSubscriptionOfferTimestamp$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.offers.UserOffersRepository
    public Object setLastChatSubscriptionOfferTimestamp(long j, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.background(), new UserOffersRepositoryImpl$setLastChatSubscriptionOfferTimestamp$2(this, j, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    @Override // com.ifriend.domain.data.offers.UserOffersRepository
    public Object getShouldShowChatSubscriptionOfferAfterOnboarding(Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.dispatchers.background(), new UserOffersRepositoryImpl$getShouldShowChatSubscriptionOfferAfterOnboarding$2(this, null), continuation);
    }

    @Override // com.ifriend.domain.data.offers.UserOffersRepository
    public Object setShouldShowChatSubscriptionOfferAfterOnboarding(boolean z, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(this.dispatchers.background(), new UserOffersRepositoryImpl$setShouldShowChatSubscriptionOfferAfterOnboarding$2(this, z, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }
}
