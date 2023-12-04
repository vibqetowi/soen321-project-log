package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: S
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$6$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
    final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
    final /* synthetic */ S $stateForContent;
    final /* synthetic */ Transition<S> $this_AnimatedContent;
    final /* synthetic */ Function1<AnimatedContentTransitionScope<S>, ContentTransform> $transitionSpec;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentKt$AnimatedContent$6$1(Transition<S> transition, S s, int i, Function1<? super AnimatedContentTransitionScope<S>, ContentTransform> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, SnapshotStateList<S> snapshotStateList, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4) {
        super(2);
        this.$this_AnimatedContent = transition;
        this.$stateForContent = s;
        this.$$dirty = i;
        this.$transitionSpec = function1;
        this.$rootScope = animatedContentTransitionScopeImpl;
        this.$currentlyVisible = snapshotStateList;
        this.$content = function4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C740@35270L38,744@35484L323,751@35840L125,756@36148L1332:AnimatedContent.kt#xbi5r1");
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885640742, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:739)");
        }
        Function1<AnimatedContentTransitionScope<S>, ContentTransform> function1 = this.$transitionSpec;
        Object obj = this.$rootScope;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        ContentTransform rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = function1.invoke(obj);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ContentTransform contentTransform = (ContentTransform) rememberedValue;
        Boolean valueOf = Boolean.valueOf(Intrinsics.areEqual(this.$this_AnimatedContent.getSegment().getTargetState(), this.$stateForContent));
        Transition<S> transition = this.$this_AnimatedContent;
        S s = this.$stateForContent;
        Function1<AnimatedContentTransitionScope<S>, ContentTransform> function12 = this.$transitionSpec;
        Object obj2 = this.$rootScope;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(valueOf);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = Intrinsics.areEqual(transition.getSegment().getTargetState(), s) ? ExitTransition.Companion.getNone() : function12.invoke(obj2).getInitialContentExit();
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        ExitTransition exitTransition = (ExitTransition) rememberedValue2;
        S s2 = this.$stateForContent;
        Transition<S> transition2 = this.$this_AnimatedContent;
        composer.startReplaceableGroup(-492369756);
        ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
        Object rememberedValue3 = composer.rememberedValue();
        if (rememberedValue3 == Composer.Companion.getEmpty()) {
            rememberedValue3 = new AnimatedContentTransitionScopeImpl.ChildData(Intrinsics.areEqual(s2, transition2.getTargetState()));
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        AnimatedContentTransitionScopeImpl.ChildData childData = (AnimatedContentTransitionScopeImpl.ChildData) rememberedValue3;
        EnterTransition targetContentEnter = contentTransform.getTargetContentEnter();
        Modifier layout = LayoutModifierKt.layout(Modifier.Companion, new AnonymousClass1(contentTransform));
        childData.setTarget(Intrinsics.areEqual(this.$stateForContent, this.$this_AnimatedContent.getTargetState()));
        AnimatedVisibilityKt.AnimatedVisibility(this.$this_AnimatedContent, new AnonymousClass3(this.$stateForContent), layout.then(childData), targetContentEnter, exitTransition, ComposableLambdaKt.composableLambda(composer, -1894897681, true, new AnonymousClass4(this.$rootScope, this.$stateForContent, this.$currentlyVisible, this.$content, this.$$dirty)), composer, 196608 | (this.$$dirty & 14), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<S, Boolean> {
        final /* synthetic */ S $stateForContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(S s) {
            super(1);
            this.$stateForContent = s;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((AnonymousClass3) obj);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(S s) {
            return Boolean.valueOf(Intrinsics.areEqual(s, this.$stateForContent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<MeasureScope, Measurable, Constraints, MeasureResult> {
        final /* synthetic */ ContentTransform $specOnEnter;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentTransform contentTransform) {
            super(3);
            this.$specOnEnter = contentTransform;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
            return m270invoke3p2s80s(measureScope, measurable, constraints.m5557unboximpl());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C00061 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
            final /* synthetic */ Placeable $placeable;
            final /* synthetic */ ContentTransform $specOnEnter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00061(Placeable placeable, ContentTransform contentTransform) {
                super(1);
                this.$placeable = placeable;
                this.$specOnEnter = contentTransform;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                layout.place(this.$placeable, 0, 0, this.$specOnEnter.getTargetContentZIndex());
            }
        }

        /* renamed from: invoke-3p2s80s  reason: not valid java name */
        public final MeasureResult m270invoke3p2s80s(MeasureScope layout, Measurable measurable, long j) {
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
            return MeasureScope.CC.layout$default(layout, mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight(), null, new C00061(mo4545measureBRTryo0, this.$specOnEnter), 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function4<AnimatedContentScope, S, Composer, Integer, Unit> $content;
        final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
        final /* synthetic */ S $stateForContent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass4(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, S s, SnapshotStateList<S> snapshotStateList, Function4<? super AnimatedContentScope, ? super S, ? super Composer, ? super Integer, Unit> function4, int i) {
            super(3);
            this.$rootScope = animatedContentTransitionScopeImpl;
            this.$stateForContent = s;
            this.$currentlyVisible = snapshotStateList;
            this.$content = function4;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AnimatedContent.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/DisposableEffectResult;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/runtime/DisposableEffectScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1  reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {
            final /* synthetic */ SnapshotStateList<S> $currentlyVisible;
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> $rootScope;
            final /* synthetic */ S $stateForContent;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SnapshotStateList<S> snapshotStateList, S s, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
                super(1);
                this.$currentlyVisible = snapshotStateList;
                this.$stateForContent = s;
                this.$rootScope = animatedContentTransitionScopeImpl;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                return invoke2(disposableEffectScope);
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final DisposableEffectResult invoke2(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final SnapshotStateList<S> snapshotStateList = this.$currentlyVisible;
                final S s = this.$stateForContent;
                final AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.$rootScope;
                return new DisposableEffectResult() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        SnapshotStateList.this.remove(s);
                        animatedContentTransitionScopeImpl.getTargetSizeMap$animation_release().remove(s);
                    }
                };
            }
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            ComposerKt.sourceInformation(composer, "C770@36930L253,*778@37345L43,779@37416L24:AnimatedContent.kt#xbi5r1");
            if ((i & 14) == 0) {
                i |= composer.changed(AnimatedVisibility) ? 4 : 2;
            }
            if ((i & 91) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1894897681, i, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:768)");
            }
            EffectsKt.DisposableEffect(AnimatedVisibility, new AnonymousClass1(this.$currentlyVisible, this.$stateForContent, this.$rootScope), composer, i & 14);
            this.$rootScope.getTargetSizeMap$animation_release().put(this.$stateForContent, ((AnimatedVisibilityScopeImpl) AnimatedVisibility).getTargetSize$animation_release());
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AnimatedContentScopeImpl(AnimatedVisibility);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            this.$content.invoke((AnimatedContentScopeImpl) rememberedValue, this.$stateForContent, composer, Integer.valueOf((this.$$dirty >> 9) & 896));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
