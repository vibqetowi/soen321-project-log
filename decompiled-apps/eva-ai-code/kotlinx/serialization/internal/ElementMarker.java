package kotlinx.serialization.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
/* compiled from: ElementMarker.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u0006\u0010\u0012\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "readIfAbsent", "Lkotlin/Function2;", "", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", "highMarksArray", "", "lowerMarks", "", "mark", "", FirebaseAnalytics.Param.INDEX, "markHigh", "nextUnmarkedHighIndex", "nextUnmarkedIndex", "prepareHighMarksArray", "elementsCount", "Companion", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ElementMarker {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final long[] EMPTY_HIGH_MARKS = new long[0];
    private final SerialDescriptor descriptor;
    private final long[] highMarksArray;
    private long lowerMarks;
    private final Function2<SerialDescriptor, Integer, Boolean> readIfAbsent;

    /* JADX WARN: Multi-variable type inference failed */
    public ElementMarker(SerialDescriptor descriptor, Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.descriptor = descriptor;
        this.readIfAbsent = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.highMarksArray = EMPTY_HIGH_MARKS;
            return;
        }
        this.lowerMarks = 0L;
        this.highMarksArray = prepareHighMarksArray(elementsCount);
    }

    /* compiled from: ElementMarker.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker$Companion;", "", "()V", "EMPTY_HIGH_MARKS", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes5.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void mark(int i) {
        if (i < 64) {
            this.lowerMarks |= 1 << i;
        } else {
            markHigh(i);
        }
    }

    public final int nextUnmarkedIndex() {
        int numberOfTrailingZeros;
        int elementsCount = this.descriptor.getElementsCount();
        do {
            long j = this.lowerMarks;
            if (j == -1) {
                if (elementsCount > 64) {
                    return nextUnmarkedHighIndex();
                }
                return -1;
            }
            numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.lowerMarks |= 1 << numberOfTrailingZeros;
        } while (!this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(numberOfTrailingZeros)).booleanValue());
        return numberOfTrailingZeros;
    }

    private final long[] prepareHighMarksArray(int i) {
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            jArr[ArraysKt.getLastIndex(jArr)] = (-1) << i;
        }
        return jArr;
    }

    private final void markHigh(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.highMarksArray;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    private final int nextUnmarkedHighIndex() {
        int length = this.highMarksArray.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.highMarksArray[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i4 = numberOfTrailingZeros + i3;
                if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(i4)).booleanValue()) {
                    this.highMarksArray[i] = j;
                    return i4;
                }
            }
            this.highMarksArray[i] = j;
            i = i2;
        }
        return -1;
    }
}
