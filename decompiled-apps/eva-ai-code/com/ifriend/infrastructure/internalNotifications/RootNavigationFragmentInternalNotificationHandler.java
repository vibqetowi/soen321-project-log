package com.ifriend.infrastructure.internalNotifications;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RootNavigationFragmentInternalNotificationHandler.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ifriend/infrastructure/internalNotifications/RootNavigationFragmentInternalNotificationHandler;", "Lcom/ifriend/infrastructure/internalNotifications/LifecycledInternalNotificationHandler;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "fragmentsContainerId", "", "(Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;I)V", "onBackStackChanged", "", "onPause", "owner", "Landroidx/lifecycle/LifecycleOwner;", "infrastructure_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RootNavigationFragmentInternalNotificationHandler extends LifecycledInternalNotificationHandler implements DefaultLifecycleObserver, FragmentManager.OnBackStackChangedListener {
    private final FragmentManager fragmentManager;
    private final int fragmentsContainerId;
    private final Lifecycle lifecycle;

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
        FragmentManager.OnBackStackChangedListener.CC.$default$onBackStackChangeCommitted(this, fragment, z);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
        FragmentManager.OnBackStackChangedListener.CC.$default$onBackStackChangeStarted(this, fragment, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RootNavigationFragmentInternalNotificationHandler(FragmentManager fragmentManager, Lifecycle lifecycle, int i) {
        super(lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.fragmentManager = fragmentManager;
        this.lifecycle = lifecycle;
        this.fragmentsContainerId = i;
        fragmentManager.addOnBackStackChangedListener(this);
    }

    @Override // com.ifriend.infrastructure.internalNotifications.LifecycledInternalNotificationHandler, androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onPause(owner);
        this.fragmentManager.removeOnBackStackChangedListener(this);
    }

    @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
    public void onBackStackChanged() {
        if (this.fragmentManager.findFragmentById(this.fragmentsContainerId) == null) {
            activate();
        } else {
            deactivate();
        }
    }
}
