package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SwipeableV2.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwipeableV2Kt$rememberSwipeableV2State$1 extends Lambda implements Function1<T, Boolean> {
    public static final SwipeableV2Kt$rememberSwipeableV2State$1 INSTANCE = new SwipeableV2Kt$rememberSwipeableV2State$1();

    SwipeableV2Kt$rememberSwipeableV2State$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(T it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((SwipeableV2Kt$rememberSwipeableV2State$1) obj);
    }
}
