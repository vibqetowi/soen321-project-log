package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SearchBarKt$SearchBar$2$1 extends Lambda implements Function1<WindowInsets, Unit> {
    final /* synthetic */ MutableWindowInsets $unconsumedInsets;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$2$1(MutableWindowInsets mutableWindowInsets, WindowInsets windowInsets) {
        super(1);
        this.$unconsumedInsets = mutableWindowInsets;
        this.$windowInsets = windowInsets;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WindowInsets windowInsets) {
        invoke2(windowInsets);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(WindowInsets consumedInsets) {
        Intrinsics.checkNotNullParameter(consumedInsets, "consumedInsets");
        this.$unconsumedInsets.setInsets(WindowInsetsKt.exclude(this.$windowInsets, consumedInsets));
    }
}
