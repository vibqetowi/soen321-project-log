package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.OverlayListView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.theinnerhour.b2b.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import r1.l;
import v1.b;
/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes.dex */
public final class g extends androidx.appcompat.app.b {
    public static final boolean H0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    public static final int I0 = (int) TimeUnit.SECONDS.toMillis(30);
    public final j A;
    public int A0;
    public final l.g B;
    public int B0;
    public final Context C;
    public Interpolator C0;
    public boolean D;
    public final Interpolator D0;
    public boolean E;
    public final Interpolator E0;
    public int F;
    public final AccessibilityManager F0;
    public Button G;
    public final a G0;
    public Button H;
    public ImageButton I;
    public MediaRouteExpandCollapseButton J;
    public FrameLayout K;
    public LinearLayout L;
    public FrameLayout M;
    public ImageView N;
    public TextView O;
    public TextView P;
    public TextView Q;
    public final boolean R;
    public LinearLayout S;
    public RelativeLayout T;
    public LinearLayout U;
    public View V;
    public OverlayListView W;
    public l X;
    public ArrayList Y;
    public HashSet Z;

    /* renamed from: a0  reason: collision with root package name */
    public HashSet f2547a0;

    /* renamed from: b0  reason: collision with root package name */
    public HashSet f2548b0;
    public SeekBar c0;

    /* renamed from: d0  reason: collision with root package name */
    public k f2549d0;
    public l.g e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f2550f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f2551g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f2552h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f2553i0;

    /* renamed from: j0  reason: collision with root package name */
    public HashMap f2554j0;

    /* renamed from: k0  reason: collision with root package name */
    public MediaControllerCompat f2555k0;

    /* renamed from: l0  reason: collision with root package name */
    public final i f2556l0;

    /* renamed from: m0  reason: collision with root package name */
    public PlaybackStateCompat f2557m0;

    /* renamed from: n0  reason: collision with root package name */
    public MediaDescriptionCompat f2558n0;

    /* renamed from: o0  reason: collision with root package name */
    public h f2559o0;

    /* renamed from: p0  reason: collision with root package name */
    public Bitmap f2560p0;

    /* renamed from: q0  reason: collision with root package name */
    public Uri f2561q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f2562r0;

    /* renamed from: s0  reason: collision with root package name */
    public Bitmap f2563s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f2564t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2565u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f2566v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f2567w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f2568x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f2569y0;

    /* renamed from: z  reason: collision with root package name */
    public final r1.l f2570z;

    /* renamed from: z0  reason: collision with root package name */
    public int f2571z0;

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g gVar = g.this;
            gVar.h(true);
            gVar.W.requestLayout();
            gVar.W.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.e(gVar));
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            g.this.dismiss();
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PendingIntent sessionActivity;
            g gVar = g.this;
            MediaControllerCompat mediaControllerCompat = gVar.f2555k0;
            if (mediaControllerCompat != null && (sessionActivity = mediaControllerCompat.f861a.f863a.getSessionActivity()) != null) {
                try {
                    sessionActivity.send();
                    gVar.dismiss();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                }
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Interpolator interpolator;
            g gVar = g.this;
            boolean z10 = !gVar.f2567w0;
            gVar.f2567w0 = z10;
            if (z10) {
                gVar.W.setVisibility(0);
            }
            if (gVar.f2567w0) {
                interpolator = gVar.D0;
            } else {
                interpolator = gVar.E0;
            }
            gVar.C0 = interpolator;
            gVar.p(true);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class f implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ boolean f2576u;

        public f(boolean z10) {
            this.f2576u = z10;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            int i6;
            int i10;
            boolean z10;
            boolean z11;
            HashMap hashMap;
            HashMap hashMap2;
            Bitmap bitmap;
            ImageView.ScaleType scaleType;
            g gVar = g.this;
            gVar.M.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            if (gVar.f2568x0) {
                gVar.f2569y0 = true;
                return;
            }
            int i11 = gVar.S.getLayoutParams().height;
            g.k(-1, gVar.S);
            gVar.q(gVar.g());
            View decorView = gVar.getWindow().getDecorView();
            decorView.measure(View.MeasureSpec.makeMeasureSpec(gVar.getWindow().getAttributes().width, 1073741824), 0);
            g.k(i11, gVar.S);
            if ((gVar.N.getDrawable() instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) gVar.N.getDrawable()).getBitmap()) != null) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                if (width >= height) {
                    i6 = (int) (((gVar.F * height) / width) + 0.5f);
                } else {
                    i6 = (int) (((gVar.F * 9.0f) / 16.0f) + 0.5f);
                }
                ImageView imageView = gVar.N;
                if (bitmap.getWidth() >= bitmap.getHeight()) {
                    scaleType = ImageView.ScaleType.FIT_XY;
                } else {
                    scaleType = ImageView.ScaleType.FIT_CENTER;
                }
                imageView.setScaleType(scaleType);
            } else {
                i6 = 0;
            }
            int j10 = gVar.j(gVar.g());
            int size = gVar.Y.size();
            l.g gVar2 = gVar.B;
            if (gVar2.e()) {
                i10 = gVar2.b().size() * gVar.f2551g0;
            } else {
                i10 = 0;
            }
            if (size > 0) {
                i10 += gVar.f2553i0;
            }
            int min = Math.min(i10, gVar.f2552h0);
            if (!gVar.f2567w0) {
                min = 0;
            }
            int max = Math.max(i6, min) + j10;
            Rect rect = new Rect();
            decorView.getWindowVisibleDisplayFrame(rect);
            int height2 = rect.height() - (gVar.L.getMeasuredHeight() - gVar.M.getMeasuredHeight());
            if (i6 > 0 && max <= height2) {
                gVar.N.setVisibility(0);
                g.k(i6, gVar.N);
            } else {
                if (gVar.S.getMeasuredHeight() + gVar.W.getLayoutParams().height >= gVar.M.getMeasuredHeight()) {
                    gVar.N.setVisibility(8);
                }
                max = min + j10;
                i6 = 0;
            }
            if (gVar.g() && max <= height2) {
                gVar.T.setVisibility(0);
            } else {
                gVar.T.setVisibility(8);
            }
            if (gVar.T.getVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.q(z10);
            if (gVar.T.getVisibility() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int j11 = gVar.j(z11);
            int max2 = Math.max(i6, min) + j11;
            if (max2 > height2) {
                min -= max2 - height2;
            } else {
                height2 = max2;
            }
            gVar.S.clearAnimation();
            gVar.W.clearAnimation();
            gVar.M.clearAnimation();
            boolean z12 = this.f2576u;
            if (z12) {
                gVar.f(j11, gVar.S);
                gVar.f(min, gVar.W);
                gVar.f(height2, gVar.M);
            } else {
                g.k(j11, gVar.S);
                g.k(min, gVar.W);
                g.k(height2, gVar.M);
            }
            g.k(rect.height(), gVar.K);
            List<l.g> b10 = gVar2.b();
            if (b10.isEmpty()) {
                gVar.Y.clear();
                gVar.X.notifyDataSetChanged();
            } else if (new HashSet(gVar.Y).equals(new HashSet(b10))) {
                gVar.X.notifyDataSetChanged();
            } else {
                if (z12) {
                    OverlayListView overlayListView = gVar.W;
                    l lVar = gVar.X;
                    hashMap = new HashMap();
                    int firstVisiblePosition = overlayListView.getFirstVisiblePosition();
                    for (int i12 = 0; i12 < overlayListView.getChildCount(); i12++) {
                        l.g item = lVar.getItem(firstVisiblePosition + i12);
                        View childAt = overlayListView.getChildAt(i12);
                        hashMap.put(item, new Rect(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()));
                    }
                } else {
                    hashMap = null;
                }
                if (z12) {
                    OverlayListView overlayListView2 = gVar.W;
                    l lVar2 = gVar.X;
                    hashMap2 = new HashMap();
                    int firstVisiblePosition2 = overlayListView2.getFirstVisiblePosition();
                    for (int i13 = 0; i13 < overlayListView2.getChildCount(); i13++) {
                        l.g item2 = lVar2.getItem(firstVisiblePosition2 + i13);
                        View childAt2 = overlayListView2.getChildAt(i13);
                        Bitmap createBitmap = Bitmap.createBitmap(childAt2.getWidth(), childAt2.getHeight(), Bitmap.Config.ARGB_8888);
                        childAt2.draw(new Canvas(createBitmap));
                        hashMap2.put(item2, new BitmapDrawable(gVar.C.getResources(), createBitmap));
                    }
                } else {
                    hashMap2 = null;
                }
                ArrayList arrayList = gVar.Y;
                HashSet hashSet = new HashSet(b10);
                hashSet.removeAll(arrayList);
                gVar.Z = hashSet;
                HashSet hashSet2 = new HashSet(gVar.Y);
                hashSet2.removeAll(b10);
                gVar.f2547a0 = hashSet2;
                gVar.Y.addAll(0, gVar.Z);
                gVar.Y.removeAll(gVar.f2547a0);
                gVar.X.notifyDataSetChanged();
                if (z12 && gVar.f2567w0) {
                    if (gVar.f2547a0.size() + gVar.Z.size() > 0) {
                        gVar.W.setEnabled(false);
                        gVar.W.requestLayout();
                        gVar.f2568x0 = true;
                        gVar.W.getViewTreeObserver().addOnGlobalLayoutListener(new androidx.mediarouter.app.i(gVar, hashMap, hashMap2));
                        return;
                    }
                }
                gVar.Z = null;
                gVar.f2547a0 = null;
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* renamed from: androidx.mediarouter.app.g$g  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public final class View$OnClickListenerC0035g implements View.OnClickListener {
        public View$OnClickListenerC0035g() {
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(View view) {
            PlaybackStateCompat playbackStateCompat;
            boolean z10;
            boolean z11;
            AccessibilityManager accessibilityManager;
            boolean z12;
            int id2 = view.getId();
            int i6 = 1;
            g gVar = g.this;
            if (id2 != 16908313 && id2 != 16908314) {
                if (id2 == R.id.mr_control_playback_ctrl) {
                    MediaControllerCompat mediaControllerCompat = gVar.f2555k0;
                    if (mediaControllerCompat != null && (playbackStateCompat = gVar.f2557m0) != null) {
                        int i10 = 0;
                        if (playbackStateCompat.f915u == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            if ((playbackStateCompat.f919y & 514) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                mediaControllerCompat.c().f876a.pause();
                                i10 = R.string.mr_controller_pause;
                                accessibilityManager = gVar.F0;
                                if (accessibilityManager != null && accessibilityManager.isEnabled() && i10 != 0) {
                                    AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                    Context context = gVar.C;
                                    obtain.setPackageName(context.getPackageName());
                                    obtain.setClassName(View$OnClickListenerC0035g.class.getName());
                                    obtain.getText().add(context.getString(i10));
                                    accessibilityManager.sendAccessibilityEvent(obtain);
                                    return;
                                }
                                return;
                            }
                        }
                        if (z10) {
                            if ((playbackStateCompat.f919y & 1) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                mediaControllerCompat.c().f876a.stop();
                                i10 = R.string.mr_controller_stop;
                                accessibilityManager = gVar.F0;
                                if (accessibilityManager != null) {
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z10) {
                            if ((playbackStateCompat.f919y & 516) == 0) {
                                i6 = 0;
                            }
                            if (i6 != 0) {
                                mediaControllerCompat.c().f876a.play();
                                i10 = R.string.mr_controller_play;
                            }
                        }
                        accessibilityManager = gVar.F0;
                        if (accessibilityManager != null) {
                        }
                    }
                } else if (id2 == R.id.mr_close) {
                    gVar.dismiss();
                }
            } else {
                if (gVar.B.g()) {
                    if (id2 == 16908313) {
                        i6 = 2;
                    }
                    gVar.f2570z.getClass();
                    r1.l.i(i6);
                }
                gVar.dismiss();
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class h extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f2579a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f2580b;

        /* renamed from: c  reason: collision with root package name */
        public int f2581c;

        /* renamed from: d  reason: collision with root package name */
        public long f2582d;

        public h() {
            Bitmap bitmap;
            boolean z10;
            MediaDescriptionCompat mediaDescriptionCompat = g.this.f2558n0;
            if (mediaDescriptionCompat == null) {
                bitmap = null;
            } else {
                bitmap = mediaDescriptionCompat.f849y;
            }
            if (bitmap != null && bitmap.isRecycled()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
                bitmap = null;
            }
            this.f2579a = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = g.this.f2558n0;
            this.f2580b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f850z : null;
        }

        public final BufferedInputStream a(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if (!"android.resource".equals(lowerCase) && !"content".equals(lowerCase) && !"file".equals(lowerCase)) {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
                int i6 = g.I0;
                uRLConnection.setConnectTimeout(i6);
                uRLConnection.setReadTimeout(i6);
                openInputStream = uRLConnection.getInputStream();
            } else {
                openInputStream = g.this.C.getContentResolver().openInputStream(uri);
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x00a0: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:39:0x00a0 */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x00e1  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Bitmap doInBackground(Void[] voidArr) {
            boolean z10;
            InputStream inputStream;
            BufferedInputStream bufferedInputStream;
            float f;
            float f2;
            int i6 = 0;
            InputStream inputStream2 = null;
            Bitmap bitmap = this.f2579a;
            if (bitmap == null) {
                Uri uri = this.f2580b;
                try {
                    if (uri != null) {
                        try {
                            bufferedInputStream = a(uri);
                            try {
                                if (bufferedInputStream == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                    if (bufferedInputStream == null) {
                                        return null;
                                    }
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                    if (options.outWidth != 0 && options.outHeight != 0) {
                                        try {
                                            bufferedInputStream.reset();
                                        } catch (IOException unused) {
                                            bufferedInputStream.close();
                                            bufferedInputStream = a(uri);
                                            if (bufferedInputStream == null) {
                                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                                if (bufferedInputStream == null) {
                                                    return null;
                                                }
                                            }
                                        }
                                        options.inJustDecodeBounds = false;
                                        g gVar = g.this;
                                        int i10 = options.outWidth;
                                        int i11 = options.outHeight;
                                        if (i10 >= i11) {
                                            f = gVar.F * i11;
                                            f2 = i10;
                                        } else {
                                            f = gVar.F * 9.0f;
                                            f2 = 16.0f;
                                        }
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(i11 / ((int) ((f / f2) + 0.5f))));
                                        if (!isCancelled()) {
                                            bitmap = BitmapFactory.decodeStream(bufferedInputStream, null, options);
                                            try {
                                                bufferedInputStream.close();
                                            } catch (IOException unused2) {
                                            }
                                        }
                                    }
                                }
                                try {
                                    bufferedInputStream.close();
                                } catch (IOException unused3) {
                                    return null;
                                }
                            } catch (IOException e10) {
                                e = e10;
                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri, e);
                                if (bufferedInputStream != null) {
                                    try {
                                        bufferedInputStream.close();
                                    } catch (IOException unused4) {
                                    }
                                }
                                bitmap = null;
                                if (bitmap == null) {
                                }
                                z10 = false;
                                if (!z10) {
                                }
                            }
                        } catch (IOException e11) {
                            e = e11;
                            bufferedInputStream = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (inputStream2 != null) {
                                try {
                                    inputStream2.close();
                                } catch (IOException unused5) {
                                }
                            }
                            throw th;
                        }
                    }
                    bitmap = null;
                } catch (Throwable th3) {
                    th = th3;
                    inputStream2 = inputStream;
                }
            }
            if (bitmap == null && bitmap.isRecycled()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmap);
                return null;
            }
            if (bitmap != null && bitmap.getWidth() < bitmap.getHeight()) {
                b.C0588b c0588b = new b.C0588b(bitmap);
                c0588b.f34687c = 1;
                List<b.d> list = c0588b.a().f34680a;
                if (!Collections.unmodifiableList(list).isEmpty()) {
                    i6 = ((b.d) Collections.unmodifiableList(list).get(0)).f34693d;
                }
                this.f2581c = i6;
            }
            return bitmap;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            g gVar = g.this;
            gVar.f2559o0 = null;
            Bitmap bitmap3 = gVar.f2560p0;
            Bitmap bitmap4 = this.f2579a;
            boolean a10 = s0.b.a(bitmap3, bitmap4);
            Uri uri = this.f2580b;
            if (!a10 || !s0.b.a(gVar.f2561q0, uri)) {
                gVar.f2560p0 = bitmap4;
                gVar.f2563s0 = bitmap2;
                gVar.f2561q0 = uri;
                gVar.f2564t0 = this.f2581c;
                boolean z10 = true;
                gVar.f2562r0 = true;
                if (SystemClock.uptimeMillis() - this.f2582d <= 120) {
                    z10 = false;
                }
                gVar.m(z10);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            this.f2582d = SystemClock.uptimeMillis();
            g gVar = g.this;
            gVar.f2562r0 = false;
            gVar.f2563s0 = null;
            gVar.f2564t0 = 0;
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public final class i extends MediaControllerCompat.a {
        public i() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat b10;
            if (mediaMetadataCompat == null) {
                b10 = null;
            } else {
                b10 = mediaMetadataCompat.b();
            }
            g gVar = g.this;
            gVar.f2558n0 = b10;
            gVar.n();
            gVar.m(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void b(PlaybackStateCompat playbackStateCompat) {
            g gVar = g.this;
            gVar.f2557m0 = playbackStateCompat;
            gVar.m(false);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void d() {
            g gVar = g.this;
            MediaControllerCompat mediaControllerCompat = gVar.f2555k0;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.e(gVar.f2556l0);
                gVar.f2555k0 = null;
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public final class j extends l.a {
        public j() {
        }

        @Override // r1.l.a
        public final void e(r1.l lVar, l.g gVar) {
            g.this.m(true);
        }

        @Override // r1.l.a
        public final void h() {
            g.this.m(false);
        }

        @Override // r1.l.a
        public final void j(l.g gVar) {
            g gVar2 = g.this;
            SeekBar seekBar = (SeekBar) gVar2.f2554j0.get(gVar);
            int i6 = gVar.f30354o;
            if (g.H0) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + i6);
            }
            if (seekBar != null && gVar2.e0 != gVar) {
                seekBar.setProgress(i6);
            }
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class k implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public final a f2586a = new a();

        /* compiled from: MediaRouteControllerDialog.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                g gVar = g.this;
                if (gVar.e0 != null) {
                    gVar.e0 = null;
                    if (gVar.f2565u0) {
                        gVar.m(gVar.f2566v0);
                    }
                }
            }
        }

        public k() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            if (z10) {
                l.g gVar = (l.g) seekBar.getTag();
                if (g.H0) {
                    Log.d("MediaRouteCtrlDialog", "onProgressChanged(): calling MediaRouter.RouteInfo.requestSetVolume(" + i6 + ")");
                }
                gVar.j(i6);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            g gVar = g.this;
            if (gVar.e0 != null) {
                gVar.c0.removeCallbacks(this.f2586a);
            }
            gVar.e0 = (l.g) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            g.this.c0.postDelayed(this.f2586a, 500L);
        }
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class l extends ArrayAdapter<l.g> {

        /* renamed from: u  reason: collision with root package name */
        public final float f2589u;

        public l(Context context, List<l.g> list) {
            super(context, 0, list);
            this.f2589u = u.d(context);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i6, View view, ViewGroup viewGroup) {
            int i10;
            boolean z10;
            int i11 = 0;
            g gVar = g.this;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
            } else {
                gVar.getClass();
                g.k(gVar.f2551g0, (LinearLayout) view.findViewById(R.id.volume_item_container));
                View findViewById = view.findViewById(R.id.mr_volume_item_icon);
                ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                int i12 = gVar.f2550f0;
                layoutParams.width = i12;
                layoutParams.height = i12;
                findViewById.setLayoutParams(layoutParams);
            }
            l.g item = getItem(i6);
            if (item != null) {
                boolean z11 = item.f30346g;
                TextView textView = (TextView) view.findViewById(R.id.mr_name);
                textView.setEnabled(z11);
                textView.setText(item.f30344d);
                MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
                u.l(viewGroup.getContext(), mediaRouteVolumeSlider, gVar.W);
                mediaRouteVolumeSlider.setTag(item);
                gVar.f2554j0.put(item, mediaRouteVolumeSlider);
                mediaRouteVolumeSlider.b(!z11);
                mediaRouteVolumeSlider.setEnabled(z11);
                if (z11) {
                    if (gVar.R && item.f30353n == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        mediaRouteVolumeSlider.setMax(item.f30355p);
                        mediaRouteVolumeSlider.setProgress(item.f30354o);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(gVar.f2549d0);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.mr_volume_item_icon);
                if (z11) {
                    i10 = 255;
                } else {
                    i10 = (int) (this.f2589u * 255.0f);
                }
                imageView.setAlpha(i10);
                LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.volume_item_container);
                if (gVar.f2548b0.contains(item)) {
                    i11 = 4;
                }
                linearLayout.setVisibility(i11);
                HashSet hashSet = gVar.Z;
                if (hashSet != null && hashSet.contains(item)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    alphaAnimation.setDuration(0L);
                    alphaAnimation.setFillEnabled(true);
                    alphaAnimation.setFillAfter(true);
                    view.clearAnimation();
                    view.startAnimation(alphaAnimation);
                }
            }
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public final boolean isEnabled(int i6) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(Context context) {
        super(r4, u.b(r4));
        ContextThemeWrapper a10 = u.a(context, true);
        this.R = true;
        this.G0 = new a();
        Context context2 = getContext();
        this.C = context2;
        this.f2556l0 = new i();
        this.f2570z = r1.l.c(context2);
        this.A = new j();
        this.B = r1.l.e();
        l(r1.l.d());
        this.f2553i0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.F0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.D0 = AnimationUtils.loadInterpolator(a10, R.interpolator.mr_linear_out_slow_in);
        this.E0 = AnimationUtils.loadInterpolator(a10, R.interpolator.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    public static void k(int i6, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i6;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i6, ViewGroup viewGroup) {
        androidx.mediarouter.app.h hVar = new androidx.mediarouter.app.h(viewGroup.getLayoutParams().height, i6, viewGroup);
        hVar.setDuration(this.f2571z0);
        hVar.setInterpolator(this.C0);
        viewGroup.startAnimation(hVar);
    }

    public final boolean g() {
        if (this.f2558n0 == null && this.f2557m0 == null) {
            return false;
        }
        return true;
    }

    public final void h(boolean z10) {
        HashSet hashSet;
        int firstVisiblePosition = this.W.getFirstVisiblePosition();
        for (int i6 = 0; i6 < this.W.getChildCount(); i6++) {
            View childAt = this.W.getChildAt(i6);
            l.g item = this.X.getItem(firstVisiblePosition + i6);
            if (!z10 || (hashSet = this.Z) == null || !hashSet.contains(item)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        Iterator it = this.W.f2503u.iterator();
        while (it.hasNext()) {
            OverlayListView.a aVar = (OverlayListView.a) it.next();
            aVar.f2513k = true;
            aVar.f2514l = true;
            OverlayListView.a.InterfaceC0032a interfaceC0032a = aVar.f2515m;
            if (interfaceC0032a != null) {
                androidx.mediarouter.app.d dVar = (androidx.mediarouter.app.d) interfaceC0032a;
                g gVar = dVar.f2544b;
                gVar.f2548b0.remove(dVar.f2543a);
                gVar.X.notifyDataSetChanged();
            }
        }
        if (!z10) {
            i(false);
        }
    }

    public final void i(boolean z10) {
        this.Z = null;
        this.f2547a0 = null;
        this.f2568x0 = false;
        if (this.f2569y0) {
            this.f2569y0 = false;
            p(z10);
        }
        this.W.setEnabled(true);
    }

    public final int j(boolean z10) {
        int i6;
        if (!z10 && this.U.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.S.getPaddingBottom() + this.S.getPaddingTop() + 0;
        if (z10) {
            paddingBottom += this.T.getMeasuredHeight();
        }
        if (this.U.getVisibility() == 0) {
            i6 = this.U.getMeasuredHeight() + paddingBottom;
        } else {
            i6 = paddingBottom;
        }
        if (z10 && this.U.getVisibility() == 0) {
            return i6 + this.V.getMeasuredHeight();
        }
        return i6;
    }

    public final void l(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.f2555k0;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        i iVar = this.f2556l0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.e(iVar);
            this.f2555k0 = null;
        }
        if (token == null || !this.E) {
            return;
        }
        MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.C, token);
        this.f2555k0 = mediaControllerCompat2;
        mediaControllerCompat2.d(iVar);
        MediaMetadataCompat a10 = this.f2555k0.a();
        if (a10 != null) {
            mediaDescriptionCompat = a10.b();
        }
        this.f2558n0 = mediaDescriptionCompat;
        this.f2557m0 = this.f2555k0.b();
        n();
        m(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(boolean z10) {
        int i6;
        boolean z11;
        CharSequence charSequence;
        boolean z12;
        boolean z13;
        int i10;
        int i11;
        PlaybackStateCompat playbackStateCompat;
        boolean z14;
        int i12;
        int i13;
        boolean z15;
        boolean z16;
        boolean z17;
        int i14;
        boolean z18;
        boolean z19 = true;
        if (this.e0 != null) {
            this.f2565u0 = true;
            this.f2566v0 = z10 | this.f2566v0;
            return;
        }
        int i15 = 0;
        this.f2565u0 = false;
        this.f2566v0 = false;
        l.g gVar = this.B;
        if (gVar.g() && !gVar.d()) {
            if (!this.D) {
                return;
            }
            this.Q.setText(gVar.f30344d);
            Button button = this.G;
            if (gVar.f30348i) {
                i6 = 0;
            } else {
                i6 = 8;
            }
            button.setVisibility(i6);
            CharSequence charSequence2 = null;
            if (this.f2562r0) {
                Bitmap bitmap = this.f2563s0;
                if (bitmap != null && bitmap.isRecycled()) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f2563s0);
                } else {
                    this.N.setImageBitmap(this.f2563s0);
                    this.N.setBackgroundColor(this.f2564t0);
                }
                this.f2562r0 = false;
                this.f2563s0 = null;
                this.f2564t0 = 0;
            }
            if (this.R && gVar.f30353n == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                if (this.U.getVisibility() == 8) {
                    this.U.setVisibility(0);
                    this.c0.setMax(gVar.f30355p);
                    this.c0.setProgress(gVar.f30354o);
                    MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = this.J;
                    if (gVar.e()) {
                        i14 = 0;
                    } else {
                        i14 = 8;
                    }
                    mediaRouteExpandCollapseButton.setVisibility(i14);
                }
            } else {
                this.U.setVisibility(8);
            }
            if (g()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.f2558n0;
                if (mediaDescriptionCompat == null) {
                    charSequence = null;
                } else {
                    charSequence = mediaDescriptionCompat.f846v;
                }
                boolean z20 = !TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.f2558n0;
                if (mediaDescriptionCompat2 != null) {
                    charSequence2 = mediaDescriptionCompat2.f847w;
                }
                boolean z21 = !TextUtils.isEmpty(charSequence2);
                if (gVar.f30356q != -1) {
                    this.O.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.f2557m0;
                    if (playbackStateCompat2 != null && playbackStateCompat2.f915u != 0) {
                        if (!z20 && !z21) {
                            this.O.setText(R.string.mr_controller_no_info_available);
                        } else {
                            if (z20) {
                                this.O.setText(charSequence);
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z21) {
                                this.P.setText(charSequence2);
                                z13 = true;
                                TextView textView = this.O;
                                if (z12) {
                                    i10 = 0;
                                } else {
                                    i10 = 8;
                                }
                                textView.setVisibility(i10);
                                TextView textView2 = this.P;
                                if (z13) {
                                    i11 = 0;
                                } else {
                                    i11 = 8;
                                }
                                textView2.setVisibility(i11);
                                playbackStateCompat = this.f2557m0;
                                if (playbackStateCompat != null) {
                                    int i16 = playbackStateCompat.f915u;
                                    if (i16 != 6 && i16 != 3) {
                                        z14 = false;
                                    } else {
                                        z14 = true;
                                    }
                                    Context context = this.I.getContext();
                                    if (z14) {
                                        if ((this.f2557m0.f919y & 514) != 0) {
                                            z17 = true;
                                        } else {
                                            z17 = false;
                                        }
                                        if (z17) {
                                            i12 = R.attr.mediaRoutePauseDrawable;
                                            i13 = R.string.mr_controller_pause;
                                            ImageButton imageButton = this.I;
                                            if (!z19) {
                                                i15 = 8;
                                            }
                                            imageButton.setVisibility(i15);
                                            if (z19) {
                                                this.I.setImageResource(u.h(i12, context));
                                                this.I.setContentDescription(context.getResources().getText(i13));
                                            }
                                        }
                                    }
                                    if (z14) {
                                        if ((this.f2557m0.f919y & 1) != 0) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (z16) {
                                            i12 = R.attr.mediaRouteStopDrawable;
                                            i13 = R.string.mr_controller_stop;
                                            ImageButton imageButton2 = this.I;
                                            if (!z19) {
                                            }
                                            imageButton2.setVisibility(i15);
                                            if (z19) {
                                            }
                                        }
                                    }
                                    if (!z14) {
                                        if ((this.f2557m0.f919y & 516) != 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        if (z15) {
                                            i12 = R.attr.mediaRoutePlayDrawable;
                                            i13 = R.string.mr_controller_play;
                                            ImageButton imageButton22 = this.I;
                                            if (!z19) {
                                            }
                                            imageButton22.setVisibility(i15);
                                            if (z19) {
                                            }
                                        }
                                    }
                                    z19 = false;
                                    i12 = 0;
                                    i13 = 0;
                                    ImageButton imageButton222 = this.I;
                                    if (!z19) {
                                    }
                                    imageButton222.setVisibility(i15);
                                    if (z19) {
                                    }
                                }
                            }
                            z13 = false;
                            TextView textView3 = this.O;
                            if (z12) {
                            }
                            textView3.setVisibility(i10);
                            TextView textView22 = this.P;
                            if (z13) {
                            }
                            textView22.setVisibility(i11);
                            playbackStateCompat = this.f2557m0;
                            if (playbackStateCompat != null) {
                            }
                        }
                    } else {
                        this.O.setText(R.string.mr_controller_no_media_selected);
                    }
                }
                z12 = true;
                z13 = false;
                TextView textView32 = this.O;
                if (z12) {
                }
                textView32.setVisibility(i10);
                TextView textView222 = this.P;
                if (z13) {
                }
                textView222.setVisibility(i11);
                playbackStateCompat = this.f2557m0;
                if (playbackStateCompat != null) {
                }
            }
            p(z10);
            return;
        }
        dismiss();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0035, code lost:
        if (r0 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Uri uri;
        boolean z10;
        boolean z11;
        MediaDescriptionCompat mediaDescriptionCompat = this.f2558n0;
        Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f849y;
        }
        if (mediaDescriptionCompat != null) {
            uri2 = mediaDescriptionCompat.f850z;
        }
        h hVar = this.f2559o0;
        if (hVar == null) {
            bitmap2 = this.f2560p0;
        } else {
            bitmap2 = hVar.f2579a;
        }
        if (hVar == null) {
            uri = this.f2561q0;
        } else {
            uri = hVar.f2580b;
        }
        if (bitmap2 == bitmap) {
            if (bitmap2 == null) {
                if ((uri != null && uri.equals(uri2)) || (uri == null && uri2 == null)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            z10 = false;
            if (!z10) {
                h hVar2 = this.f2559o0;
                if (hVar2 != null) {
                    hVar2.cancel(true);
                }
                h hVar3 = new h();
                this.f2559o0 = hVar3;
                hVar3.execute(new Void[0]);
                return;
            }
            return;
        }
        z10 = true;
        if (!z10) {
        }
    }

    public final void o() {
        Context context = this.C;
        int a10 = m.a(context);
        getWindow().setLayout(a10, -2);
        View decorView = getWindow().getDecorView();
        this.F = (a10 - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.f2550f0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.f2551g0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.f2552h0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.f2560p0 = null;
        this.f2561q0 = null;
        n();
        m(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
        this.f2570z.a(r1.k.f30286c, this.A, 2);
        l(r1.l.d());
    }

    @Override // androidx.appcompat.app.b, g.r, androidx.activity.g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Interpolator interpolator;
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(17170445);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(16908315).setVisibility(8);
        View$OnClickListenerC0035g view$OnClickListenerC0035g = new View$OnClickListenerC0035g();
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.K = frameLayout;
        frameLayout.setOnClickListener(new b());
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.L = linearLayout;
        linearLayout.setOnClickListener(new c());
        Context context = this.C;
        int g5 = u.g(context, R.attr.colorPrimary);
        if (j0.d.c(g5, u.g(context, 16842801)) < 3.0d) {
            g5 = u.g(context, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(16908314);
        this.G = button;
        button.setText(R.string.mr_controller_disconnect);
        this.G.setTextColor(g5);
        this.G.setOnClickListener(view$OnClickListenerC0035g);
        Button button2 = (Button) findViewById(16908313);
        this.H = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.H.setTextColor(g5);
        this.H.setOnClickListener(view$OnClickListenerC0035g);
        this.Q = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(view$OnClickListenerC0035g);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.mr_custom_control);
        this.M = (FrameLayout) findViewById(R.id.mr_default_control);
        d dVar = new d();
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.N = imageView;
        imageView.setOnClickListener(dVar);
        findViewById(R.id.mr_control_title_container).setOnClickListener(dVar);
        this.S = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.V = findViewById(R.id.mr_control_divider);
        this.T = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.O = (TextView) findViewById(R.id.mr_control_title);
        this.P = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.I = imageButton;
        imageButton.setOnClickListener(view$OnClickListenerC0035g);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.U = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.c0 = seekBar;
        l.g gVar = this.B;
        seekBar.setTag(gVar);
        k kVar = new k();
        this.f2549d0 = kVar;
        this.c0.setOnSeekBarChangeListener(kVar);
        this.W = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.Y = new ArrayList();
        l lVar = new l(this.W.getContext(), this.Y);
        this.X = lVar;
        this.W.setAdapter((ListAdapter) lVar);
        this.f2548b0 = new HashSet();
        LinearLayout linearLayout3 = this.S;
        OverlayListView overlayListView = this.W;
        boolean e10 = gVar.e();
        int g10 = u.g(context, R.attr.colorPrimary);
        int g11 = u.g(context, R.attr.colorPrimaryDark);
        if (e10 && u.c(context) == -570425344) {
            g11 = g10;
            g10 = -1;
        }
        linearLayout3.setBackgroundColor(g10);
        overlayListView.setBackgroundColor(g11);
        linearLayout3.setTag(Integer.valueOf(g10));
        overlayListView.setTag(Integer.valueOf(g11));
        u.l(context, (MediaRouteVolumeSlider) this.c0, this.S);
        HashMap hashMap = new HashMap();
        this.f2554j0 = hashMap;
        hashMap.put(gVar, this.c0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.J = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.setOnClickListener(new e());
        if (this.f2567w0) {
            interpolator = this.D0;
        } else {
            interpolator = this.E0;
        }
        this.C0 = interpolator;
        this.f2571z0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.A0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.B0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.D = true;
        o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f2570z.g(this.A);
        l(null);
        this.E = false;
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.app.b, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        int i10;
        if (i6 != 25 && i6 != 24) {
            return super.onKeyDown(i6, keyEvent);
        }
        if (i6 == 25) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        this.B.k(i10);
        return true;
    }

    @Override // androidx.appcompat.app.b, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i6, KeyEvent keyEvent) {
        if (i6 != 25 && i6 != 24) {
            return super.onKeyUp(i6, keyEvent);
        }
        return true;
    }

    public final void p(boolean z10) {
        this.M.requestLayout();
        this.M.getViewTreeObserver().addOnGlobalLayoutListener(new f(z10));
    }

    public final void q(boolean z10) {
        int i6;
        View view = this.V;
        int i10 = 0;
        if (this.U.getVisibility() == 0 && z10) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        view.setVisibility(i6);
        LinearLayout linearLayout = this.S;
        if (this.U.getVisibility() == 8 && !z10) {
            i10 = 8;
        }
        linearLayout.setVisibility(i10);
    }

    /* compiled from: MediaRouteControllerDialog.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
        }
    }
}
