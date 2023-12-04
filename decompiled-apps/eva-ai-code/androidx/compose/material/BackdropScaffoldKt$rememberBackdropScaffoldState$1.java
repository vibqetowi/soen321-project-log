package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BackdropScaffold.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldKt$rememberBackdropScaffoldState$1 extends Lambda implements Function1<BackdropValue, Boolean> {
    public static final BackdropScaffoldKt$rememberBackdropScaffoldState$1 INSTANCE = new BackdropScaffoldKt$rememberBackdropScaffoldState$1();

    BackdropScaffoldKt$rememberBackdropScaffoldState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(BackdropValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }
}
