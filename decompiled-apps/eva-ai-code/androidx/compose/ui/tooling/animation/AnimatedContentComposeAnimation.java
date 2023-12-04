package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.messaging.Constants;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: AnimatedContentComposeAnimation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0016B-\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/animation/tooling/ComposeAnimation;", "Landroidx/compose/ui/tooling/animation/TransitionBasedAnimation;", "animationObject", "Landroidx/compose/animation/core/Transition;", "states", "", "", Constants.ScionAnalytics.PARAM_LABEL, "", "(Landroidx/compose/animation/core/Transition;Ljava/util/Set;Ljava/lang/String;)V", "getAnimationObject", "()Landroidx/compose/animation/core/Transition;", "getLabel", "()Ljava/lang/String;", "getStates", "()Ljava/util/Set;", "type", "Landroidx/compose/animation/tooling/ComposeAnimationType;", "getType", "()Landroidx/compose/animation/tooling/ComposeAnimationType;", "Companion", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimatedContentComposeAnimation<T> implements ComposeAnimation, TransitionBasedAnimation<T> {
    public static final Companion Companion = new Companion(null);
    private static boolean apiAvailable;
    private final Transition<T> animationObject;
    private final String label;
    private final Set<Object> states;
    private final ComposeAnimationType type;

    public /* synthetic */ AnimatedContentComposeAnimation(Transition transition, Set set, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(transition, set, str);
    }

    private AnimatedContentComposeAnimation(Transition<T> transition, Set<? extends Object> set, String str) {
        this.animationObject = transition;
        this.states = set;
        this.label = str;
        this.type = ComposeAnimationType.ANIMATED_CONTENT;
    }

    @Override // androidx.compose.ui.tooling.animation.TransitionBasedAnimation
    public Transition<T> getAnimationObject() {
        return this.animationObject;
    }

    public Set<Object> getStates() {
        return this.states;
    }

    public String getLabel() {
        return this.label;
    }

    public ComposeAnimationType getType() {
        return this.type;
    }

    /* compiled from: AnimatedContentComposeAnimation.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004J\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\rR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation$Companion;", "", "()V", "<set-?>", "", "apiAvailable", "getApiAvailable", "()Z", "testOverrideAvailability", "", "override", "parseAnimatedContent", "Landroidx/compose/ui/tooling/animation/AnimatedContentComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean getApiAvailable() {
            return AnimatedContentComposeAnimation.apiAvailable;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
            if (r2 == null) goto L16;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AnimatedContentComposeAnimation<?> parseAnimatedContent(Transition<?> transition) {
            Object currentState;
            Set of;
            Intrinsics.checkNotNullParameter(transition, "<this>");
            if (getApiAvailable() && (currentState = transition.getCurrentState()) != null) {
                Object[] enumConstants = currentState.getClass().getEnumConstants();
                if (enumConstants != null) {
                    Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
                    of = ArraysKt.toSet(enumConstants);
                }
                of = SetsKt.setOf(currentState);
                String label = transition.getLabel();
                if (label == null) {
                    label = Reflection.getOrCreateKotlinClass(currentState.getClass()).getSimpleName();
                }
                return new AnimatedContentComposeAnimation<>(transition, of, label, null);
            }
            return null;
        }

        public final void testOverrideAvailability(boolean z) {
            AnimatedContentComposeAnimation.apiAvailable = z;
        }
    }

    static {
        ComposeAnimationType[] values = ComposeAnimationType.values();
        int length = values.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (Intrinsics.areEqual(values[i].name(), "ANIMATED_CONTENT")) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        apiAvailable = z;
    }
}
