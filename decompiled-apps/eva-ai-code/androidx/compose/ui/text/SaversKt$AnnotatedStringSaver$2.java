package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$AnnotatedStringSaver$2 extends Lambda implements Function1<Object, AnnotatedString> {
    public static final SaversKt$AnnotatedStringSaver$2 INSTANCE = new SaversKt$AnnotatedStringSaver$2();

    SaversKt$AnnotatedStringSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final AnnotatedString invoke(Object it) {
        Saver saver;
        Saver saver2;
        List list;
        List list2;
        Saver saver3;
        Intrinsics.checkNotNullParameter(it, "it");
        List list3 = (List) it;
        Object obj = list3.get(1);
        saver = SaversKt.AnnotationRangeListSaver;
        List list4 = null;
        List list5 = (Intrinsics.areEqual(obj, (Object) false) || obj == null) ? null : (List) saver.restore(obj);
        Object obj2 = list3.get(2);
        saver2 = SaversKt.AnnotationRangeListSaver;
        List list6 = (Intrinsics.areEqual(obj2, (Object) false) || obj2 == null) ? null : (List) saver2.restore(obj2);
        Object obj3 = list3.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        Intrinsics.checkNotNull(str);
        if (list5 != null) {
            List list7 = list5;
            if (list7.isEmpty()) {
                list7 = null;
            }
            list = list7;
        } else {
            list = null;
        }
        if (list6 != null) {
            List list8 = list6;
            if (list8.isEmpty()) {
                list8 = null;
            }
            list2 = list8;
        } else {
            list2 = null;
        }
        Object obj4 = list3.get(3);
        saver3 = SaversKt.AnnotationRangeListSaver;
        if (!Intrinsics.areEqual(obj4, (Object) false) && obj4 != null) {
            list4 = (List) saver3.restore(obj4);
        }
        return new AnnotatedString(str, list, list2, list4);
    }
}
