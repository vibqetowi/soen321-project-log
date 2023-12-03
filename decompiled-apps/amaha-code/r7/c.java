package r7;

import android.media.MediaCodec;
import c9.w;
/* compiled from: CryptoInfo.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f30529a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f30530b;

    /* renamed from: c  reason: collision with root package name */
    public int f30531c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f30532d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f30533e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public int f30534g;

    /* renamed from: h  reason: collision with root package name */
    public int f30535h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f30536i;

    /* renamed from: j  reason: collision with root package name */
    public final a f30537j;

    /* compiled from: CryptoInfo.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f30538a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaCodec.CryptoInfo.Pattern f30539b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public a(MediaCodec.CryptoInfo cryptoInfo) {
            this.f30538a = cryptoInfo;
        }
    }

    public c() {
        a aVar;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f30536i = cryptoInfo;
        if (w.f5205a >= 24) {
            aVar = new a(cryptoInfo);
        } else {
            aVar = null;
        }
        this.f30537j = aVar;
    }
}
