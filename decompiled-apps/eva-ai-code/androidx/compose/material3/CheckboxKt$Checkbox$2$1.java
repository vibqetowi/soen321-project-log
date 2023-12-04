package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Checkbox.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CheckboxKt$Checkbox$2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ Function1<Boolean, Unit> $onCheckedChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CheckboxKt$Checkbox$2$1(Function1<? super Boolean, Unit> function1, boolean z) {
        super(0);
        this.$onCheckedChange = function1;
        this.$checked = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onCheckedChange.invoke(Boolean.valueOf(!this.$checked));
    }
}
