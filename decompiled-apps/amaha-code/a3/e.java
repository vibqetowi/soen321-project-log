package a3;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
/* compiled from: LottieCompositionFactory.java */
/* loaded from: classes.dex */
public final class e implements Callable<p<c>> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ Context f194u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ String f195v;

    public e(Context context, String str) {
        this.f194u = context;
        this.f195v = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p<c> call() {
        s0.c cVar;
        p<c> b10;
        File l2;
        j3.a aVar;
        s1.s sVar = new s1.s(this.f194u, this.f195v);
        j3.a aVar2 = j3.a.ZIP;
        androidx.appcompat.widget.l lVar = (androidx.appcompat.widget.l) sVar.f31226x;
        lVar.getClass();
        c cVar2 = null;
        try {
            l2 = lVar.l((String) lVar.f1472w);
        } catch (FileNotFoundException unused) {
        }
        if (l2 != null) {
            FileInputStream fileInputStream = new FileInputStream(l2);
            if (l2.getAbsolutePath().endsWith(".zip")) {
                aVar = aVar2;
            } else {
                aVar = j3.a.JSON;
            }
            l2.getAbsolutePath();
            m3.c.a();
            cVar = new s0.c(aVar, fileInputStream);
            if (cVar != null) {
            }
            if (cVar2 == null) {
            }
        } else {
            cVar = null;
            if (cVar != null) {
                j3.a aVar3 = (j3.a) cVar.f31064a;
                InputStream inputStream = (InputStream) cVar.f31065b;
                if (aVar3 == aVar2) {
                    ZipInputStream zipInputStream = new ZipInputStream(inputStream);
                    try {
                        b10 = d.g(zipInputStream, (String) sVar.f31225w);
                    } finally {
                        m3.g.b(zipInputStream);
                    }
                } else {
                    b10 = d.b(inputStream, (String) sVar.f31225w);
                }
                c cVar3 = b10.f268a;
                if (cVar3 != null) {
                    cVar2 = cVar3;
                }
            }
            if (cVar2 == null) {
                return new p<>(cVar2);
            }
            m3.c.a();
            try {
                return sVar.m();
            } catch (IOException e10) {
                return new p<>(e10);
            }
        }
    }
}
