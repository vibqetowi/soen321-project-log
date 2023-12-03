package ie;

import com.theinnerhour.b2b.utils.Constants;
import java.math.RoundingMode;
import java.util.Arrays;
/* compiled from: OrderedCodeWriter.java */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[][] f20001c = {new byte[]{0, 0}, new byte[]{Byte.MIN_VALUE, 0}, new byte[]{-64, 0}, new byte[]{-32, 0}, new byte[]{-16, 0}, new byte[]{-8, 0}, new byte[]{-4, 0}, new byte[]{-2, 0}, new byte[]{-1, 0}, new byte[]{-1, Byte.MIN_VALUE}, new byte[]{-1, -64}};

    /* renamed from: b  reason: collision with root package name */
    public int f20003b = 0;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f20002a = new byte[Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID];

    public final void a(int i6) {
        int i10 = i6 + this.f20003b;
        byte[] bArr = this.f20002a;
        if (i10 <= bArr.length) {
            return;
        }
        int length = bArr.length * 2;
        if (length >= i10) {
            i10 = length;
        }
        this.f20002a = Arrays.copyOf(bArr, i10);
    }

    public final void b(byte b10) {
        if (b10 == 0) {
            d((byte) 0);
            d((byte) -1);
        } else if (b10 == -1) {
            d((byte) -1);
            d((byte) 0);
        } else {
            d(b10);
        }
    }

    public final void c(byte b10) {
        if (b10 == 0) {
            e((byte) 0);
            e((byte) -1);
        } else if (b10 == -1) {
            e((byte) -1);
            e((byte) 0);
        } else {
            e(b10);
        }
    }

    public final void d(byte b10) {
        a(1);
        byte[] bArr = this.f20002a;
        int i6 = this.f20003b;
        this.f20003b = i6 + 1;
        bArr[i6] = b10;
    }

    public final void e(byte b10) {
        a(1);
        byte[] bArr = this.f20002a;
        int i6 = this.f20003b;
        this.f20003b = i6 + 1;
        bArr[i6] = (byte) (~b10);
    }

    public final void f(long j10) {
        long j11;
        byte b10;
        int i6;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 < 0) {
            j11 = ~j10;
        } else {
            j11 = j10;
        }
        byte[][] bArr = f20001c;
        if (j11 < 64) {
            a(1);
            byte[] bArr2 = this.f20002a;
            int i11 = this.f20003b;
            this.f20003b = i11 + 1;
            bArr2[i11] = (byte) (j10 ^ bArr[1][0]);
            return;
        }
        if (j11 < 0) {
            j11 = ~j11;
        }
        int a10 = e.a((64 - Long.numberOfLeadingZeros(j11)) + 1, 7, RoundingMode.UP);
        a(a10);
        if (a10 >= 2) {
            if (i10 < 0) {
                b10 = -1;
            } else {
                b10 = 0;
            }
            int i12 = this.f20003b;
            if (a10 == 10) {
                i6 = i12 + 2;
                byte[] bArr3 = this.f20002a;
                bArr3[i12] = b10;
                bArr3[i12 + 1] = b10;
            } else if (a10 == 9) {
                i6 = i12 + 1;
                this.f20002a[i12] = b10;
            } else {
                i6 = i12;
            }
            for (int i13 = (a10 - 1) + i12; i13 >= i6; i13--) {
                this.f20002a[i13] = (byte) (255 & j10);
                j10 >>= 8;
            }
            byte[] bArr4 = this.f20002a;
            int i14 = this.f20003b;
            byte b11 = bArr4[i14];
            byte[] bArr5 = bArr[a10];
            bArr4[i14] = (byte) (b11 ^ bArr5[0]);
            int i15 = i14 + 1;
            bArr4[i15] = (byte) (bArr5[1] ^ bArr4[i15]);
            this.f20003b = i14 + a10;
            return;
        }
        throw new AssertionError(String.format("Invalid length (%d) returned by signedNumLength", Integer.valueOf(a10)));
    }
}
