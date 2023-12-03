package rs;

import fv.h;
import j$.util.Iterator;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import kotlin.jvm.internal.i;
/* compiled from: ReadWrite.kt */
/* loaded from: classes2.dex */
public final class b implements h<String> {

    /* renamed from: a  reason: collision with root package name */
    public final BufferedReader f31011a;

    /* compiled from: ReadWrite.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Iterator<String>, ts.a, j$.util.Iterator {

        /* renamed from: u  reason: collision with root package name */
        public String f31012u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f31013v;

        public a() {
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            if (this.f31012u == null && !this.f31013v) {
                String readLine = b.this.f31011a.readLine();
                this.f31012u = readLine;
                if (readLine == null) {
                    this.f31013v = true;
                }
            }
            if (this.f31012u != null) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            if (hasNext()) {
                String str = this.f31012u;
                this.f31012u = null;
                i.d(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public b(BufferedReader bufferedReader) {
        this.f31011a = bufferedReader;
    }

    @Override // fv.h
    public final java.util.Iterator<String> iterator() {
        return new a();
    }
}
