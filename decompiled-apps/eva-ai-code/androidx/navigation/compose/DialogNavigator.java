package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.window.DialogProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.http.HttpHeaders;
/* compiled from: DialogNavigator.kt */
@Navigator.Name(DialogNavigator.NAME)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000eJ*\u0010\u000f\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0015\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0017J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R \u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u001e"}, d2 = {"Landroidx/navigation/compose/DialogNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/compose/DialogNavigator$Destination;", "()V", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "getBackStack$navigation_compose_release", "()Lkotlinx/coroutines/flow/StateFlow;", "createDestination", "dismiss", "", "backStackEntry", "dismiss$navigation_compose_release", "navigate", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "onTransitionComplete", "entry", "onTransitionComplete$navigation_compose_release", "popBackStack", "popUpTo", "savedState", "", "Companion", HttpHeaders.DESTINATION, "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialogNavigator extends Navigator<Destination> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "dialog";

    public final StateFlow<List<NavBackStackEntry>> getBackStack$navigation_compose_release() {
        return getState().getBackStack();
    }

    public final void dismiss$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        getState().popWithTransition(navBackStackEntry, false);
    }

    @Override // androidx.navigation.Navigator
    public void navigate(List<NavBackStackEntry> list, NavOptions navOptions, Navigator.Extras extras) {
        for (NavBackStackEntry navBackStackEntry : list) {
            getState().push(navBackStackEntry);
        }
    }

    @Override // androidx.navigation.Navigator
    public Destination createDestination() {
        return new Destination(this, null, ComposableSingletons$DialogNavigatorKt.INSTANCE.m6110getLambda1$navigation_compose_release(), 2, null);
    }

    @Override // androidx.navigation.Navigator
    public void popBackStack(NavBackStackEntry navBackStackEntry, boolean z) {
        getState().popWithTransition(navBackStackEntry, z);
    }

    public final void onTransitionComplete$navigation_compose_release(NavBackStackEntry navBackStackEntry) {
        getState().markTransitionComplete(navBackStackEntry);
    }

    /* compiled from: DialogNavigator.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fR'\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bX\u0080\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "navigator", "Landroidx/navigation/compose/DialogNavigator;", "dialogProperties", "Landroidx/compose/ui/window/DialogProperties;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function1;", "Landroidx/navigation/NavBackStackEntry;", "", "Landroidx/compose/runtime/Composable;", "(Landroidx/navigation/compose/DialogNavigator;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;)V", "getContent$navigation_compose_release", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "getDialogProperties$navigation_compose_release", "()Landroidx/compose/ui/window/DialogProperties;", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Destination extends NavDestination implements FloatingWindow {
        public static final int $stable = 0;
        private final Function3<NavBackStackEntry, Composer, Integer, Unit> content;
        private final DialogProperties dialogProperties;

        public /* synthetic */ Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, Function3 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(dialogNavigator, (i & 2) != 0 ? new DialogProperties(false, false, (SecureFlagPolicy) null, 7, (DefaultConstructorMarker) null) : dialogProperties, function3);
        }

        public final DialogProperties getDialogProperties$navigation_compose_release() {
            return this.dialogProperties;
        }

        public final Function3<NavBackStackEntry, Composer, Integer, Unit> getContent$navigation_compose_release() {
            return this.content;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Destination(DialogNavigator dialogNavigator, DialogProperties dialogProperties, Function3<? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> function3) {
            super(dialogNavigator);
            this.dialogProperties = dialogProperties;
            this.content = function3;
        }
    }

    /* compiled from: DialogNavigator.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/navigation/compose/DialogNavigator$Companion;", "", "()V", "NAME", "", "navigation-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
