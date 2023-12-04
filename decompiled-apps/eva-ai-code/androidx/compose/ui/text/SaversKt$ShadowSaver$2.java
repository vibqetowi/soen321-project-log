package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Savers.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Shadow;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SaversKt$ShadowSaver$2 extends Lambda implements Function1<Object, Shadow> {
    public static final SaversKt$ShadowSaver$2 INSTANCE = new SaversKt$ShadowSaver$2();

    SaversKt$ShadowSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    public final Shadow invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        List list = (List) it;
        Object obj = list.get(0);
        Color restore = (Intrinsics.areEqual(obj, (Object) false) || obj == null) ? null : SaversKt.getSaver(Color.Companion).restore(obj);
        Intrinsics.checkNotNull(restore);
        long m3301unboximpl = restore.m3301unboximpl();
        Object obj2 = list.get(1);
        Offset restore2 = (Intrinsics.areEqual(obj2, (Object) false) || obj2 == null) ? null : SaversKt.getSaver(Offset.Companion).restore(obj2);
        Intrinsics.checkNotNull(restore2);
        long m3028unboximpl = restore2.m3028unboximpl();
        Object obj3 = list.get(2);
        Float f = obj3 != null ? (Float) obj3 : null;
        Intrinsics.checkNotNull(f);
        return new Shadow(m3301unboximpl, m3028unboximpl, f.floatValue(), null);
    }
}
