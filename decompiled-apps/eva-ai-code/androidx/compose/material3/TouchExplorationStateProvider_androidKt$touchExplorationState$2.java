package androidx.compose.material3;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TouchExplorationStateProvider_androidKt$touchExplorationState$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ AccessibilityManager $accessibilityManager;
    final /* synthetic */ Listener $listener;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchExplorationStateProvider_androidKt$touchExplorationState$2(Listener listener, AccessibilityManager accessibilityManager) {
        super(0);
        this.$listener = listener;
        this.$accessibilityManager = accessibilityManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$listener.unregister(this.$accessibilityManager);
    }
}
