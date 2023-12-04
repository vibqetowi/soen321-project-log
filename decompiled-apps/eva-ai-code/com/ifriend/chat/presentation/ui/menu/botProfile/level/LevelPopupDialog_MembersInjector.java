package com.ifriend.chat.presentation.ui.menu.botProfile.level;

import com.ifriend.ui.base.di.ViewModelFactory;
import dagger.MembersInjector;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LevelPopupDialog_MembersInjector implements MembersInjector<LevelPopupDialog> {
    private final Provider<ViewModelFactory> viewModelFactoryProvider;

    public LevelPopupDialog_MembersInjector(Provider<ViewModelFactory> provider) {
        this.viewModelFactoryProvider = provider;
    }

    public static MembersInjector<LevelPopupDialog> create(Provider<ViewModelFactory> provider) {
        return new LevelPopupDialog_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(LevelPopupDialog levelPopupDialog) {
        injectViewModelFactory(levelPopupDialog, this.viewModelFactoryProvider.get());
    }

    public static void injectViewModelFactory(LevelPopupDialog levelPopupDialog, ViewModelFactory viewModelFactory) {
        levelPopupDialog.viewModelFactory = viewModelFactory;
    }
}
