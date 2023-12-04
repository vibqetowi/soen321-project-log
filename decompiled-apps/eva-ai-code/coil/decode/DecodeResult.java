package coil.decode;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: DecodeResult.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001a\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u000f"}, d2 = {"Lcoil/decode/DecodeResult;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "isSampled", "", "(Landroid/graphics/drawable/Drawable;Z)V", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "copy", "equals", "other", "hashCode", "", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DecodeResult {
    private final Drawable drawable;
    private final boolean isSampled;

    public DecodeResult(Drawable drawable, boolean z) {
        this.drawable = drawable;
        this.isSampled = z;
    }

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final boolean isSampled() {
        return this.isSampled;
    }

    public static /* synthetic */ DecodeResult copy$default(DecodeResult decodeResult, Drawable drawable, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = decodeResult.drawable;
        }
        if ((i & 2) != 0) {
            z = decodeResult.isSampled;
        }
        return decodeResult.copy(drawable, z);
    }

    public final DecodeResult copy(Drawable drawable, boolean z) {
        return new DecodeResult(drawable, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DecodeResult) {
            DecodeResult decodeResult = (DecodeResult) obj;
            if (Intrinsics.areEqual(this.drawable, decodeResult.drawable) && this.isSampled == decodeResult.isSampled) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.drawable.hashCode() * 31) + UByte$$ExternalSyntheticBackport0.m(this.isSampled);
    }
}
