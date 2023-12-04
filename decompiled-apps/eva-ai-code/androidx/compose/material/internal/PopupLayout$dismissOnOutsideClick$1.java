package androidx.compose.material.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.IntRect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "bounds", "Landroidx/compose/ui/unit/IntRect;", "invoke-KMgbckE", "(Landroidx/compose/ui/geometry/Offset;Landroidx/compose/ui/unit/IntRect;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PopupLayout$dismissOnOutsideClick$1 extends Lambda implements Function2<Offset, IntRect, Boolean> {
    public static final PopupLayout$dismissOnOutsideClick$1 INSTANCE = new PopupLayout$dismissOnOutsideClick$1();

    PopupLayout$dismissOnOutsideClick$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke-KMgbckE  reason: not valid java name */
    public final Boolean invoke(Offset offset, IntRect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        boolean z = false;
        if (offset != null && (Offset.m3018getXimpl(offset.m3028unboximpl()) < bounds.getLeft() || Offset.m3018getXimpl(offset.m3028unboximpl()) > bounds.getRight() || Offset.m3019getYimpl(offset.m3028unboximpl()) < bounds.getTop() || Offset.m3019getYimpl(offset.m3028unboximpl()) > bounds.getBottom())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
