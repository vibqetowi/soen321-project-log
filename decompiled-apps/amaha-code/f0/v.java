package f0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import com.theinnerhour.b2b.R;
import i0.f;
import java.io.InputStream;
import k0.a;
/* compiled from: NotificationCompat.java */
/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public t f14681a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f14682b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f14683c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14684d = false;

    public void a(Bundle bundle) {
        if (this.f14684d) {
            bundle.putCharSequence("android.summaryText", this.f14683c);
        }
        CharSequence charSequence = this.f14682b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String e10 = e();
        if (e10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", e10);
        }
    }

    public abstract void b(w wVar);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.drawable.Drawable] */
    public final Bitmap c(IconCompat iconCompat, int i6, int i10) {
        BitmapDrawable bitmapDrawable;
        Drawable drawable;
        BitmapDrawable bitmapDrawable2;
        int i11;
        Object obj;
        Context context = this.f14681a.f14657a;
        if (iconCompat.f1959a == 2 && (obj = iconCompat.f1960b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if ("0_resource_name_obfuscated".equals(str4)) {
                    Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                } else {
                    String e10 = iconCompat.e();
                    int identifier = IconCompat.f(context, e10).getIdentifier(str4, str3, str5);
                    if (iconCompat.f1963e != identifier) {
                        Log.i("IconCompat", "Id has changed for " + e10 + " " + str);
                        iconCompat.f1963e = identifier;
                    }
                }
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 23) {
            drawable = IconCompat.a.e(iconCompat.j(context), context);
        } else {
            switch (iconCompat.f1959a) {
                case 1:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), (Bitmap) iconCompat.f1960b);
                    break;
                case 2:
                    String e11 = iconCompat.e();
                    if (TextUtils.isEmpty(e11)) {
                        e11 = context.getPackageName();
                    }
                    Resources f = IconCompat.f(context, e11);
                    try {
                        int i13 = iconCompat.f1963e;
                        Resources.Theme theme = context.getTheme();
                        ThreadLocal<TypedValue> threadLocal = i0.f.f19628a;
                        bitmapDrawable2 = f.a.a(f, i13, theme);
                        bitmapDrawable = bitmapDrawable2;
                        break;
                    } catch (RuntimeException e12) {
                        Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(iconCompat.f1963e), iconCompat.f1960b), e12);
                        break;
                    }
                case 3:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) iconCompat.f1960b, iconCompat.f1963e, iconCompat.f));
                    break;
                case 4:
                    InputStream i14 = iconCompat.i(context);
                    if (i14 != null) {
                        bitmapDrawable = new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(i14));
                        break;
                    }
                    bitmapDrawable = null;
                    break;
                case 5:
                    bitmapDrawable = new BitmapDrawable(context.getResources(), IconCompat.a((Bitmap) iconCompat.f1960b, false));
                    break;
                case 6:
                    InputStream i15 = iconCompat.i(context);
                    if (i15 != null) {
                        if (i12 >= 26) {
                            bitmapDrawable2 = IconCompat.b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(i15)));
                            bitmapDrawable = bitmapDrawable2;
                            break;
                        } else {
                            bitmapDrawable = new BitmapDrawable(context.getResources(), IconCompat.a(BitmapFactory.decodeStream(i15), false));
                            break;
                        }
                    }
                    bitmapDrawable = null;
                    break;
                default:
                    bitmapDrawable = null;
                    break;
            }
            if (bitmapDrawable != null && (iconCompat.f1964g != null || iconCompat.f1965h != IconCompat.f1958k)) {
                bitmapDrawable.mutate();
                a.b.h(bitmapDrawable, iconCompat.f1964g);
                a.b.i(bitmapDrawable, iconCompat.f1965h);
            }
            drawable = bitmapDrawable;
        }
        if (i10 == 0) {
            i11 = drawable.getIntrinsicWidth();
        } else {
            i11 = i10;
        }
        if (i10 == 0) {
            i10 = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i11, i10, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i11, i10);
        if (i6 != 0) {
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_IN));
        }
        drawable.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public final Bitmap d(int i6, int i10, int i11, int i12) {
        if (i12 == 0) {
            i12 = 0;
        }
        Context context = this.f14681a.f14657a;
        PorterDuff.Mode mode = IconCompat.f1958k;
        context.getClass();
        Bitmap c10 = c(IconCompat.b(context.getResources(), context.getPackageName(), R.drawable.notification_icon_background), i12, i10);
        Canvas canvas = new Canvas(c10);
        Drawable mutate = this.f14681a.f14657a.getResources().getDrawable(i6).mutate();
        mutate.setFilterBitmap(true);
        int i13 = (i10 - i11) / 2;
        int i14 = i11 + i13;
        mutate.setBounds(i13, i13, i14, i14);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return c10;
    }

    public String e() {
        return null;
    }

    public RemoteViews f() {
        return null;
    }

    public RemoteViews g() {
        return null;
    }

    public final void i(t tVar) {
        if (this.f14681a != tVar) {
            this.f14681a = tVar;
            if (tVar != null) {
                tVar.j(this);
            }
        }
    }

    public void h() {
    }
}
