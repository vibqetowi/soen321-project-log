package vm;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.appsflyer.R;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.components.learningHub.experiment.activities.CreativeCarouselPagerActivity;
import hs.k;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.k1;
import kotlinx.coroutines.o0;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: CreativeCarouselPagerActivity.kt */
@ns.e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.CreativeCarouselPagerActivity$shareImage$1$1", f = "CreativeCarouselPagerActivity.kt", l = {R.styleable.AppCompatTheme_seekBarStyle}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public int f35275u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ CreativeCarouselPagerActivity f35276v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f35277w;

    /* compiled from: CreativeCarouselPagerActivity.kt */
    @ns.e(c = "com.theinnerhour.b2b.components.learningHub.experiment.activities.CreativeCarouselPagerActivity$shareImage$1$1$1$1", f = "CreativeCarouselPagerActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends i implements p<d0, ls.d<? super k>, Object> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ CreativeCarouselPagerActivity f35278u;

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Bitmap f35279v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CreativeCarouselPagerActivity creativeCarouselPagerActivity, Bitmap bitmap, ls.d<? super a> dVar) {
            super(2, dVar);
            this.f35278u = creativeCarouselPagerActivity;
            this.f35279v = bitmap;
        }

        @Override // ns.a
        public final ls.d<k> create(Object obj, ls.d<?> dVar) {
            return new a(this.f35278u, this.f35279v, dVar);
        }

        @Override // ss.p
        public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
            return ((a) create(d0Var, dVar)).invokeSuspend(k.f19476a);
        }

        @Override // ns.a
        public final Object invokeSuspend(Object obj) {
            sp.b.d0(obj);
            Bitmap bitmap = this.f35279v;
            kotlin.jvm.internal.i.f(bitmap, "bitmap");
            int i6 = CreativeCarouselPagerActivity.A;
            CreativeCarouselPagerActivity creativeCarouselPagerActivity = this.f35278u;
            creativeCarouselPagerActivity.getClass();
            String format = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss", Locale.ENGLISH).format(new Date());
            File file = new File(creativeCarouselPagerActivity.getFilesDir(), "images");
            if (!file.exists()) {
                file.mkdirs();
            }
            File createTempFile = File.createTempFile("share_image_" + format, ".png", file);
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            Uri b10 = FileProvider.b(creativeCarouselPagerActivity, "com.theinnerhour.b2b.provider", createTempFile);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setFlags(268435456);
            intent.addFlags(1);
            intent.putExtra("android.intent.extra.STREAM", b10);
            intent.putExtra("android.intent.extra.TEXT", creativeCarouselPagerActivity.getString(com.theinnerhour.b2b.R.string.resourceShareCreatives));
            intent.setType("image/jpg");
            creativeCarouselPagerActivity.startActivity(Intent.createChooser(intent, "Share using"));
            return k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CreativeCarouselPagerActivity creativeCarouselPagerActivity, String str, ls.d<? super b> dVar) {
        super(2, dVar);
        this.f35276v = creativeCarouselPagerActivity;
        this.f35277w = str;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> dVar) {
        return new b(this.f35276v, this.f35277w, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((b) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    @Override // ns.a
    public final Object invokeSuspend(Object obj) {
        ms.a aVar = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f35275u;
        if (i6 != 0) {
            if (i6 == 1) {
                sp.b.d0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            sp.b.d0(obj);
            CreativeCarouselPagerActivity creativeCarouselPagerActivity = this.f35276v;
            com.bumptech.glide.e<Bitmap> a10 = Glide.i(creativeCarouselPagerActivity).a();
            a10.Z = this.f35277w;
            a10.f5953b0 = true;
            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
            k1 k1Var = kotlinx.coroutines.internal.k.f23608a;
            a aVar2 = new a(creativeCarouselPagerActivity, (Bitmap) a10.E().get(), null);
            this.f35275u = 1;
            if (v.S(k1Var, aVar2, this) == aVar) {
                return aVar;
            }
        }
        return k.f19476a;
    }
}
