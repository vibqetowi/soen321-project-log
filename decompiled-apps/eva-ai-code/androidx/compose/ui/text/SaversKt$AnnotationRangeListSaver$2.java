package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$AnnotationRangeListSaver$2 extends Lambda implements Function1<Object, List<? extends AnnotatedString.Range<? extends Object>>> {
    public static final SaversKt$AnnotationRangeListSaver$2 INSTANCE = new SaversKt$AnnotationRangeListSaver$2();

    SaversKt$AnnotationRangeListSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends AnnotatedString.Range<? extends Object>> invoke(Object it) {
        Saver saver;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ArrayList arrayList2 = arrayList;
            saver = SaversKt.AnnotationRangeSaver;
            AnnotatedString.Range range = null;
            if (!Intrinsics.areEqual(obj, (Object) false) && obj != null) {
                range = (AnnotatedString.Range) saver.restore(obj);
            }
            Intrinsics.checkNotNull(range);
            arrayList2.add(range);
        }
        return arrayList;
    }
}
