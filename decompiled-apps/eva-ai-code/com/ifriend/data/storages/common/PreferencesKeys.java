package com.ifriend.data.storages.common;

import androidx.datastore.preferences.core.Preferences;
import kotlin.Metadata;
/* compiled from: PreferencesKeys.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ifriend/data/storages/common/PreferencesKeys;", "", "()V", "CHAT_SUBSCRIPTION_OFFER", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "getCHAT_SUBSCRIPTION_OFFER", "()Landroidx/datastore/preferences/core/Preferences$Key;", "CHAT_SUBSCRIPTION_OFFER_ONBOARDING", "", "getCHAT_SUBSCRIPTION_OFFER_ONBOARDING", "LAST_ACTIVE_CHAT_ID", "", "getLAST_ACTIVE_CHAT_ID", "ONBOARDING_DATA_SUBMITTED_ID", "getONBOARDING_DATA_SUBMITTED_ID", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PreferencesKeys {
    public static final PreferencesKeys INSTANCE = new PreferencesKeys();
    private static final Preferences.Key<String> LAST_ACTIVE_CHAT_ID = androidx.datastore.preferences.core.PreferencesKeys.stringKey("last_active_chat_id");
    private static final Preferences.Key<Boolean> ONBOARDING_DATA_SUBMITTED_ID = androidx.datastore.preferences.core.PreferencesKeys.booleanKey("onboarding_data_submitted");
    private static final Preferences.Key<Long> CHAT_SUBSCRIPTION_OFFER = androidx.datastore.preferences.core.PreferencesKeys.longKey("chat_subscription_offer");
    private static final Preferences.Key<Boolean> CHAT_SUBSCRIPTION_OFFER_ONBOARDING = androidx.datastore.preferences.core.PreferencesKeys.booleanKey("chat_subscription_offer_onboarding");

    private PreferencesKeys() {
    }

    public final Preferences.Key<String> getLAST_ACTIVE_CHAT_ID() {
        return LAST_ACTIVE_CHAT_ID;
    }

    public final Preferences.Key<Boolean> getONBOARDING_DATA_SUBMITTED_ID() {
        return ONBOARDING_DATA_SUBMITTED_ID;
    }

    public final Preferences.Key<Long> getCHAT_SUBSCRIPTION_OFFER() {
        return CHAT_SUBSCRIPTION_OFFER;
    }

    public final Preferences.Key<Boolean> getCHAT_SUBSCRIPTION_OFFER_ONBOARDING() {
        return CHAT_SUBSCRIPTION_OFFER_ONBOARDING;
    }
}
