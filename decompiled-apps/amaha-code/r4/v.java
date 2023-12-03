package r4;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import h4.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: VideoDecoder.java */
/* loaded from: classes.dex */
public final class v<T> implements h4.i<T, Bitmap> {

    /* renamed from: d  reason: collision with root package name */
    public static final h4.f<Long> f30444d = new h4.f<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* renamed from: e  reason: collision with root package name */
    public static final h4.f<Integer> f30445e = new h4.f<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final e f = new e();

    /* renamed from: a  reason: collision with root package name */
    public final f<T> f30446a;

    /* renamed from: b  reason: collision with root package name */
    public final l4.d f30447b;

    /* renamed from: c  reason: collision with root package name */
    public final e f30448c = f;

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class a implements f.b<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f30449a = ByteBuffer.allocate(8);

        @Override // h4.f.b
        public final void a(byte[] bArr, Long l2, MessageDigest messageDigest) {
            Long l10 = l2;
            messageDigest.update(bArr);
            synchronized (this.f30449a) {
                this.f30449a.position(0);
                messageDigest.update(this.f30449a.putLong(l10.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public class b implements f.b<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f30450a = ByteBuffer.allocate(4);

        @Override // h4.f.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.f30450a) {
                    this.f30450a.position(0);
                    messageDigest.update(this.f30450a.putInt(num2.intValue()).array());
                }
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class c implements f<AssetFileDescriptor> {
        @Override // r4.v.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class d implements f<ByteBuffer> {
        @Override // r4.v.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new w(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static class e {
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t3);
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    public static final class g implements f<ParcelFileDescriptor> {
        @Override // r4.v.f
        public final void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public v(l4.d dVar, f<T> fVar) {
        this.f30447b = dVar;
        this.f30446a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i6, int i10, int i11, h hVar) {
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 27 && i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && hVar != h.f30399d) {
            try {
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                if (parseInt3 == 90 || parseInt3 == 270) {
                    parseInt2 = parseInt;
                    parseInt = parseInt2;
                }
                float b10 = hVar.b(parseInt, parseInt2, i10, i11);
                bitmap = mediaMetadataRetriever.getScaledFrameAtTime(j10, i6, Math.round(parseInt * b10), Math.round(b10 * parseInt2));
            } catch (Throwable th2) {
                if (Log.isLoggable("VideoDecoder", 3)) {
                    Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th2);
                }
            }
            if (bitmap != null) {
                return mediaMetadataRetriever.getFrameAtTime(j10, i6);
            }
            return bitmap;
        }
        bitmap = null;
        if (bitmap != null) {
        }
    }

    @Override // h4.i
    public final boolean a(T t3, h4.g gVar) {
        return true;
    }

    @Override // h4.i
    public final k4.v<Bitmap> b(T t3, int i6, int i10, h4.g gVar) {
        long longValue = ((Long) gVar.c(f30444d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) gVar.c(f30445e);
        if (num == null) {
            num = 2;
        }
        h hVar = (h) gVar.c(h.f);
        if (hVar == null) {
            hVar = h.f30400e;
        }
        h hVar2 = hVar;
        this.f30448c.getClass();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                this.f30446a.a(mediaMetadataRetriever, t3);
                Bitmap c10 = c(mediaMetadataRetriever, longValue, num.intValue(), i6, i10, hVar2);
                mediaMetadataRetriever.release();
                return r4.c.c(c10, this.f30447b);
            } catch (RuntimeException e10) {
                throw new IOException(e10);
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }
}
