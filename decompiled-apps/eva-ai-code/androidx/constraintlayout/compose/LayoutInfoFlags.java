package androidx.constraintlayout.compose;

import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: MotionLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/constraintlayout/compose/LayoutInfoFlags;", "", "(Ljava/lang/String;I)V", "NONE", "BOUNDS", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public enum LayoutInfoFlags {
    NONE,
    BOUNDS;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LayoutInfoFlags[] valuesCustom() {
        LayoutInfoFlags[] valuesCustom = values();
        return (LayoutInfoFlags[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
