package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/ParagraphStyle;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$ParagraphStyleSaver$2 extends Lambda implements Function1<Object, ParagraphStyle> {
    public static final SaversKt$ParagraphStyleSaver$2 INSTANCE = new SaversKt$ParagraphStyleSaver$2();

    SaversKt$ParagraphStyleSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final ParagraphStyle invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        TextAlign textAlign = obj != null ? (TextAlign) obj : null;
        Object obj2 = list.get(1);
        TextDirection textDirection = obj2 != null ? (TextDirection) obj2 : null;
        Object obj3 = list.get(2);
        TextUnit restore = (Intrinsics.areEqual(obj3, (Object) false) || obj3 == null) ? null : SaversKt.getSaver(TextUnit.Companion).restore(obj3);
        Intrinsics.checkNotNull(restore);
        long m5797unboximpl = restore.m5797unboximpl();
        Object obj4 = list.get(3);
        return new ParagraphStyle(textAlign, textDirection, m5797unboximpl, (Intrinsics.areEqual(obj4, (Object) false) || obj4 == null) ? null : SaversKt.getSaver(TextIndent.Companion).restore(obj4), null, null, null, null, null, 496, null);
    }
}
