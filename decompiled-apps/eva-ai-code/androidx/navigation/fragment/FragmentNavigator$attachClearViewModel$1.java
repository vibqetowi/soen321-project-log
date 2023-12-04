package androidx.navigation.fragment;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: FragmentNavigator.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class FragmentNavigator$attachClearViewModel$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ NavigatorState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigator$attachClearViewModel$1(NavBackStackEntry navBackStackEntry, NavigatorState navigatorState, Fragment fragment) {
        super(0);
        this.$entry = navBackStackEntry;
        this.$state = navigatorState;
        this.$fragment = fragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NavigatorState navigatorState = this.$state;
        Fragment fragment = this.$fragment;
        for (NavBackStackEntry navBackStackEntry : navigatorState.getTransitionsInProgress().getValue()) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + fragment + " viewmodel being cleared");
            }
            navigatorState.markTransitionComplete(navBackStackEntry);
        }
    }
}
