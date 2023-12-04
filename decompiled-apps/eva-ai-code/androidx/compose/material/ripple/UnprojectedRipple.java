package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RippleHostView.android.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001a\u001bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J#\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple;", "Landroid/graphics/drawable/RippleDrawable;", "bounded", "", "(Z)V", "projected", "rippleColor", "Landroidx/compose/ui/graphics/Color;", "rippleRadius", "", "Ljava/lang/Integer;", "calculateRippleColor", "color", "alpha", "", "calculateRippleColor-5vOe2sY", "(JF)J", "getDirtyBounds", "Landroid/graphics/Rect;", "isProjected", "setColor", "", "setColor-DxMtmZc", "(JF)V", "trySetRadius", "radius", "Companion", "MRadiusHelper", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UnprojectedRipple extends RippleDrawable {
    public static final Companion Companion = new Companion(null);
    private static boolean setMaxRadiusFetched;
    private static Method setMaxRadiusMethod;
    private final boolean bounded;
    private boolean projected;
    private Color rippleColor;
    private Integer rippleRadius;

    public UnprojectedRipple(boolean z) {
        super(ColorStateList.valueOf(-16777216), null, z ? new ColorDrawable(-1) : null);
        this.bounded = z;
    }

    /* renamed from: setColor-DxMtmZc  reason: not valid java name */
    public final void m1564setColorDxMtmZc(long j, float f) {
        long m1563calculateRippleColor5vOe2sY = m1563calculateRippleColor5vOe2sY(j, f);
        Color color = this.rippleColor;
        if (color == null ? false : Color.m3292equalsimpl0(color.m3301unboximpl(), m1563calculateRippleColor5vOe2sY)) {
            return;
        }
        this.rippleColor = Color.m3281boximpl(m1563calculateRippleColor5vOe2sY);
        setColor(ColorStateList.valueOf(ColorKt.m3345toArgb8_81llA(m1563calculateRippleColor5vOe2sY)));
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.projected;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.bounded) {
            this.projected = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        Intrinsics.checkNotNullExpressionValue(dirtyBounds, "super.getDirtyBounds()");
        this.projected = false;
        return dirtyBounds;
    }

    public final void trySetRadius(int i) {
        Integer num = this.rippleRadius;
        if (num != null && num.intValue() == i) {
            return;
        }
        this.rippleRadius = Integer.valueOf(i);
        MRadiusHelper.INSTANCE.setRadius(this, i);
    }

    /* renamed from: calculateRippleColor-5vOe2sY  reason: not valid java name */
    private final long m1563calculateRippleColor5vOe2sY(long j, float f) {
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        return Color.m3290copywmQWz5c$default(j, RangesKt.coerceAtMost(f, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RippleHostView.android.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$MRadiusHelper;", "", "()V", "setRadius", "", "ripple", "Landroid/graphics/drawable/RippleDrawable;", "radius", "", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class MRadiusHelper {
        public static final MRadiusHelper INSTANCE = new MRadiusHelper();

        private MRadiusHelper() {
        }

        public final void setRadius(RippleDrawable ripple, int i) {
            Intrinsics.checkNotNullParameter(ripple, "ripple");
            ripple.setRadius(i);
        }
    }

    /* compiled from: RippleHostView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$Companion;", "", "()V", "setMaxRadiusFetched", "", "setMaxRadiusMethod", "Ljava/lang/reflect/Method;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
