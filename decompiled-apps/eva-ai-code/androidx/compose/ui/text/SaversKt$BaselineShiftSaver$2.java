package androidx.compose.ui.text;

import androidx.compose.ui.text.style.BaselineShift;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/BaselineShift;", "it", "", "invoke-jTk7eUs"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$BaselineShiftSaver$2 extends Lambda implements Function1<Object, BaselineShift> {
    public static final SaversKt$BaselineShiftSaver$2 INSTANCE = new SaversKt$BaselineShiftSaver$2();

    SaversKt$BaselineShiftSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-jTk7eUs  reason: not valid java name */
    public final BaselineShift invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return BaselineShift.m5362boximpl(BaselineShift.m5363constructorimpl(((Float) it).floatValue()));
    }
}
