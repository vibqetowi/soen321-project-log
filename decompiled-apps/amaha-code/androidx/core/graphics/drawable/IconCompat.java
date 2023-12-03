package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1958k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1959a;

    /* renamed from: b  reason: collision with root package name */
    public Object f1960b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1961c;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1962d;

    /* renamed from: e  reason: collision with root package name */
    public int f1963e;
    public int f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1964g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1965h;

    /* renamed from: i  reason: collision with root package name */
    public String f1966i;

    /* renamed from: j  reason: collision with root package name */
    public String f1967j;

    /* loaded from: classes.dex */
    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        public static int c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                return -1;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                return -1;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e12);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            Drawable loadDrawable;
            loadDrawable = icon.loadDrawable(context);
            return loadDrawable;
        }

        public static Icon f(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.f1959a) {
                case -1:
                    return (Icon) iconCompat.f1960b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.f1960b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.e(), iconCompat.f1963e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.f1960b, iconCompat.f1963e, iconCompat.f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.f1960b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT < 26) {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.a((Bitmap) iconCompat.f1960b, false));
                        break;
                    } else {
                        createWithBitmap = b.b((Bitmap) iconCompat.f1960b);
                        break;
                    }
                case 6:
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30) {
                        createWithBitmap = d.a(iconCompat.h());
                        break;
                    } else if (context != null) {
                        InputStream i10 = iconCompat.i(context);
                        if (i10 != null) {
                            if (i6 < 26) {
                                createWithBitmap = Icon.createWithBitmap(IconCompat.a(BitmapFactory.decodeStream(i10), false));
                                break;
                            } else {
                                createWithBitmap = b.b(BitmapFactory.decodeStream(i10));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.h());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.h());
                    }
            }
            ColorStateList colorStateList = iconCompat.f1964g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.f1965h;
            if (mode != IconCompat.f1958k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            Icon createWithAdaptiveBitmap;
            createWithAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
            return createWithAdaptiveBitmap;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static int a(Object obj) {
            int resId;
            resId = ((Icon) obj).getResId();
            return resId;
        }

        public static String b(Object obj) {
            String resPackage;
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }

        public static int c(Object obj) {
            int type;
            type = ((Icon) obj).getType();
            return type;
        }

        public static Uri d(Object obj) {
            Uri uri;
            uri = ((Icon) obj).getUri();
            return uri;
        }
    }

    /* loaded from: classes.dex */
    public static class d {
        public static Icon a(Uri uri) {
            Icon createWithAdaptiveBitmapContentUri;
            createWithAdaptiveBitmapContentUri = Icon.createWithAdaptiveBitmapContentUri(uri);
            return createWithAdaptiveBitmapContentUri;
        }
    }

    public IconCompat() {
        this.f1959a = -1;
        this.f1961c = null;
        this.f1962d = null;
        this.f1963e = 0;
        this.f = 0;
        this.f1964g = null;
        this.f1965h = f1958k;
        this.f1966i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f10 = 0.9166667f * f2;
        if (z10) {
            float f11 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f10, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i6) {
        str.getClass();
        if (i6 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f1963e = i6;
            if (resources != null) {
                try {
                    iconCompat.f1960b = resources.getResourceName(i6);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f1960b = str;
            }
            iconCompat.f1967j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public static Resources f(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo == null) {
                return null;
            }
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    public final Bitmap c() {
        int i6 = this.f1959a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f1960b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i6 == 1) {
            return (Bitmap) this.f1960b;
        } else {
            if (i6 == 5) {
                return a((Bitmap) this.f1960b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public final int d() {
        int i6 = this.f1959a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.a(this.f1960b);
        }
        if (i6 == 2) {
            return this.f1963e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final String e() {
        int i6 = this.f1959a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.f1960b);
        }
        if (i6 == 2) {
            String str = this.f1967j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.f1967j;
            }
            return ((String) this.f1960b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public final int g() {
        int i6 = this.f1959a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.c(this.f1960b);
        }
        return i6;
    }

    public final Uri h() {
        int i6 = this.f1959a;
        if (i6 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.d(this.f1960b);
        }
        if (i6 != 4 && i6 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f1960b);
    }

    public final InputStream i(Context context) {
        Uri h10 = h();
        String scheme = h10.getScheme();
        if (!"content".equals(scheme) && !"file".equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.f1960b));
            } catch (FileNotFoundException e10) {
                Log.w("IconCompat", "Unable to load image from path: " + h10, e10);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(h10);
        } catch (Exception e11) {
            Log.w("IconCompat", "Unable to load image from URI: " + h10, e11);
            return null;
        }
    }

    public final Icon j(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public final String toString() {
        String str;
        if (this.f1959a == -1) {
            return String.valueOf(this.f1960b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f1959a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f1959a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1960b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f1960b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1967j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(d())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1963e);
                if (this.f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1960b);
                break;
        }
        if (this.f1964g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1964g);
        }
        if (this.f1965h != f1958k) {
            sb2.append(" mode=");
            sb2.append(this.f1965h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public IconCompat(int i6) {
        this.f1961c = null;
        this.f1962d = null;
        this.f1963e = 0;
        this.f = 0;
        this.f1964g = null;
        this.f1965h = f1958k;
        this.f1966i = null;
        this.f1959a = i6;
    }
}
