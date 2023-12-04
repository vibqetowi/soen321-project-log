package com.ifriend.data.repository.guide;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.ifriend.data.storages.common.DataStorePreferenceDelegateImpl;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: UserGuideRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/data/storages/common/DataStorePreferenceDelegateImpl;", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class UserGuideRepositoryImpl$chatStoreDelegate$2 extends Lambda implements Function0<DataStorePreferenceDelegateImpl<Boolean>> {
    final /* synthetic */ DataStore<Preferences> $dataStore;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserGuideRepositoryImpl$chatStoreDelegate$2(DataStore<Preferences> dataStore) {
        super(0);
        this.$dataStore = dataStore;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DataStorePreferenceDelegateImpl<Boolean> invoke() {
        return new DataStorePreferenceDelegateImpl<>(this.$dataStore, PreferencesKeys.booleanKey("chat_store_explanation"), true);
    }
}
