package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.measurement.u7;
import j$.util.Iterator;
import java.util.ListIterator;
import java.util.function.Consumer;
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
/* loaded from: classes.dex */
public final class c5 implements ListIterator, Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f7496u = 0;

    /* renamed from: v  reason: collision with root package name */
    public final ListIterator f7497v;

    public c5(e5 e5Var, int i6) {
        this.f7497v = e5Var.f7517u.listIterator(i6);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        switch (this.f7496u) {
            case 0:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            case 1:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str3 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        switch (this.f7496u) {
            case 0:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            case 1:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
            default:
                Iterator.CC.$default$forEachRemaining(this, consumer);
                return;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f7496u;
        ListIterator listIterator = this.f7497v;
        switch (i6) {
            case 0:
                return listIterator.hasNext();
            case 1:
                return listIterator.hasNext();
            default:
                return listIterator.hasNext();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        int i6 = this.f7496u;
        ListIterator listIterator = this.f7497v;
        switch (i6) {
            case 0:
                return listIterator.hasPrevious();
            case 1:
                return listIterator.hasPrevious();
            default:
                return listIterator.hasPrevious();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i6 = this.f7496u;
        ListIterator listIterator = this.f7497v;
        switch (i6) {
            case 0:
                return (String) listIterator.next();
            case 1:
                return (String) listIterator.next();
            default:
                return (String) listIterator.next();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int i6 = this.f7496u;
        ListIterator listIterator = this.f7497v;
        switch (i6) {
            case 0:
                return listIterator.nextIndex();
            case 1:
                return listIterator.nextIndex();
            default:
                return listIterator.nextIndex();
        }
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        int i6 = this.f7496u;
        ListIterator listIterator = this.f7497v;
        switch (i6) {
            case 0:
                return (String) listIterator.previous();
            case 1:
                return (String) listIterator.previous();
            default:
                return (String) listIterator.previous();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i6 = this.f7496u;
        ListIterator listIterator = this.f7497v;
        switch (i6) {
            case 0:
                return listIterator.previousIndex();
            case 1:
                return listIterator.previousIndex();
            default:
                return listIterator.previousIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator, j$.util.Iterator
    public final void remove() {
        switch (this.f7496u) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        switch (this.f7496u) {
            case 0:
                String str = (String) obj;
                throw new UnsupportedOperationException();
            case 1:
                String str2 = (String) obj;
                throw new UnsupportedOperationException();
            default:
                String str3 = (String) obj;
                throw new UnsupportedOperationException();
        }
    }

    public c5(com.google.android.gms.internal.p000firebaseauthapi.b3 b3Var, int i6) {
        this.f7497v = b3Var.f7724u.listIterator(i6);
    }

    public c5(u7 u7Var, int i6) {
        this.f7497v = u7Var.f8622u.listIterator(i6);
    }
}
