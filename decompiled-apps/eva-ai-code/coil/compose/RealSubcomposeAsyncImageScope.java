package coil.compose;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubcomposeAsyncImage.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0002HÂ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003JS\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\u0015\u0010,\u001a\u00020-*\u00020-2\u0006\u0010\b\u001a\u00020\tH\u0097\u0001J\r\u0010.\u001a\u00020-*\u00020-H\u0097\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcoil/compose/RealSubcomposeAsyncImageScope;", "Lcoil/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/foundation/layout/BoxScope;", "parentScope", "painter", "Lcoil/compose/AsyncImagePainter;", "contentDescription", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/foundation/layout/BoxScope;Lcoil/compose/AsyncImagePainter;Ljava/lang/String;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getAlpha", "()F", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getContentDescription", "()Ljava/lang/String;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getPainter", "()Lcoil/compose/AsyncImagePainter;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "align", "Landroidx/compose/ui/Modifier;", "matchParentSize", "coil-compose-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RealSubcomposeAsyncImageScope implements SubcomposeAsyncImageScope, BoxScope {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final String contentDescription;
    private final ContentScale contentScale;
    private final AsyncImagePainter painter;
    private final BoxScope parentScope;

    private final BoxScope component1() {
        return this.parentScope;
    }

    public static /* synthetic */ RealSubcomposeAsyncImageScope copy$default(RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope, BoxScope boxScope, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            boxScope = realSubcomposeAsyncImageScope.parentScope;
        }
        if ((i & 2) != 0) {
            asyncImagePainter = realSubcomposeAsyncImageScope.painter;
        }
        AsyncImagePainter asyncImagePainter2 = asyncImagePainter;
        if ((i & 4) != 0) {
            str = realSubcomposeAsyncImageScope.contentDescription;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            alignment = realSubcomposeAsyncImageScope.alignment;
        }
        Alignment alignment2 = alignment;
        if ((i & 16) != 0) {
            contentScale = realSubcomposeAsyncImageScope.contentScale;
        }
        ContentScale contentScale2 = contentScale;
        if ((i & 32) != 0) {
            f = realSubcomposeAsyncImageScope.alpha;
        }
        float f2 = f;
        if ((i & 64) != 0) {
            colorFilter = realSubcomposeAsyncImageScope.colorFilter;
        }
        return realSubcomposeAsyncImageScope.copy(boxScope, asyncImagePainter2, str2, alignment2, contentScale2, f2, colorFilter);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier align(Modifier modifier, Alignment alignment) {
        return this.parentScope.align(modifier, alignment);
    }

    public final AsyncImagePainter component2() {
        return this.painter;
    }

    public final String component3() {
        return this.contentDescription;
    }

    public final Alignment component4() {
        return this.alignment;
    }

    public final ContentScale component5() {
        return this.contentScale;
    }

    public final float component6() {
        return this.alpha;
    }

    public final ColorFilter component7() {
        return this.colorFilter;
    }

    public final RealSubcomposeAsyncImageScope copy(BoxScope boxScope, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        return new RealSubcomposeAsyncImageScope(boxScope, asyncImagePainter, str, alignment, contentScale, f, colorFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RealSubcomposeAsyncImageScope) {
            RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
            return Intrinsics.areEqual(this.parentScope, realSubcomposeAsyncImageScope.parentScope) && Intrinsics.areEqual(this.painter, realSubcomposeAsyncImageScope.painter) && Intrinsics.areEqual(this.contentDescription, realSubcomposeAsyncImageScope.contentDescription) && Intrinsics.areEqual(this.alignment, realSubcomposeAsyncImageScope.alignment) && Intrinsics.areEqual(this.contentScale, realSubcomposeAsyncImageScope.contentScale) && Float.compare(this.alpha, realSubcomposeAsyncImageScope.alpha) == 0 && Intrinsics.areEqual(this.colorFilter, realSubcomposeAsyncImageScope.colorFilter);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((this.parentScope.hashCode() * 31) + this.painter.hashCode()) * 31;
        String str = this.contentDescription;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.floatToIntBits(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return hashCode2 + (colorFilter != null ? colorFilter.hashCode() : 0);
    }

    @Override // androidx.compose.foundation.layout.BoxScope
    public Modifier matchParentSize(Modifier modifier) {
        return this.parentScope.matchParentSize(modifier);
    }

    public String toString() {
        return "RealSubcomposeAsyncImageScope(parentScope=" + this.parentScope + ", painter=" + this.painter + ", contentDescription=" + this.contentDescription + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public RealSubcomposeAsyncImageScope(BoxScope boxScope, AsyncImagePainter asyncImagePainter, String str, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        this.parentScope = boxScope;
        this.painter = asyncImagePainter;
        this.contentDescription = str;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public AsyncImagePainter getPainter() {
        return this.painter;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public String getContentDescription() {
        return this.contentDescription;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public Alignment getAlignment() {
        return this.alignment;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public ContentScale getContentScale() {
        return this.contentScale;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public float getAlpha() {
        return this.alpha;
    }

    @Override // coil.compose.SubcomposeAsyncImageScope
    public ColorFilter getColorFilter() {
        return this.colorFilter;
    }
}
