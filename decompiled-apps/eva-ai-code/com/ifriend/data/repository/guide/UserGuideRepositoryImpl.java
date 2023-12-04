package com.ifriend.data.repository.guide;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.ifriend.data.storages.common.DataStorePreferenceDelegateImpl;
import com.ifriend.domain.data.guide.UserGuideRepository;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: UserGuideRepositoryImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fR!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/ifriend/data/repository/guide/UserGuideRepositoryImpl;", "Lcom/ifriend/domain/data/guide/UserGuideRepository;", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "(Landroidx/datastore/core/DataStore;)V", "chatStoreDelegate", "Lcom/ifriend/data/storages/common/DataStorePreferenceDelegateImpl;", "", "getChatStoreDelegate", "()Lcom/ifriend/data/storages/common/DataStorePreferenceDelegateImpl;", "chatStoreDelegate$delegate", "Lkotlin/Lazy;", "onChatStoreGuideShown", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldShowChatStoreGuide", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserGuideRepositoryImpl implements UserGuideRepository {
    private final Lazy chatStoreDelegate$delegate;

    @Inject
    public UserGuideRepositoryImpl(DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.chatStoreDelegate$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new UserGuideRepositoryImpl$chatStoreDelegate$2(dataStore));
    }

    private final DataStorePreferenceDelegateImpl<Boolean> getChatStoreDelegate() {
        return (DataStorePreferenceDelegateImpl) this.chatStoreDelegate$delegate.getValue();
    }

    @Override // com.ifriend.domain.data.guide.UserGuideRepository
    public Object shouldShowChatStoreGuide(Continuation<? super Boolean> continuation) {
        return FlowKt.first(getChatStoreDelegate().getFlow(), continuation);
    }

    @Override // com.ifriend.domain.data.guide.UserGuideRepository
    public Object onChatStoreGuideShown(Continuation<? super Unit> continuation) {
        Object obj = getChatStoreDelegate().set(Boxing.boxBoolean(false), continuation);
        return obj == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : Unit.INSTANCE;
    }
}
