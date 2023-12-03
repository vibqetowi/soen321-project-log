package com.android.volley.toolbox;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/* compiled from: ByteArrayPool.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final a f5874e = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5875a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5876b = new ArrayList(64);

    /* renamed from: c  reason: collision with root package name */
    public int f5877c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f5878d = 4096;

    /* compiled from: ByteArrayPool.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public final int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    }

    public final synchronized byte[] a(int i6) {
        for (int i10 = 0; i10 < this.f5876b.size(); i10++) {
            byte[] bArr = (byte[]) this.f5876b.get(i10);
            if (bArr.length >= i6) {
                this.f5877c -= bArr.length;
                this.f5876b.remove(i10);
                this.f5875a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i6];
    }

    public final synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f5878d) {
                this.f5875a.add(bArr);
                int binarySearch = Collections.binarySearch(this.f5876b, bArr, f5874e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f5876b.add(binarySearch, bArr);
                this.f5877c += bArr.length;
                c();
            }
        }
    }

    public final synchronized void c() {
        while (this.f5877c > this.f5878d) {
            byte[] bArr = (byte[]) this.f5875a.remove(0);
            this.f5876b.remove(bArr);
            this.f5877c -= bArr.length;
        }
    }
}
