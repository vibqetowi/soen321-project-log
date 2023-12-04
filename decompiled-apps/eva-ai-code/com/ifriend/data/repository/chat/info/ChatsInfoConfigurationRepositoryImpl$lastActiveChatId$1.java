package com.ifriend.data.repository.chat.info;

import androidx.datastore.core.DataStore;
import com.ifriend.data.storages.common.DataStorePreferenceDelegate;
import com.ifriend.data.storages.common.DataStorePreferenceDelegateImpl;
import com.ifriend.data.storages.common.PreferencesKeys;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
/* compiled from: ChatsInfoConfigurationRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u0002H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010\fR\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"com/ifriend/data/repository/chat/info/ChatsInfoConfigurationRepositoryImpl$lastActiveChatId$1", "Lcom/ifriend/data/storages/common/DataStorePreferenceDelegate;", "", "flow", "Lkotlinx/coroutines/flow/Flow;", "getFlow", "()Lkotlinx/coroutines/flow/Flow;", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsInfoConfigurationRepositoryImpl$lastActiveChatId$1 implements DataStorePreferenceDelegate<String> {
    private final /* synthetic */ DataStorePreferenceDelegateImpl<String> $$delegate_0;

    @Override // com.ifriend.data.storages.common.DataStorePreferenceDelegate
    public Object get(Continuation<? super String> continuation) {
        return this.$$delegate_0.get(continuation);
    }

    @Override // com.ifriend.data.storages.common.DataStorePreferenceDelegate
    public Flow<String> getFlow() {
        return this.$$delegate_0.getFlow();
    }

    /* renamed from: set  reason: avoid collision after fix types in other method */
    public Object set2(String str, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.set(str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChatsInfoConfigurationRepositoryImpl$lastActiveChatId$1(ChatsInfoConfigurationRepositoryImpl chatsInfoConfigurationRepositoryImpl) {
        DataStore dataStore;
        dataStore = chatsInfoConfigurationRepositoryImpl.dataStore;
        this.$$delegate_0 = new DataStorePreferenceDelegateImpl<>(dataStore, PreferencesKeys.INSTANCE.getLAST_ACTIVE_CHAT_ID(), "");
    }

    @Override // com.ifriend.data.storages.common.DataStorePreferenceDelegate
    public /* bridge */ /* synthetic */ Object set(String str, Continuation continuation) {
        return set2(str, (Continuation<? super Unit>) continuation);
    }
}
