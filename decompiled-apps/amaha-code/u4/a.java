package u4;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import d5.f;
import d5.j;
import h4.g;
import h4.i;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import k4.v;
/* compiled from: ByteBufferGifDecoder.java */
/* loaded from: classes.dex */
public final class a implements i<ByteBuffer, GifDrawable> {
    public static final C0565a f = new C0565a();

    /* renamed from: g  reason: collision with root package name */
    public static final b f33793g = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Context f33794a;

    /* renamed from: b  reason: collision with root package name */
    public final List<ImageHeaderParser> f33795b;

    /* renamed from: c  reason: collision with root package name */
    public final b f33796c;

    /* renamed from: d  reason: collision with root package name */
    public final C0565a f33797d;

    /* renamed from: e  reason: collision with root package name */
    public final u4.b f33798e;

    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: u4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0565a {
    }

    /* compiled from: ByteBufferGifDecoder.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayDeque f33799a;

        public b() {
            char[] cArr = j.f12201a;
            this.f33799a = new ArrayDeque(0);
        }

        public final synchronized void a(g4.d dVar) {
            dVar.f16203b = null;
            dVar.f16204c = null;
            this.f33799a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, l4.d dVar, l4.b bVar) {
        C0565a c0565a = f;
        this.f33794a = context.getApplicationContext();
        this.f33795b = list;
        this.f33797d = c0565a;
        this.f33798e = new u4.b(dVar, bVar);
        this.f33796c = f33793g;
    }

    public static int d(g4.c cVar, int i6, int i10) {
        int highestOneBit;
        int min = Math.min(cVar.f16197g / i10, cVar.f / i6);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i6 + "x" + i10 + "], actual dimens: [" + cVar.f + "x" + cVar.f16197g + "]");
        }
        return max;
    }

    @Override // h4.i
    public final boolean a(ByteBuffer byteBuffer, g gVar) {
        ImageHeaderParser.ImageType imageType;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (((Boolean) gVar.c(d.f33804b)).booleanValue()) {
            return false;
        }
        if (byteBuffer2 == null) {
            imageType = ImageHeaderParser.ImageType.UNKNOWN;
        } else {
            List<ImageHeaderParser> list = this.f33795b;
            int size = list.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    ImageHeaderParser.ImageType a10 = list.get(i6).a(byteBuffer2);
                    if (a10 != ImageHeaderParser.ImageType.UNKNOWN) {
                        imageType = a10;
                        break;
                    }
                    i6++;
                } else {
                    imageType = ImageHeaderParser.ImageType.UNKNOWN;
                    break;
                }
            }
        }
        if (imageType != ImageHeaderParser.ImageType.GIF) {
            return false;
        }
        return true;
    }

    @Override // h4.i
    public final v<GifDrawable> b(ByteBuffer byteBuffer, int i6, int i10, g gVar) {
        g4.d dVar;
        ByteBuffer byteBuffer2 = byteBuffer;
        b bVar = this.f33796c;
        synchronized (bVar) {
            g4.d dVar2 = (g4.d) bVar.f33799a.poll();
            if (dVar2 == null) {
                dVar2 = new g4.d();
            }
            dVar = dVar2;
            dVar.f16203b = null;
            Arrays.fill(dVar.f16202a, (byte) 0);
            dVar.f16204c = new g4.c();
            dVar.f16205d = 0;
            ByteBuffer asReadOnlyBuffer = byteBuffer2.asReadOnlyBuffer();
            dVar.f16203b = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            dVar.f16203b.order(ByteOrder.LITTLE_ENDIAN);
        }
        try {
            return c(byteBuffer2, i6, i10, dVar, gVar);
        } finally {
            this.f33796c.a(dVar);
        }
    }

    public final t4.c c(ByteBuffer byteBuffer, int i6, int i10, g4.d dVar, g gVar) {
        Bitmap.Config config;
        int i11 = f.f12193b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            g4.c b10 = dVar.b();
            if (b10.f16194c > 0 && b10.f16193b == 0) {
                if (gVar.c(d.f33803a) == h4.b.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                int d10 = d(b10, i6, i10);
                C0565a c0565a = this.f33797d;
                u4.b bVar = this.f33798e;
                c0565a.getClass();
                g4.e eVar = new g4.e(bVar, b10, byteBuffer, d10);
                eVar.h(config);
                eVar.b();
                Bitmap a10 = eVar.a();
                if (a10 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
                    }
                    return null;
                }
                return new t4.c(new GifDrawable(new GifDrawable.a(new com.bumptech.glide.load.resource.gif.a(Glide.b(this.f33794a), eVar, i6, i10, q4.a.f29129b, a10))), 1);
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + f.a(elapsedRealtimeNanos));
            }
        }
    }
}
