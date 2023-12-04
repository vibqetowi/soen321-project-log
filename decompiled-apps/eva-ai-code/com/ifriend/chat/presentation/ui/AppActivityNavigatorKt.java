package com.ifriend.chat.presentation.ui;

import androidx.fragment.app.FragmentTransaction;
import com.ifriend.infrastructure.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppActivityNavigator.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0004"}, d2 = {"applyDefaultAnimations", "", "Landroidx/fragment/app/FragmentTransaction;", "applySlideUpTransactionAnimation", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppActivityNavigatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applySlideUpTransactionAnimation(FragmentTransaction fragmentTransaction) {
        fragmentTransaction.setCustomAnimations(R.anim.slide_up_enter, R.anim.fade_out_exit, R.anim.fade_in_enter, R.anim.slide_up_exit);
    }

    public static final void applyDefaultAnimations(FragmentTransaction fragmentTransaction) {
        Intrinsics.checkNotNullParameter(fragmentTransaction, "<this>");
        fragmentTransaction.setCustomAnimations(com.ifriend.chat.presentation.R.anim.enter_from_right, com.ifriend.chat.presentation.R.anim.exit_to_left, com.ifriend.chat.presentation.R.anim.enter_from_left, com.ifriend.chat.presentation.R.anim.exit_to_right);
    }
}
