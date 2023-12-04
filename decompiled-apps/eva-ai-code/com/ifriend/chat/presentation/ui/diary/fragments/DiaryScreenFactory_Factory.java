package com.ifriend.chat.presentation.ui.diary.fragments;

import com.ifriend.data.toggle.DiaryFeatureToggle;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DiaryScreenFactory_Factory implements Factory<DiaryScreenFactory> {
    private final Provider<DiaryFeatureToggle> diaryToggleProvider;

    public DiaryScreenFactory_Factory(Provider<DiaryFeatureToggle> provider) {
        this.diaryToggleProvider = provider;
    }

    @Override // javax.inject.Provider
    public DiaryScreenFactory get() {
        return newInstance(this.diaryToggleProvider.get());
    }

    public static DiaryScreenFactory_Factory create(Provider<DiaryFeatureToggle> provider) {
        return new DiaryScreenFactory_Factory(provider);
    }

    public static DiaryScreenFactory newInstance(DiaryFeatureToggle diaryFeatureToggle) {
        return new DiaryScreenFactory(diaryFeatureToggle);
    }
}
