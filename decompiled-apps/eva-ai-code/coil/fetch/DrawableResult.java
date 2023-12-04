package coil.fetch;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import kotlin.Metadata;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: FetchResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u0014"}, d2 = {"Lcoil/fetch/DrawableResult;", "Lcoil/fetch/FetchResult;", "drawable", "Landroid/graphics/drawable/Drawable;", "isSampled", "", "dataSource", "Lcoil/decode/DataSource;", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;)V", "getDataSource", "()Lcoil/decode/DataSource;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "copy", "equals", "other", "", "hashCode", "", "coil-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DrawableResult extends FetchResult {
    private final DataSource dataSource;
    private final Drawable drawable;
    private final boolean isSampled;

    public final Drawable getDrawable() {
        return this.drawable;
    }

    public final boolean isSampled() {
        return this.isSampled;
    }

    public final DataSource getDataSource() {
        return this.dataSource;
    }

    public DrawableResult(Drawable drawable, boolean z, DataSource dataSource) {
        super(null);
        this.drawable = drawable;
        this.isSampled = z;
        this.dataSource = dataSource;
    }

    public static /* synthetic */ DrawableResult copy$default(DrawableResult drawableResult, Drawable drawable, boolean z, DataSource dataSource, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = drawableResult.drawable;
        }
        if ((i & 2) != 0) {
            z = drawableResult.isSampled;
        }
        if ((i & 4) != 0) {
            dataSource = drawableResult.dataSource;
        }
        return drawableResult.copy(drawable, z, dataSource);
    }

    public final DrawableResult copy(Drawable drawable, boolean z, DataSource dataSource) {
        return new DrawableResult(drawable, z, dataSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawableResult) {
            DrawableResult drawableResult = (DrawableResult) obj;
            if (Intrinsics.areEqual(this.drawable, drawableResult.drawable) && this.isSampled == drawableResult.isSampled && this.dataSource == drawableResult.dataSource) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.drawable.hashCode() * 31) + UByte$$ExternalSyntheticBackport0.m(this.isSampled)) * 31) + this.dataSource.hashCode();
    }
}
