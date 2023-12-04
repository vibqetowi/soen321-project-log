package com.ifriend.chat.presentation.ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ifriend.analytics.usecase.screenshot.AnalyticsScreenName;
import com.ifriend.chat.new_chat.backstack.ChatBackStackChangedListener;
import com.ifriend.chat.new_chat.backstack.ChatBackStackChangedListenerKt;
import com.ifriend.ui.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.Job;
/* compiled from: BackgroundDelegateManager.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ifriend/chat/presentation/ui/BackgroundDelegateManager;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "fragment", "Landroidx/fragment/app/Fragment;", "provideBackgroundView", "Lkotlin/Function0;", "Landroid/view/View;", "(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V", "backStackListener", "Lcom/ifriend/chat/new_chat/backstack/ChatBackStackChangedListener;", "delayedHideBlurJob", "Lkotlinx/coroutines/Job;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "hideBlurWithDelay", "", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onDestroy", "onStart", "showBlur", "showOverlay", "updateBackgroundState", "isForeground", "", "Companion", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BackgroundDelegateManager implements DefaultLifecycleObserver {
    public static final long FRAGMENTS_TRANSITION_DURATION = 300;
    private final ChatBackStackChangedListener backStackListener;
    private Job delayedHideBlurJob;
    private final FragmentManager fragmentManager;
    private final LifecycleCoroutineScope lifecycleScope;
    private final Function0<View> provideBackgroundView;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundDelegateManager(Fragment fragment, Function0<? extends View> provideBackgroundView) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(provideBackgroundView, "provideBackgroundView");
        this.provideBackgroundView = provideBackgroundView;
        this.lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment);
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.fragmentManager = childFragmentManager;
        this.backStackListener = new ChatBackStackChangedListener(childFragmentManager, new BackgroundDelegateManager$backStackListener$1(this));
    }

    /* compiled from: BackgroundDelegateManager.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ifriend/chat/presentation/ui/BackgroundDelegateManager$Companion;", "", "()V", "FRAGMENTS_TRANSITION_DURATION", "", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void updateBackgroundState(boolean z) {
        if (!z) {
            showBlur();
            showOverlay();
            return;
        }
        hideBlurWithDelay();
    }

    private final void showOverlay() {
        int color;
        IntRange until = RangesKt.until(0, this.fragmentManager.getBackStackEntryCount());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(this.fragmentManager.getBackStackEntryAt(((IntIterator) it).nextInt()));
        }
        FragmentManager.BackStackEntry backStackEntry = (FragmentManager.BackStackEntry) CollectionsKt.lastOrNull((List<? extends Object>) arrayList);
        String name = backStackEntry != null ? backStackEntry.getName() : null;
        View invoke = this.provideBackgroundView.invoke();
        if (Intrinsics.areEqual(name, AnalyticsScreenName.HAMBURGER_MENU.getValue())) {
            color = invoke.getContext().getColor(R.color.black_60);
        } else if (Intrinsics.areEqual(name, AnalyticsScreenName.SCREENS_AFTER_ONBOARDING.getValue())) {
            color = invoke.getContext().getColor(R.color.black_95);
        } else {
            color = invoke.getContext().getColor(R.color.black);
        }
        invoke.setBackgroundColor(color);
    }

    private final void hideBlurWithDelay() {
        this.delayedHideBlurJob = this.lifecycleScope.launchWhenResumed(new BackgroundDelegateManager$hideBlurWithDelay$1(this, null));
    }

    private final void showBlur() {
        Job job = this.delayedHideBlurJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.delayedHideBlurJob = null;
        View invoke = this.provideBackgroundView.invoke();
        invoke.setBackgroundColor(invoke.getContext().getColor(R.color.black));
        invoke.setClickable(true);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.fragmentManager.addOnBackStackChangedListener(this.backStackListener);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        updateBackgroundState(ChatBackStackChangedListenerKt.isChatFragmentForeground(this.fragmentManager));
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.fragmentManager.removeOnBackStackChangedListener(this.backStackListener);
    }
}
