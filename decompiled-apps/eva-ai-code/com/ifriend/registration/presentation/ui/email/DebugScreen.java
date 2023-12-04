package com.ifriend.registration.presentation.ui.email;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DebugScreen.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/registration/presentation/ui/email/DebugScreen;", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "factory", "Landroidx/fragment/app/FragmentFactory;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DebugScreen implements FragmentScreen {
    public static final int $stable = 0;

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public boolean getClearContainer() {
        return FragmentScreen.DefaultImpls.getClearContainer(this);
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Screen
    public String getScreenKey() {
        return FragmentScreen.DefaultImpls.getScreenKey(this);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public Fragment createFragment(FragmentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return new DebugFragment();
    }
}
