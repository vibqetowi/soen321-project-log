package xs;

import is.c0;
import java.util.NoSuchElementException;
/* compiled from: ProgressionIterators.kt */
/* loaded from: classes2.dex */
public final class e extends c0 {

    /* renamed from: u  reason: collision with root package name */
    public final int f37999u;

    /* renamed from: v  reason: collision with root package name */
    public final int f38000v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f38001w;

    /* renamed from: x  reason: collision with root package name */
    public int f38002x;

    public e(int i6, int i10, int i11) {
        this.f37999u = i11;
        this.f38000v = i10;
        boolean z10 = true;
        if (i11 <= 0 ? i6 < i10 : i6 > i10) {
            z10 = false;
        }
        this.f38001w = z10;
        this.f38002x = z10 ? i6 : i10;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f38001w;
    }

    @Override // is.c0
    public final int nextInt() {
        int i6 = this.f38002x;
        if (i6 == this.f38000v) {
            if (this.f38001w) {
                this.f38001w = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f38002x = this.f37999u + i6;
        }
        return i6;
    }
}
