package j$.util.stream;

import androidx.recyclerview.widget.k;
import j$.time.AbstractC0689a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class W2 extends AbstractC0735a3 implements IntConsumer {
    /* JADX INFO: Access modifiers changed from: package-private */
    public W2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public W2(int i6) {
        super(i6);
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i6) {
        t();
        int i10 = this.f21445b;
        this.f21445b = i10 + 1;
        ((int[]) this.f21421e)[i10] = i6;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g((IntConsumer) consumer);
        } else if (S3.f21385a) {
            S3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.g0.g(spliterator());
    }

    @Override // j$.util.stream.AbstractC0735a3
    public final Object newArray(int i6) {
        return new int[i6];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0735a3
    public final void o(Object obj, int i6, int i10, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i6 < i10) {
            intConsumer.accept(iArr[i6]);
            i6++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0735a3
    public final int p(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.AbstractC0735a3
    protected final Object[] s() {
        return new int[8];
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        return iArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f21446c), Arrays.toString(iArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f21446c), Arrays.toString(Arrays.copyOf(iArr, (int) k.d.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    @Override // j$.util.stream.AbstractC0735a3, java.lang.Iterable
    /* renamed from: u */
    public j$.util.I spliterator() {
        return new V2(this, 0, this.f21446c, 0, this.f21445b);
    }
}
