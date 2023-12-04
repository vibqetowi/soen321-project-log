package com.ifriend.chat.presentation.ui;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.ifriend.base.navigation.api.cicerone.Command;
import com.ifriend.base.navigation.api.cicerone.Replace;
import com.ifriend.base.navigation.api.cicerone.Screen;
import com.ifriend.base.navigation.impl.ExtendNavigator;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.chat.presentation.ui.chat.presentation.chat.ui.ChatFragment;
import com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment;
import com.ifriend.ui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppActivityNavigator.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0014J*\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¨\u0006\u0015"}, d2 = {"Lcom/ifriend/chat/presentation/ui/AppActivityNavigator;", "Lcom/ifriend/base/navigation/impl/ExtendNavigator;", "activity", "Lcom/ifriend/chat/presentation/ui/AppActivity;", "containerId", "", "(Lcom/ifriend/chat/presentation/ui/AppActivity;I)V", "applyCommand", "", "command", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "backToUnexisting", "screen", "Lcom/ifriend/base/navigation/api/cicerone/Screen;", "setupFragmentTransaction", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "currentFragment", "Landroidx/fragment/app/Fragment;", "nextFragment", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppActivityNavigator extends ExtendNavigator {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppActivityNavigator(AppActivity activity, int i) {
        super(activity, i, null, null, 12, null);
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.AppNavigator
    protected void setupFragmentTransaction(FragmentScreen screen, FragmentTransaction fragmentTransaction, Fragment fragment, Fragment nextFragment) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
        Intrinsics.checkNotNullParameter(nextFragment, "nextFragment");
        if (fragment != null) {
            if (!(fragment instanceof HomeFragment) || !(nextFragment instanceof ChatFragment)) {
                AppActivityNavigatorKt.applySlideUpTransactionAnimation(fragmentTransaction);
            } else {
                AppActivityNavigatorKt.applyDefaultAnimations(fragmentTransaction);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.base.navigation.impl.ExtendNavigator, com.ifriend.base.navigation.impl.cicerone.AppNavigator
    public void applyCommand(Command command) {
        Intrinsics.checkNotNullParameter(command, "command");
        UIHelper.INSTANCE.hideKeyboardIfOpened(getActivity(), new AppActivityNavigator$applyCommand$1(this, command));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ifriend.base.navigation.impl.cicerone.AppNavigator
    public void backToUnexisting(Screen screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        super.backToUnexisting(screen);
        replace(new Replace(screen));
    }
}
