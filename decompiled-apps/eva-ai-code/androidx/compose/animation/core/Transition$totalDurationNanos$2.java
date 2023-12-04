package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Transition.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", ExifInterface.LATITUDE_SOUTH, "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Transition$totalDurationNanos$2 extends Lambda implements Function0<Long> {
    final /* synthetic */ Transition<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$totalDurationNanos$2(Transition<S> transition) {
        super(0);
        this.this$0 = transition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        SnapshotStateList<Transition.TransitionAnimationState> snapshotStateList;
        SnapshotStateList<Transition> snapshotStateList2;
        snapshotStateList = ((Transition) this.this$0)._animations;
        long j = 0;
        for (Transition.TransitionAnimationState transitionAnimationState : snapshotStateList) {
            j = Math.max(j, transitionAnimationState.getDurationNanos$animation_core_release());
        }
        snapshotStateList2 = ((Transition) this.this$0)._transitions;
        for (Transition transition : snapshotStateList2) {
            j = Math.max(j, transition.getTotalDurationNanos());
        }
        return Long.valueOf(j);
    }
}
