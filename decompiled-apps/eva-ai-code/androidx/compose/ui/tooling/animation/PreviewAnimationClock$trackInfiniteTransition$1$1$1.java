package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.animation.clock.ComposeAnimationClock;
import androidx.compose.ui.tooling.animation.clock.InfiniteTransitionClock;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PreviewAnimationClock.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreviewAnimationClock$trackInfiniteTransition$1$1$1 extends Lambda implements Function0<Long> {
    final /* synthetic */ PreviewAnimationClock this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAnimationClock$trackInfiniteTransition$1$1$1(PreviewAnimationClock previewAnimationClock) {
        super(0);
        this.this$0 = previewAnimationClock;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        List allClocksExceptInfinite;
        Long valueOf;
        allClocksExceptInfinite = this.this$0.getAllClocksExceptInfinite();
        Iterator it = allClocksExceptInfinite.iterator();
        Long l = null;
        if (it.hasNext()) {
            valueOf = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
            while (it.hasNext()) {
                Long valueOf2 = Long.valueOf(((ComposeAnimationClock) it.next()).getMaxDuration());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        Long l2 = valueOf;
        long longValue = l2 != null ? l2.longValue() : 0L;
        Iterator<T> it2 = this.this$0.getInfiniteTransitionClocks$ui_tooling_release().values().iterator();
        if (it2.hasNext()) {
            l = Long.valueOf(((InfiniteTransitionClock) it2.next()).getMaxDurationPerIteration());
            while (it2.hasNext()) {
                Long valueOf3 = Long.valueOf(((InfiniteTransitionClock) it2.next()).getMaxDurationPerIteration());
                if (l.compareTo(valueOf3) < 0) {
                    l = valueOf3;
                }
            }
        }
        Long l3 = l;
        return Long.valueOf(Math.max(longValue, l3 != null ? l3.longValue() : 0L));
    }
}
