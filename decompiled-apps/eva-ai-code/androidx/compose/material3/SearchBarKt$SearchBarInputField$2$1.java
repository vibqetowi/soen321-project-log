package androidx.compose.material3;

import androidx.compose.ui.focus.FocusState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SearchBar.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SearchBarKt$SearchBarInputField$2$1 extends Lambda implements Function1<FocusState, Unit> {
    final /* synthetic */ Function1<Boolean, Unit> $onActiveChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SearchBarKt$SearchBarInputField$2$1(Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$onActiveChange = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
        invoke2(focusState);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.isFocused()) {
            this.$onActiveChange.invoke(true);
        }
    }
}
