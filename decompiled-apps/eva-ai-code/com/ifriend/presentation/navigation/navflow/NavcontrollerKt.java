package com.ifriend.presentation.navigation.navflow;

import android.net.Uri;
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
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.text.StringsKt;
/* compiled from: navcontroller.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0016\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u0004\u0018\u0001H\n\"\u0004\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000e\u001a%\u0010\u000f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u0002H\n¢\u0006\u0002\u0010\u0011\u001a;\u0010\u0012\u001a\u00020\r*\u00020\r2*\u0010\u0013\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u00140\u0004\"\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u0014¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, d2 = {"DestinationListenerEffect", "", "Landroidx/navigation/NavController;", UserMetadata.KEYDATA_FILENAME, "", "", "onChangedDestination", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "(Landroidx/navigation/NavController;[Ljava/lang/Object;Landroidx/navigation/NavController$OnDestinationChangedListener;Landroidx/compose/runtime/Composer;I)V", "getResult", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/navigation/NavBackStackEntry;", "key", "", "(Landroidx/navigation/NavBackStackEntry;Ljava/lang/String;)Ljava/lang/Object;", "setResult", "result", "(Landroidx/navigation/NavBackStackEntry;Ljava/lang/String;Ljava/lang/Object;)V", "withArguments", "args", "Lkotlin/Pair;", "(Ljava/lang/String;[Lkotlin/Pair;)Ljava/lang/String;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NavcontrollerKt {
    public static final void DestinationListenerEffect(NavController navController, Object[] keys, NavController.OnDestinationChangedListener onChangedDestination, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(navController, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(onChangedDestination, "onChangedDestination");
        Composer startRestartGroup = composer.startRestartGroup(-1059944240);
        ComposerKt.sourceInformation(startRestartGroup, "C(DestinationListenerEffect)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1059944240, i, -1, "com.ifriend.presentation.navigation.navflow.DestinationListenerEffect (navcontroller.kt:26)");
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.add(navController);
        spreadBuilder.addSpread(keys);
        EffectsKt.DisposableEffect(spreadBuilder.toArray(new Object[spreadBuilder.size()]), (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) new NavcontrollerKt$DestinationListenerEffect$1(navController, onChangedDestination), startRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavcontrollerKt$DestinationListenerEffect$2(navController, keys, onChangedDestination, i));
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

    public static final String withArguments(String str, Pair<String, String>... args) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        Uri.Builder buildUpon = parse.buildUpon();
        for (Pair<String, String> pair : args) {
            String component1 = pair.component1();
            String component2 = pair.component2();
            if (!StringsKt.isBlank(component2)) {
                buildUpon.appendQueryParameter(component1, component2);
            }
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }
}
