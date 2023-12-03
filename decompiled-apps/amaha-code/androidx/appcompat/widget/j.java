package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.b1;
import com.theinnerhour.b2b.R;
/* compiled from: AppCompatDrawableManager.java */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f1439b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static j f1440c;

    /* renamed from: a  reason: collision with root package name */
    public b1 f1441a;

    /* compiled from: AppCompatDrawableManager.java */
    /* loaded from: classes.dex */
    public class a implements b1.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1442a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1443b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1444c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1445d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1446e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        public final int[] f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public static boolean a(int[] iArr, int i6) {
            for (int i10 : iArr) {
                if (i10 == i6) {
                    return true;
                }
            }
            return false;
        }

        public static ColorStateList b(int i6, Context context) {
            int c10 = g1.c(R.attr.colorControlHighlight, context);
            return new ColorStateList(new int[][]{g1.f1415b, g1.f1417d, g1.f1416c, g1.f}, new int[]{g1.b(R.attr.colorButtonNormal, context), j0.d.f(c10, i6), j0.d.f(c10, i6), i6});
        }

        public static LayerDrawable c(b1 b1Var, Context context, int i6) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i6);
            Drawable f = b1Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f2 = b1Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f instanceof BitmapDrawable) && f.getIntrinsicWidth() == dimensionPixelSize && f.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) f;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f2;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public static void e(Drawable drawable, int i6, PorterDuff.Mode mode) {
            int[] iArr = q0.f1510a;
            Drawable mutate = drawable.mutate();
            if (mode == null) {
                mode = j.f1439b;
            }
            mutate.setColorFilter(j.c(i6, mode));
        }

        public final ColorStateList d(int i6, Context context) {
            if (i6 == R.drawable.abc_edit_text_material) {
                return g0.a.c(R.color.abc_tint_edittext, context);
            }
            if (i6 == R.drawable.abc_switch_track_mtrl_alpha) {
                return g0.a.c(R.color.abc_tint_switch_track, context);
            }
            if (i6 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3];
                int[] iArr2 = new int[3];
                ColorStateList d10 = g1.d(R.attr.colorSwitchThumbNormal, context);
                if (d10 != null && d10.isStateful()) {
                    int[] iArr3 = g1.f1415b;
                    iArr[0] = iArr3;
                    iArr2[0] = d10.getColorForState(iArr3, 0);
                    iArr[1] = g1.f1418e;
                    iArr2[1] = g1.c(R.attr.colorControlActivated, context);
                    iArr[2] = g1.f;
                    iArr2[2] = d10.getDefaultColor();
                } else {
                    iArr[0] = g1.f1415b;
                    iArr2[0] = g1.b(R.attr.colorSwitchThumbNormal, context);
                    iArr[1] = g1.f1418e;
                    iArr2[1] = g1.c(R.attr.colorControlActivated, context);
                    iArr[2] = g1.f;
                    iArr2[2] = g1.c(R.attr.colorSwitchThumbNormal, context);
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i6 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(g1.c(R.attr.colorButtonNormal, context), context);
            } else {
                if (i6 == R.drawable.abc_btn_borderless_material) {
                    return b(0, context);
                }
                if (i6 == R.drawable.abc_btn_colored_material) {
                    return b(g1.c(R.attr.colorAccent, context), context);
                }
                if (i6 != R.drawable.abc_spinner_mtrl_am_alpha && i6 != R.drawable.abc_spinner_textfield_background_material) {
                    if (a(this.f1443b, i6)) {
                        return g1.d(R.attr.colorControlNormal, context);
                    }
                    if (a(this.f1446e, i6)) {
                        return g0.a.c(R.color.abc_tint_default, context);
                    }
                    if (a(this.f, i6)) {
                        return g0.a.c(R.color.abc_tint_btn_checkable, context);
                    }
                    if (i6 == R.drawable.abc_seekbar_thumb_material) {
                        return g0.a.c(R.color.abc_tint_seek_thumb, context);
                    }
                    return null;
                }
                return g0.a.c(R.color.abc_tint_spinner, context);
            }
        }
    }

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f1440c == null) {
                d();
            }
            jVar = f1440c;
        }
        return jVar;
    }

    public static synchronized PorterDuffColorFilter c(int i6, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (j.class) {
            h10 = b1.h(i6, mode);
        }
        return h10;
    }

    public static synchronized void d() {
        synchronized (j.class) {
            if (f1440c == null) {
                j jVar = new j();
                f1440c = jVar;
                jVar.f1441a = b1.d();
                f1440c.f1441a.l(new a());
            }
        }
    }

    public static void e(Drawable drawable, j1 j1Var, int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = b1.f1350h;
        int[] state = drawable.getState();
        int[] iArr2 = q0.f1510a;
        if (drawable.mutate() == drawable) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z11 = j1Var.f1462d;
        if (!z11 && !j1Var.f1461c) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z11) {
                colorStateList = j1Var.f1459a;
            } else {
                colorStateList = null;
            }
            if (j1Var.f1461c) {
                mode = j1Var.f1460b;
            } else {
                mode = b1.f1350h;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = b1.h(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i6) {
        return this.f1441a.f(context, i6);
    }
}
