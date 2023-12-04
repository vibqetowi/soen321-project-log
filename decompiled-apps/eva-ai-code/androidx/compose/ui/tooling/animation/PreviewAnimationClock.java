package androidx.compose.ui.tooling.animation;

import android.util.Log;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimatedProperty;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.TransitionInfo;
import androidx.compose.ui.tooling.animation.AnimationSearch;
import androidx.compose.ui.tooling.animation.clock.AnimateXAsStateClock;
import androidx.compose.ui.tooling.animation.clock.AnimatedVisibilityClock;
import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import androidx.compose.ui.tooling.animation.clock.TransitionClock;
import androidx.compose.ui.tooling.animation.clock.UtilsKt;
import androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState;
import com.google.firebase.messaging.Constants;
import com.ifriend.data.networking.OkHttpClientProviderKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: PreviewAnimationClock.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0010\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u00105\u001a\u00020\u0004J\u001a\u00106\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0006\u00107\u001a\u000208H\u0002J\u0014\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u000b2\u0006\u00107\u001a\u000208J\u001e\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000208ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b>\u0010?J\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020AJ\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020D0\u000b2\u0006\u00107\u001a\u0002082\u0006\u0010E\u001a\u00020AJ\u0010\u0010F\u001a\u00020\u00042\u0006\u00107\u001a\u000208H\u0015J\u0010\u0010G\u001a\u00020\u00042\u0006\u00107\u001a\u000208H\u0015J\u000e\u0010H\u001a\u00020\u00042\u0006\u0010I\u001a\u00020AJ\u001a\u0010J\u001a\u00020\u00042\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020A0KJ\u000e\u0010L\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0001J\u0016\u0010M\u001a\u00020\u00042\u000e\u00107\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030NJ\u0012\u0010O\u001a\u00020\u00042\n\u00107\u001a\u0006\u0012\u0002\b\u00030PJ\"\u0010Q\u001a\u00020\u00042\n\u00107\u001a\u0006\u0012\u0002\b\u00030P2\u000e\b\u0002\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J$\u0010S\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00012\u0012\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040UH\u0002J\u0016\u0010V\u001a\u00020\u00042\u000e\u00107\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030WJ\u000e\u0010X\u001a\u00020\u00042\u0006\u00107\u001a\u00020YJ\u0016\u0010Z\u001a\u00020\u00042\u000e\u00107\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030[J\u0012\u0010\\\u001a\u00020\u00042\n\u00107\u001a\u0006\u0012\u0002\b\u00030PJ\u0018\u0010]\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u00012\u0006\u0010^\u001a\u00020\tH\u0002J\u0016\u0010_\u001a\u00020\u00042\u0006\u0010=\u001a\u0002082\u0006\u0010`\u001a\u00020\u0001J\u001e\u0010a\u001a\u00020\u00042\u0006\u0010=\u001a\u0002082\u0006\u0010b\u001a\u00020\u00012\u0006\u0010c\u001a\u00020\u0001R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR8\u0010\u0011\u001a\u001e\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0013\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00140\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R0\u0010\u0019\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R(\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R(\u0010#\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R\u000e\u0010(\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\u00010*j\b\u0012\u0004\u0012\u00020\u0001`+X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010,\u001a\u0012\u0012\u0004\u0012\u00020-0*j\b\u0012\u0004\u0012\u00020-`+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u00100R0\u00101\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u000302\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001b0\u00128\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u0016\u001a\u0004\b4\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006d"}, d2 = {"Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "", "setAnimationsTimeCallback", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", OkHttpClientProviderKt.DEBUG_KEY, "", "TAG", "", "allClocks", "", "Landroidx/compose/ui/tooling/animation/clock/ComposeAnimationClock;", "getAllClocks", "()Ljava/util/List;", "allClocksExceptInfinite", "getAllClocksExceptInfinite", "animateXAsStateClocks", "", "Landroidx/compose/ui/tooling/animation/AnimateXAsStateComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimateXAsStateClock;", "getAnimateXAsStateClocks$ui_tooling_release$annotations", "()V", "getAnimateXAsStateClocks$ui_tooling_release", "()Ljava/util/Map;", "animatedContentClocks", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/TransitionClock;", "getAnimatedContentClocks$ui_tooling_release$annotations", "getAnimatedContentClocks$ui_tooling_release", "animatedVisibilityClocks", "Landroidx/compose/ui/tooling/animation/AnimatedVisibilityComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/AnimatedVisibilityClock;", "getAnimatedVisibilityClocks$ui_tooling_release$annotations", "getAnimatedVisibilityClocks$ui_tooling_release", "infiniteTransitionClocks", "Landroidx/compose/ui/tooling/animation/InfiniteTransitionComposeAnimation;", "Landroidx/compose/ui/tooling/animation/clock/InfiniteTransitionClock;", "getInfiniteTransitionClocks$ui_tooling_release$annotations", "getInfiniteTransitionClocks$ui_tooling_release", "lock", "trackedAnimations", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "trackedUnsupportedAnimations", "Landroidx/compose/ui/tooling/animation/UnsupportedComposeAnimation;", "getTrackedUnsupportedAnimations$annotations", "getTrackedUnsupportedAnimations", "()Ljava/util/LinkedHashSet;", "transitionClocks", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "getTransitionClocks$ui_tooling_release$annotations", "getTransitionClocks$ui_tooling_release", "dispose", "findClock", "animation", "Landroidx/compose/animation/tooling/ComposeAnimation;", "getAnimatedProperties", "Landroidx/compose/animation/tooling/ComposeAnimatedProperty;", "getAnimatedVisibilityState", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "composeAnimation", "getAnimatedVisibilityState-cc2g1to", "(Landroidx/compose/animation/tooling/ComposeAnimation;)Ljava/lang/String;", "getMaxDuration", "", "getMaxDurationPerIteration", "getTransitions", "Landroidx/compose/animation/tooling/TransitionInfo;", "stepMillis", "notifySubscribe", "notifyUnsubscribe", "setClockTime", "animationTimeMillis", "setClockTimes", "", "trackAnimateContentSize", "trackAnimateXAsState", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "trackAnimatedContent", "Landroidx/compose/animation/core/Transition;", "trackAnimatedVisibility", "onSeek", "trackAnimation", "createClockAndSubscribe", "Lkotlin/Function1;", "trackDecayAnimations", "Landroidx/compose/animation/core/DecayAnimation;", "trackInfiniteTransition", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "trackTargetBasedAnimations", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackTransition", "trackUnsupported", Constants.ScionAnalytics.PARAM_LABEL, "updateAnimatedVisibilityState", "state", "updateFromAndToStates", "fromState", "toState", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public class PreviewAnimationClock {
    private final boolean DEBUG;
    private final String TAG;
    private final Map<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> animateXAsStateClocks;
    private final Map<AnimatedContentComposeAnimation<?>, TransitionClock<?>> animatedContentClocks;
    private final Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> animatedVisibilityClocks;
    private final Map<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> infiniteTransitionClocks;
    private final Object lock;
    private final Function0<Unit> setAnimationsTimeCallback;
    private final LinkedHashSet<Object> trackedAnimations;
    private final LinkedHashSet<UnsupportedComposeAnimation> trackedUnsupportedAnimations;
    private final Map<TransitionComposeAnimation<?>, TransitionClock<?>> transitionClocks;

    public PreviewAnimationClock() {
        this(null, 1, null);
    }

    public static /* synthetic */ void getAnimateXAsStateClocks$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getAnimatedContentClocks$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getAnimatedVisibilityClocks$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getInfiniteTransitionClocks$ui_tooling_release$annotations() {
    }

    public static /* synthetic */ void getTrackedUnsupportedAnimations$annotations() {
    }

    public static /* synthetic */ void getTransitionClocks$ui_tooling_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifySubscribe(ComposeAnimation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    protected void notifyUnsubscribe(ComposeAnimation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreviewAnimationClock.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.tooling.animation.PreviewAnimationClock$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    public PreviewAnimationClock(Function0<Unit> setAnimationsTimeCallback) {
        Intrinsics.checkNotNullParameter(setAnimationsTimeCallback, "setAnimationsTimeCallback");
        this.setAnimationsTimeCallback = setAnimationsTimeCallback;
        this.TAG = "PreviewAnimationClock";
        this.transitionClocks = new LinkedHashMap();
        this.animatedVisibilityClocks = new LinkedHashMap();
        this.animateXAsStateClocks = new LinkedHashMap();
        this.infiniteTransitionClocks = new LinkedHashMap();
        this.animatedContentClocks = new LinkedHashMap();
        this.trackedUnsupportedAnimations = new LinkedHashSet<>();
        this.trackedAnimations = new LinkedHashSet<>();
        this.lock = new Object();
    }

    public /* synthetic */ PreviewAnimationClock(AnonymousClass1 anonymousClass1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnonymousClass1.INSTANCE : anonymousClass1);
    }

    public final Map<TransitionComposeAnimation<?>, TransitionClock<?>> getTransitionClocks$ui_tooling_release() {
        return this.transitionClocks;
    }

    public final Map<AnimatedVisibilityComposeAnimation, AnimatedVisibilityClock> getAnimatedVisibilityClocks$ui_tooling_release() {
        return this.animatedVisibilityClocks;
    }

    public final Map<AnimateXAsStateComposeAnimation<?, ?>, AnimateXAsStateClock<?, ?>> getAnimateXAsStateClocks$ui_tooling_release() {
        return this.animateXAsStateClocks;
    }

    public final Map<InfiniteTransitionComposeAnimation, InfiniteTransitionClock> getInfiniteTransitionClocks$ui_tooling_release() {
        return this.infiniteTransitionClocks;
    }

    public final Map<AnimatedContentComposeAnimation<?>, TransitionClock<?>> getAnimatedContentClocks$ui_tooling_release() {
        return this.animatedContentClocks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ComposeAnimationClock<?, ?>> getAllClocksExceptInfinite() {
        return CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) CollectionsKt.plus((Collection) this.transitionClocks.values(), (Iterable) this.animatedVisibilityClocks.values()), (Iterable) this.animateXAsStateClocks.values()), (Iterable) this.animatedContentClocks.values());
    }

    private final List<ComposeAnimationClock<?, ?>> getAllClocks() {
        return CollectionsKt.plus((Collection) getAllClocksExceptInfinite(), (Iterable) this.infiniteTransitionClocks.values());
    }

    private final ComposeAnimationClock<?, ?> findClock(ComposeAnimation composeAnimation) {
        InfiniteTransitionClock infiniteTransitionClock = this.transitionClocks.get(composeAnimation);
        return (infiniteTransitionClock == null && (infiniteTransitionClock = this.animatedVisibilityClocks.get(composeAnimation)) == null && (infiniteTransitionClock = this.animateXAsStateClocks.get(composeAnimation)) == null && (infiniteTransitionClock = this.infiniteTransitionClocks.get(composeAnimation)) == null) ? this.animatedContentClocks.get(composeAnimation) : infiniteTransitionClock;
    }

    public final void trackTransition(Transition<?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        trackAnimation(animation, new PreviewAnimationClock$trackTransition$1(animation, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackAnimatedVisibility$default(PreviewAnimationClock previewAnimationClock, Transition transition, Function0 function0, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackAnimatedVisibility");
        }
        if ((i & 2) != 0) {
            function0 = PreviewAnimationClock$trackAnimatedVisibility$1.INSTANCE;
        }
        previewAnimationClock.trackAnimatedVisibility(transition, function0);
    }

    public final void trackAnimatedVisibility(Transition<?> animation, Function0<Unit> onSeek) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(onSeek, "onSeek");
        if (animation.getCurrentState() instanceof Boolean) {
            trackAnimation(animation, new PreviewAnimationClock$trackAnimatedVisibility$2(animation, onSeek, this));
        }
    }

    public final void trackAnimateXAsState(AnimationSearch.AnimateXAsStateSearchInfo<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        trackAnimation(animation.getAnimatable(), new PreviewAnimationClock$trackAnimateXAsState$1(animation, this));
    }

    public final void trackAnimateContentSize(Object animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        trackUnsupported(animation, "animateContentSize");
    }

    public final void trackTargetBasedAnimations(TargetBasedAnimation<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        trackUnsupported(animation, "TargetBasedAnimation");
    }

    public final void trackDecayAnimations(DecayAnimation<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        trackUnsupported(animation, "DecayAnimation");
    }

    public final void trackAnimatedContent(Transition<?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        trackAnimation(animation, new PreviewAnimationClock$trackAnimatedContent$1(animation, this));
    }

    public final void trackInfiniteTransition(AnimationSearch.InfiniteTransitionSearchInfo animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        trackAnimation(animation.getInfiniteTransition(), new PreviewAnimationClock$trackInfiniteTransition$1(animation, this));
    }

    public final LinkedHashSet<UnsupportedComposeAnimation> getTrackedUnsupportedAnimations() {
        return this.trackedUnsupportedAnimations;
    }

    private final void trackUnsupported(Object obj, String str) {
        trackAnimation(obj, new PreviewAnimationClock$trackUnsupported$1(str, this));
    }

    private final boolean trackAnimation(Object obj, Function1<Object, Unit> function1) {
        synchronized (this.lock) {
            if (this.trackedAnimations.contains(obj)) {
                if (this.DEBUG) {
                    String str = this.TAG;
                    Log.d(str, "Animation " + obj + " is already being tracked");
                }
                return false;
            }
            this.trackedAnimations.add(obj);
            function1.invoke(obj);
            if (this.DEBUG) {
                String str2 = this.TAG;
                Log.d(str2, "Animation " + obj + " is now tracked");
                return true;
            }
            return true;
        }
    }

    public final void updateFromAndToStates(ComposeAnimation composeAnimation, Object fromState, Object toState) {
        Intrinsics.checkNotNullParameter(composeAnimation, "composeAnimation");
        Intrinsics.checkNotNullParameter(fromState, "fromState");
        Intrinsics.checkNotNullParameter(toState, "toState");
        ComposeAnimationClock<?, ?> findClock = findClock(composeAnimation);
        if (findClock != null) {
            findClock.setStateParameters(fromState, toState);
        }
    }

    public final void updateAnimatedVisibilityState(ComposeAnimation composeAnimation, Object state) {
        Intrinsics.checkNotNullParameter(composeAnimation, "composeAnimation");
        Intrinsics.checkNotNullParameter(state, "state");
        AnimatedVisibilityClock animatedVisibilityClock = this.animatedVisibilityClocks.get(composeAnimation);
        if (animatedVisibilityClock != null) {
            ComposeAnimationClock.CC.setStateParameters$default(animatedVisibilityClock, state, null, 2, null);
        }
    }

    /* renamed from: getAnimatedVisibilityState-cc2g1to  reason: not valid java name */
    public final String m5526getAnimatedVisibilityStatecc2g1to(ComposeAnimation composeAnimation) {
        Intrinsics.checkNotNullParameter(composeAnimation, "composeAnimation");
        AnimatedVisibilityClock animatedVisibilityClock = this.animatedVisibilityClocks.get(composeAnimation);
        return animatedVisibilityClock != null ? animatedVisibilityClock.m5528getStatejXw82LU() : AnimatedVisibilityState.Companion.m5537getEnterjXw82LU();
    }

    public final long getMaxDuration() {
        Long l;
        Iterator<T> it = getAllClocks().iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        Long l2 = l;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public final long getMaxDurationPerIteration() {
        Long l;
        Iterator<T> it = getAllClocks().iterator();
        if (it.hasNext()) {
            Long valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDurationPerIteration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            l = valueOf;
        } else {
            l = null;
        }
        Long l2 = l;
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public final List<ComposeAnimatedProperty> getAnimatedProperties(ComposeAnimation animation) {
        List<ComposeAnimatedProperty> animatedProperties;
        Intrinsics.checkNotNullParameter(animation, "animation");
        ComposeAnimationClock<?, ?> findClock = findClock(animation);
        return (findClock == null || (animatedProperties = findClock.getAnimatedProperties()) == null) ? CollectionsKt.emptyList() : animatedProperties;
    }

    public final List<TransitionInfo> getTransitions(ComposeAnimation animation, long j) {
        List<TransitionInfo> transitions;
        Intrinsics.checkNotNullParameter(animation, "animation");
        ComposeAnimationClock<?, ?> findClock = findClock(animation);
        return (findClock == null || (transitions = findClock.getTransitions(j)) == null) ? CollectionsKt.emptyList() : transitions;
    }

    public final void setClockTime(long j) {
        long millisToNanos = UtilsKt.millisToNanos(j);
        Iterator<T> it = getAllClocks().iterator();
        while (it.hasNext()) {
            ((ComposeAnimationClock) it.next()).setClockTime(millisToNanos);
        }
        this.setAnimationsTimeCallback.invoke();
    }

    public final void dispose() {
        Iterator<T> it = getAllClocks().iterator();
        while (it.hasNext()) {
            notifyUnsubscribe(((ComposeAnimationClock) it.next()).getAnimation());
        }
        for (UnsupportedComposeAnimation unsupportedComposeAnimation : this.trackedUnsupportedAnimations) {
            notifyUnsubscribe(unsupportedComposeAnimation);
        }
        this.trackedUnsupportedAnimations.clear();
        this.transitionClocks.clear();
        this.animatedVisibilityClocks.clear();
        this.trackedAnimations.clear();
    }

    public final void setClockTimes(Map<ComposeAnimation, Long> animationTimeMillis) {
        Intrinsics.checkNotNullParameter(animationTimeMillis, "animationTimeMillis");
        for (Map.Entry<ComposeAnimation, Long> entry : animationTimeMillis.entrySet()) {
            long longValue = entry.getValue().longValue();
            ComposeAnimationClock<?, ?> findClock = findClock(entry.getKey());
            if (findClock != null) {
                findClock.setClockTime(UtilsKt.millisToNanos(longValue));
            }
        }
        this.setAnimationsTimeCallback.invoke();
    }
}
