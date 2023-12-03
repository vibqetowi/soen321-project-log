package v4;

import android.graphics.Bitmap;
import h4.g;
import java.io.ByteArrayOutputStream;
import k4.v;
/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes.dex */
public final class a implements b<Bitmap, byte[]> {

    /* renamed from: u  reason: collision with root package name */
    public final Bitmap.CompressFormat f34806u = Bitmap.CompressFormat.JPEG;

    /* renamed from: v  reason: collision with root package name */
    public final int f34807v = 100;

    @Override // v4.b
    public final v<byte[]> n(v<Bitmap> vVar, g gVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f34806u, this.f34807v, byteArrayOutputStream);
        vVar.recycle();
        return new s4.b(byteArrayOutputStream.toByteArray());
    }
}
