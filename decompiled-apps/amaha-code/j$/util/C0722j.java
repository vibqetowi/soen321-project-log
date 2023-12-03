package j$.util;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.time.AbstractC0689a;
import java.util.function.IntConsumer;
/* renamed from: j$.util.j  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0722j implements IntConsumer {
    private long count;
    private long sum;
    private int min = SubsamplingScaleImageView.TILE_SIZE_AUTO;
    private int max = LinearLayoutManager.INVALID_OFFSET;

    public final void a(C0722j c0722j) {
        this.count += c0722j.count;
        this.sum += c0722j.sum;
        this.min = Math.min(this.min, c0722j.min);
        this.max = Math.max(this.max, c0722j.max);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i6) {
        this.count++;
        this.sum += i6;
        this.min = Math.min(this.min, i6);
        this.max = Math.max(this.max, i6);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC0689a.e(this, intConsumer);
    }

    public final String toString() {
        Object[] objArr = new Object[6];
        objArr[0] = C0722j.class.getSimpleName();
        objArr[1] = Long.valueOf(this.count);
        objArr[2] = Long.valueOf(this.sum);
        objArr[3] = Integer.valueOf(this.min);
        long j10 = this.count;
        objArr[4] = Double.valueOf(j10 > 0 ? this.sum / j10 : 0.0d);
        objArr[5] = Integer.valueOf(this.max);
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", objArr);
    }
}
