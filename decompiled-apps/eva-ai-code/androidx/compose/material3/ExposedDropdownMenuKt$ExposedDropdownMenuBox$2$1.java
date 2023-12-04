package androidx.compose.material3;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExposedDropdownMenu.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ FocusRequester $focusRequester;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$2$1(boolean z, FocusRequester focusRequester) {
        super(0);
        this.$expanded = z;
        this.$focusRequester = focusRequester;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$expanded) {
            this.$focusRequester.requestFocus();
        }
    }
}
