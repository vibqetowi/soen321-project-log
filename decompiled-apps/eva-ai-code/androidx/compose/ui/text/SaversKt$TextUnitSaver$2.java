package androidx.compose.ui.text;

import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/TextUnit;", "it", "", "invoke-XNhUCwk"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$TextUnitSaver$2 extends Lambda implements Function1<Object, TextUnit> {
    public static final SaversKt$TextUnitSaver$2 INSTANCE = new SaversKt$TextUnitSaver$2();

    SaversKt$TextUnitSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke-XNhUCwk  reason: not valid java name */
    public final TextUnit invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        Float f = obj != null ? (Float) obj : null;
        Intrinsics.checkNotNull(f);
        float floatValue = f.floatValue();
        Object obj2 = list.get(1);
        TextUnitType textUnitType = obj2 != null ? (TextUnitType) obj2 : null;
        Intrinsics.checkNotNull(textUnitType);
        return TextUnit.m5778boximpl(TextUnitKt.m5800TextUnitanM5pPY(floatValue, textUnitType.m5819unboximpl()));
    }
}
