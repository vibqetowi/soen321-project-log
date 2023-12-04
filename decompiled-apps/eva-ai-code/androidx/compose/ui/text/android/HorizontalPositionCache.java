package androidx.compose.ui.text.android;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: TextLayout.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", TtmlNode.TAG_LAYOUT, "Landroidx/compose/ui/text/android/TextLayout;", "(Landroidx/compose/ui/text/android/TextLayout;)V", "cachedKey", "", "cachedValue", "", "getLayout", "()Landroidx/compose/ui/text/android/TextLayout;", "get", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "", "cache", "primary", "getPrimaryDownstream", "getPrimaryUpstream", "getSecondaryDownstream", "getSecondaryUpstream", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HorizontalPositionCache {
    private int cachedKey;
    private float cachedValue;
    private final TextLayout layout;

    public HorizontalPositionCache(TextLayout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        this.cachedKey = -1;
    }

    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryDownstream(int i) {
        return get(i, false, false, true);
    }

    public final float getPrimaryUpstream(int i) {
        return get(i, true, true, true);
    }

    public final float getSecondaryDownstream(int i) {
        return get(i, false, false, false);
    }

    public final float getSecondaryUpstream(int i) {
        return get(i, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float get(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        float secondaryHorizontal;
        int i3 = 1;
        if (z) {
            int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout.getLayout(), i, z);
            int lineStart = this.layout.getLineStart(lineForOffset);
            int lineEnd = this.layout.getLineEnd(lineForOffset);
            if (i == lineStart || i == lineEnd) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.cachedKey != i2) {
                    return this.cachedValue;
                }
                if (z3) {
                    secondaryHorizontal = this.layout.getPrimaryHorizontal(i, z);
                } else {
                    secondaryHorizontal = this.layout.getSecondaryHorizontal(i, z);
                }
                if (z2) {
                    this.cachedKey = i2;
                    this.cachedValue = secondaryHorizontal;
                }
                return secondaryHorizontal;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.cachedKey != i2) {
        }
    }
}
