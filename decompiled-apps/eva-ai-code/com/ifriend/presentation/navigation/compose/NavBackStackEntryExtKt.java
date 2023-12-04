package com.ifriend.presentation.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: NavBackStackEntryExt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"rememberBackStackEntry", "Landroidx/navigation/NavBackStackEntry;", "navController", "Landroidx/navigation/NavController;", "route", "", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavController;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/navigation/NavBackStackEntry;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavBackStackEntryExtKt {
    public static final NavBackStackEntry rememberBackStackEntry(NavBackStackEntry navBackStackEntry, NavController navController, String route, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(route, "route");
        composer.startReplaceableGroup(1102910133);
        ComposerKt.sourceInformation(composer, "C(rememberBackStackEntry)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1102910133, i, -1, "com.ifriend.presentation.navigation.compose.rememberBackStackEntry (NavBackStackEntryExt.kt:11)");
        }
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(navBackStackEntry);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = navController.getBackStackEntry(route);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return navBackStackEntry2;
    }
}
