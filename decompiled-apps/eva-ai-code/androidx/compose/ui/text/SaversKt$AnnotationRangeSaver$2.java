package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$AnnotationRangeSaver$2 extends Lambda implements Function1<Object, AnnotatedString.Range<? extends Object>> {
    public static final SaversKt$AnnotationRangeSaver$2 INSTANCE = new SaversKt$AnnotationRangeSaver$2();

    /* compiled from: Savers.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    SaversKt$AnnotationRangeSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final AnnotatedString.Range<? extends Object> invoke(Object it) {
        Saver saver;
        Saver saver2;
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        AnnotationType annotationType = obj != null ? (AnnotationType) obj : null;
        Intrinsics.checkNotNull(annotationType);
        Object obj2 = list.get(2);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Object obj3 = list.get(3);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.checkNotNull(num2);
        int intValue2 = num2.intValue();
        Object obj4 = list.get(4);
        String str = obj4 != null ? (String) obj4 : null;
        Intrinsics.checkNotNull(str);
        int i = WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()];
        if (i == 1) {
            Object obj5 = list.get(1);
            Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
            if (!Intrinsics.areEqual(obj5, (Object) false) && obj5 != null) {
                r2 = paragraphStyleSaver.restore(obj5);
            }
            Intrinsics.checkNotNull(r2);
            return new AnnotatedString.Range<>(r2, intValue, intValue2, str);
        } else if (i == 2) {
            Object obj6 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            if (!Intrinsics.areEqual(obj6, (Object) false) && obj6 != null) {
                r2 = spanStyleSaver.restore(obj6);
            }
            Intrinsics.checkNotNull(r2);
            return new AnnotatedString.Range<>(r2, intValue, intValue2, str);
        } else if (i == 3) {
            Object obj7 = list.get(1);
            saver = SaversKt.VerbatimTtsAnnotationSaver;
            if (!Intrinsics.areEqual(obj7, (Object) false) && obj7 != null) {
                r2 = (VerbatimTtsAnnotation) saver.restore(obj7);
            }
            Intrinsics.checkNotNull(r2);
            return new AnnotatedString.Range<>(r2, intValue, intValue2, str);
        } else if (i != 4) {
            if (i == 5) {
                Object obj8 = list.get(1);
                r2 = obj8 != null ? (String) obj8 : null;
                Intrinsics.checkNotNull(r2);
                return new AnnotatedString.Range<>(r2, intValue, intValue2, str);
            }
            throw new NoWhenBranchMatchedException();
        } else {
            Object obj9 = list.get(1);
            saver2 = SaversKt.UrlAnnotationSaver;
            if (!Intrinsics.areEqual(obj9, (Object) false) && obj9 != null) {
                r2 = (UrlAnnotation) saver2.restore(obj9);
            }
            Intrinsics.checkNotNull(r2);
            return new AnnotatedString.Range<>(r2, intValue, intValue2, str);
        }
    }
}
