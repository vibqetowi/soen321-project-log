package androidx.compose.foundation;

import androidx.compose.ui.focus.FocusProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/focus/FocusProperties;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FocusableKt$focusGroup$1 extends Lambda implements Function1<FocusProperties, Unit> {
    public static final FocusableKt$focusGroup$1 INSTANCE = new FocusableKt$focusGroup$1();

    FocusableKt$focusGroup$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FocusProperties focusProperties) {
        invoke2(focusProperties);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
        focusProperties.setCanFocus(false);
    }
}
