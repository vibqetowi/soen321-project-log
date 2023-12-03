package u4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import h4.g;
import h4.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import k4.v;
/* compiled from: StreamGifDecoder.java */
/* loaded from: classes.dex */
public final class e implements i<InputStream, GifDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f33805a;

    /* renamed from: b  reason: collision with root package name */
    public final i<ByteBuffer, GifDrawable> f33806b;

    /* renamed from: c  reason: collision with root package name */
    public final l4.b f33807c;

    public e(List list, a aVar, l4.b bVar) {
        this.f33805a = list;
        this.f33806b = aVar;
        this.f33807c = bVar;
    }

    @Override // h4.i
    public final boolean a(InputStream inputStream, g gVar) {
        InputStream inputStream2 = inputStream;
        if (!((Boolean) gVar.c(d.f33804b)).booleanValue()) {
            if (com.bumptech.glide.load.a.b(this.f33807c, inputStream2, this.f33805a) == ImageHeaderParser.ImageType.GIF) {
                return true;
            }
        }
        return false;
    }

    @Override // h4.i
    public final v<GifDrawable> b(InputStream inputStream, int i6, int i10, g gVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f33806b.b(ByteBuffer.wrap(bArr), i6, i10, gVar);
    }
}
