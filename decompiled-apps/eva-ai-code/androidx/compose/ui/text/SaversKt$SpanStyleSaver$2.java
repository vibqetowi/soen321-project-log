package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/SpanStyle;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$SpanStyleSaver$2 extends Lambda implements Function1<Object, SpanStyle> {
    public static final SaversKt$SpanStyleSaver$2 INSTANCE = new SaversKt$SpanStyleSaver$2();

    SaversKt$SpanStyleSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final SpanStyle invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        Color restore = (Intrinsics.areEqual(obj, (Object) false) || obj == null) ? null : SaversKt.getSaver(Color.Companion).restore(obj);
        Intrinsics.checkNotNull(restore);
        long m3301unboximpl = restore.m3301unboximpl();
        Object obj2 = list.get(1);
        TextUnit restore2 = (Intrinsics.areEqual(obj2, (Object) false) || obj2 == null) ? null : SaversKt.getSaver(TextUnit.Companion).restore(obj2);
        Intrinsics.checkNotNull(restore2);
        long m5797unboximpl = restore2.m5797unboximpl();
        Object obj3 = list.get(2);
        FontWeight restore3 = (Intrinsics.areEqual(obj3, (Object) false) || obj3 == null) ? null : SaversKt.getSaver(FontWeight.Companion).restore(obj3);
        Object obj4 = list.get(3);
        FontStyle fontStyle = obj4 != null ? (FontStyle) obj4 : null;
        Object obj5 = list.get(4);
        FontSynthesis fontSynthesis = obj5 != null ? (FontSynthesis) obj5 : null;
        Object obj6 = list.get(6);
        String str = obj6 != null ? (String) obj6 : null;
        Object obj7 = list.get(7);
        TextUnit restore4 = (Intrinsics.areEqual(obj7, (Object) false) || obj7 == null) ? null : SaversKt.getSaver(TextUnit.Companion).restore(obj7);
        Intrinsics.checkNotNull(restore4);
        long m5797unboximpl2 = restore4.m5797unboximpl();
        Object obj8 = list.get(8);
        BaselineShift restore5 = (Intrinsics.areEqual(obj8, (Object) false) || obj8 == null) ? null : SaversKt.getSaver(BaselineShift.Companion).restore(obj8);
        Object obj9 = list.get(9);
        TextGeometricTransform restore6 = (Intrinsics.areEqual(obj9, (Object) false) || obj9 == null) ? null : SaversKt.getSaver(TextGeometricTransform.Companion).restore(obj9);
        Object obj10 = list.get(10);
        LocaleList restore7 = (Intrinsics.areEqual(obj10, (Object) false) || obj10 == null) ? null : SaversKt.getSaver(LocaleList.Companion).restore(obj10);
        Object obj11 = list.get(11);
        Color restore8 = (Intrinsics.areEqual(obj11, (Object) false) || obj11 == null) ? null : SaversKt.getSaver(Color.Companion).restore(obj11);
        Intrinsics.checkNotNull(restore8);
        long m3301unboximpl2 = restore8.m3301unboximpl();
        Object obj12 = list.get(12);
        TextDecoration restore9 = (Intrinsics.areEqual(obj12, (Object) false) || obj12 == null) ? null : SaversKt.getSaver(TextDecoration.Companion).restore(obj12);
        Object obj13 = list.get(13);
        return new SpanStyle(m3301unboximpl, m5797unboximpl, restore3, fontStyle, fontSynthesis, (FontFamily) null, str, m5797unboximpl2, restore5, restore6, restore7, m3301unboximpl2, restore9, (Intrinsics.areEqual(obj13, (Object) false) || obj13 == null) ? null : SaversKt.getSaver(Shadow.Companion).restore(obj13), (PlatformSpanStyle) null, (DrawStyle) null, 49184, (DefaultConstructorMarker) null);
    }
}
