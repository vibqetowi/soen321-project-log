package r4;

import android.graphics.Bitmap;
/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes.dex */
public final class t implements h4.i<Bitmap, Bitmap> {
    @Override // h4.i
    public final /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, h4.g gVar) {
        return true;
    }

    @Override // h4.i
    public final k4.v<Bitmap> b(Bitmap bitmap, int i6, int i10, h4.g gVar) {
        return new a(bitmap);
    }

    /* compiled from: UnitBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static final class a implements k4.v<Bitmap> {

        /* renamed from: u  reason: collision with root package name */
        public final Bitmap f30443u;

        public a(Bitmap bitmap) {
            this.f30443u = bitmap;
        }

        @Override // k4.v
        public final int a() {
            return d5.j.c(this.f30443u);
        }

        @Override // k4.v
        public final Class<Bitmap> b() {
            return Bitmap.class;
        }

        @Override // k4.v
        public final Bitmap get() {
            return this.f30443u;
        }

        @Override // k4.v
        public final void recycle() {
        }
    }
}
