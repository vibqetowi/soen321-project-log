package xs;

import is.m;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;
/* compiled from: ProgressionIterators.kt */
/* loaded from: classes2.dex */
public final class b extends m {

    /* renamed from: u  reason: collision with root package name */
    public final int f37992u;

    /* renamed from: v  reason: collision with root package name */
    public final int f37993v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f37994w;

    /* renamed from: x  reason: collision with root package name */
    public int f37995x;

    public b(char c10, char c11, int i6) {
        this.f37992u = i6;
        this.f37993v = c11;
        boolean z10 = true;
        if (i6 <= 0 ? i.i(c10, c11) < 0 : i.i(c10, c11) > 0) {
            z10 = false;
        }
        this.f37994w = z10;
        this.f37995x = z10 ? c10 : c11;
    }

    @Override // is.m
    public final char a() {
        int i6 = this.f37995x;
        if (i6 == this.f37993v) {
            if (this.f37994w) {
                this.f37994w = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f37995x = this.f37992u + i6;
        }
        return (char) i6;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f37994w;
    }
}
