package a3;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class f implements Callable<p<c>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f196u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f197v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f198w;

    public f(Context context, String str, String str2) {
        this.f196u = context;
        this.f197v = str;
        this.f198w = str2;
    }

    @Override // java.util.concurrent.Callable
    public final p<c> call() {
        p<c> b10;
        String str = this.f197v;
        try {
            boolean endsWith = str.endsWith(".zip");
            Context context = this.f196u;
            String str2 = this.f198w;
            if (endsWith) {
                ZipInputStream zipInputStream = new ZipInputStream(context.getAssets().open(str));
                b10 = d.g(zipInputStream, str2);
                m3.g.b(zipInputStream);
            } else {
                b10 = d.b(context.getAssets().open(str), str2);
            }
            return b10;
        } catch (IOException e10) {
            return new p<>(e10);
        }
    }
}
