package com.ifriend.presentation.navigation.compose;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import com.ifriend.presentation.navigation.FeatureRoute;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FeatureComponentHolder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u001f\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH'¢\u0006\u0002\u0010\tJ\u001d\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ'\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ifriend/presentation/navigation/compose/FeatureComponentHolder;", "C", "", "Lcom/ifriend/presentation/navigation/FeatureRoute;", "featureComponent", "rootEntry", "Landroidx/navigation/NavBackStackEntry;", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "currentEntry", "navController", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavController;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "(Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavController;Landroid/os/Bundle;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FeatureComponentHolder<C> extends FeatureRoute {
    C featureComponent(NavBackStackEntry navBackStackEntry, Bundle bundle, Composer composer, int i);

    C featureComponent(NavBackStackEntry navBackStackEntry, NavController navController, Bundle bundle, Composer composer, int i);

    C featureComponent(NavBackStackEntry navBackStackEntry, NavController navController, Composer composer, int i);

    /* compiled from: FeatureComponentHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static <C> C featureComponent(FeatureComponentHolder<C> featureComponentHolder, NavBackStackEntry currentEntry, NavController navController, Bundle bundle, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(currentEntry, "currentEntry");
            Intrinsics.checkNotNullParameter(navController, "navController");
            composer.startReplaceableGroup(1532472887);
            ComposerKt.sourceInformation(composer, "C(featureComponent)P(1,2)");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1532472887, i, -1, "com.ifriend.presentation.navigation.compose.FeatureComponentHolder.featureComponent (FeatureComponentHolder.kt:15)");
            }
            C featureComponent = featureComponentHolder.featureComponent(NavBackStackEntryExtKt.rememberBackStackEntry(currentEntry, navController, featureComponentHolder.getFeatureRoute(), composer, 72), bundle, composer, ((i >> 3) & 896) | 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return featureComponent;
        }

        public static <C> C featureComponent(FeatureComponentHolder<C> featureComponentHolder, NavBackStackEntry currentEntry, NavController navController, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(currentEntry, "currentEntry");
            Intrinsics.checkNotNullParameter(navController, "navController");
            composer.startReplaceableGroup(-519150575);
            ComposerKt.sourceInformation(composer, "C(featureComponent)");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-519150575, i, -1, "com.ifriend.presentation.navigation.compose.FeatureComponentHolder.featureComponent (FeatureComponentHolder.kt:27)");
            }
            C featureComponent = featureComponentHolder.featureComponent(NavBackStackEntryExtKt.rememberBackStackEntry(currentEntry, navController, featureComponentHolder.getFeatureRoute(), composer, 72), currentEntry.getArguments(), composer, (i & 896) | 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return featureComponent;
        }
    }
}
