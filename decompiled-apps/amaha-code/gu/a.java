package gu;

import gu.n;
import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
/* compiled from: AbstractMessageLite.java */
/* loaded from: classes2.dex */
public abstract class a implements n {

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: gu.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0262a<BuilderType extends AbstractC0262a> implements n.a {
        @Override // gu.n.a
        /* renamed from: h */
        public abstract BuilderType R(d dVar, e eVar);

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: gu.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0263a extends FilterInputStream {

            /* renamed from: u  reason: collision with root package name */
            public int f16832u;

            public C0263a(ByteArrayInputStream byteArrayInputStream, int i6) {
                super(byteArrayInputStream);
                this.f16832u = i6;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f16832u);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() {
                if (this.f16832u <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f16832u--;
                }
                return read;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j10) {
                long skip = super.skip(Math.min(j10, this.f16832u));
                if (skip >= 0) {
                    this.f16832u = (int) (this.f16832u - skip);
                }
                return skip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i6, int i10) {
                int i11 = this.f16832u;
                if (i11 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i6, Math.min(i10, i11));
                if (read >= 0) {
                    this.f16832u -= read;
                }
                return read;
            }
        }
    }
}
