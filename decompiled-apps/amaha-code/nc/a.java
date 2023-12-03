package nc;

import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import nc.k;
/* compiled from: AbstractIterator.java */
/* loaded from: classes.dex */
public abstract class a<T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public int f25979u = 2;

    /* renamed from: v  reason: collision with root package name */
    public String f25980v;

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        String str;
        int a10;
        CharSequence charSequence;
        b bVar;
        if (this.f25979u != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.D(z10);
        int d10 = v.h.d(this.f25979u);
        if (d10 == 0) {
            return true;
        }
        if (d10 == 2) {
            return false;
        }
        this.f25979u = 4;
        k.a aVar = (k.a) this;
        int i6 = aVar.f26009z;
        while (true) {
            int i10 = aVar.f26009z;
            if (i10 != -1) {
                i iVar = (i) aVar;
                a10 = iVar.B.f26001a.a(i10, iVar.f26006w);
                charSequence = aVar.f26006w;
                if (a10 == -1) {
                    a10 = charSequence.length();
                    aVar.f26009z = -1;
                } else {
                    aVar.f26009z = a10 + 1;
                }
                int i11 = aVar.f26009z;
                if (i11 == i6) {
                    int i12 = i11 + 1;
                    aVar.f26009z = i12;
                    if (i12 > charSequence.length()) {
                        aVar.f26009z = -1;
                    }
                } else {
                    while (true) {
                        bVar = aVar.f26007x;
                        if (i6 >= a10 || !bVar.b(charSequence.charAt(i6))) {
                            break;
                        }
                        i6++;
                    }
                    while (a10 > i6) {
                        int i13 = a10 - 1;
                        if (!bVar.b(charSequence.charAt(i13))) {
                            break;
                        }
                        a10 = i13;
                    }
                    if (!aVar.f26008y || i6 != a10) {
                        break;
                    }
                    i6 = aVar.f26009z;
                }
            } else {
                aVar.f25979u = 3;
                str = null;
                break;
            }
        }
        int i14 = aVar.A;
        if (i14 == 1) {
            a10 = charSequence.length();
            aVar.f26009z = -1;
            while (a10 > i6) {
                int i15 = a10 - 1;
                if (!bVar.b(charSequence.charAt(i15))) {
                    break;
                }
                a10 = i15;
            }
        } else {
            aVar.A = i14 - 1;
        }
        str = charSequence.subSequence(i6, a10).toString();
        this.f25980v = str;
        if (this.f25979u == 3) {
            return false;
        }
        this.f25979u = 1;
        return true;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f25979u = 2;
            T t3 = (T) this.f25980v;
            this.f25980v = null;
            return t3;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
