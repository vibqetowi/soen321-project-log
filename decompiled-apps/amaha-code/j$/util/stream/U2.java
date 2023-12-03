package j$.util.stream;

import androidx.recyclerview.widget.k;
import j$.time.AbstractC0689a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class U2 extends AbstractC0735a3 implements DoubleConsumer {
    /* JADX INFO: Access modifiers changed from: package-private */
    public U2() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public U2(int i6) {
        super(i6);
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d10) {
        t();
        int i6 = this.f21445b;
        this.f21445b = i6 + 1;
        ((double[]) this.f21421e)[i6] = d10;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC0689a.d(this, doubleConsumer);
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            g((DoubleConsumer) consumer);
        } else if (S3.f21385a) {
            S3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
            throw null;
        } else {
            spliterator().forEachRemaining(consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return j$.util.g0.f(spliterator());
    }

    @Override // j$.util.stream.AbstractC0735a3
    public final Object newArray(int i6) {
        return new double[i6];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0735a3
    public final void o(Object obj, int i6, int i10, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i6 < i10) {
            doubleConsumer.accept(dArr[i6]);
            i6++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // j$.util.stream.AbstractC0735a3
    public final int p(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // j$.util.stream.AbstractC0735a3
    protected final Object[] s() {
        return new double[8];
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        return dArr.length < 200 ? String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f21446c), Arrays.toString(dArr)) : String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f21446c), Arrays.toString(Arrays.copyOf(dArr, (int) k.d.DEFAULT_DRAG_ANIMATION_DURATION)));
    }

    @Override // j$.util.stream.AbstractC0735a3, java.lang.Iterable
    /* renamed from: u */
    public j$.util.F spliterator() {
        return new T2(this, 0, this.f21446c, 0, this.f21445b);
    }
}
