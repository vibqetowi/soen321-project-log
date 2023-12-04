package com.ifriend.presentation.navigation.compose;

import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptionsBuilder;
import com.ifriend.presentation.navigation.destination.NavigationDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: navcontroller.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b\u001a\u0012\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u0012\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\f\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\u000f"}, d2 = {"backTo", "", "Landroidx/navigation/NavController;", "destination", "Lcom/ifriend/presentation/navigation/destination/NavigationDestination;", "navigate", "navigateReplace", "route", "", "currentRoute", "navigateSingleTopTo", "navigateWithSaveState", "popUpToTop", "Landroidx/navigation/NavOptionsBuilder;", "navController", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavcontrollerKt {
    public static final void navigateSingleTopTo(NavController navController, String route) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        navController.navigate(route, NavcontrollerKt$navigateSingleTopTo$1.INSTANCE);
    }

    public static final void navigate(NavController navController, NavigationDestination destination) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        NavController.navigate$default(navController, destination.getDestination(), null, null, 6, null);
    }

    public static /* synthetic */ void navigateReplace$default(NavController navController, String str, String str2, int i, Object obj) {
        NavBackStackEntry currentBackStackEntry;
        NavDestination destination;
        if ((i & 2) != 0 && ((currentBackStackEntry = navController.getCurrentBackStackEntry()) == null || (destination = currentBackStackEntry.getDestination()) == null || (str2 = destination.getRoute()) == null)) {
            str2 = "";
        }
        navigateReplace(navController, str, str2);
    }

    public static final void navigateReplace(NavController navController, String route, String currentRoute) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(currentRoute, "currentRoute");
        navController.navigate(route, new NavcontrollerKt$navigateReplace$1(navController, currentRoute));
    }

    public static final void backTo(NavController navController, NavigationDestination destination) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        String destination2 = destination.getDestination();
        if (NavController.popBackStack$default(navController, destination2, false, false, 4, null)) {
            return;
        }
        navigateReplace$default(navController, destination2, null, 2, null);
    }

    public static /* synthetic */ void popUpToTop$default(NavOptionsBuilder navOptionsBuilder, NavController navController, String str, int i, Object obj) {
        NavBackStackEntry currentBackStackEntry;
        NavDestination destination;
        if ((i & 2) != 0 && ((currentBackStackEntry = navController.getCurrentBackStackEntry()) == null || (destination = currentBackStackEntry.getDestination()) == null || (str = destination.getRoute()) == null)) {
            str = "";
        }
        popUpToTop(navOptionsBuilder, navController, str);
    }

    public static final void popUpToTop(NavOptionsBuilder navOptionsBuilder, NavController navController, String route) {
        Intrinsics.checkNotNullParameter(navOptionsBuilder, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(route, "route");
        navOptionsBuilder.popUpTo(route, NavcontrollerKt$popUpToTop$1.INSTANCE);
    }

    public static final void navigateWithSaveState(NavController navController, String route) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        navController.navigate(route, new NavcontrollerKt$navigateWithSaveState$1(navController));
    }
}
