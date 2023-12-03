package pl.droidsonroids.gif;

import java.io.IOException;
import java.util.Locale;
/* loaded from: classes2.dex */
public class GifIOException extends IOException {

    /* renamed from: u  reason: collision with root package name */
    public final bw.b f28562u;

    /* renamed from: v  reason: collision with root package name */
    public final String f28563v;

    public GifIOException(int i6, String str) {
        bw.b bVar;
        bw.b[] values = bw.b.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                bVar = values[i10];
                if (bVar.f4729v == i6) {
                    break;
                }
                i10++;
            } else {
                bVar = bw.b.UNKNOWN;
                bVar.f4729v = i6;
                break;
            }
        }
        this.f28562u = bVar;
        this.f28563v = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        bw.b bVar = this.f28562u;
        String str = this.f28563v;
        if (str == null) {
            bVar.getClass();
            return String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(bVar.f4729v), bVar.f4728u);
        }
        StringBuilder sb2 = new StringBuilder();
        bVar.getClass();
        sb2.append(String.format(Locale.ENGLISH, "GifError %d: %s", Integer.valueOf(bVar.f4729v), bVar.f4728u));
        sb2.append(": ");
        sb2.append(str);
        return sb2.toString();
    }
}
