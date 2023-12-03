package zo;

import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.utils.LogHelper;
import is.u;
import java.io.File;
import kotlinx.coroutines.d0;
/* compiled from: RecommendedActivityAudioFragment.kt */
@ns.e(c = "com.theinnerhour.b2b.components.recommendedActivities.fragment.RecommendedActivityAudioFragment$initUI$5", f = "RecommendedActivityAudioFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d extends ns.i implements ss.p<d0, ls.d<? super hs.k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ e f39688u;

    /* compiled from: RecommendedActivityAudioFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<Bitmap, hs.k> {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ e f39689u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar) {
            super(1);
            this.f39689u = eVar;
        }

        @Override // ss.l
        public final hs.k invoke(Bitmap bitmap) {
            Bitmap it = bitmap;
            kotlin.jvm.internal.i.g(it, "it");
            this.f39689u.T = it;
            return hs.k.f19476a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ls.d<? super d> dVar) {
        super(2, dVar);
        this.f39688u = eVar;
    }

    @Override // ns.a
    public final ls.d<hs.k> create(Object obj, ls.d<?> dVar) {
        return new d(this.f39688u, dVar);
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super hs.k> dVar) {
        return ((d) create(d0Var, dVar)).invokeSuspend(hs.k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009b A[Catch: Exception -> 0x009f, TRY_LEAVE, TryCatch #0 {Exception -> 0x009f, blocks: (B:3:0x000f, B:5:0x0019, B:9:0x0030, B:11:0x0043, B:14:0x009b, B:12:0x0073), top: B:20:0x000f }] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Bitmap bitmap;
        sp.b.d0(obj);
        e eVar = this.f39688u;
        a aVar = new a(eVar);
        int i6 = e.e0;
        eVar.getClass();
        try {
            String thumbUrl = eVar.Q().getThumbUrl();
            if (thumbUrl != null) {
                str = (String) u.p2(gv.r.a1(thumbUrl, new String[]{"/"}, 0, 6));
            } else {
                str = null;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(eVar.f39693u, e10);
        }
        if (str != null) {
            String[] fileList = eVar.requireActivity().fileList();
            kotlin.jvm.internal.i.f(fileList, "requireActivity().fileList()");
            if (is.k.Q1(str, fileList)) {
                com.bumptech.glide.e<Bitmap> a10 = Glide.g(eVar.requireActivity().getApplicationContext()).a();
                a10.Z = new File(eVar.requireActivity().getApplicationContext().getFilesDir(), str);
                a10.f5953b0 = true;
                bitmap = (Bitmap) a10.E().get();
                if (bitmap != null) {
                    aVar.invoke(bitmap);
                }
                return hs.k.f19476a;
            }
        }
        com.bumptech.glide.e<Bitmap> a11 = Glide.g(eVar.requireActivity().getApplicationContext()).a();
        a11.Z = eVar.Q().getThumbUrl();
        a11.f5953b0 = true;
        bitmap = (Bitmap) a11.E().get();
        if (bitmap != null) {
        }
        return hs.k.f19476a;
    }
}
