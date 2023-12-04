package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentNavigator.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FragmentNavigator$attachObservers$1 extends Lambda implements Function1<LifecycleOwner, Unit> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ FragmentNavigator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigator$attachObservers$1(FragmentNavigator fragmentNavigator, Fragment fragment, NavBackStackEntry navBackStackEntry) {
        super(1);
        this.this$0 = fragmentNavigator;
        this.$fragment = fragment;
        this.$entry = navBackStackEntry;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
        invoke2(lifecycleOwner);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LifecycleOwner lifecycleOwner) {
        Function1 function1;
        if (lifecycleOwner == null || CollectionsKt.contains(this.this$0.getEntriesToPop$navigation_fragment_release(), this.$fragment.getTag())) {
            return;
        }
        Lifecycle lifecycle = this.$fragment.getViewLifecycleOwner().getLifecycle();
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            function1 = this.this$0.fragmentViewObserver;
            lifecycle.addObserver((LifecycleObserver) function1.invoke(this.$entry));
        }
    }
}
