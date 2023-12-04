package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: LayoutHelper.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001'B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\rJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u001a\u0010\u001f\u001a\u00020\r2\b\b\u0001\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010 \u001a\u00020\r2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u001a2\b\b\u0001\u0010\u0015\u001a\u00020\rJ\u0010\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper;", "", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "(Landroid/text/Layout;)V", "bidiProcessedParagraphs", "", "getLayout", "()Landroid/text/Layout;", "paragraphBidi", "", "Ljava/text/Bidi;", "paragraphCount", "", "getParagraphCount", "()I", "paragraphEnds", "", "tmpBuffer", "", "analyzeBidi", "paragraphIndex", "getDownstreamHorizontal", "", TypedValues.CycleType.S_WAVE_OFFSET, "primary", "", "getHorizontalPosition", "usePrimaryDirection", "upstream", "getParagraphEnd", "getParagraphForOffset", "getParagraphStart", "isLineEndSpace", "c", "", "isRtlParagraph", "lineEndToVisibleEnd", "lineEnd", "BidiRun", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LayoutHelper {
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    public final boolean isLineEndSpace(char c) {
        if (c == ' ' || c == '\n' || c == 5760) {
            return true;
        }
        return ((8192 <= c && c < 8203) && c != 8199) || c == 8287 || c == 12288;
    }

    public LayoutHelper(Layout layout) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            CharSequence text = this.layout.getText();
            Intrinsics.checkNotNullExpressionValue(text, "layout.text");
            int indexOf$default = StringsKt.indexOf$default(text, '\n', i, false, 4, (Object) null);
            i = indexOf$default < 0 ? this.layout.getText().length() : indexOf$default + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    public final Layout getLayout() {
        return this.layout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r0.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi analyzeBidi(int i) {
        Bidi bidi;
        if (this.bidiProcessedParagraphs[i]) {
            return this.paragraphBidi.get(i);
        }
        int intValue = i == 0 ? 0 : this.paragraphEnds.get(i - 1).intValue();
        int intValue2 = this.paragraphEnds.get(i).intValue();
        int i2 = intValue2 - intValue;
        char[] cArr = this.tmpBuffer;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        TextUtils.getChars(this.layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, isRtlParagraph(i) ? 1 : 0);
        }
        bidi = null;
        this.paragraphBidi.set(i, bidi);
        this.bidiProcessedParagraphs[i] = true;
        if (bidi != null) {
            char[] cArr3 = this.tmpBuffer;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.tmpBuffer = cArr2;
        return bidi;
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return layoutHelper.getParagraphForOffset(i, z);
    }

    public final int getParagraphForOffset(int i, boolean z) {
        int binarySearch$default = CollectionsKt.binarySearch$default(this.paragraphEnds, Integer.valueOf(i), 0, 0, 6, (Object) null);
        int i2 = binarySearch$default < 0 ? -(binarySearch$default + 1) : binarySearch$default + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == this.paragraphEnds.get(i3).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int getParagraphStart(int i) {
        if (i == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i - 1).intValue();
    }

    public final int getParagraphEnd(int i) {
        return this.paragraphEnds.get(i).intValue();
    }

    public final boolean isRtlParagraph(int i) {
        return this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i))) == -1;
    }

    public final float getHorizontalPosition(int i, boolean z, boolean z2) {
        int i2 = i;
        if (!z2) {
            return getDownstreamHorizontal(i, z);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout, i2, z2);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i2 != lineStart && i2 != lineEnd) {
            return getDownstreamHorizontal(i, z);
        }
        if (i2 == 0 || i2 == this.layout.getText().length()) {
            return getDownstreamHorizontal(i, z);
        }
        int paragraphForOffset = getParagraphForOffset(i2, z2);
        boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
        int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd);
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i3 = lineStart - paragraphStart;
        int i4 = lineEndToVisibleEnd - paragraphStart;
        Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi createLineBidi = analyzeBidi != null ? analyzeBidi.createLineBidi(i3, i4) : null;
        boolean z3 = false;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z || isRtlParagraph == isRtlCharAt) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i2 == lineStart) {
                z3 = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z3 = true;
            }
            Layout layout = this.layout;
            return z3 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = createLineBidi.getRunCount();
        BidiRun[] bidiRunArr = new BidiRun[runCount];
        for (int i5 = 0; i5 < runCount; i5++) {
            bidiRunArr[i5] = new BidiRun(createLineBidi.getRunStart(i5) + lineStart, createLineBidi.getRunLimit(i5) + lineStart, createLineBidi.getRunLevel(i5) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i6 = 0; i6 < runCount2; i6++) {
            bArr[i6] = (byte) createLineBidi.getRunLevel(i6);
        }
        Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
        int i7 = -1;
        if (i2 == lineStart) {
            int i8 = 0;
            while (true) {
                if (i8 >= runCount) {
                    break;
                }
                if (bidiRunArr[i8].getStart() == i2) {
                    i7 = i8;
                    break;
                }
                i8++;
            }
            BidiRun bidiRun = bidiRunArr[i7];
            if (z || isRtlParagraph == bidiRun.isRtl()) {
                isRtlParagraph = !isRtlParagraph;
            }
            if (i7 == 0 && isRtlParagraph) {
                return this.layout.getLineLeft(lineForOffset);
            }
            if (i7 != ArraysKt.getLastIndex(bidiRunArr) || isRtlParagraph) {
                if (isRtlParagraph) {
                    return this.layout.getPrimaryHorizontal(bidiRunArr[i7 - 1].getStart());
                }
                return this.layout.getPrimaryHorizontal(bidiRunArr[i7 + 1].getStart());
            }
            return this.layout.getLineRight(lineForOffset);
        }
        if (i2 > lineEndToVisibleEnd) {
            i2 = lineEndToVisibleEnd(i);
        }
        int i9 = 0;
        while (true) {
            if (i9 >= runCount) {
                break;
            }
            if (bidiRunArr[i9].getEnd() == i2) {
                i7 = i9;
                break;
            }
            i9++;
        }
        BidiRun bidiRun2 = bidiRunArr[i7];
        if (!z && isRtlParagraph != bidiRun2.isRtl()) {
            isRtlParagraph = !isRtlParagraph;
        }
        if (i7 == 0 && isRtlParagraph) {
            return this.layout.getLineLeft(lineForOffset);
        }
        if (i7 != ArraysKt.getLastIndex(bidiRunArr) || isRtlParagraph) {
            if (isRtlParagraph) {
                return this.layout.getPrimaryHorizontal(bidiRunArr[i7 - 1].getEnd());
            }
            return this.layout.getPrimaryHorizontal(bidiRunArr[i7 + 1].getEnd());
        }
        return this.layout.getLineRight(lineForOffset);
    }

    private final float getDownstreamHorizontal(int i, boolean z) {
        if (z) {
            return this.layout.getPrimaryHorizontal(i);
        }
        return this.layout.getSecondaryHorizontal(i);
    }

    /* compiled from: LayoutHelper.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/android/LayoutHelper$BidiRun;", "", TtmlNode.START, "", TtmlNode.END, "isRtl", "", "(IIZ)V", "getEnd", "()I", "()Z", "getStart", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = bidiRun.start;
            }
            if ((i3 & 2) != 0) {
                i2 = bidiRun.end;
            }
            if ((i3 & 4) != 0) {
                z = bidiRun.isRtl;
            }
            return bidiRun.copy(i, i2, z);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int i, int i2, boolean z) {
            return new BidiRun(i, i2, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BidiRun) {
                BidiRun bidiRun = (BidiRun) obj;
                return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i = ((this.start * 31) + this.end) * 31;
            boolean z = this.isRtl;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }

        public BidiRun(int i, int i2, boolean z) {
            this.start = i;
            this.end = i2;
            this.isRtl = z;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final boolean isRtl() {
            return this.isRtl;
        }
    }

    private final int lineEndToVisibleEnd(int i) {
        while (i > 0 && isLineEndSpace(this.layout.getText().charAt(i - 1))) {
            i--;
        }
        return i;
    }
}
