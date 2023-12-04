package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TouchExplorationStateProvider_androidKt$touchExplorationState$3$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ Listener $listener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$touchExplorationState$3$1(Listener listener) {
        super(0);
        this.$listener = listener;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.$listener.isEnabled());
    }
}
