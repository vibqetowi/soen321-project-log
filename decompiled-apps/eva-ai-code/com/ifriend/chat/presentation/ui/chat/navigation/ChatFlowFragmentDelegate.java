package com.ifriend.chat.presentation.ui.chat.navigation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ifriend.base.app.activity.FlowFragment;
import com.ifriend.base.app.activity.FlowNavigator;
import com.ifriend.base.navigation.api.cicerone.Command;
import com.ifriend.base.navigation.impl.cicerone.FragmentScreen;
import com.ifriend.chat.presentation.R;
import com.ifriend.ui.utils.UIHelper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ChatFlowFragmentDelegate.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0002J\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u0007\u001a\u00060\bR\u00020\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "flowFragment", "Lcom/ifriend/base/app/activity/FlowFragment;", "containerId", "", "(Lcom/ifriend/base/app/activity/FlowFragment;I)V", "navigator", "Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate$ChatFlowNavigator;", "getNavigator", "()Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate$ChatFlowNavigator;", "navigator$delegate", "Lkotlin/Lazy;", "exit", "", "applySlideUpTransactionAnimation", "Landroidx/fragment/app/FragmentTransaction;", "ChatFlowNavigator", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatFlowFragmentDelegate implements DefaultLifecycleObserver {
    public static final int $stable = 8;
    private final int containerId;
    private final FlowFragment flowFragment;
    private final Lazy navigator$delegate;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public ChatFlowFragmentDelegate(FlowFragment flowFragment, int i) {
        Intrinsics.checkNotNullParameter(flowFragment, "flowFragment");
        this.flowFragment = flowFragment;
        this.containerId = i;
        this.navigator$delegate = LazyKt.lazy(new ChatFlowFragmentDelegate$navigator$2(this));
    }

    public /* synthetic */ ChatFlowFragmentDelegate(FlowFragment flowFragment, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(flowFragment, (i2 & 2) != 0 ? R.id.chatFragmentContainer : i);
    }

    public final ChatFlowNavigator getNavigator() {
        return (ChatFlowNavigator) this.navigator$delegate.getValue();
    }

    /* compiled from: ChatFlowFragmentDelegate.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J*\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¨\u0006\u0010"}, d2 = {"Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate$ChatFlowNavigator;", "Lcom/ifriend/base/app/activity/FlowNavigator;", "(Lcom/ifriend/chat/presentation/ui/chat/navigation/ChatFlowFragmentDelegate;)V", "activityBack", "", "applyCommand", "command", "Lcom/ifriend/base/navigation/api/cicerone/Command;", "setupFragmentTransaction", "screen", "Lcom/ifriend/base/navigation/impl/cicerone/FragmentScreen;", "fragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "currentFragment", "Landroidx/fragment/app/Fragment;", "nextFragment", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public final class ChatFlowNavigator extends FlowNavigator {
        public ChatFlowNavigator() {
            super(ChatFlowFragmentDelegate.this.flowFragment, ChatFlowFragmentDelegate.this.containerId);
        }

        @Override // com.ifriend.base.navigation.impl.cicerone.AppNavigator
        protected void setupFragmentTransaction(FragmentScreen screen, FragmentTransaction fragmentTransaction, Fragment fragment, Fragment nextFragment) {
            Intrinsics.checkNotNullParameter(screen, "screen");
            Intrinsics.checkNotNullParameter(fragmentTransaction, "fragmentTransaction");
            Intrinsics.checkNotNullParameter(nextFragment, "nextFragment");
            ChatFlowFragmentDelegate.this.applySlideUpTransactionAnimation(fragmentTransaction);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ifriend.base.navigation.impl.ExtendNavigator, com.ifriend.base.navigation.impl.cicerone.AppNavigator
        public void applyCommand(Command command) {
            Intrinsics.checkNotNullParameter(command, "command");
            UIHelper.INSTANCE.hideKeyboardIfOpened(getActivity(), new ChatFlowFragmentDelegate$ChatFlowNavigator$applyCommand$1(this, command));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.ifriend.base.app.activity.FlowNavigator, com.ifriend.base.navigation.impl.cicerone.AppNavigator
        public void activityBack() {
            ChatFlowFragmentDelegate.this.flowFragment.getRouterProvider().getAppRouter().exit();
        }
    }

    private final void exit() {
        this.flowFragment.getRouterProvider().getAppRouter().exit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySlideUpTransactionAnimation(FragmentTransaction fragmentTransaction) {
        fragmentTransaction.setCustomAnimations(com.ifriend.infrastructure.R.anim.slide_up_enter, com.ifriend.infrastructure.R.anim.fade_out_exit, com.ifriend.infrastructure.R.anim.fade_in_enter, com.ifriend.infrastructure.R.anim.slide_up_exit);
    }
}
