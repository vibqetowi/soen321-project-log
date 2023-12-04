package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "Landroidx/compose/ui/graphics/Color;", "invoke-4WTKRHQ", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$ColorSaver$1 extends Lambda implements Function2<SaverScope, Color, Object> {
    public static final SaversKt$ColorSaver$1 INSTANCE = new SaversKt$ColorSaver$1();

    SaversKt$ColorSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SaverScope saverScope, Color color) {
        return m5023invoke4WTKRHQ(saverScope, color.m3301unboximpl());
    }

    /* renamed from: invoke-4WTKRHQ  reason: not valid java name */
    public final Object m5023invoke4WTKRHQ(SaverScope Saver, long j) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        return ULong.m7440boximpl(j);
    }
}
