package com.google.android.gms.internal.p000firebaseauthapi;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.i0  reason: invalid package */
/* loaded from: classes.dex */
public final class i0 extends j0 {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f7881c;

    /* renamed from: d  reason: collision with root package name */
    public int f7882d;

    /* renamed from: e  reason: collision with root package name */
    public int f7883e;

    /* renamed from: g  reason: collision with root package name */
    public int f7884g;

    /* renamed from: h  reason: collision with root package name */
    public int f7885h = SubsamplingScaleImageView.TILE_SIZE_AUTO;
    public int f = 0;

    public /* synthetic */ i0(byte[] bArr, int i6) {
        this.f7881c = bArr;
        this.f7882d = i6;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final int a(int i6) {
        if (i6 >= 0) {
            int i10 = i6 + this.f;
            if (i10 >= 0) {
                int i11 = this.f7885h;
                if (i10 <= i11) {
                    this.f7885h = i10;
                    int i12 = this.f7882d + this.f7883e;
                    this.f7882d = i12;
                    if (i12 > i10) {
                        int i13 = i12 - i10;
                        this.f7883e = i13;
                        this.f7882d = i12 - i13;
                    } else {
                        this.f7883e = 0;
                    }
                    return i11;
                }
                throw zzadn.e();
            }
            throw zzadn.d();
        }
        throw zzadn.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final int b() {
        if (c()) {
            this.f7884g = 0;
            return 0;
        }
        int i6 = i();
        this.f7884g = i6;
        if ((i6 >>> 3) != 0) {
            return i6;
        }
        throw new zzadn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final boolean c() {
        if (this.f == this.f7882d) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final boolean d() {
        if (k() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j0
    public final boolean e(int i6) {
        int b10;
        int i10 = i6 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return false;
                        }
                        if (i10 == 5) {
                            m(4);
                            return true;
                        }
                        int i12 = zzadn.f8297u;
                        throw new zzadm();
                    }
                    do {
                        b10 = b();
                        if (b10 == 0) {
                            break;
                        }
                    } while (e(b10));
                    if (this.f7884g == (((i6 >>> 3) << 3) | 4)) {
                        return true;
                    }
                    throw new zzadn("Protocol message end-group tag did not match expected tag.");
                }
                m(i());
                return true;
            }
            m(8);
            return true;
        }
        int i13 = this.f7882d - this.f;
        byte[] bArr = this.f7881c;
        if (i13 >= 10) {
            while (i11 < 10) {
                int i14 = this.f;
                this.f = i14 + 1;
                if (bArr[i14] < 0) {
                    i11++;
                }
            }
            throw new zzadn("CodedInputStream encountered a malformed varint.");
        }
        while (i11 < 10) {
            int i15 = this.f;
            if (i15 != this.f7882d) {
                this.f = i15 + 1;
                if (bArr[i15] < 0) {
                    i11++;
                }
            } else {
                throw zzadn.e();
            }
        }
        throw new zzadn("CodedInputStream encountered a malformed varint.");
        return true;
    }

    public final int h() {
        int i6 = this.f;
        if (this.f7882d - i6 >= 4) {
            this.f = i6 + 4;
            byte[] bArr = this.f7881c;
            return ((bArr[i6 + 3] & 255) << 24) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16);
        }
        throw zzadn.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        if (r3[r2] >= 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i() {
        int i6;
        int i10 = this.f;
        int i11 = this.f7882d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f7881c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f = i12;
                return b10;
            } else if (i11 - i12 >= 9) {
                int i13 = i12 + 1;
                int i14 = b10 ^ (bArr[i12] << 7);
                if (i14 < 0) {
                    i6 = i14 ^ (-128);
                } else {
                    int i15 = i13 + 1;
                    int i16 = i14 ^ (bArr[i13] << 14);
                    if (i16 >= 0) {
                        i6 = i16 ^ 16256;
                    } else {
                        i13 = i15 + 1;
                        int i17 = i16 ^ (bArr[i15] << 21);
                        if (i17 < 0) {
                            i6 = i17 ^ (-2080896);
                        } else {
                            i15 = i13 + 1;
                            byte b11 = bArr[i13];
                            i6 = (i17 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i13 = i15 + 1;
                                if (bArr[i15] < 0) {
                                    i15 = i13 + 1;
                                    if (bArr[i13] < 0) {
                                        i13 = i15 + 1;
                                        if (bArr[i15] < 0) {
                                            i15 = i13 + 1;
                                            if (bArr[i13] < 0) {
                                                i13 = i15 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i13 = i15;
                }
                this.f = i13;
                return i6;
            }
        }
        return (int) l();
    }

    public final long j() {
        int i6 = this.f;
        if (this.f7882d - i6 >= 8) {
            this.f = i6 + 8;
            byte[] bArr = this.f7881c;
            return ((bArr[i6 + 7] & 255) << 56) | (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24) | ((bArr[i6 + 4] & 255) << 32) | ((bArr[i6 + 5] & 255) << 40) | ((bArr[i6 + 6] & 255) << 48);
        }
        throw zzadn.e();
    }

    public final long k() {
        long j10;
        long j11;
        long j12;
        long j13;
        int i6;
        int i10 = this.f;
        int i11 = this.f7882d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f7881c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f = i12;
                return b10;
            } else if (i11 - i12 >= 9) {
                int i13 = i12 + 1;
                int i14 = b10 ^ (bArr[i12] << 7);
                if (i14 < 0) {
                    i6 = i14 ^ (-128);
                } else {
                    int i15 = i13 + 1;
                    int i16 = i14 ^ (bArr[i13] << 14);
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                    } else {
                        i13 = i15 + 1;
                        int i17 = i16 ^ (bArr[i15] << 21);
                        if (i17 < 0) {
                            i6 = i17 ^ (-2080896);
                        } else {
                            i15 = i13 + 1;
                            long j14 = (bArr[i13] << 28) ^ i17;
                            if (j14 >= 0) {
                                j13 = 266354560;
                            } else {
                                int i18 = i15 + 1;
                                long j15 = j14 ^ (bArr[i15] << 35);
                                if (j15 < 0) {
                                    j12 = -34093383808L;
                                } else {
                                    i15 = i18 + 1;
                                    j14 = j15 ^ (bArr[i18] << 42);
                                    if (j14 >= 0) {
                                        j13 = 4363953127296L;
                                    } else {
                                        i18 = i15 + 1;
                                        j15 = j14 ^ (bArr[i15] << 49);
                                        if (j15 < 0) {
                                            j12 = -558586000294016L;
                                        } else {
                                            i15 = i18 + 1;
                                            j10 = (j15 ^ (bArr[i18] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i18 = i15 + 1;
                                                if (bArr[i15] >= 0) {
                                                    j11 = j10;
                                                    i13 = i18;
                                                    this.f = i13;
                                                    return j11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j11 = j12 ^ j15;
                                i13 = i18;
                                this.f = i13;
                                return j11;
                            }
                            j10 = j14 ^ j13;
                        }
                    }
                    i13 = i15;
                    j11 = j10;
                    this.f = i13;
                    return j11;
                }
                j11 = i6;
                this.f = i13;
                return j11;
            }
        }
        return l();
    }

    public final long l() {
        long j10 = 0;
        for (int i6 = 0; i6 < 64; i6 += 7) {
            int i10 = this.f;
            if (i10 != this.f7882d) {
                this.f = i10 + 1;
                byte b10 = this.f7881c[i10];
                j10 |= (b10 & Byte.MAX_VALUE) << i6;
                if ((b10 & 128) == 0) {
                    return j10;
                }
            } else {
                throw zzadn.e();
            }
        }
        throw new zzadn("CodedInputStream encountered a malformed varint.");
    }

    public final void m(int i6) {
        if (i6 >= 0) {
            int i10 = this.f7882d;
            int i11 = this.f;
            if (i6 <= i10 - i11) {
                this.f = i11 + i6;
                return;
            }
        }
        if (i6 < 0) {
            throw zzadn.c();
        }
        throw zzadn.e();
    }
}
