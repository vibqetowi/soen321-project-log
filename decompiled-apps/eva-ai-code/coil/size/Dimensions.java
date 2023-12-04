package coil.size;

import coil.size.Dimension;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: Dimension.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0086\b¨\u0006\b"}, d2 = {"Dimension", "Lcoil/size/Dimension$Pixels;", "px", "", "pxOrElse", "Lcoil/size/Dimension;", "block", "Lkotlin/Function0;", "coil-base_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: coil.size.-Dimensions  reason: invalid class name */
/* loaded from: classes2.dex */
public final class Dimensions {
    public static final Dimension.Pixels Dimension(int i) {
        return new Dimension.Pixels(i);
    }

    public static final int pxOrElse(Dimension dimension, Function0<Integer> function0) {
        return dimension instanceof Dimension.Pixels ? ((Dimension.Pixels) dimension).px : function0.invoke().intValue();
    }
}
