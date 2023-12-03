package j$.util;

import com.theinnerhour.b2b.utils.Constants;
import j$.util.Iterator;
import java.util.Collection;
import java.util.function.Consumer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class e0 implements S {

    /* renamed from: a  reason: collision with root package name */
    private final Collection f21199a;

    /* renamed from: b  reason: collision with root package name */
    private java.util.Iterator f21200b = null;

    /* renamed from: c  reason: collision with root package name */
    private final int f21201c;

    /* renamed from: d  reason: collision with root package name */
    private long f21202d;

    /* renamed from: e  reason: collision with root package name */
    private int f21203e;

    public e0(Collection collection, int i6) {
        this.f21199a = collection;
        this.f21201c = (i6 & 4096) == 0 ? i6 | 64 | 16384 : i6;
    }

    @Override // j$.util.S
    public final int characteristics() {
        return this.f21201c;
    }

    @Override // j$.util.S
    public final long estimateSize() {
        if (this.f21200b == null) {
            Collection collection = this.f21199a;
            this.f21200b = collection.iterator();
            long size = collection.size();
            this.f21202d = size;
            return size;
        }
        return this.f21202d;
    }

    @Override // j$.util.S
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        java.util.Iterator it = this.f21200b;
        if (it == null) {
            Collection collection = this.f21199a;
            java.util.Iterator it2 = collection.iterator();
            this.f21200b = it2;
            this.f21202d = collection.size();
            it = it2;
        }
        if (it instanceof Iterator) {
            ((Iterator) it).forEachRemaining(consumer);
        } else {
            Iterator.CC.$default$forEachRemaining(it, consumer);
        }
    }

    @Override // j$.util.S
    public java.util.Comparator getComparator() {
        if (AbstractC0714b.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.S
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC0714b.d(this);
    }

    @Override // j$.util.S
    public final /* synthetic */ boolean hasCharacteristics(int i6) {
        return AbstractC0714b.e(this, i6);
    }

    @Override // j$.util.S
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        if (this.f21200b == null) {
            Collection collection = this.f21199a;
            this.f21200b = collection.iterator();
            this.f21202d = collection.size();
        }
        if (this.f21200b.hasNext()) {
            consumer.accept(this.f21200b.next());
            return true;
        }
        return false;
    }

    @Override // j$.util.S
    public final S trySplit() {
        long j10;
        java.util.Iterator it = this.f21200b;
        if (it == null) {
            Collection collection = this.f21199a;
            java.util.Iterator it2 = collection.iterator();
            this.f21200b = it2;
            j10 = collection.size();
            this.f21202d = j10;
            it = it2;
        } else {
            j10 = this.f21202d;
        }
        if (j10 <= 1 || !it.hasNext()) {
            return null;
        }
        int i6 = this.f21203e + Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID;
        if (i6 > j10) {
            i6 = (int) j10;
        }
        if (i6 > 33554432) {
            i6 = 33554432;
        }
        Object[] objArr = new Object[i6];
        int i10 = 0;
        do {
            objArr[i10] = it.next();
            i10++;
            if (i10 >= i6) {
                break;
            }
        } while (it.hasNext());
        this.f21203e = i10;
        long j11 = this.f21202d;
        if (j11 != Long.MAX_VALUE) {
            this.f21202d = j11 - i10;
        }
        return new X(objArr, 0, i10, this.f21201c);
    }
}
