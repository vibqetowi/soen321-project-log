package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
/* compiled from: MetadataListReader.java */
/* loaded from: classes.dex */
public final class n {

    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f2081a;

        public a(ByteBuffer byteBuffer) {
            this.f2081a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final long a() {
            return this.f2081a.getInt() & 4294967295L;
        }

        public final void b(int i6) {
            ByteBuffer byteBuffer = this.f2081a;
            byteBuffer.position(byteBuffer.position() + i6);
        }
    }

    public static d1.b a(MappedByteBuffer mappedByteBuffer) {
        ByteBuffer byteBuffer;
        long j10;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        a aVar = new a(duplicate);
        aVar.b(4);
        int i6 = duplicate.getShort() & 65535;
        if (i6 <= 100) {
            aVar.b(6);
            int i10 = 0;
            while (true) {
                byteBuffer = aVar.f2081a;
                if (i10 < i6) {
                    int i11 = byteBuffer.getInt();
                    aVar.b(4);
                    j10 = aVar.a();
                    aVar.b(4);
                    if (1835365473 == i11) {
                        break;
                    }
                    i10++;
                } else {
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                aVar.b((int) (j10 - duplicate.position()));
                aVar.b(12);
                long a10 = aVar.a();
                for (int i12 = 0; i12 < a10; i12++) {
                    int i13 = byteBuffer.getInt();
                    long a11 = aVar.a();
                    aVar.a();
                    if (1164798569 == i13 || 1701669481 == i13) {
                        duplicate.position((int) (a11 + j10));
                        d1.b bVar = new d1.b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
