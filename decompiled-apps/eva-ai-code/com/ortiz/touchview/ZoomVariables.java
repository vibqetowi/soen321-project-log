package com.ortiz.touchview;

import android.widget.ImageView;
import kotlin.Metadata;
/* compiled from: ZoomVariables.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ortiz/touchview/ZoomVariables;", "", "scale", "", "focusX", "focusY", "scaleType", "Landroid/widget/ImageView$ScaleType;", "(FFFLandroid/widget/ImageView$ScaleType;)V", "getFocusX", "()F", "setFocusX", "(F)V", "getFocusY", "setFocusY", "getScale", "setScale", "getScaleType", "()Landroid/widget/ImageView$ScaleType;", "setScaleType", "(Landroid/widget/ImageView$ScaleType;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ZoomVariables {
    private float focusX;
    private float focusY;
    private float scale;
    private ImageView.ScaleType scaleType;

    public static /* synthetic */ ZoomVariables copy$default(ZoomVariables zoomVariables, float f, float f2, float f3, ImageView.ScaleType scaleType, int i, Object obj) {
        if ((i & 1) != 0) {
            f = zoomVariables.scale;
        }
        if ((i & 2) != 0) {
            f2 = zoomVariables.focusX;
        }
        if ((i & 4) != 0) {
            f3 = zoomVariables.focusY;
        }
        if ((i & 8) != 0) {
            scaleType = zoomVariables.scaleType;
        }
        return zoomVariables.copy(f, f2, f3, scaleType);
    }

    public final float component1() {
        return this.scale;
    }

    public final float component2() {
        return this.focusX;
    }

    public final float component3() {
        return this.focusY;
    }

    public final ImageView.ScaleType component4() {
        return this.scaleType;
    }

    public final ZoomVariables copy(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        return new ZoomVariables(f, f2, f3, scaleType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoomVariables) {
            ZoomVariables zoomVariables = (ZoomVariables) obj;
            return Float.compare(this.scale, zoomVariables.scale) == 0 && Float.compare(this.focusX, zoomVariables.focusX) == 0 && Float.compare(this.focusY, zoomVariables.focusY) == 0 && this.scaleType == zoomVariables.scaleType;
        }
        return false;
    }

    public int hashCode() {
        int floatToIntBits = ((((Float.floatToIntBits(this.scale) * 31) + Float.floatToIntBits(this.focusX)) * 31) + Float.floatToIntBits(this.focusY)) * 31;
        ImageView.ScaleType scaleType = this.scaleType;
        return floatToIntBits + (scaleType == null ? 0 : scaleType.hashCode());
    }

    public String toString() {
        float f = this.scale;
        float f2 = this.focusX;
        float f3 = this.focusY;
        ImageView.ScaleType scaleType = this.scaleType;
        return "ZoomVariables(scale=" + f + ", focusX=" + f2 + ", focusY=" + f3 + ", scaleType=" + scaleType + ")";
    }

    public ZoomVariables(float f, float f2, float f3, ImageView.ScaleType scaleType) {
        this.scale = f;
        this.focusX = f2;
        this.focusY = f3;
        this.scaleType = scaleType;
    }

    public final float getFocusX() {
        return this.focusX;
    }

    public final float getFocusY() {
        return this.focusY;
    }

    public final float getScale() {
        return this.scale;
    }

    public final ImageView.ScaleType getScaleType() {
        return this.scaleType;
    }

    public final void setFocusX(float f) {
        this.focusX = f;
    }

    public final void setFocusY(float f) {
        this.focusY = f;
    }

    public final void setScale(float f) {
        this.scale = f;
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }
}
