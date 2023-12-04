package com.ifriend.app.di.features.popup;

import com.ifriend.popup.api.PopupFragmentFactory;
import com.ifriend.popup.api.PopupModelFactory;
import com.ifriend.popup.impl.PopupFragmentFactoryImpl;
import com.ifriend.popup.impl.PopupModelFactoryImpl;
import dagger.Binds;
import dagger.Module;
import kotlin.Metadata;
/* compiled from: PopupModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/ifriend/app/di/features/popup/PopupModule;", "", "()V", "bindPopupFragmentFactory", "Lcom/ifriend/popup/api/PopupFragmentFactory;", "factory", "Lcom/ifriend/popup/impl/PopupFragmentFactoryImpl;", "bindPopupModelFactory", "Lcom/ifriend/popup/api/PopupModelFactory;", "Lcom/ifriend/popup/impl/PopupModelFactoryImpl;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public abstract class PopupModule {
    @Binds
    public abstract PopupFragmentFactory bindPopupFragmentFactory(PopupFragmentFactoryImpl popupFragmentFactoryImpl);

    @Binds
    public abstract PopupModelFactory bindPopupModelFactory(PopupModelFactoryImpl popupModelFactoryImpl);
}
