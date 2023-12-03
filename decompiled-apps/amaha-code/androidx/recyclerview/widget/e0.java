package androidx.recyclerview.widget;

import android.view.View;
import com.appsflyer.R;
/* compiled from: ViewBoundsCheck.java */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f2926a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2927b = new a();

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2928a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f2929b;

        /* renamed from: c  reason: collision with root package name */
        public int f2930c;

        /* renamed from: d  reason: collision with root package name */
        public int f2931d;

        /* renamed from: e  reason: collision with root package name */
        public int f2932e;

        public final boolean a() {
            int i6;
            int i10;
            int i11;
            int i12 = this.f2928a;
            int i13 = 2;
            if ((i12 & 7) != 0) {
                int i14 = this.f2931d;
                int i15 = this.f2929b;
                if (i14 > i15) {
                    i11 = 1;
                } else if (i14 == i15) {
                    i11 = 2;
                } else {
                    i11 = 4;
                }
                if (((i11 << 0) & i12) == 0) {
                    return false;
                }
            }
            if ((i12 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) != 0) {
                int i16 = this.f2931d;
                int i17 = this.f2930c;
                if (i16 > i17) {
                    i10 = 1;
                } else if (i16 == i17) {
                    i10 = 2;
                } else {
                    i10 = 4;
                }
                if (((i10 << 4) & i12) == 0) {
                    return false;
                }
            }
            if ((i12 & 1792) != 0) {
                int i18 = this.f2932e;
                int i19 = this.f2929b;
                if (i18 > i19) {
                    i6 = 1;
                } else if (i18 == i19) {
                    i6 = 2;
                } else {
                    i6 = 4;
                }
                if (((i6 << 8) & i12) == 0) {
                    return false;
                }
            }
            if ((i12 & 28672) != 0) {
                int i20 = this.f2932e;
                int i21 = this.f2930c;
                if (i20 > i21) {
                    i13 = 1;
                } else if (i20 != i21) {
                    i13 = 4;
                }
                if ((i12 & (i13 << 12)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: ViewBoundsCheck.java */
    /* loaded from: classes.dex */
    public interface b {
        int a(View view);

        int b();

        int c();

        View d(int i6);

        int e(View view);
    }

    public e0(b bVar) {
        this.f2926a = bVar;
    }

    public final View a(int i6, int i10, int i11, int i12) {
        int i13;
        b bVar = this.f2926a;
        int b10 = bVar.b();
        int c10 = bVar.c();
        if (i10 > i6) {
            i13 = 1;
        } else {
            i13 = -1;
        }
        View view = null;
        while (i6 != i10) {
            View d10 = bVar.d(i6);
            int a10 = bVar.a(d10);
            int e10 = bVar.e(d10);
            a aVar = this.f2927b;
            aVar.f2929b = b10;
            aVar.f2930c = c10;
            aVar.f2931d = a10;
            aVar.f2932e = e10;
            if (i11 != 0) {
                aVar.f2928a = i11 | 0;
                if (aVar.a()) {
                    return d10;
                }
            }
            if (i12 != 0) {
                aVar.f2928a = i12 | 0;
                if (aVar.a()) {
                    view = d10;
                }
            }
            i6 += i13;
        }
        return view;
    }

    public final boolean b(View view) {
        b bVar = this.f2926a;
        int b10 = bVar.b();
        int c10 = bVar.c();
        int a10 = bVar.a(view);
        int e10 = bVar.e(view);
        a aVar = this.f2927b;
        aVar.f2929b = b10;
        aVar.f2930c = c10;
        aVar.f2931d = a10;
        aVar.f2932e = e10;
        aVar.f2928a = 24579 | 0;
        return aVar.a();
    }
}
