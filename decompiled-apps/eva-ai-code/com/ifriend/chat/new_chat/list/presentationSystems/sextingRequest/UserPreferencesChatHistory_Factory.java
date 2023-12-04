package com.ifriend.chat.new_chat.list.presentationSystems.sextingRequest;

import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserPreferencesChatHistory_Factory implements Factory<UserPreferencesChatHistory> {
    private final Provider<Preferences> preferencesProvider;

    public UserPreferencesChatHistory_Factory(Provider<Preferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public UserPreferencesChatHistory get() {
        return newInstance(this.preferencesProvider.get());
    }

    public static UserPreferencesChatHistory_Factory create(Provider<Preferences> provider) {
        return new UserPreferencesChatHistory_Factory(provider);
    }

    public static UserPreferencesChatHistory newInstance(Preferences preferences) {
        return new UserPreferencesChatHistory(preferences);
    }
}
