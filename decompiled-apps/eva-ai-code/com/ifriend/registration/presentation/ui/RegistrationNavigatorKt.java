package com.ifriend.registration.presentation.ui;

import androidx.fragment.app.FragmentTransaction;
import com.ifriend.infrastructure.R;
import kotlin.Metadata;
/* compiled from: RegistrationNavigator.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"applyAnimation", "", "Landroidx/fragment/app/FragmentTransaction;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegistrationNavigatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyAnimation(FragmentTransaction fragmentTransaction) {
        fragmentTransaction.setCustomAnimations(R.anim.slide_up_enter, R.anim.wait, R.anim.wait, R.anim.slide_up_exit);
    }
}
