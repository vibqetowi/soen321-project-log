package j$.util.stream;

import androidx.recyclerview.widget.k;
import j$.time.AbstractC0689a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class Y2 extends AbstractC0735a3 implements LongConsumer {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Y2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Y2(int i6) {
        super(i6);
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j10) {
        t();
        int i6 = this.f21445b;
        this.f21445b = i6 + 1;
        ((long[]) this.f21421e)[i6] = j10;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC0689a.f(this, longConsumer);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            g((LongConsumer) consumer);
        } else if (S3.f21385a) {
            S3.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.g0.h(spliterator());
    }

    @Override // j$.util.stream.AbstractC0735a3
    public final Object newArray(int i6) {
        return new long[i6];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0735a3
    public final void o(Object obj, int i6, int i10, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i6 < i10) {
            longConsumer.accept(jArr[i6]);
            i6++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0735a3
    public final int p(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // j$.util.stream.AbstractC0735a3
    protected final Object[] s() {
        return new long[8];
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        return jArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f21446c), Arrays.toString(jArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f21446c), Arrays.toString(Arrays.copyOf(jArr, (int) k.d.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    @Override // j$.util.stream.AbstractC0735a3, java.lang.Iterable
    /* renamed from: u */
    public j$.util.L spliterator() {
        return new X2(this, 0, this.f21446c, 0, this.f21445b);
    }
}
