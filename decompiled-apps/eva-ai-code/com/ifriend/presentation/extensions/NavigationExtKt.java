package com.ifriend.presentation.extensions;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.exifinterface.media.ExifInterface;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
/* compiled from: NavigationExt.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u0002H\n¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"DestinationListenerEffect", "", "Landroidx/navigation/NavController;", UserMetadata.KEYDATA_FILENAME, "", "", "onChangedDestination", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "(Landroidx/navigation/NavController;[Ljava/lang/Object;Landroidx/navigation/NavController$OnDestinationChangedListener;Landroidx/compose/runtime/Composer;I)V", "getResult", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavBackStackEntry;", "key", "", "(Landroidx/navigation/NavBackStackEntry;Ljava/lang/String;)Ljava/lang/Object;", "setResult", "result", "(Landroidx/navigation/NavBackStackEntry;Ljava/lang/String;Ljava/lang/Object;)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavigationExtKt {
    public static final void DestinationListenerEffect(NavController navController, Object[] keys, NavController.OnDestinationChangedListener onChangedDestination, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(onChangedDestination, "onChangedDestination");
        Composer startRestartGroup = composer.startRestartGroup(1522351135);
        ComposerKt.sourceInformation(startRestartGroup, "C(DestinationListenerEffect)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1522351135, i, -1, "com.ifriend.presentation.extensions.DestinationListenerEffect (NavigationExt.kt:11)");
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(navController);
        spreadBuilder.addSpread(keys);
        EffectsKt.DisposableEffect(spreadBuilder.toArray(new Object[spreadBuilder.size()]), (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new NavigationExtKt$DestinationListenerEffect$1(navController, onChangedDestination), startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavigationExtKt$DestinationListenerEffect$2(navController, keys, onChangedDestination, i));
    }

    public static final <T> T getResult(NavBackStackEntry navBackStackEntry, String key) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) navBackStackEntry.getSavedStateHandle().remove(key);
    }

    public static final <T> void setResult(NavBackStackEntry navBackStackEntry, String key, T t) {
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        navBackStackEntry.getSavedStateHandle().set(key, t);
    }
}
