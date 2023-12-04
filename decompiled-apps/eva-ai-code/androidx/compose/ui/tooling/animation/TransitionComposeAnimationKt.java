package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
/* compiled from: TransitionComposeAnimation.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0002H\u0000¨\u0006\u0003"}, d2 = {"parse", "Landroidx/compose/ui/tooling/animation/TransitionComposeAnimation;", "Landroidx/compose/animation/core/Transition;", "ui-tooling_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransitionComposeAnimationKt {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TransitionComposeAnimation<?> parse(Transition<?> transition) {
        Set of;
        Intrinsics.checkNotNullParameter(transition, "<this>");
        Object currentState = transition.getCurrentState();
        if (currentState != null) {
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
            return new TransitionComposeAnimation<>(transition, of, label);
        }
        return null;
    }
}
