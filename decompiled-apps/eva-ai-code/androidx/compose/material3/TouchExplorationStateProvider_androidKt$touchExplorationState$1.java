package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TouchExplorationStateProvider_androidKt$touchExplorationState$1 extends Lambda implements Function1<Lifecycle.Event, Unit> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ Listener $listener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$touchExplorationState$1(Listener listener, AccessibilityManager accessibilityManager) {
        super(1);
        this.$listener = listener;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Lifecycle.Event event) {
        invoke2(event);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_RESUME) {
            this.$listener.register(this.$accessibilityManager);
        }
    }
}
