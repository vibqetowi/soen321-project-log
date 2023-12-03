package f5;

import android.graphics.Bitmap;
import android.net.Uri;
import com.appsflyer.R;
import com.canhub.cropper.b;
import com.canhub.cropper.c;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import hs.k;
import java.io.InputStream;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.o0;
import ns.i;
import ss.p;
import ta.v;
/* compiled from: BitmapLoadingWorkerJob.kt */
@ns.e(c = "com.canhub.cropper.BitmapLoadingWorkerJob$start$1", f = "BitmapLoadingWorkerJob.kt", l = {R.styleable.AppCompatTheme_borderlessButtonStyle, R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends i implements p<d0, ls.d<? super k>, Object> {

    /* renamed from: u  reason: collision with root package name */
    public /* synthetic */ Object f14813u;

    /* renamed from: v  reason: collision with root package name */
    public int f14814v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ com.canhub.cropper.b f14815w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.canhub.cropper.b bVar, ls.d dVar) {
        super(2, dVar);
        this.f14815w = bVar;
    }

    @Override // ns.a
    public final ls.d<k> create(Object obj, ls.d<?> completion) {
        kotlin.jvm.internal.i.g(completion, "completion");
        c cVar = new c(this.f14815w, completion);
        cVar.f14813u = obj;
        return cVar;
    }

    @Override // ss.p
    public final Object invoke(d0 d0Var, ls.d<? super k> dVar) {
        return ((c) create(d0Var, dVar)).invokeSuspend(k.f19476a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[Catch: Exception -> 0x00a2, TRY_ENTER, TryCatch #2 {Exception -> 0x00a2, blocks: (B:9:0x001c, B:12:0x0028, B:14:0x002e, B:16:0x0032, B:18:0x0040, B:29:0x005e, B:39:0x0075, B:41:0x0080, B:44:0x009d, B:40:0x007b), top: B:60:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b A[Catch: Exception -> 0x00a2, TryCatch #2 {Exception -> 0x00a2, blocks: (B:9:0x001c, B:12:0x0028, B:14:0x002e, B:16:0x0032, B:18:0x0040, B:29:0x005e, B:39:0x0075, B:41:0x0080, B:44:0x009d, B:40:0x007b), top: B:60:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d A[Catch: Exception -> 0x00a2, TRY_LEAVE, TryCatch #2 {Exception -> 0x00a2, blocks: (B:9:0x001c, B:12:0x0028, B:14:0x002e, B:16:0x0032, B:18:0x0040, B:29:0x005e, B:39:0x0075, B:41:0x0080, B:44:0x009d, B:40:0x007b), top: B:60:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1 A[RETURN] */
    @Override // ns.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        f1.a aVar;
        c.b bVar;
        Object S;
        InputStream openInputStream;
        Object obj2 = ms.a.COROUTINE_SUSPENDED;
        int i6 = this.f14814v;
        com.canhub.cropper.b bVar2 = this.f14815w;
        try {
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        sp.b.d0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    sp.b.d0(obj);
                }
            } else {
                sp.b.d0(obj);
                d0 d0Var = (d0) this.f14813u;
                if (kotlin.jvm.internal.h.E(d0Var)) {
                    androidx.fragment.app.p pVar = bVar2.f6072e;
                    Uri uri = bVar2.f;
                    c.a j10 = com.canhub.cropper.c.j(pVar, uri, bVar2.f6068a, bVar2.f6069b);
                    if (kotlin.jvm.internal.h.E(d0Var)) {
                        Bitmap bitmap = j10.f6084a;
                        try {
                            openInputStream = bVar2.f6072e.getContentResolver().openInputStream(uri);
                        } catch (Exception unused) {
                        }
                        if (openInputStream != null) {
                            aVar = new f1.a(openInputStream);
                            try {
                                openInputStream.close();
                            } catch (Exception unused2) {
                            }
                            int i10 = 0;
                            if (aVar == null) {
                                int e10 = aVar.e();
                                if (e10 != 3) {
                                    if (e10 != 6) {
                                        if (e10 == 8) {
                                            i10 = SubsamplingScaleImageView.ORIENTATION_270;
                                        }
                                    } else {
                                        i10 = 90;
                                    }
                                } else {
                                    i10 = SubsamplingScaleImageView.ORIENTATION_180;
                                }
                                bVar = new c.b(i10, bitmap);
                            } else {
                                bVar = new c.b(0, bitmap);
                            }
                            b.a aVar2 = new b.a(uri, bVar.f6086a, j10.f6085b, bVar.f6087b);
                            this.f14814v = 1;
                            kotlinx.coroutines.scheduling.c cVar = o0.f23640a;
                            S = v.S(kotlinx.coroutines.internal.k.f23608a, new b(bVar2, aVar2, null), this);
                            if (S == obj2) {
                                S = k.f19476a;
                            }
                            if (S == obj2) {
                                return obj2;
                            }
                        }
                        aVar = null;
                        int i102 = 0;
                        if (aVar == null) {
                        }
                        b.a aVar22 = new b.a(uri, bVar.f6086a, j10.f6085b, bVar.f6087b);
                        this.f14814v = 1;
                        kotlinx.coroutines.scheduling.c cVar2 = o0.f23640a;
                        S = v.S(kotlinx.coroutines.internal.k.f23608a, new b(bVar2, aVar22, null), this);
                        if (S == obj2) {
                        }
                        if (S == obj2) {
                        }
                    }
                }
            }
        } catch (Exception e11) {
            b.a aVar3 = new b.a(bVar2.f, e11);
            this.f14814v = 2;
            kotlinx.coroutines.scheduling.c cVar3 = o0.f23640a;
            Object S2 = v.S(kotlinx.coroutines.internal.k.f23608a, new b(bVar2, aVar3, null), this);
            if (S2 != obj2) {
                S2 = k.f19476a;
            }
            if (S2 == obj2) {
                return obj2;
            }
        }
        return k.f19476a;
    }
}
