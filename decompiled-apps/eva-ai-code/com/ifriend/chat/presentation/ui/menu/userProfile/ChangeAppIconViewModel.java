package com.ifriend.chat.presentation.ui.menu.userProfile;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.icon_switcher.PremiumAppIconManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChangeAppIconViewModel.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconViewModel;", "Landroidx/lifecycle/ViewModel;", "iconManager", "Lcom/ifriend/icon_switcher/PremiumAppIconManager;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "(Lcom/ifriend/icon_switcher/PremiumAppIconManager;Lcom/ifriend/base/navigation/api/RouterProvider;)V", "fragment", "Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconFragment;", "getFragment", "()Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconFragment;", "setFragment", "(Lcom/ifriend/chat/presentation/ui/menu/userProfile/ChangeAppIconFragment;)V", "isEdited", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "()Landroidx/lifecycle/MutableLiveData;", "isInitialIconPremium", "isPremiumIconSelected", "back", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "onClickPremiumIcon", "onClickRegularIcon", "save", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeAppIconViewModel extends ViewModel {
    public static final int $stable = 8;
    private ChangeAppIconFragment fragment;
    private final PremiumAppIconManager iconManager;
    private final MutableLiveData<Boolean> isEdited;
    private boolean isInitialIconPremium;
    private final MutableLiveData<Boolean> isPremiumIconSelected;
    private final RouterProvider router;

    @Inject
    public ChangeAppIconViewModel(PremiumAppIconManager iconManager, RouterProvider router) {
        Intrinsics.checkNotNullParameter(iconManager, "iconManager");
        Intrinsics.checkNotNullParameter(router, "router");
        this.iconManager = iconManager;
        this.router = router;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(false);
        this.isPremiumIconSelected = mutableLiveData;
        this.isEdited = new MutableLiveData<>(false);
        boolean isPremiumIconEnabled = iconManager.isPremiumIconEnabled();
        this.isInitialIconPremium = isPremiumIconEnabled;
        mutableLiveData.setValue(Boolean.valueOf(isPremiumIconEnabled));
    }

    public final ChangeAppIconFragment getFragment() {
        return this.fragment;
    }

    public final void setFragment(ChangeAppIconFragment changeAppIconFragment) {
        this.fragment = changeAppIconFragment;
    }

    public final MutableLiveData<Boolean> isPremiumIconSelected() {
        return this.isPremiumIconSelected;
    }

    public final MutableLiveData<Boolean> isEdited() {
        return this.isEdited;
    }

    public final void onClickRegularIcon(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isPremiumIconSelected.setValue(false);
        this.isEdited.setValue(Boolean.valueOf(this.isInitialIconPremium));
    }

    public final void onClickPremiumIcon(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.isPremiumIconSelected.setValue(true);
        this.isEdited.setValue(Boolean.valueOf(true ^ this.isInitialIconPremium));
    }

    public final void save(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual((Object) this.isPremiumIconSelected.getValue(), (Object) true)) {
            this.iconManager.enablePremiumIcon();
        } else {
            this.iconManager.disablePremiumIcon();
        }
        this.router.getRoute().exit();
    }

    public final void back(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.router.getRoute().exit();
    }
}
