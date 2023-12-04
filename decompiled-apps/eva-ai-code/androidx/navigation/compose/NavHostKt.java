package androidx.navigation.compose;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.ComposeNavGraphNavigator;
import androidx.navigation.compose.ComposeNavigator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: NavHost.kt */
@Metadata(d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u001f\b\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00102\u001f\b\u0002\u0010\u0011\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0002\b\u00102\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00102\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0015\u001aÚ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u001f\b\u0002\u0010\u000b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00102\u001f\b\u0002\u0010\u0011\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0002\b\u00102\u001f\b\u0002\u0010\u0013\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u00102\u001f\b\u0002\u0010\u0014\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u00120\f¢\u0006\u0002\b\u00102\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001b\u001aL\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u001c\u001a\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000f*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010 \u001a\u0004\u0018\u00010\u0012*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010!\u001a\u0004\u0018\u00010\u000f*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002\u001a\u001c\u0010\"\u001a\u0004\u0018\u00010\u0012*\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¨\u0006#²\u0006\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%X\u008a\u0084\u0002²\u0006\u0010\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0%X\u008a\u0084\u0002"}, d2 = {"NavHost", "", "navController", "Landroidx/navigation/NavHostController;", "graph", "Landroidx/navigation/NavGraph;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "contentAlignment", "Landroidx/compose/ui/Alignment;", "enterTransition", "Lkotlin/Function1;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "Landroidx/compose/animation/EnterTransition;", "Lkotlin/ExtensionFunctionType;", "exitTransition", "Landroidx/compose/animation/ExitTransition;", "popEnterTransition", "popExitTransition", "(Landroidx/navigation/NavHostController;Landroidx/navigation/NavGraph;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "startDestination", "", "route", "builder", "Landroidx/navigation/NavGraphBuilder;", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Alignment;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "createEnterTransition", "Landroidx/navigation/NavDestination;", "scope", "createExitTransition", "createPopEnterTransition", "createPopExitTransition", "navigation-compose_release", "currentBackStack", "", "visibleEntries"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NavHostKt {
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    public static final /* synthetic */ void NavHost(NavHostController navHostController, String str, Modifier modifier, String str2, Function1 function1, Composer composer, int i, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(141827520);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(2,4,1,3)84@3335L126,82@3295L190:NavHost.kt#opm8kd");
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        String str3 = (i2 & 8) != 0 ? null : str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(141827520, i, -1, "androidx.navigation.compose.NavHost (NavHost.kt:81)");
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(str3) | startRestartGroup.changed(str) | startRestartGroup.changed(function1);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            function1.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        NavHost(navHostController, (NavGraph) rememberedValue, companion, null, null, null, null, null, startRestartGroup, (i & 896) | 72, 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$2(navHostController, str, companion, str3, function1, i, i2));
    }

    public static final void NavHost(NavHostController navHostController, String str, Modifier modifier, Alignment alignment, String str2, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function14, Function1<? super NavGraphBuilder, Unit> function15, Composer composer, int i, int i2) {
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function16;
        int i3;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function17;
        Composer startRestartGroup = composer.startRestartGroup(410432995);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(5,9,4,1,8,2,3,6,7)130@5424L126,128@5384L320:NavHost.kt#opm8kd");
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        String str3 = (i2 & 16) != 0 ? null : str2;
        NavHostKt$NavHost$3 navHostKt$NavHost$3 = (i2 & 32) != 0 ? NavHostKt$NavHost$3.INSTANCE : function1;
        NavHostKt$NavHost$4 navHostKt$NavHost$4 = (i2 & 64) != 0 ? NavHostKt$NavHost$4.INSTANCE : function12;
        if ((i2 & 128) != 0) {
            i3 = i & (-29360129);
            function16 = navHostKt$NavHost$3;
        } else {
            function16 = function13;
            i3 = i;
        }
        if ((i2 & 256) != 0) {
            i3 &= -234881025;
            function17 = navHostKt$NavHost$4;
        } else {
            function17 = function14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(410432995, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:127)");
        }
        startRestartGroup.startReplaceableGroup(1618982084);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(str3) | startRestartGroup.changed(str) | startRestartGroup.changed(function15);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHostController.getNavigatorProvider(), str, str3);
            function15.invoke(navGraphBuilder);
            rememberedValue = navGraphBuilder.build();
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        int i4 = i3 >> 3;
        NavHost(navHostController, (NavGraph) rememberedValue, companion, center, navHostKt$NavHost$3, navHostKt$NavHost$4, function16, function17, startRestartGroup, (i3 & 896) | 72 | (i3 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (i4 & 29360128), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$6(navHostController, str, companion, center, str3, navHostKt$NavHost$3, navHostKt$NavHost$4, function16, function17, function15, i, i2));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of NavHost that supports AnimatedContent")
    public static final /* synthetic */ void NavHost(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Composer composer, int i, int i2) {
        Composer startRestartGroup = composer.startRestartGroup(-957014592);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(2)164@6478L39:NavHost.kt#opm8kd");
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-957014592, i, -1, "androidx.navigation.compose.NavHost (NavHost.kt:164)");
        }
        NavHost(navHostController, navGraph, companion, null, null, null, null, null, startRestartGroup, (i & 896) | 72, 248);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new NavHostKt$NavHost$7(navHostController, navGraph, companion, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19 */
    public static final void NavHost(NavHostController navHostController, NavGraph navGraph, Modifier modifier, Alignment alignment, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function1, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function12, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function13, Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function14, Composer composer, int i, int i2) {
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> function15;
        int i3;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function16;
        NavBackStackEntry navBackStackEntry;
        Function1<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> function17;
        Composer startRestartGroup = composer.startRestartGroup(-1818191915);
        ComposerKt.sourceInformation(startRestartGroup, "C(NavHost)P(5,3,4)198@8167L7,*199@8243L7,204@8443L223,210@8667L27,211@8699L83,216@8838L172,226@9173L29,233@9522L219,239@9742L27,241@9840L7,247@9980L42,339@14467L27:NavHost.kt#opm8kd");
        Modifier.Companion companion = (i2 & 4) != 0 ? Modifier.Companion : modifier;
        Alignment center = (i2 & 8) != 0 ? Alignment.Companion.getCenter() : alignment;
        NavHostKt$NavHost$8 navHostKt$NavHost$8 = (i2 & 16) != 0 ? NavHostKt$NavHost$8.INSTANCE : function1;
        NavHostKt$NavHost$9 navHostKt$NavHost$9 = (i2 & 32) != 0 ? NavHostKt$NavHost$9.INSTANCE : function12;
        if ((i2 & 64) != 0) {
            i3 = i & (-3670017);
            function15 = navHostKt$NavHost$8;
        } else {
            function15 = function13;
            i3 = i;
        }
        if ((i2 & 128) != 0) {
            i3 &= -29360129;
            function16 = navHostKt$NavHost$9;
        } else {
            function16 = function14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1818191915, i3, -1, "androidx.navigation.compose.NavHost (NavHost.kt:196)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) consume;
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner".toString());
        }
        StateFlow<List<NavBackStackEntry>> currentBackStack = navHostController.getCurrentBackStack();
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = startRestartGroup.changed(currentBackStack);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final StateFlow<List<NavBackStackEntry>> currentBackStack2 = navHostController.getCurrentBackStack();
            rememberedValue = (Flow) new Flow<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends NavBackStackEntry>> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2", f = "NavHost.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$5$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    ArrayList arrayList = new ArrayList();
                                    for (T t : (List) obj) {
                                        if (Intrinsics.areEqual(((NavBackStackEntry) t).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                                            arrayList.add(t);
                                        }
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        BackHandlerKt.BackHandler(NavHost$lambda$6(SnapshotStateKt.collectAsState((Flow) rememberedValue, CollectionsKt.emptyList(), null, startRestartGroup, 56, 2)).size() > 1, new NavHostKt$NavHost$10(navHostController), startRestartGroup, 0, 0);
        EffectsKt.DisposableEffect(lifecycleOwner, new NavHostKt$NavHost$11(navHostController, lifecycleOwner), startRestartGroup, 8);
        navHostController.setViewModelStore(current.getViewModelStore());
        navHostController.setGraph(navGraph);
        SaveableStateHolder rememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(startRestartGroup, 0);
        Navigator navigator = navHostController.getNavigatorProvider().getNavigator(ComposeNavigator.NAME);
        ComposeNavigator composeNavigator = navigator instanceof ComposeNavigator ? (ComposeNavigator) navigator : null;
        if (composeNavigator == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                return;
            }
            endRestartGroup.updateScope(new NavHostKt$NavHost$composeNavigator$1(navHostController, navGraph, companion, center, navHostKt$NavHost$8, navHostKt$NavHost$9, function15, function16, i, i2));
            return;
        }
        StateFlow<List<NavBackStackEntry>> visibleEntries = navHostController.getVisibleEntries();
        startRestartGroup.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed2 = startRestartGroup.changed(visibleEntries);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            final StateFlow<List<NavBackStackEntry>> visibleEntries2 = navHostController.getVisibleEntries();
            rememberedValue2 = (Flow) new Flow<List<? extends NavBackStackEntry>>() { // from class: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super List<? extends NavBackStackEntry>> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2", f = "NavHost.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    /* renamed from: androidx.navigation.compose.NavHostKt$NavHost$lambda$9$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    ArrayList arrayList = new ArrayList();
                                    for (T t : (List) obj) {
                                        if (Intrinsics.areEqual(((NavBackStackEntry) t).getDestination().getNavigatorName(), ComposeNavigator.NAME)) {
                                            arrayList.add(t);
                                        }
                                    }
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                } else {
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        State collectAsState = SnapshotStateKt.collectAsState((Flow) rememberedValue2, CollectionsKt.emptyList(), null, startRestartGroup, 56, 2);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume2 = startRestartGroup.consume(InspectionModeKt.getLocalInspectionMode());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (((Boolean) consume2).booleanValue()) {
            navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List<? extends Object>) composeNavigator.getBackStack().getValue());
        } else {
            navBackStackEntry = (NavBackStackEntry) CollectionsKt.lastOrNull((List<? extends Object>) NavHost$lambda$10(collectAsState));
        }
        startRestartGroup.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(startRestartGroup, "CC(remember):Composables.kt#9igjgp");
        LinkedHashMap rememberedValue3 = startRestartGroup.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new LinkedHashMap();
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        startRestartGroup.endReplaceableGroup();
        Map map = (Map) rememberedValue3;
        startRestartGroup.startReplaceableGroup(1822178354);
        ComposerKt.sourceInformation(startRestartGroup, "250@10156L577,264@10831L577,278@11435L49,279@11504L2305,322@13818L441");
        if (navBackStackEntry != null) {
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed3 = startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(function15) | startRestartGroup.changed(navHostKt$NavHost$8);
            NavHostKt$NavHost$finalEnter$1$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new NavHostKt$NavHost$finalEnter$1$1(composeNavigator, function15, navHostKt$NavHost$8);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            startRestartGroup.endReplaceableGroup();
            Function1 function18 = (Function1) rememberedValue4;
            startRestartGroup.startReplaceableGroup(1618982084);
            ComposerKt.sourceInformation(startRestartGroup, "CC(remember)P(1,2,3):Composables.kt#9igjgp");
            boolean changed4 = startRestartGroup.changed(composeNavigator) | startRestartGroup.changed(function16) | startRestartGroup.changed(navHostKt$NavHost$9);
            NavHostKt$NavHost$finalExit$1$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue5 == Composer.Companion.getEmpty()) {
                rememberedValue5 = new NavHostKt$NavHost$finalExit$1$1(composeNavigator, function16, navHostKt$NavHost$9);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            startRestartGroup.endReplaceableGroup();
            function17 = function16;
            Transition updateTransition = TransitionKt.updateTransition(navBackStackEntry, "entry", startRestartGroup, 56, 0);
            Modifier modifier2 = companion;
            Alignment alignment2 = center;
            AnimatedContentKt.AnimatedContent(updateTransition, modifier2, new NavHostKt$NavHost$12(map, composeNavigator, function18, rememberedValue5, collectAsState), alignment2, NavHostKt$NavHost$13.INSTANCE, ComposableLambdaKt.composableLambda(startRestartGroup, -1440061047, true, new NavHostKt$NavHost$14(composeNavigator, rememberSaveableStateHolder, collectAsState)), startRestartGroup, ((i3 >> 3) & 112) | 221184 | (i3 & 7168), 0);
            EffectsKt.LaunchedEffect(updateTransition.getCurrentState(), updateTransition.getTargetState(), new NavHostKt$NavHost$15(updateTransition, map, collectAsState, composeNavigator, null), startRestartGroup, 584);
        } else {
            function17 = function16;
        }
        startRestartGroup.endReplaceableGroup();
        Navigator navigator2 = navHostController.getNavigatorProvider().getNavigator(DialogNavigator.NAME);
        DialogNavigator dialogNavigator = navigator2 instanceof DialogNavigator ? (DialogNavigator) navigator2 : null;
        if (dialogNavigator == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
            if (endRestartGroup2 == null) {
                return;
            }
            endRestartGroup2.updateScope(new NavHostKt$NavHost$dialogNavigator$1(navHostController, navGraph, companion, center, navHostKt$NavHost$8, navHostKt$NavHost$9, function15, function17, i, i2));
            return;
        }
        DialogHostKt.DialogHost(dialogNavigator, startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup3 = startRestartGroup.endRestartGroup();
        if (endRestartGroup3 == null) {
            return;
        }
        endRestartGroup3.updateScope(new NavHostKt$NavHost$16(navHostController, navGraph, companion, center, navHostKt$NavHost$8, navHostKt$NavHost$9, function15, function17, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> enterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getEnterTransition$navigation_compose_release();
            if (enterTransition$navigation_compose_release2 != null) {
                return enterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (enterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getEnterTransition$navigation_compose_release()) == null) {
            return null;
        } else {
            return enterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> exitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getExitTransition$navigation_compose_release();
            if (exitTransition$navigation_compose_release2 != null) {
                return exitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (exitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getExitTransition$navigation_compose_release()) == null) {
            return null;
        } else {
            return exitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnterTransition createPopEnterTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> popEnterTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopEnterTransition$navigation_compose_release();
            if (popEnterTransition$navigation_compose_release2 != null) {
                return popEnterTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popEnterTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopEnterTransition$navigation_compose_release()) == null) {
            return null;
        } else {
            return popEnterTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExitTransition createPopExitTransition(NavDestination navDestination, AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release;
        if (navDestination instanceof ComposeNavigator.Destination) {
            Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> popExitTransition$navigation_compose_release2 = ((ComposeNavigator.Destination) navDestination).getPopExitTransition$navigation_compose_release();
            if (popExitTransition$navigation_compose_release2 != null) {
                return popExitTransition$navigation_compose_release2.invoke(animatedContentTransitionScope);
            }
            return null;
        } else if (!(navDestination instanceof ComposeNavGraphNavigator.ComposeNavGraph) || (popExitTransition$navigation_compose_release = ((ComposeNavGraphNavigator.ComposeNavGraph) navDestination).getPopExitTransition$navigation_compose_release()) == null) {
            return null;
        } else {
            return popExitTransition$navigation_compose_release.invoke(animatedContentTransitionScope);
        }
    }

    private static final List<NavBackStackEntry> NavHost$lambda$6(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NavBackStackEntry> NavHost$lambda$10(State<? extends List<NavBackStackEntry>> state) {
        return state.getValue();
    }
}
