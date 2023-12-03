package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes.dex */
public final class q implements Iterator {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f8559u;

    /* renamed from: v  reason: collision with root package name */
    public int f8560v = 0;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ r f8561w;

    public /* synthetic */ q(r rVar, int i6) {
        this.f8559u = i6;
        this.f8561w = rVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i6 = this.f8559u;
        r rVar = this.f8561w;
        switch (i6) {
            case 0:
                if (this.f8560v >= rVar.f8576u.length()) {
                    return false;
                }
                return true;
            default:
                if (this.f8560v >= rVar.f8576u.length()) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i6 = this.f8559u;
        r rVar = this.f8561w;
        switch (i6) {
            case 0:
                int i10 = this.f8560v;
                if (i10 < rVar.f8576u.length()) {
                    this.f8560v = i10 + 1;
                    return new r(String.valueOf(i10));
                }
                throw new NoSuchElementException();
            default:
                int i11 = this.f8560v;
                if (i11 < rVar.f8576u.length()) {
                    this.f8560v = i11 + 1;
                    return new r(String.valueOf(rVar.f8576u.charAt(i11)));
                }
                throw new NoSuchElementException();
        }
    }
}
