package com.google.android.gms.internal.p000firebaseauthapi;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import j$.util.Iterator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import tr.r;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.z0  reason: invalid package */
/* loaded from: classes.dex */
public abstract class z0 implements Iterator, j$.util.Iterator {

    /* renamed from: u  reason: collision with root package name */
    public String f8268u;

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f8270w;

    /* renamed from: y  reason: collision with root package name */
    public int f8272y;

    /* renamed from: v  reason: collision with root package name */
    public int f8269v = 2;

    /* renamed from: x  reason: collision with root package name */
    public int f8271x = 0;

    public z0(p2 p2Var, CharSequence charSequence) {
        Object obj = p2Var.f8038v;
        this.f8272y = SubsamplingScaleImageView.TILE_SIZE_AUTO;
        this.f8270w = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e8, code lost:
        r14.f8268u = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ec, code lost:
        if (r14.f8269v == 3) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
        r14.f8269v = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f0, code lost:
        return true;
     */
    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean hasNext() {
        int i6;
        int length;
        String K;
        int i10;
        int i11 = this.f8269v;
        if (i11 != 4) {
            int i12 = i11 - 1;
            String str = null;
            if (i11 != 0) {
                if (i12 == 0) {
                    return true;
                }
                if (i12 != 2) {
                    this.f8269v = 4;
                    int i13 = this.f8271x;
                    while (true) {
                        i6 = this.f8271x;
                        if (i6 != -1) {
                            l lVar = (l) this;
                            Object obj = lVar.A;
                            int i14 = lVar.f7951z;
                            switch (i14) {
                                case 0:
                                    yc ycVar = (yc) obj;
                                    if (ycVar.f8260a.find(i6)) {
                                        i6 = ycVar.f8260a.start();
                                        break;
                                    }
                                    i6 = -1;
                                    break;
                                default:
                                    CharSequence charSequence = lVar.f8270w;
                                    length = charSequence.length();
                                    if (i6 >= 0 && i6 <= length) {
                                        while (i6 < length) {
                                            if (charSequence.charAt(i6) == '.') {
                                                break;
                                            } else {
                                                i6++;
                                            }
                                        }
                                        i6 = -1;
                                        break;
                                    }
                                    break;
                            }
                            CharSequence charSequence2 = this.f8270w;
                            if (i6 == -1) {
                                i6 = charSequence2.length();
                                this.f8271x = -1;
                                i10 = -1;
                            } else {
                                switch (i14) {
                                    case 0:
                                        i10 = ((yc) obj).f8260a.end();
                                        break;
                                    default:
                                        i10 = i6 + 1;
                                        break;
                                }
                                this.f8271x = i10;
                            }
                            if (i10 == i13) {
                                int i15 = i10 + 1;
                                this.f8271x = i15;
                                if (i15 > charSequence2.length()) {
                                    this.f8271x = -1;
                                }
                            } else {
                                if (i13 < i6) {
                                    charSequence2.charAt(i13);
                                }
                                if (i13 < i6) {
                                    charSequence2.charAt(i6 - 1);
                                }
                                int i16 = this.f8272y;
                                if (i16 == 1) {
                                    i6 = charSequence2.length();
                                    this.f8271x = -1;
                                    if (i6 > i13) {
                                        charSequence2.charAt(i6 - 1);
                                    }
                                } else {
                                    this.f8272y = i16 - 1;
                                }
                                str = charSequence2.subSequence(i13, i6).toString();
                            }
                        } else {
                            this.f8269v = 3;
                        }
                    }
                    if (i6 >= 0) {
                        if (length >= 0) {
                            K = r.K("%s (%s) must not be greater than size (%s)", "index", Integer.valueOf(i6), Integer.valueOf(length));
                        } else {
                            throw new IllegalArgumentException(c.p("negative size: ", length));
                        }
                    } else {
                        K = r.K("%s (%s) must not be negative", "index", Integer.valueOf(i6));
                    }
                    throw new IndexOutOfBoundsException(K);
                }
                return false;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    /* renamed from: b */
    public final Object next() {
        if (hasNext()) {
            this.f8269v = 2;
            String str = this.f8268u;
            this.f8268u = null;
            return str;
        }
        throw new NoSuchElementException();
    }

    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final /* bridge */ /* synthetic */ void remove() {
        c();
        throw null;
    }
}
