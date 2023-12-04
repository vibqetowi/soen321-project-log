package com.ifriend.registration.presentation.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.ifriend.base.navigation.impl.ExtendNavigator;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.registration.presentation.ui.registration.VideoBackgroundRegistrationScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RegistrationNavigator.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¨\u0006\u0010"}, d2 = {"Lcom/ifriend/registration/presentation/ui/RegistrationNavigator;", "Lcom/ifriend/base/navigation/impl/ExtendNavigator;", "activity", "Lcom/ifriend/registration/presentation/ui/RegistrationActivity;", "containerId", "", "(Lcom/ifriend/registration/presentation/ui/RegistrationActivity;I)V", "setupFragmentTransaction", "", "screen", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "currentFragment", "Landroidx/fragment/app/Fragment;", "nextFragment", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegistrationNavigator extends ExtendNavigator {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationNavigator(RegistrationActivity activity, int i) {
        super(activity, i, null, null, 12, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.AppNavigator
    protected void setupFragmentTransaction(FragmentScreen screen, FragmentTransaction fragmentTransaction, Fragment fragment, Fragment nextFragment) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
        Intrinsics.checkNotNullParameter(nextFragment, "nextFragment");
        if (screen instanceof VideoBackgroundRegistrationScreen) {
            return;
        }
        RegistrationNavigatorKt.applyAnimation(fragmentTransaction);
    }
}
