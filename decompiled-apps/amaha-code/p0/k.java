package p0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.theinnerhour.b2b.utils.Constants;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final t.f<String, Typeface> f27846a = new t.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f27847b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f27848c;

    /* renamed from: d  reason: collision with root package name */
    public static final t.h<String, ArrayList<s0.a<a>>> f27849d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) Constants.TIMEOUT_MS, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f27847b = threadPoolExecutor;
        f27848c = new Object();
        f27849d = new t.h<>();
    }

    public static a a(String str, Context context, f fVar, int i6) {
        int i10;
        t.f<String, Typeface> fVar2 = f27846a;
        Typeface b10 = fVar2.b(str);
        if (b10 != null) {
            return new a(b10);
        }
        try {
            l a10 = e.a(context, fVar);
            int i11 = 1;
            m[] mVarArr = a10.f27853b;
            int i12 = a10.f27852a;
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = -2;
                }
                i10 = -3;
            } else {
                if (mVarArr != null && mVarArr.length != 0) {
                    i11 = 0;
                    for (m mVar : mVarArr) {
                        int i13 = mVar.f27858e;
                        if (i13 != 0) {
                            if (i13 >= 0) {
                                i10 = i13;
                            }
                            i10 = -3;
                        }
                    }
                }
                i10 = i11;
            }
            if (i10 != 0) {
                return new a(i10);
            }
            Typeface b11 = j0.h.f21630a.b(context, mVarArr, i6);
            if (b11 != null) {
                fVar2.c(str, b11);
                return new a(b11);
            }
            return new a(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* compiled from: FontRequestWorker.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f27850a;

        /* renamed from: b  reason: collision with root package name */
        public final int f27851b;

        public a(int i6) {
            this.f27850a = null;
            this.f27851b = i6;
        }

        public a(Typeface typeface) {
            this.f27850a = typeface;
            this.f27851b = 0;
        }
    }
}
