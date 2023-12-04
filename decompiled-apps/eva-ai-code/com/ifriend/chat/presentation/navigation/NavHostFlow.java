package com.ifriend.chat.presentation.navigation;

import android.os.Bundle;
import androidx.fragment.app.FragmentFactory;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.presentation.navigation.navflow.NavHostFlowFragment;
import com.ifriend.presentation.navigation.navflow.NavHostNavigationType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppFlowCoordinatorImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ifriend/chat/presentation/navigation/NavHostFlow;", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "navigationType", "Lcom/ifriend/presentation/navigation/navflow/NavHostNavigationType;", "arg", "Landroid/os/Bundle;", "(Lcom/ifriend/presentation/navigation/navflow/NavHostNavigationType;Landroid/os/Bundle;)V", "getArg", "()Landroid/os/Bundle;", "getNavigationType", "()Lcom/ifriend/presentation/navigation/navflow/NavHostNavigationType;", "component1", "component2", "copy", "createFragment", "Lcom/ifriend/presentation/navigation/navflow/NavHostFlowFragment;", "factory", "Landroidx/fragment/app/FragmentFactory;", "equals", "", "other", "", "hashCode", "", "toString", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavHostFlow implements FragmentScreen {
    public static final int $stable = 8;
    private final Bundle arg;
    private final NavHostNavigationType navigationType;

    public static /* synthetic */ NavHostFlow copy$default(NavHostFlow navHostFlow, NavHostNavigationType navHostNavigationType, Bundle bundle, int i, Object obj) {
        if ((i & 1) != 0) {
            navHostNavigationType = navHostFlow.navigationType;
        }
        if ((i & 2) != 0) {
            bundle = navHostFlow.arg;
        }
        return navHostFlow.copy(navHostNavigationType, bundle);
    }

    public final NavHostNavigationType component1() {
        return this.navigationType;
    }

    public final Bundle component2() {
        return this.arg;
    }

    public final NavHostFlow copy(NavHostNavigationType navigationType, Bundle bundle) {
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        return new NavHostFlow(navigationType, bundle);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NavHostFlow) {
            NavHostFlow navHostFlow = (NavHostFlow) obj;
            return this.navigationType == navHostFlow.navigationType && Intrinsics.areEqual(this.arg, navHostFlow.arg);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.navigationType.hashCode() * 31;
        Bundle bundle = this.arg;
        return hashCode + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        NavHostNavigationType navHostNavigationType = this.navigationType;
        Bundle bundle = this.arg;
        return "NavHostFlow(navigationType=" + navHostNavigationType + ", arg=" + bundle + ")";
    }

    public NavHostFlow(NavHostNavigationType navigationType, Bundle bundle) {
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        this.navigationType = navigationType;
        this.arg = bundle;
    }

    public /* synthetic */ NavHostFlow(NavHostNavigationType navHostNavigationType, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navHostNavigationType, (i & 2) != 0 ? null : bundle);
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public boolean getClearContainer() {
        return FragmentScreen.DefaultImpls.getClearContainer(this);
    }

    @Override // com.ifriend.base.navigation.api.cicerone.Screen
    public String getScreenKey() {
        return FragmentScreen.DefaultImpls.getScreenKey(this);
    }

    public final NavHostNavigationType getNavigationType() {
        return this.navigationType;
    }

    public final Bundle getArg() {
        return this.arg;
    }

    @Override // com.ifriend.base.navigation.impl.cicerone.FragmentScreen
    public NavHostFlowFragment createFragment(FragmentFactory factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        return NavHostFlowFragment.Companion.newInstance(this.navigationType, this.arg);
    }
}
