package com.ifriend.ui.navigation;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: appnavigation.kt */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a[\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\u0010\u0012\u001a[\u0010\u0013\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\b\u0010¢\u0006\u0002\b\u0011¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"DURATION_SLIDE_ANIMATION", "", "animatedComposable", "", "Landroidx/navigation/NavGraphBuilder;", "route", "", "arguments", "", "Landroidx/navigation/NamedNavArgument;", "deepLinks", "Landroidx/navigation/NavDeepLink;", FirebaseAnalytics.Param.CONTENT, "Lkotlin/Function2;", "Landroidx/compose/animation/AnimatedVisibilityScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function4;)V", "nonAnimationComposable", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppnavigationKt {
    private static final int DURATION_SLIDE_ANIMATION = 250;

    public static /* synthetic */ void nonAnimationComposable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        nonAnimationComposable(navGraphBuilder, str, list, list2, function4);
    }

    public static final void nonAnimationComposable(NavGraphBuilder navGraphBuilder, String route, List<NamedNavArgument> arguments, List<NavDeepLink> deepLinks, Function4<? super AnimatedVisibilityScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        Intrinsics.checkNotNullParameter(content, "content");
        NavGraphBuilderKt.composable(navGraphBuilder, route, arguments, deepLinks, AppnavigationKt$nonAnimationComposable$1.INSTANCE, AppnavigationKt$nonAnimationComposable$2.INSTANCE, AppnavigationKt$nonAnimationComposable$3.INSTANCE, AppnavigationKt$nonAnimationComposable$4.INSTANCE, content);
    }

    public static /* synthetic */ void animatedComposable$default(NavGraphBuilder navGraphBuilder, String str, List list, List list2, Function4 function4, int i, Object obj) {
        if ((i & 2) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i & 4) != 0) {
            list2 = CollectionsKt.emptyList();
        }
        animatedComposable(navGraphBuilder, str, list, list2, function4);
    }

    public static final void animatedComposable(NavGraphBuilder navGraphBuilder, String route, List<NamedNavArgument> arguments, List<NavDeepLink> deepLinks, Function4<? super AnimatedVisibilityScope, ? super NavBackStackEntry, ? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(navGraphBuilder, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        Intrinsics.checkNotNullParameter(content, "content");
        NavGraphBuilderKt.composable$default(navGraphBuilder, route, arguments, deepLinks, AppnavigationKt$animatedComposable$1.INSTANCE, AppnavigationKt$animatedComposable$2.INSTANCE, null, null, content, 96, null);
    }
}
