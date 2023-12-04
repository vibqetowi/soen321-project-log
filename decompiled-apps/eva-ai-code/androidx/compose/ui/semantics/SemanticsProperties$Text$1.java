package androidx.compose.ui.semantics;

import androidx.compose.ui.text.AnnotatedString;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SemanticsProperties.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/text/AnnotatedString;", "parentValue", "childValue", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SemanticsProperties$Text$1 extends Lambda implements Function2<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>> {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    SemanticsProperties$Text$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ List<? extends AnnotatedString> invoke(List<? extends AnnotatedString> list, List<? extends AnnotatedString> list2) {
        return invoke2((List<AnnotatedString>) list, (List<AnnotatedString>) list2);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final List<AnnotatedString> invoke2(List<AnnotatedString> list, List<AnnotatedString> childValue) {
        List<AnnotatedString> mutableList;
        Intrinsics.checkNotNullParameter(childValue, "childValue");
        if (list == null || (mutableList = CollectionsKt.toMutableList((Collection) list)) == null) {
            return childValue;
        }
        mutableList.addAll(childValue);
        return mutableList;
    }
}
