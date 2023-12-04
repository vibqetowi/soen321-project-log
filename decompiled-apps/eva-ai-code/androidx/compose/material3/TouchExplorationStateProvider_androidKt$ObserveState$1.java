package androidx.compose.material3;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: TouchExplorationStateProvider.android.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TouchExplorationStateProvider_androidKt$ObserveState$1 extends Lambda implements Function1<Lifecycle.Event, Unit> {
    public static final TouchExplorationStateProvider_androidKt$ObserveState$1 INSTANCE = new TouchExplorationStateProvider_androidKt$ObserveState$1();

    TouchExplorationStateProvider_androidKt$ObserveState$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Lifecycle.Event it) {
        Intrinsics.checkNotNullParameter(it, "it");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Lifecycle.Event event) {
        invoke2(event);
        return Unit.INSTANCE;
    }
}
