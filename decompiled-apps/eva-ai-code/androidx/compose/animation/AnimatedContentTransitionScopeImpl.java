package androidx.compose.animation;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.ParentDataModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedContent.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002UVB%\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ%\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0004\b>\u0010?JN\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u0002002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2!\u0010E\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0FH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bK\u0010LJN\u0010M\u001a\u00020N2\u0006\u0010B\u001a\u0002002\f\u0010C\u001a\b\u0012\u0004\u0012\u0002060D2!\u0010O\u001a\u001d\u0012\u0013\u0012\u00110G¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(J\u0012\u0004\u0012\u00020G0FH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bP\u0010QJ\u0017\u0010R\u001a\u00020=*\u00020=2\b\u0010S\u001a\u0004\u0018\u00010TH\u0096\u0004R%\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0080\u000eø\u0001\u0000¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u00020\f8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR4\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R)\u0010&\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0'X\u0080\u0004ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u001b\u0010.\u001a\u00020/*\u0002008BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b1\u00102R\u001b\u00103\u001a\u00020/*\u0002008BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b4\u00102\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W²\u0006\u0010\u0010X\u001a\u00020/\"\u0004\b\u0000\u0010\u0001X\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", ExifInterface.LATITUDE_SOUTH, "Landroidx/compose/animation/AnimatedContentTransitionScope;", "transition", "Landroidx/compose/animation/core/Transition;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/unit/LayoutDirection;)V", "animatedSize", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/unit/IntSize;", "getAnimatedSize$animation_release", "()Landroidx/compose/runtime/State;", "setAnimatedSize$animation_release", "(Landroidx/compose/runtime/State;)V", "getContentAlignment$animation_release", "()Landroidx/compose/ui/Alignment;", "setContentAlignment$animation_release", "(Landroidx/compose/ui/Alignment;)V", "currentSize", "getCurrentSize-YbymL2g", "()J", "initialState", "getInitialState", "()Ljava/lang/Object;", "getLayoutDirection$animation_release", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection$animation_release", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "<set-?>", "measuredSize", "getMeasuredSize-YbymL2g$animation_release", "setMeasuredSize-ozmzZPI$animation_release", "(J)V", "measuredSize$delegate", "Landroidx/compose/runtime/MutableState;", "targetSizeMap", "", "getTargetSizeMap$animation_release", "()Ljava/util/Map;", "targetState", "getTargetState", "getTransition$animation_release", "()Landroidx/compose/animation/core/Transition;", "isLeft", "", "Landroidx/compose/animation/AnimatedContentTransitionScope$SlideDirection;", "isLeft-gWo6LJ4", "(I)Z", "isRight", "isRight-gWo6LJ4", "calculateOffset", "Landroidx/compose/ui/unit/IntOffset;", "fullSize", "calculateOffset-emnUabE", "(JJ)J", "createSizeAnimationModifier", "Landroidx/compose/ui/Modifier;", "contentTransform", "Landroidx/compose/animation/ContentTransform;", "createSizeAnimationModifier$animation_release", "(Landroidx/compose/animation/ContentTransform;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "slideIntoContainer", "Landroidx/compose/animation/EnterTransition;", "towards", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "initialOffset", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "offsetForFullSlide", "slideIntoContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/EnterTransition;", "slideOutOfContainer", "Landroidx/compose/animation/ExitTransition;", "targetOffset", "slideOutOfContainer-mOhB8PU", "(ILandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;)Landroidx/compose/animation/ExitTransition;", "using", "sizeTransform", "Landroidx/compose/animation/SizeTransform;", "ChildData", "SizeModifier", "animation_release", "shouldAnimateSize"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements AnimatedContentTransitionScope<S> {
    private State<IntSize> animatedSize;
    private Alignment contentAlignment;
    private LayoutDirection layoutDirection;
    private final MutableState measuredSize$delegate;
    private final Map<S, State<IntSize>> targetSizeMap;
    private final Transition<S> transition;

    @Override // androidx.compose.animation.core.Transition.Segment
    public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
        return Transition.Segment.CC.$default$isTransitioningTo(this, obj, obj2);
    }

    public AnimatedContentTransitionScopeImpl(Transition<S> transition, Alignment contentAlignment, LayoutDirection layoutDirection) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(transition, "transition");
        Intrinsics.checkNotNullParameter(contentAlignment, "contentAlignment");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        this.transition = transition;
        this.contentAlignment = contentAlignment;
        this.layoutDirection = layoutDirection;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m5759boximpl(IntSize.Companion.m5772getZeroYbymL2g()), null, 2, null);
        this.measuredSize$delegate = mutableStateOf$default;
        this.targetSizeMap = new LinkedHashMap();
    }

    public final Transition<S> getTransition$animation_release() {
        return this.transition;
    }

    public final Alignment getContentAlignment$animation_release() {
        return this.contentAlignment;
    }

    public final void setContentAlignment$animation_release(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.contentAlignment = alignment;
    }

    public final LayoutDirection getLayoutDirection$animation_release() {
        return this.layoutDirection;
    }

    public final void setLayoutDirection$animation_release(LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getInitialState() {
        return this.transition.getSegment().getInitialState();
    }

    @Override // androidx.compose.animation.core.Transition.Segment
    public S getTargetState() {
        return this.transition.getSegment().getTargetState();
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    public ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform) {
        Intrinsics.checkNotNullParameter(contentTransform, "<this>");
        contentTransform.setSizeTransform$animation_release(sizeTransform);
        return contentTransform;
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideIntoContainer-mOhB8PU */
    public EnterTransition mo273slideIntoContainermOhB8PU(int i, FiniteAnimationSpec<IntOffset> animationSpec, Function1<? super Integer, Integer> initialOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(initialOffset, "initialOffset");
        return m294isLeftgWo6LJ4(i) ? EnterExitTransitionKt.slideInHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$1(initialOffset, this)) : m295isRightgWo6LJ4(i) ? EnterExitTransitionKt.slideInHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$2(initialOffset, this)) : AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m289getUpDKzdypw()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$3(initialOffset, this)) : AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m284getDownDKzdypw()) ? EnterExitTransitionKt.slideInVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideIntoContainer$4(initialOffset, this)) : EnterTransition.Companion.getNone();
    }

    /* renamed from: isLeft-gWo6LJ4  reason: not valid java name */
    private final boolean m294isLeftgWo6LJ4(int i) {
        return AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m286getLeftDKzdypw()) || (AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m288getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr) || (AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m285getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl);
    }

    /* renamed from: isRight-gWo6LJ4  reason: not valid java name */
    private final boolean m295isRightgWo6LJ4(int i) {
        return AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m287getRightDKzdypw()) || (AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m288getStartDKzdypw()) && this.layoutDirection == LayoutDirection.Rtl) || (AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m285getEndDKzdypw()) && this.layoutDirection == LayoutDirection.Ltr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffset-emnUabE  reason: not valid java name */
    public final long m292calculateOffsetemnUabE(long j, long j2) {
        return this.contentAlignment.mo2908alignKFBX0sM(j, j2, LayoutDirection.Ltr);
    }

    @Override // androidx.compose.animation.AnimatedContentTransitionScope
    /* renamed from: slideOutOfContainer-mOhB8PU */
    public ExitTransition mo274slideOutOfContainermOhB8PU(int i, FiniteAnimationSpec<IntOffset> animationSpec, Function1<? super Integer, Integer> targetOffset) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        Intrinsics.checkNotNullParameter(targetOffset, "targetOffset");
        return m294isLeftgWo6LJ4(i) ? EnterExitTransitionKt.slideOutHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(this, targetOffset)) : m295isRightgWo6LJ4(i) ? EnterExitTransitionKt.slideOutHorizontally(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$2(this, targetOffset)) : AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m289getUpDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$3(this, targetOffset)) : AnimatedContentTransitionScope.SlideDirection.m280equalsimpl0(i, AnimatedContentTransitionScope.SlideDirection.Companion.m284getDownDKzdypw()) ? EnterExitTransitionKt.slideOutVertically(animationSpec, new AnimatedContentTransitionScopeImpl$slideOutOfContainer$4(this, targetOffset)) : ExitTransition.Companion.getNone();
    }

    /* renamed from: getMeasuredSize-YbymL2g$animation_release  reason: not valid java name */
    public final long m296getMeasuredSizeYbymL2g$animation_release() {
        return ((IntSize) this.measuredSize$delegate.getValue()).m5771unboximpl();
    }

    /* renamed from: setMeasuredSize-ozmzZPI$animation_release  reason: not valid java name */
    public final void m297setMeasuredSizeozmzZPI$animation_release(long j) {
        this.measuredSize$delegate.setValue(IntSize.m5759boximpl(j));
    }

    public final Map<S, State<IntSize>> getTargetSizeMap$animation_release() {
        return this.targetSizeMap;
    }

    public final State<IntSize> getAnimatedSize$animation_release() {
        return this.animatedSize;
    }

    public final void setAnimatedSize$animation_release(State<IntSize> state) {
        this.animatedSize = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSize-YbymL2g  reason: not valid java name */
    public final long m293getCurrentSizeYbymL2g() {
        State<IntSize> state = this.animatedSize;
        return state != null ? state.getValue().m5771unboximpl() : m296getMeasuredSizeYbymL2g$animation_release();
    }

    public final Modifier createSizeAnimationModifier$animation_release(ContentTransform contentTransform, Composer composer, int i) {
        Modifier.Companion companion;
        Intrinsics.checkNotNullParameter(contentTransform, "contentTransform");
        composer.startReplaceableGroup(93755870);
        ComposerKt.sourceInformation(composer, "C(createSizeAnimationModifier)557@26192L40,558@26261L52,568@26730L48,569@26791L205:AnimatedContent.kt#xbi5r1");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(93755870, i, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:554)");
        }
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(this);
        Object rememberedValue = composer.rememberedValue();
        boolean z = false;
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(contentTransform.getSizeTransform(), composer, 0);
        if (Intrinsics.areEqual(this.transition.getCurrentState(), this.transition.getTargetState())) {
            createSizeAnimationModifier$lambda$3(mutableState, false);
        } else if (rememberUpdatedState.getValue() != null) {
            createSizeAnimationModifier$lambda$3(mutableState, true);
        }
        if (createSizeAnimationModifier$lambda$2(mutableState)) {
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(this.transition, VectorConvertersKt.getVectorConverter(IntSize.Companion), null, composer, 64, 2);
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed2 = composer.changed(createDeferredAnimation);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                SizeTransform sizeTransform = (SizeTransform) rememberUpdatedState.getValue();
                if (sizeTransform != null && !sizeTransform.getClip()) {
                    z = true;
                }
                Modifier.Companion companion2 = Modifier.Companion;
                if (!z) {
                    companion2 = ClipKt.clipToBounds(companion2);
                }
                rememberedValue2 = companion2.then(new SizeModifier(this, createDeferredAnimation, rememberUpdatedState));
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceableGroup();
            companion = (Modifier) rememberedValue2;
        } else {
            this.animatedSize = null;
            companion = Modifier.Companion;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return companion;
    }

    private static final boolean createSizeAnimationModifier$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void createSizeAnimationModifier$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0016\u0010\u0010\u001a\u00020\u000b*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0013"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$ChildData;", "Landroidx/compose/ui/layout/ParentDataModifier;", "isTarget", "", "(Z)V", "()Z", "setTarget", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "modifyParentData", "Landroidx/compose/ui/unit/Density;", "parentData", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class ChildData implements ParentDataModifier {
        private boolean isTarget;

        public static /* synthetic */ ChildData copy$default(ChildData childData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = childData.isTarget;
            }
            return childData.copy(z);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean all(Function1 function1) {
            return Modifier.Element.CC.$default$all(this, function1);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ boolean any(Function1 function1) {
            return Modifier.Element.CC.$default$any(this, function1);
        }

        public final boolean component1() {
            return this.isTarget;
        }

        public final ChildData copy(boolean z) {
            return new ChildData(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ChildData) && this.isTarget == ((ChildData) obj).isTarget;
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
            return Modifier.Element.CC.$default$foldIn(this, obj, function2);
        }

        @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
        public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
            return Modifier.Element.CC.$default$foldOut(this, obj, function2);
        }

        public int hashCode() {
            boolean z = this.isTarget;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        @Override // androidx.compose.ui.layout.ParentDataModifier
        public Object modifyParentData(Density density, Object obj) {
            Intrinsics.checkNotNullParameter(density, "<this>");
            return this;
        }

        @Override // androidx.compose.ui.Modifier
        public /* synthetic */ Modifier then(Modifier modifier) {
            return Modifier.CC.$default$then(this, modifier);
        }

        public String toString() {
            return "ChildData(isTarget=" + this.isTarget + ')';
        }

        public ChildData(boolean z) {
            this.isTarget = z;
        }

        public final boolean isTarget() {
            return this.isTarget;
        }

        public final void setTarget(boolean z) {
            this.isTarget = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AnimatedContent.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B6\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bø\u0001\u0000¢\u0006\u0002\u0010\nJ)\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u0002\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003R\b\u0012\u0004\u0012\u00028\u00000\u0006ø\u0001\u0000¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/AnimatedContentTransitionScopeImpl$SizeModifier;", "Landroidx/compose/animation/LayoutModifierWithPassThroughIntrinsics;", "sizeAnimation", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "Landroidx/compose/animation/core/Transition;", "sizeTransform", "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/SizeTransform;", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/runtime/State;)V", "getSizeAnimation", "()Landroidx/compose/animation/core/Transition$DeferredAnimation;", "getSizeTransform", "()Landroidx/compose/runtime/State;", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public final class SizeModifier extends LayoutModifierWithPassThroughIntrinsics {
        private final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation;
        private final State<SizeTransform> sizeTransform;
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public SizeModifier(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> sizeAnimation, State<? extends SizeTransform> sizeTransform) {
            Intrinsics.checkNotNullParameter(sizeAnimation, "sizeAnimation");
            Intrinsics.checkNotNullParameter(sizeTransform, "sizeTransform");
            this.this$0 = animatedContentTransitionScopeImpl;
            this.sizeAnimation = sizeAnimation;
            this.sizeTransform = sizeTransform;
        }

        public final Transition<S>.DeferredAnimation<IntSize, AnimationVector2D> getSizeAnimation() {
            return this.sizeAnimation;
        }

        public final State<SizeTransform> getSizeTransform() {
            return this.sizeTransform;
        }

        @Override // androidx.compose.ui.layout.LayoutModifier
        /* renamed from: measure-3p2s80s  reason: not valid java name */
        public MeasureResult mo298measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(j);
            State<IntSize> animate = this.sizeAnimation.animate(new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$1(this.this$0, this), new AnimatedContentTransitionScopeImpl$SizeModifier$measure$size$2(this.this$0));
            this.this$0.setAnimatedSize$animation_release(animate);
            return MeasureScope.CC.layout$default(measure, IntSize.m5767getWidthimpl(animate.getValue().m5771unboximpl()), IntSize.m5766getHeightimpl(animate.getValue().m5771unboximpl()), null, new AnimatedContentTransitionScopeImpl$SizeModifier$measure$1(mo4545measureBRTryo0, this.this$0.getContentAlignment$animation_release().mo2908alignKFBX0sM(IntSizeKt.IntSize(mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight()), animate.getValue().m5771unboximpl(), LayoutDirection.Ltr)), 4, null);
        }
    }
}
