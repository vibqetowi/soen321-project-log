package vj;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import ih.p;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: ImageManager.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final p f35229a;

    /* renamed from: b  reason: collision with root package name */
    public final String f35230b;

    /* renamed from: c  reason: collision with root package name */
    public final ai.d f35231c;

    /* compiled from: ImageManager.kt */
    /* renamed from: vj.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0597a extends k implements ss.a<String> {
        public C0597a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return i.n(" getImageFromUrl() : ", a.this.f35230b);
        }
    }

    public a(Context context, p sdkInstance) {
        i.g(context, "context");
        i.g(sdkInstance, "sdkInstance");
        this.f35229a = sdkInstance;
        this.f35230b = "RichPush_4.3.2_ImageManager";
        this.f35231c = new ai.d(context, sdkInstance);
    }

    public final Bitmap a(String campaignId, String imageUrl) {
        ai.d dVar = this.f35231c;
        i.g(campaignId, "campaignId");
        i.g(imageUrl, "imageUrl");
        try {
            String i6 = di.b.i(imageUrl);
            if (!dVar.e(campaignId, i6)) {
                return null;
            }
            return BitmapFactory.decodeFile(dVar.f(campaignId, i6));
        } catch (Throwable th2) {
            this.f35229a.f20105d.a(1, th2, new C0597a());
            return null;
        }
    }

    public final boolean b(Bitmap bitmap, String directoryName, String str) {
        ai.d dVar = this.f35231c;
        i.g(directoryName, "directoryName");
        try {
            String i6 = di.b.i(str);
            dVar.h(bitmap, directoryName, i6);
            return dVar.e(directoryName, i6);
        } catch (NoSuchAlgorithmException e10) {
            this.f35229a.f20105d.a(1, e10, new c(this));
            return false;
        }
    }
}
