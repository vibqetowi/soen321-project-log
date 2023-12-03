package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c9.g;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.c;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.google.common.collect.s;
import com.theinnerhour.b2b.R;
import d9.h;
import d9.q;
import e9.j;
import g0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import o8.p;
/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int U = 0;
    public final SubtitleView A;
    public final View B;
    public final TextView C;
    public final c D;
    public final FrameLayout E;
    public final FrameLayout F;
    public w G;
    public boolean H;
    public c.d I;
    public boolean J;
    public Drawable K;
    public int L;
    public boolean M;
    public CharSequence N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;

    /* renamed from: u  reason: collision with root package name */
    public final a f7055u;

    /* renamed from: v  reason: collision with root package name */
    public final AspectRatioFrameLayout f7056v;

    /* renamed from: w  reason: collision with root package name */
    public final View f7057w;

    /* renamed from: x  reason: collision with root package name */
    public final View f7058x;

    /* renamed from: y  reason: collision with root package name */
    public final boolean f7059y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f7060z;

    public PlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z10;
        int i6;
        int i10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        int i13;
        int i14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i15;
        boolean z18;
        int color;
        a aVar = new a();
        this.f7055u = aVar;
        if (isInEditMode()) {
            this.f7056v = null;
            this.f7057w = null;
            this.f7058x = null;
            this.f7059y = false;
            this.f7060z = null;
            this.A = null;
            this.B = null;
            this.C = null;
            this.D = null;
            this.E = null;
            this.F = null;
            ImageView imageView = new ImageView(context);
            if (c9.w.f5205a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                color = resources.getColor(R.color.exo_edit_mode_background_color, null);
                imageView.setBackgroundColor(color);
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i16 = R.layout.exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, hc.d.f17374z, 0, 0);
            try {
                z13 = obtainStyledAttributes.hasValue(23);
                i10 = obtainStyledAttributes.getColor(23, 0);
                i16 = obtainStyledAttributes.getResourceId(12, R.layout.exo_player_view);
                z14 = obtainStyledAttributes.getBoolean(28, true);
                i13 = obtainStyledAttributes.getResourceId(6, 0);
                boolean z19 = obtainStyledAttributes.getBoolean(29, true);
                i11 = obtainStyledAttributes.getInt(24, 1);
                i6 = obtainStyledAttributes.getInt(14, 0);
                int i17 = obtainStyledAttributes.getInt(22, 5000);
                boolean z20 = obtainStyledAttributes.getBoolean(8, true);
                boolean z21 = obtainStyledAttributes.getBoolean(2, true);
                int integer = obtainStyledAttributes.getInteger(20, 0);
                this.M = obtainStyledAttributes.getBoolean(9, this.M);
                z10 = obtainStyledAttributes.getBoolean(7, true);
                obtainStyledAttributes.recycle();
                z12 = z20;
                i12 = integer;
                i14 = i17;
                z11 = z21;
                z15 = z19;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = true;
            i6 = 0;
            i10 = 0;
            i11 = 1;
            z11 = true;
            i12 = 0;
            z12 = true;
            z13 = false;
            z14 = true;
            i13 = 0;
            i14 = 5000;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i16, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f7056v = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i6);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f7057w = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i10);
        }
        if (aspectRatioFrameLayout != null && i11 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        this.f7058x = new SurfaceView(context);
                    } else {
                        try {
                            int i18 = h.f12670v;
                            this.f7058x = (View) h.class.getConstructor(Context.class).newInstance(context);
                        } catch (Exception e10) {
                            throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e10);
                        }
                    }
                } else {
                    try {
                        int i19 = j.F;
                        this.f7058x = (View) j.class.getConstructor(Context.class).newInstance(context);
                        z16 = true;
                        this.f7058x.setLayoutParams(layoutParams);
                        this.f7058x.setOnClickListener(aVar);
                        this.f7058x.setClickable(false);
                        aspectRatioFrameLayout.addView(this.f7058x, 0);
                    } catch (Exception e11) {
                        throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e11);
                    }
                }
            } else {
                this.f7058x = new TextureView(context);
            }
            z16 = false;
            this.f7058x.setLayoutParams(layoutParams);
            this.f7058x.setOnClickListener(aVar);
            this.f7058x.setClickable(false);
            aspectRatioFrameLayout.addView(this.f7058x, 0);
        } else {
            this.f7058x = null;
            z16 = false;
        }
        this.f7059y = z16;
        this.E = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.F = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f7060z = imageView2;
        if (z14 && imageView2 != null) {
            z17 = true;
        } else {
            z17 = false;
        }
        this.J = z17;
        if (i13 != 0) {
            Context context2 = getContext();
            Object obj = g0.a.f16164a;
            this.K = a.c.b(context2, i13);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.A = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.j();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.B = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.L = i12;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.C = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        c cVar = (c) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (cVar != null) {
            this.D = cVar;
        } else if (findViewById3 != null) {
            c cVar2 = new c(context, attributeSet);
            this.D = cVar2;
            cVar2.setId(R.id.exo_controller);
            cVar2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(cVar2, indexOfChild);
        } else {
            this.D = null;
        }
        c cVar3 = this.D;
        if (cVar3 != null) {
            i15 = i14;
        } else {
            i15 = 0;
        }
        this.O = i15;
        this.R = z12;
        this.P = z11;
        this.Q = z10;
        if (z15 && cVar3 != null) {
            z18 = true;
        } else {
            z18 = false;
        }
        this.H = z18;
        if (cVar3 != null) {
            cVar3.c();
        }
        j();
        c cVar4 = this.D;
        if (cVar4 != null) {
            cVar4.f7118v.add(aVar);
        }
    }

    public static void a(TextureView textureView, int i6) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i6 != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i6, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    public final boolean b() {
        w wVar = this.G;
        if (wVar != null && wVar.b() && this.G.h()) {
            return true;
        }
        return false;
    }

    public final void c(boolean z10) {
        boolean z11;
        if ((!b() || !this.Q) && m()) {
            c cVar = this.D;
            if (cVar.e() && cVar.getShowTimeoutMs() <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean e10 = e();
            if (z10 || z11 || e10) {
                f(e10);
            }
        }
    }

    public final boolean d(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f7056v;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f);
                }
                ImageView imageView = this.f7060z;
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        w wVar = this.G;
        if (wVar != null && wVar.b()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 19 && keyCode != 270 && keyCode != 22 && keyCode != 271 && keyCode != 20 && keyCode != 269 && keyCode != 21 && keyCode != 268 && keyCode != 23) {
            z10 = false;
        } else {
            z10 = true;
        }
        c cVar = this.D;
        if (z10 && m() && !cVar.e()) {
            c(true);
        } else {
            if (m() && cVar.a(keyEvent)) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11 && !super.dispatchKeyEvent(keyEvent)) {
                if (!z10 || !m()) {
                    return false;
                }
                c(true);
                return false;
            }
            c(true);
        }
        return true;
    }

    public final boolean e() {
        w wVar = this.G;
        if (wVar == null) {
            return true;
        }
        int p10 = wVar.p();
        if (this.P && (p10 == 1 || p10 == 4 || !this.G.h())) {
            return true;
        }
        return false;
    }

    public final void f(boolean z10) {
        int i6;
        if (!m()) {
            return;
        }
        if (z10) {
            i6 = 0;
        } else {
            i6 = this.O;
        }
        c cVar = this.D;
        cVar.setShowTimeoutMs(i6);
        if (!cVar.e()) {
            cVar.setVisibility(0);
            Iterator<c.d> it = cVar.f7118v.iterator();
            while (it.hasNext()) {
                cVar.getVisibility();
                it.next().d();
            }
            cVar.i();
            cVar.h();
            cVar.k();
            cVar.l();
            cVar.m();
            boolean f = cVar.f();
            View view = cVar.f7124z;
            View view2 = cVar.f7123y;
            if (!f && view2 != null) {
                view2.requestFocus();
            } else if (f && view != null) {
                view.requestFocus();
            }
            boolean f2 = cVar.f();
            if (!f2 && view2 != null) {
                view2.sendAccessibilityEvent(8);
            } else if (f2 && view != null) {
                view.sendAccessibilityEvent(8);
            }
        }
        cVar.d();
    }

    public final boolean g() {
        if (m() && this.G != null) {
            c cVar = this.D;
            if (!cVar.e()) {
                c(true);
            } else if (this.R) {
                cVar.c();
            }
            return true;
        }
        return false;
    }

    public List<a9.a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.F;
        if (frameLayout != null) {
            arrayList.add(new a9.a(frameLayout, 3, "Transparent overlay does not impact viewability", 0));
        }
        c cVar = this.D;
        if (cVar != null) {
            arrayList.add(new a9.a(cVar));
        }
        return s.z(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.E;
        sc.b.F(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.P;
    }

    public boolean getControllerHideOnTouch() {
        return this.R;
    }

    public int getControllerShowTimeoutMs() {
        return this.O;
    }

    public Drawable getDefaultArtwork() {
        return this.K;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.F;
    }

    public w getPlayer() {
        return this.G;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f7056v;
        sc.b.E(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.A;
    }

    public boolean getUseArtwork() {
        return this.J;
    }

    public boolean getUseController() {
        return this.H;
    }

    public View getVideoSurfaceView() {
        return this.f7058x;
    }

    public final void h() {
        q qVar;
        float f;
        w wVar = this.G;
        if (wVar != null) {
            qVar = wVar.u();
        } else {
            qVar = q.f12712y;
        }
        int i6 = qVar.f12713u;
        float f2 = 0.0f;
        int i10 = qVar.f12714v;
        if (i10 != 0 && i6 != 0) {
            f = (i6 * qVar.f12716x) / i10;
        } else {
            f = 0.0f;
        }
        View view = this.f7058x;
        if (view instanceof TextureView) {
            int i11 = qVar.f12715w;
            if (f > 0.0f && (i11 == 90 || i11 == 270)) {
                f = 1.0f / f;
            }
            int i12 = this.S;
            a aVar = this.f7055u;
            if (i12 != 0) {
                view.removeOnLayoutChangeListener(aVar);
            }
            this.S = i11;
            if (i11 != 0) {
                view.addOnLayoutChangeListener(aVar);
            }
            a((TextureView) view, this.S);
        }
        if (!this.f7059y) {
            f2 = f;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f7056v;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r5.G.h() == false) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean z10;
        View view = this.B;
        if (view != null) {
            w wVar = this.G;
            int i6 = 0;
            if (wVar != null && wVar.p() == 2) {
                int i10 = this.L;
                z10 = true;
                if (i10 != 2) {
                    if (i10 == 1) {
                    }
                }
                if (!z10) {
                    i6 = 8;
                }
                view.setVisibility(i6);
            }
            z10 = false;
            if (!z10) {
            }
            view.setVisibility(i6);
        }
    }

    public final void j() {
        String str = null;
        c cVar = this.D;
        if (cVar != null && this.H) {
            if (cVar.getVisibility() == 0) {
                if (this.R) {
                    str = getResources().getString(R.string.exo_controls_hide);
                }
                setContentDescription(str);
                return;
            }
            setContentDescription(getResources().getString(R.string.exo_controls_show));
            return;
        }
        setContentDescription(null);
    }

    public final void k() {
        TextView textView = this.C;
        if (textView != null) {
            CharSequence charSequence = this.N;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            w wVar = this.G;
            if (wVar != null) {
                wVar.H();
            }
            textView.setVisibility(8);
        }
    }

    public final void l(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        w wVar = this.G;
        View view = this.f7057w;
        ImageView imageView = this.f7060z;
        boolean z14 = false;
        if (wVar != null && wVar.L(30) && !wVar.P().f6488u.isEmpty()) {
            if (z10 && !this.M && view != null) {
                view.setVisibility(0);
            }
            f0 P = wVar.P();
            int i6 = 0;
            while (true) {
                s<f0.a> sVar = P.f6488u;
                z11 = true;
                if (i6 < sVar.size()) {
                    f0.a aVar = sVar.get(i6);
                    boolean[] zArr = aVar.f6492x;
                    int length = zArr.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            if (zArr[i10]) {
                                z13 = true;
                                break;
                            }
                            i10++;
                        } else {
                            z13 = false;
                            break;
                        }
                    }
                    if (z13 && aVar.f6491w == 2) {
                        z12 = true;
                        break;
                    }
                    i6++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z12) {
                if (imageView != null) {
                    imageView.setImageResource(17170445);
                    imageView.setVisibility(4);
                    return;
                }
                return;
            }
            if (view != null) {
                view.setVisibility(0);
            }
            if (this.J) {
                sc.b.E(imageView);
            } else {
                z11 = false;
            }
            if (z11) {
                byte[] bArr = wVar.Y().E;
                if (bArr != null) {
                    z14 = d(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (z14 || d(this.K)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(17170445);
                imageView.setVisibility(4);
            }
        } else if (!this.M) {
            if (imageView != null) {
                imageView.setImageResource(17170445);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    public final boolean m() {
        if (this.H) {
            sc.b.E(this.D);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m() || this.G == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || !this.T) {
                return false;
            }
            this.T = false;
            performClick();
            return true;
        }
        this.T = true;
        return true;
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (m() && this.G != null) {
            c(true);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return g();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.a aVar) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f7056v;
        sc.b.E(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.P = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.Q = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        sc.b.E(this.D);
        this.R = z10;
        j();
    }

    public void setControllerShowTimeoutMs(int i6) {
        c cVar = this.D;
        sc.b.E(cVar);
        this.O = i6;
        if (cVar.e()) {
            f(e());
        }
    }

    public void setControllerVisibilityListener(c.d dVar) {
        c cVar = this.D;
        sc.b.E(cVar);
        c.d dVar2 = this.I;
        if (dVar2 == dVar) {
            return;
        }
        CopyOnWriteArrayList<c.d> copyOnWriteArrayList = cVar.f7118v;
        if (dVar2 != null) {
            copyOnWriteArrayList.remove(dVar2);
        }
        this.I = dVar;
        if (dVar != null) {
            copyOnWriteArrayList.add(dVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        boolean z10;
        if (this.C != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        this.N = charSequence;
        k();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.K != drawable) {
            this.K = drawable;
            l(false);
        }
    }

    public void setErrorMessageProvider(g<? super PlaybackException> gVar) {
        if (gVar != null) {
            k();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.M != z10) {
            this.M = z10;
            l(false);
        }
    }

    public void setPlayer(w wVar) {
        boolean z10;
        boolean z11;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        sc.b.C(z10);
        if (wVar != null && wVar.R() != Looper.getMainLooper()) {
            z11 = false;
        } else {
            z11 = true;
        }
        sc.b.q(z11);
        w wVar2 = this.G;
        if (wVar2 == wVar) {
            return;
        }
        View view = this.f7058x;
        a aVar = this.f7055u;
        if (wVar2 != null) {
            wVar2.v(aVar);
            if (wVar2.L(27)) {
                if (view instanceof TextureView) {
                    wVar2.t((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    wVar2.M((SurfaceView) view);
                }
            }
        }
        SubtitleView subtitleView = this.A;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.G = wVar;
        boolean m10 = m();
        c cVar = this.D;
        if (m10) {
            cVar.setPlayer(wVar);
        }
        i();
        k();
        l(true);
        if (wVar != null) {
            if (wVar.L(27)) {
                if (view instanceof TextureView) {
                    wVar.W((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    wVar.x((SurfaceView) view);
                }
                h();
            }
            if (subtitleView != null && wVar.L(28)) {
                subtitleView.setCues(wVar.G());
            }
            wVar.E(aVar);
            c(false);
        } else if (cVar != null) {
            cVar.c();
        }
    }

    public void setRepeatToggleModes(int i6) {
        c cVar = this.D;
        sc.b.E(cVar);
        cVar.setRepeatToggleModes(i6);
    }

    public void setResizeMode(int i6) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f7056v;
        sc.b.E(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i6);
    }

    public void setShowBuffering(int i6) {
        if (this.L != i6) {
            this.L = i6;
            i();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        c cVar = this.D;
        sc.b.E(cVar);
        cVar.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        c cVar = this.D;
        sc.b.E(cVar);
        cVar.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        c cVar = this.D;
        sc.b.E(cVar);
        cVar.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        c cVar = this.D;
        sc.b.E(cVar);
        cVar.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        c cVar = this.D;
        sc.b.E(cVar);
        cVar.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        c cVar = this.D;
        sc.b.E(cVar);
        cVar.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i6) {
        View view = this.f7057w;
        if (view != null) {
            view.setBackgroundColor(i6);
        }
    }

    public void setUseArtwork(boolean z10) {
        boolean z11;
        if (z10 && this.f7060z == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        sc.b.C(z11);
        if (this.J != z10) {
            this.J = z10;
            l(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11;
        c cVar = this.D;
        if (z10 && cVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        sc.b.C(z11);
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        if (m()) {
            cVar.setPlayer(this.G);
        } else if (cVar != null) {
            cVar.c();
            cVar.setPlayer(null);
        }
        j();
    }

    @Override // android.view.View
    public void setVisibility(int i6) {
        super.setVisibility(i6);
        View view = this.f7058x;
        if (view instanceof SurfaceView) {
            view.setVisibility(i6);
        }
    }

    /* loaded from: classes.dex */
    public final class a implements w.d, View.OnLayoutChangeListener, View.OnClickListener, c.d {

        /* renamed from: u  reason: collision with root package name */
        public final e0.b f7061u = new e0.b();

        /* renamed from: v  reason: collision with root package name */
        public Object f7062v;

        public a() {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final void c(q qVar) {
            int i6 = PlayerView.U;
            PlayerView.this.h();
        }

        @Override // com.google.android.exoplayer2.ui.c.d
        public final void d() {
            int i6 = PlayerView.U;
            PlayerView.this.j();
        }

        @Override // com.google.android.exoplayer2.w.d
        public final void f() {
            View view = PlayerView.this.f7057w;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // com.google.android.exoplayer2.w.d
        public final void h(List<p8.a> list) {
            SubtitleView subtitleView = PlayerView.this.A;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i6 = PlayerView.U;
            PlayerView.this.g();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i6, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
            PlayerView.a((TextureView) view, PlayerView.this.S);
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void r(f0 f0Var) {
            PlayerView playerView = PlayerView.this;
            w wVar = playerView.G;
            wVar.getClass();
            e0 Q = wVar.Q();
            if (Q.q()) {
                this.f7062v = null;
            } else {
                boolean isEmpty = wVar.P().f6488u.isEmpty();
                e0.b bVar = this.f7061u;
                if (!isEmpty) {
                    this.f7062v = Q.g(wVar.s(), bVar, true).f6466v;
                } else {
                    Object obj = this.f7062v;
                    if (obj != null) {
                        int c10 = Q.c(obj);
                        if (c10 != -1) {
                            if (wVar.K() == Q.g(c10, bVar, false).f6467w) {
                                return;
                            }
                        }
                        this.f7062v = null;
                    }
                }
            }
            playerView.l(false);
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void v(int i6, boolean z10) {
            int i10 = PlayerView.U;
            PlayerView playerView = PlayerView.this;
            playerView.i();
            if (playerView.b() && playerView.Q) {
                c cVar = playerView.D;
                if (cVar != null) {
                    cVar.c();
                    return;
                }
                return;
            }
            playerView.c(false);
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void x(int i6) {
            int i10 = PlayerView.U;
            PlayerView playerView = PlayerView.this;
            playerView.i();
            playerView.k();
            if (playerView.b() && playerView.Q) {
                c cVar = playerView.D;
                if (cVar != null) {
                    cVar.c();
                    return;
                }
                return;
            }
            playerView.c(false);
        }

        @Override // com.google.android.exoplayer2.w.b
        public final void z(int i6, w.e eVar, w.e eVar2) {
            c cVar;
            int i10 = PlayerView.U;
            PlayerView playerView = PlayerView.this;
            if (playerView.b() && playerView.Q && (cVar = playerView.D) != null) {
                cVar.c();
            }
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void N() {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void T() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void b() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void d0() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void e() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void i() {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void A(r rVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void C(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void L(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void a(g8.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void f0(v vVar) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void g(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void i0(q7.d dVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void l0(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void q(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void s(boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void t(w.a aVar) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void w(float f) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void y(int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void D(w wVar, w.c cVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void G(p pVar, z8.h hVar) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void R(com.google.android.exoplayer2.q qVar, int i6) {
        }

        @Override // com.google.android.exoplayer2.w.b
        public final /* synthetic */ void V(int i6, boolean z10) {
        }

        @Override // com.google.android.exoplayer2.w.d
        public final /* synthetic */ void e0(int i6, int i10) {
        }
    }
}
