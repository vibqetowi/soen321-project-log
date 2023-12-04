package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AnimatedVisibility.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0017R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition$annotations", "()V", "getTransition", "()Landroidx/compose/animation/core/Transition;", "animateEnterExit", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", "exit", "Landroidx/compose/animation/ExitTransition;", Constants.ScionAnalytics.PARAM_LABEL, "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AnimatedVisibilityScope {
    Modifier animateEnterExit(Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str);

    Transition<EnterExitState> getTransition();

    /* compiled from: AnimatedVisibility.kt */
    /* renamed from: androidx.compose.animation.AnimatedVisibilityScope$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    enterTransition = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
                }
                if ((i & 2) != 0) {
                    exitTransition = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
                }
                if ((i & 4) != 0) {
                    str = "animateEnterExit";
                }
                return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
        }

        public static Modifier $default$animateEnterExit(AnimatedVisibilityScope _this, Modifier modifier, EnterTransition enter, ExitTransition exit, String label) {
            Intrinsics.checkNotNullParameter(modifier, "<this>");
            Intrinsics.checkNotNullParameter(enter, "enter");
            Intrinsics.checkNotNullParameter(exit, "exit");
            Intrinsics.checkNotNullParameter(label, "label");
            return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1(enter, exit, label) : InspectableValueKt.getNoInspectorInfo(), new AnimatedVisibilityScope$animateEnterExit$2(_this, enter, exit, label));
        }
    }

    /* compiled from: AnimatedVisibility.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void getTransition$annotations() {
        }

        @Deprecated
        public static Modifier animateEnterExit(AnimatedVisibilityScope animatedVisibilityScope, Modifier receiver, EnterTransition enter, ExitTransition exit, String label) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(enter, "enter");
            Intrinsics.checkNotNullParameter(exit, "exit");
            Intrinsics.checkNotNullParameter(label, "label");
            return CC.$default$animateEnterExit(animatedVisibilityScope, receiver, enter, exit, label);
        }
    }
}
