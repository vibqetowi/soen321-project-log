package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.theinnerhour.b2b.R;
import g0.a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k0.a;
import r1.g;
import r1.l;
import v1.b;
/* compiled from: MediaRouteDynamicControllerDialog.java */
/* loaded from: classes.dex */
public final class p extends g.r {

    /* renamed from: l0  reason: collision with root package name */
    public static final boolean f2621l0 = Log.isLoggable("MediaRouteCtrlDialog", 3);
    public r1.k A;
    public l.g B;
    public final ArrayList C;
    public final ArrayList D;
    public final ArrayList E;
    public final ArrayList F;
    public final Context G;
    public boolean H;
    public boolean I;
    public long J;
    public final a K;
    public RecyclerView L;
    public h M;
    public j N;
    public HashMap O;
    public l.g P;
    public HashMap Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public ImageButton U;
    public Button V;
    public ImageView W;
    public View X;
    public ImageView Y;
    public TextView Z;

    /* renamed from: a0  reason: collision with root package name */
    public TextView f2622a0;

    /* renamed from: b0  reason: collision with root package name */
    public String f2623b0;
    public MediaControllerCompat c0;

    /* renamed from: d0  reason: collision with root package name */
    public final e f2624d0;
    public MediaDescriptionCompat e0;

    /* renamed from: f0  reason: collision with root package name */
    public d f2625f0;

    /* renamed from: g0  reason: collision with root package name */
    public Bitmap f2626g0;

    /* renamed from: h0  reason: collision with root package name */
    public Uri f2627h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f2628i0;

    /* renamed from: j0  reason: collision with root package name */
    public Bitmap f2629j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f2630k0;

    /* renamed from: y  reason: collision with root package name */
    public final r1.l f2631y;

    /* renamed from: z  reason: collision with root package name */
    public final g f2632z;

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i6 = message.what;
            p pVar = p.this;
            if (i6 != 1) {
                if (i6 == 2 && pVar.P != null) {
                    pVar.P = null;
                    pVar.m();
                    return;
                }
                return;
            }
            pVar.l();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p.this.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            p pVar = p.this;
            if (pVar.B.g()) {
                pVar.f2631y.getClass();
                r1.l.i(2);
            }
            pVar.dismiss();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class d extends AsyncTask<Void, Void, Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f2636a;

        /* renamed from: b  reason: collision with root package name */
        public final Uri f2637b;

        /* renamed from: c  reason: collision with root package name */
        public int f2638c;

        public d() {
            Bitmap bitmap;
            boolean z10;
            MediaDescriptionCompat mediaDescriptionCompat = p.this.e0;
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
            this.f2636a = bitmap;
            MediaDescriptionCompat mediaDescriptionCompat2 = p.this.e0;
            this.f2637b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f850z : null;
        }

        public final BufferedInputStream a(Uri uri) {
            InputStream openInputStream;
            String lowerCase = uri.getScheme().toLowerCase();
            if (!"android.resource".equals(lowerCase) && !"content".equals(lowerCase) && !"file".equals(lowerCase)) {
                URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(uri.toString()).openConnection());
                uRLConnection.setConnectTimeout(30000);
                uRLConnection.setReadTimeout(30000);
                openInputStream = uRLConnection.getInputStream();
            } else {
                openInputStream = p.this.G.getContentResolver().openInputStream(uri);
            }
            if (openInputStream == null) {
                return null;
            }
            return new BufferedInputStream(openInputStream);
        }

        /* JADX WARN: Not initialized variable reg: 5, insn: 0x0090: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:33:0x0090 */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
        @Override // android.os.AsyncTask
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Bitmap doInBackground(Void[] voidArr) {
            boolean z10;
            InputStream inputStream;
            BufferedInputStream bufferedInputStream;
            int i6 = 0;
            InputStream inputStream2 = null;
            Bitmap bitmap = this.f2636a;
            if (bitmap == null) {
                Uri uri = this.f2637b;
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
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / p.this.G.getResources().getDimensionPixelSize(R.dimen.mr_cast_meta_art_size)));
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
                this.f2638c = i6;
            }
            return bitmap;
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Bitmap bitmap) {
            Bitmap bitmap2 = bitmap;
            p pVar = p.this;
            pVar.f2625f0 = null;
            Bitmap bitmap3 = pVar.f2626g0;
            Bitmap bitmap4 = this.f2636a;
            boolean a10 = s0.b.a(bitmap3, bitmap4);
            Uri uri = this.f2637b;
            if (!a10 || !s0.b.a(pVar.f2627h0, uri)) {
                pVar.f2626g0 = bitmap4;
                pVar.f2629j0 = bitmap2;
                pVar.f2627h0 = uri;
                pVar.f2630k0 = this.f2638c;
                pVar.f2628i0 = true;
                pVar.j();
            }
        }

        @Override // android.os.AsyncTask
        public final void onPreExecute() {
            p pVar = p.this;
            pVar.f2628i0 = false;
            pVar.f2629j0 = null;
            pVar.f2630k0 = 0;
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public final class e extends MediaControllerCompat.a {
        public e() {
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void a(MediaMetadataCompat mediaMetadataCompat) {
            MediaDescriptionCompat b10;
            if (mediaMetadataCompat == null) {
                b10 = null;
            } else {
                b10 = mediaMetadataCompat.b();
            }
            p pVar = p.this;
            pVar.e0 = b10;
            pVar.f();
            pVar.j();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public final void d() {
            p pVar = p.this;
            MediaControllerCompat mediaControllerCompat = pVar.c0;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.e(pVar.f2624d0);
                pVar.c0 = null;
            }
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public abstract class f extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public l.g f2641u;

        /* renamed from: v  reason: collision with root package name */
        public final ImageButton f2642v;

        /* renamed from: w  reason: collision with root package name */
        public final MediaRouteVolumeSlider f2643w;

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar = f.this;
                p pVar = p.this;
                if (pVar.P != null) {
                    pVar.K.removeMessages(2);
                }
                l.g gVar = fVar.f2641u;
                p pVar2 = p.this;
                pVar2.P = gVar;
                int i6 = 1;
                boolean z10 = !view.isActivated();
                if (z10) {
                    i6 = 0;
                } else {
                    Integer num = (Integer) pVar2.Q.get(fVar.f2641u.f30343c);
                    if (num != null) {
                        i6 = Math.max(1, num.intValue());
                    }
                }
                fVar.w(z10);
                fVar.f2643w.setProgress(i6);
                fVar.f2641u.j(i6);
                pVar2.K.sendEmptyMessageDelayed(2, 500L);
            }
        }

        public f(View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
            super(view);
            int b10;
            int b11;
            this.f2642v = imageButton;
            this.f2643w = mediaRouteVolumeSlider;
            Context context = p.this.G;
            Object obj = g0.a.f16164a;
            Drawable g5 = k0.a.g(a.c.b(context, R.drawable.mr_cast_mute_button));
            if (u.i(context)) {
                a.b.g(g5, g0.a.b(context, R.color.mr_dynamic_dialog_icon_light));
            }
            imageButton.setImageDrawable(g5);
            Context context2 = p.this.G;
            if (u.i(context2)) {
                b10 = g0.a.b(context2, R.color.mr_cast_progressbar_progress_and_thumb_light);
                b11 = g0.a.b(context2, R.color.mr_cast_progressbar_background_light);
            } else {
                b10 = g0.a.b(context2, R.color.mr_cast_progressbar_progress_and_thumb_dark);
                b11 = g0.a.b(context2, R.color.mr_cast_progressbar_background_dark);
            }
            mediaRouteVolumeSlider.a(b10, b11);
        }

        public final void v(l.g gVar) {
            boolean z10;
            this.f2641u = gVar;
            int i6 = gVar.f30354o;
            if (i6 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ImageButton imageButton = this.f2642v;
            imageButton.setActivated(z10);
            imageButton.setOnClickListener(new a());
            l.g gVar2 = this.f2641u;
            MediaRouteVolumeSlider mediaRouteVolumeSlider = this.f2643w;
            mediaRouteVolumeSlider.setTag(gVar2);
            mediaRouteVolumeSlider.setMax(gVar.f30355p);
            mediaRouteVolumeSlider.setProgress(i6);
            mediaRouteVolumeSlider.setOnSeekBarChangeListener(p.this.N);
        }

        public final void w(boolean z10) {
            ImageButton imageButton = this.f2642v;
            if (imageButton.isActivated() == z10) {
                return;
            }
            imageButton.setActivated(z10);
            p pVar = p.this;
            if (z10) {
                pVar.Q.put(this.f2641u.f30343c, Integer.valueOf(this.f2643w.getProgress()));
            } else {
                pVar.Q.remove(this.f2641u.f30343c);
            }
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public final class g extends l.a {
        public g() {
        }

        @Override // r1.l.a
        public final void d(r1.l lVar, l.g gVar) {
            p.this.l();
        }

        @Override // r1.l.a
        public final void e(r1.l lVar, l.g gVar) {
            g.b bVar;
            l.g.a a10;
            boolean z10;
            p pVar = p.this;
            boolean z11 = false;
            if (gVar == pVar.B) {
                g.e eVar = r1.l.f30291d.r;
                if (eVar instanceof g.b) {
                    bVar = (g.b) eVar;
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    l.f fVar = gVar.f30341a;
                    fVar.getClass();
                    r1.l.b();
                    Iterator it = Collections.unmodifiableList(fVar.f30338b).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        l.g gVar2 = (l.g) it.next();
                        if (!pVar.B.b().contains(gVar2) && (a10 = pVar.B.a(gVar2)) != null) {
                            g.b.a aVar = a10.f30361a;
                            if (aVar != null && aVar.f30272d) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 && !pVar.D.contains(gVar2)) {
                                z11 = true;
                                break;
                            }
                        }
                    }
                }
            }
            if (z11) {
                pVar.m();
                pVar.k();
                return;
            }
            pVar.l();
        }

        @Override // r1.l.a
        public final void f(r1.l lVar, l.g gVar) {
            p.this.l();
        }

        @Override // r1.l.a
        public final void g(l.g gVar) {
            p pVar = p.this;
            pVar.B = gVar;
            pVar.m();
            pVar.k();
        }

        @Override // r1.l.a
        public final void h() {
            p.this.l();
        }

        @Override // r1.l.a
        public final void j(l.g gVar) {
            f fVar;
            boolean z10;
            int i6 = gVar.f30354o;
            if (p.f2621l0) {
                Log.d("MediaRouteCtrlDialog", "onRouteVolumeChanged(), route.getVolume:" + i6);
            }
            p pVar = p.this;
            if (pVar.P != gVar && (fVar = (f) pVar.O.get(gVar.f30343c)) != null) {
                int i10 = fVar.f2641u.f30354o;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                fVar.w(z10);
                fVar.f2643w.setProgress(i10);
            }
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public final class h extends RecyclerView.e<RecyclerView.c0> {
        public final Drawable A;
        public final Drawable B;
        public final Drawable C;
        public d D;
        public final int E;
        public final AccelerateDecelerateInterpolator F;

        /* renamed from: x  reason: collision with root package name */
        public final ArrayList<d> f2647x = new ArrayList<>();

        /* renamed from: y  reason: collision with root package name */
        public final LayoutInflater f2648y;

        /* renamed from: z  reason: collision with root package name */
        public final Drawable f2649z;

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class a extends RecyclerView.c0 {

            /* renamed from: u  reason: collision with root package name */
            public final View f2650u;

            /* renamed from: v  reason: collision with root package name */
            public final ImageView f2651v;

            /* renamed from: w  reason: collision with root package name */
            public final ProgressBar f2652w;

            /* renamed from: x  reason: collision with root package name */
            public final TextView f2653x;

            /* renamed from: y  reason: collision with root package name */
            public final float f2654y;

            /* renamed from: z  reason: collision with root package name */
            public l.g f2655z;

            public a(View view) {
                super(view);
                this.f2650u = view;
                this.f2651v = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
                this.f2652w = progressBar;
                this.f2653x = (TextView) view.findViewById(R.id.mr_cast_group_name);
                this.f2654y = u.d(p.this.G);
                u.k(p.this.G, progressBar);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class b extends f {

            /* renamed from: y  reason: collision with root package name */
            public final TextView f2656y;

            /* renamed from: z  reason: collision with root package name */
            public final int f2657z;

            public b(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.f2656y = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
                Resources resources = p.this.G.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
                this.f2657z = (int) typedValue.getDimension(displayMetrics);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class c extends RecyclerView.c0 {

            /* renamed from: u  reason: collision with root package name */
            public final TextView f2658u;

            public c(View view) {
                super(view);
                this.f2658u = (TextView) view.findViewById(R.id.mr_cast_header_name);
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class d {

            /* renamed from: a  reason: collision with root package name */
            public final Object f2659a;

            /* renamed from: b  reason: collision with root package name */
            public final int f2660b;

            public d(Object obj, int i6) {
                this.f2659a = obj;
                this.f2660b = i6;
            }
        }

        /* compiled from: MediaRouteDynamicControllerDialog.java */
        /* loaded from: classes.dex */
        public class e extends f {
            public final ProgressBar A;
            public final TextView B;
            public final RelativeLayout C;
            public final CheckBox D;
            public final float E;
            public final int F;
            public final a G;

            /* renamed from: y  reason: collision with root package name */
            public final View f2661y;

            /* renamed from: z  reason: collision with root package name */
            public final ImageView f2662z;

            /* compiled from: MediaRouteDynamicControllerDialog.java */
            /* loaded from: classes.dex */
            public class a implements View.OnClickListener {
                public a() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z10;
                    boolean z11;
                    int i6;
                    boolean z12;
                    e eVar = e.this;
                    boolean z13 = true;
                    boolean z14 = !eVar.x(eVar.f2641u);
                    boolean e10 = eVar.f2641u.e();
                    int i10 = 0;
                    h hVar = h.this;
                    if (z14) {
                        r1.l lVar = p.this.f2631y;
                        l.g gVar = eVar.f2641u;
                        lVar.getClass();
                        r1.l.b();
                        l.d dVar = r1.l.f30291d;
                        if (dVar.r instanceof g.b) {
                            l.g.a a10 = dVar.f30313q.a(gVar);
                            if (!dVar.f30313q.b().contains(gVar) && a10 != null) {
                                g.b.a aVar = a10.f30361a;
                                if (aVar != null && aVar.f30272d) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    ((g.b) dVar.r).m(gVar.f30342b);
                                }
                            }
                            Log.w("MediaRouter", "Ignoring attemp to add a non-groupable route to dynamic group : " + gVar);
                        } else {
                            throw new IllegalStateException("There is no currently selected dynamic group route.");
                        }
                    } else {
                        r1.l lVar2 = p.this.f2631y;
                        l.g gVar2 = eVar.f2641u;
                        lVar2.getClass();
                        r1.l.b();
                        l.d dVar2 = r1.l.f30291d;
                        if (dVar2.r instanceof g.b) {
                            l.g.a a11 = dVar2.f30313q.a(gVar2);
                            if (dVar2.f30313q.b().contains(gVar2) && a11 != null) {
                                g.b.a aVar2 = a11.f30361a;
                                if (aVar2 != null && !aVar2.f30271c) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (z10) {
                                    if (dVar2.f30313q.b().size() <= 1) {
                                        Log.w("MediaRouter", "Ignoring attempt to remove the last member route.");
                                    } else {
                                        ((g.b) dVar2.r).n(gVar2.f30342b);
                                    }
                                }
                            }
                            Log.w("MediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + gVar2);
                        } else {
                            throw new IllegalStateException("There is no currently selected dynamic group route.");
                        }
                    }
                    eVar.y(z14, !e10);
                    if (e10) {
                        List<l.g> b10 = p.this.B.b();
                        for (l.g gVar3 : eVar.f2641u.b()) {
                            if (b10.contains(gVar3) != z14) {
                                f fVar = (f) p.this.O.get(gVar3.f30343c);
                                if (fVar instanceof e) {
                                    ((e) fVar).y(z14, true);
                                }
                            }
                        }
                    }
                    l.g gVar4 = eVar.f2641u;
                    p pVar = p.this;
                    List<l.g> b11 = pVar.B.b();
                    int max = Math.max(1, b11.size());
                    int i11 = -1;
                    if (gVar4.e()) {
                        for (l.g gVar5 : gVar4.b()) {
                            if (b11.contains(gVar5) != z14) {
                                if (z14) {
                                    i6 = 1;
                                } else {
                                    i6 = -1;
                                }
                                max += i6;
                            }
                        }
                    } else {
                        if (z14) {
                            i11 = 1;
                        }
                        max += i11;
                    }
                    if (p.this.B.b().size() > 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (max < 2) {
                        z13 = false;
                    }
                    if (z11 != z13) {
                        RecyclerView.c0 H = pVar.L.H(0);
                        if (H instanceof b) {
                            b bVar = (b) H;
                            View view2 = bVar.f2751a;
                            if (z13) {
                                i10 = bVar.f2657z;
                            }
                            hVar.v(i10, view2);
                        }
                    }
                }
            }

            public e(View view) {
                super(view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
                this.G = new a();
                this.f2661y = view;
                this.f2662z = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
                ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
                this.A = progressBar;
                this.B = (TextView) view.findViewById(R.id.mr_cast_route_name);
                this.C = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
                CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
                this.D = checkBox;
                p pVar = p.this;
                Context context = pVar.G;
                Object obj = g0.a.f16164a;
                Drawable g5 = k0.a.g(a.c.b(context, R.drawable.mr_cast_checkbox));
                if (u.i(context)) {
                    a.b.g(g5, g0.a.b(context, R.color.mr_dynamic_dialog_icon_light));
                }
                checkBox.setButtonDrawable(g5);
                Context context2 = pVar.G;
                u.k(context2, progressBar);
                this.E = u.d(context2);
                Resources resources = context2.getResources();
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                TypedValue typedValue = new TypedValue();
                resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
                this.F = (int) typedValue.getDimension(displayMetrics);
            }

            public final boolean x(l.g gVar) {
                int i6;
                if (gVar.g()) {
                    return true;
                }
                l.g.a a10 = p.this.B.a(gVar);
                if (a10 != null) {
                    g.b.a aVar = a10.f30361a;
                    if (aVar != null) {
                        i6 = aVar.f30270b;
                    } else {
                        i6 = 1;
                    }
                    if (i6 == 3) {
                        return true;
                    }
                }
                return false;
            }

            public final void y(boolean z10, boolean z11) {
                CheckBox checkBox = this.D;
                int i6 = 0;
                checkBox.setEnabled(false);
                this.f2661y.setEnabled(false);
                checkBox.setChecked(z10);
                if (z10) {
                    this.f2662z.setVisibility(4);
                    this.A.setVisibility(0);
                }
                if (z11) {
                    if (z10) {
                        i6 = this.F;
                    }
                    h.this.v(i6, this.C);
                }
            }
        }

        public h() {
            this.f2648y = LayoutInflater.from(p.this.G);
            Context context = p.this.G;
            this.f2649z = u.e(R.attr.mediaRouteDefaultIconDrawable, context);
            this.A = u.e(R.attr.mediaRouteTvIconDrawable, context);
            this.B = u.e(R.attr.mediaRouteSpeakerIconDrawable, context);
            this.C = u.e(R.attr.mediaRouteSpeakerGroupIconDrawable, context);
            this.E = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
            this.F = new AccelerateDecelerateInterpolator();
            y();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int f() {
            return this.f2647x.size() + 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final int h(int i6) {
            d dVar;
            if (i6 == 0) {
                dVar = this.D;
            } else {
                dVar = this.f2647x.get(i6 - 1);
            }
            return dVar.f2660b;
        }

        /* JADX WARN: Code restructure failed: missing block: B:52:0x010d, code lost:
            if (r12 != false) goto L52;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(RecyclerView.c0 c0Var, int i6) {
            d dVar;
            boolean z10;
            boolean z11;
            float f;
            float f2;
            boolean z12;
            int h10 = h(i6);
            if (i6 == 0) {
                dVar = this.D;
            } else {
                dVar = this.f2647x.get(i6 - 1);
            }
            boolean z13 = true;
            int i10 = 0;
            p pVar = p.this;
            if (h10 != 1) {
                if (h10 != 2) {
                    float f10 = 1.0f;
                    if (h10 != 3) {
                        if (h10 != 4) {
                            Log.w("MediaRouteCtrlDialog", "Cannot bind item to ViewHolder because of wrong view type");
                            return;
                        }
                        a aVar = (a) c0Var;
                        l.g gVar = (l.g) dVar.f2659a;
                        aVar.f2655z = gVar;
                        ImageView imageView = aVar.f2651v;
                        imageView.setVisibility(0);
                        aVar.f2652w.setVisibility(4);
                        h hVar = h.this;
                        List<l.g> b10 = p.this.B.b();
                        if (b10.size() == 1 && b10.get(0) == gVar) {
                            z13 = false;
                        }
                        if (!z13) {
                            f10 = aVar.f2654y;
                        }
                        View view = aVar.f2650u;
                        view.setAlpha(f10);
                        view.setOnClickListener(new s(aVar));
                        imageView.setImageDrawable(hVar.w(gVar));
                        aVar.f2653x.setText(gVar.f30344d);
                        return;
                    }
                    pVar.O.put(((l.g) dVar.f2659a).f30343c, (f) c0Var);
                    e eVar = (e) c0Var;
                    l.g gVar2 = (l.g) dVar.f2659a;
                    h hVar2 = h.this;
                    p pVar2 = p.this;
                    if (gVar2 == pVar2.B && gVar2.b().size() > 0) {
                        Iterator<l.g> it = gVar2.b().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            l.g next = it.next();
                            if (!pVar2.D.contains(next)) {
                                gVar2 = next;
                                break;
                            }
                        }
                    }
                    eVar.v(gVar2);
                    Drawable w10 = hVar2.w(gVar2);
                    ImageView imageView2 = eVar.f2662z;
                    imageView2.setImageDrawable(w10);
                    eVar.B.setText(gVar2.f30344d);
                    CheckBox checkBox = eVar.D;
                    checkBox.setVisibility(0);
                    boolean x10 = eVar.x(gVar2);
                    if (!pVar2.F.contains(gVar2) && (!eVar.x(gVar2) || pVar2.B.b().size() >= 2)) {
                        if (eVar.x(gVar2)) {
                            l.g.a a10 = pVar2.B.a(gVar2);
                            if (a10 != null) {
                                g.b.a aVar2 = a10.f30361a;
                                if (aVar2 != null && !aVar2.f30271c) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                            }
                        }
                        z10 = true;
                        checkBox.setChecked(x10);
                        eVar.A.setVisibility(4);
                        imageView2.setVisibility(0);
                        View view2 = eVar.f2661y;
                        view2.setEnabled(z10);
                        checkBox.setEnabled(z10);
                        if (z10 && !x10) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        eVar.f2642v.setEnabled(z11);
                        if (!z10 && !x10) {
                            z13 = false;
                        }
                        eVar.f2643w.setEnabled(z13);
                        e.a aVar3 = eVar.G;
                        view2.setOnClickListener(aVar3);
                        checkBox.setOnClickListener(aVar3);
                        if (x10 && !eVar.f2641u.e()) {
                            i10 = eVar.F;
                        }
                        RelativeLayout relativeLayout = eVar.C;
                        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                        layoutParams.height = i10;
                        relativeLayout.setLayoutParams(layoutParams);
                        f = eVar.E;
                        if (z10 && !x10) {
                            f2 = f;
                        } else {
                            f2 = 1.0f;
                        }
                        view2.setAlpha(f2);
                        if (!z10 && x10) {
                            f10 = f;
                        }
                        checkBox.setAlpha(f10);
                        return;
                    }
                    z10 = false;
                    checkBox.setChecked(x10);
                    eVar.A.setVisibility(4);
                    imageView2.setVisibility(0);
                    View view22 = eVar.f2661y;
                    view22.setEnabled(z10);
                    checkBox.setEnabled(z10);
                    if (z10) {
                    }
                    z11 = true;
                    eVar.f2642v.setEnabled(z11);
                    if (!z10) {
                        z13 = false;
                    }
                    eVar.f2643w.setEnabled(z13);
                    e.a aVar32 = eVar.G;
                    view22.setOnClickListener(aVar32);
                    checkBox.setOnClickListener(aVar32);
                    if (x10) {
                        i10 = eVar.F;
                    }
                    RelativeLayout relativeLayout2 = eVar.C;
                    ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
                    layoutParams2.height = i10;
                    relativeLayout2.setLayoutParams(layoutParams2);
                    f = eVar.E;
                    if (z10) {
                    }
                    f2 = 1.0f;
                    view22.setAlpha(f2);
                    if (!z10) {
                        f10 = f;
                    }
                    checkBox.setAlpha(f10);
                    return;
                }
                ((c) c0Var).f2658u.setText(dVar.f2659a.toString());
                return;
            }
            pVar.O.put(((l.g) dVar.f2659a).f30343c, (f) c0Var);
            b bVar = (b) c0Var;
            if (p.this.B.b().size() <= 1) {
                z13 = false;
            }
            if (z13) {
                i10 = bVar.f2657z;
            }
            View view3 = bVar.f2751a;
            ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
            layoutParams3.height = i10;
            view3.setLayoutParams(layoutParams3);
            l.g gVar3 = (l.g) dVar.f2659a;
            bVar.v(gVar3);
            bVar.f2656y.setText(gVar3.f30344d);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
            LayoutInflater layoutInflater = this.f2648y;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        if (i6 != 4) {
                            Log.w("MediaRouteCtrlDialog", "Cannot create ViewHolder because of wrong view type");
                            return null;
                        }
                        return new a(layoutInflater.inflate(R.layout.mr_cast_group_item, (ViewGroup) recyclerView, false));
                    }
                    return new e(layoutInflater.inflate(R.layout.mr_cast_route_item, (ViewGroup) recyclerView, false));
                }
                return new c(layoutInflater.inflate(R.layout.mr_cast_header_item, (ViewGroup) recyclerView, false));
            }
            return new b(layoutInflater.inflate(R.layout.mr_cast_group_volume_item, (ViewGroup) recyclerView, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.e
        public final void t(RecyclerView.c0 c0Var) {
            p.this.O.values().remove(c0Var);
        }

        public final void v(int i6, View view) {
            q qVar = new q(i6, view.getLayoutParams().height, view);
            qVar.setAnimationListener(new r(this));
            qVar.setDuration(this.E);
            qVar.setInterpolator(this.F);
            view.startAnimation(qVar);
        }

        public final Drawable w(l.g gVar) {
            Uri uri = gVar.f;
            if (uri != null) {
                try {
                    Drawable createFromStream = Drawable.createFromStream(p.this.G.getContentResolver().openInputStream(uri), null);
                    if (createFromStream != null) {
                        return createFromStream;
                    }
                } catch (IOException e10) {
                    Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e10);
                }
            }
            int i6 = gVar.f30352m;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (gVar.e()) {
                        return this.C;
                    }
                    return this.f2649z;
                }
                return this.B;
            }
            return this.A;
        }

        public final void x() {
            boolean z10;
            p pVar = p.this;
            pVar.F.clear();
            ArrayList arrayList = pVar.F;
            ArrayList arrayList2 = pVar.D;
            ArrayList arrayList3 = new ArrayList();
            l.f fVar = pVar.B.f30341a;
            fVar.getClass();
            r1.l.b();
            for (l.g gVar : Collections.unmodifiableList(fVar.f30338b)) {
                l.g.a a10 = pVar.B.a(gVar);
                if (a10 != null) {
                    g.b.a aVar = a10.f30361a;
                    if (aVar != null && aVar.f30272d) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList3.add(gVar);
                    }
                }
            }
            HashSet hashSet = new HashSet(arrayList2);
            hashSet.removeAll(arrayList3);
            arrayList.addAll(hashSet);
            i();
        }

        public final void y() {
            g.b bVar;
            String str;
            g.b bVar2;
            String str2;
            ArrayList<d> arrayList = this.f2647x;
            arrayList.clear();
            p pVar = p.this;
            this.D = new d(pVar.B, 1);
            ArrayList arrayList2 = pVar.C;
            if (!arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new d((l.g) it.next(), 3));
                }
            } else {
                arrayList.add(new d(pVar.B, 3));
            }
            ArrayList arrayList3 = pVar.D;
            boolean isEmpty = arrayList3.isEmpty();
            boolean z10 = false;
            Context context = pVar.G;
            if (!isEmpty) {
                Iterator it2 = arrayList3.iterator();
                boolean z11 = false;
                while (it2.hasNext()) {
                    l.g gVar = (l.g) it2.next();
                    if (!arrayList2.contains(gVar)) {
                        if (!z11) {
                            pVar.B.getClass();
                            g.e eVar = r1.l.f30291d.r;
                            if (eVar instanceof g.b) {
                                bVar2 = (g.b) eVar;
                            } else {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                str2 = bVar2.j();
                            } else {
                                str2 = null;
                            }
                            if (TextUtils.isEmpty(str2)) {
                                str2 = context.getString(R.string.mr_dialog_groupable_header);
                            }
                            arrayList.add(new d(str2, 2));
                            z11 = true;
                        }
                        arrayList.add(new d(gVar, 3));
                    }
                }
            }
            ArrayList arrayList4 = pVar.E;
            if (!arrayList4.isEmpty()) {
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    l.g gVar2 = (l.g) it3.next();
                    l.g gVar3 = pVar.B;
                    if (gVar3 != gVar2) {
                        if (!z10) {
                            gVar3.getClass();
                            g.e eVar2 = r1.l.f30291d.r;
                            if (eVar2 instanceof g.b) {
                                bVar = (g.b) eVar2;
                            } else {
                                bVar = null;
                            }
                            if (bVar != null) {
                                str = bVar.k();
                            } else {
                                str = null;
                            }
                            if (TextUtils.isEmpty(str)) {
                                str = context.getString(R.string.mr_dialog_transferable_header);
                            }
                            arrayList.add(new d(str, 2));
                            z10 = true;
                        }
                        arrayList.add(new d(gVar2, 4));
                    }
                }
            }
            x();
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public static final class i implements Comparator<l.g> {

        /* renamed from: u  reason: collision with root package name */
        public static final i f2664u = new i();

        @Override // java.util.Comparator
        public final int compare(l.g gVar, l.g gVar2) {
            return gVar.f30344d.compareToIgnoreCase(gVar2.f30344d);
        }
    }

    /* compiled from: MediaRouteDynamicControllerDialog.java */
    /* loaded from: classes.dex */
    public class j implements SeekBar.OnSeekBarChangeListener {
        public j() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            boolean z11;
            if (z10) {
                l.g gVar = (l.g) seekBar.getTag();
                f fVar = (f) p.this.O.get(gVar.f30343c);
                if (fVar != null) {
                    if (i6 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    fVar.w(z11);
                }
                gVar.j(i6);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            p pVar = p.this;
            if (pVar.P != null) {
                pVar.K.removeMessages(2);
            }
            pVar.P = (l.g) seekBar.getTag();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            p.this.K.sendEmptyMessageDelayed(2, 500L);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p(Context context) {
        super(r2, u.b(r2));
        ContextThemeWrapper a10 = u.a(context, false);
        this.A = r1.k.f30286c;
        this.C = new ArrayList();
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.K = new a();
        Context context2 = getContext();
        this.G = context2;
        this.f2631y = r1.l.c(context2);
        this.f2632z = new g();
        this.B = r1.l.e();
        this.f2624d0 = new e();
        g(r1.l.d());
    }

    public final void e(List<l.g> list) {
        boolean z10;
        for (int size = list.size() - 1; size >= 0; size--) {
            l.g gVar = list.get(size);
            if (!gVar.d() && gVar.f30346g && gVar.h(this.A) && this.B != gVar) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.e0;
        Uri uri2 = null;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f849y;
        }
        if (mediaDescriptionCompat != null) {
            uri2 = mediaDescriptionCompat.f850z;
        }
        d dVar = this.f2625f0;
        if (dVar == null) {
            bitmap2 = this.f2626g0;
        } else {
            bitmap2 = dVar.f2636a;
        }
        if (dVar == null) {
            uri = this.f2627h0;
        } else {
            uri = dVar.f2637b;
        }
        if (bitmap2 == bitmap && (bitmap2 != null || s0.b.a(uri, uri2))) {
            return;
        }
        d dVar2 = this.f2625f0;
        if (dVar2 != null) {
            dVar2.cancel(true);
        }
        d dVar3 = new d();
        this.f2625f0 = dVar3;
        dVar3.execute(new Void[0]);
    }

    public final void g(MediaSessionCompat.Token token) {
        MediaControllerCompat mediaControllerCompat = this.c0;
        MediaDescriptionCompat mediaDescriptionCompat = null;
        e eVar = this.f2624d0;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.e(eVar);
            this.c0 = null;
        }
        if (token == null || !this.I) {
            return;
        }
        MediaControllerCompat mediaControllerCompat2 = new MediaControllerCompat(this.G, token);
        this.c0 = mediaControllerCompat2;
        mediaControllerCompat2.d(eVar);
        MediaMetadataCompat a10 = this.c0.a();
        if (a10 != null) {
            mediaDescriptionCompat = a10.b();
        }
        this.e0 = mediaDescriptionCompat;
        f();
        j();
    }

    public final void h(r1.k kVar) {
        if (kVar != null) {
            if (!this.A.equals(kVar)) {
                this.A = kVar;
                if (this.I) {
                    r1.l lVar = this.f2631y;
                    g gVar = this.f2632z;
                    lVar.g(gVar);
                    lVar.a(kVar, gVar, 1);
                    k();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final void i() {
        int a10;
        Context context = this.G;
        int i6 = -1;
        if (!context.getResources().getBoolean(R.bool.is_tablet)) {
            a10 = -1;
        } else {
            a10 = m.a(context);
        }
        if (context.getResources().getBoolean(R.bool.is_tablet)) {
            i6 = -2;
        }
        getWindow().setLayout(a10, i6);
        this.f2626g0 = null;
        this.f2627h0 = null;
        f();
        j();
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean z10;
        boolean z11;
        MediaDescriptionCompat mediaDescriptionCompat;
        CharSequence charSequence;
        boolean z12;
        MediaDescriptionCompat mediaDescriptionCompat2;
        boolean isEmpty;
        boolean z13;
        if (this.P == null && !this.R) {
            z10 = !this.H;
        } else {
            z10 = true;
        }
        if (z10) {
            this.T = true;
            return;
        }
        this.T = false;
        if (!this.B.g() || this.B.d()) {
            dismiss();
        }
        CharSequence charSequence2 = null;
        if (this.f2628i0) {
            Bitmap bitmap = this.f2629j0;
            if (bitmap != null && bitmap.isRecycled()) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13 && this.f2629j0 != null) {
                this.Y.setVisibility(0);
                this.Y.setImageBitmap(this.f2629j0);
                this.Y.setBackgroundColor(this.f2630k0);
                this.X.setVisibility(0);
                Bitmap bitmap2 = this.f2629j0;
                RenderScript create = RenderScript.create(this.G);
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap2);
                Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                create2.setRadius(10.0f);
                create2.setInput(createFromBitmap);
                create2.forEach(createTyped);
                Bitmap copy = bitmap2.copy(bitmap2.getConfig(), true);
                createTyped.copyTo(copy);
                createFromBitmap.destroy();
                createTyped.destroy();
                create2.destroy();
                create.destroy();
                this.W.setImageBitmap(copy);
                this.f2628i0 = false;
                this.f2629j0 = null;
                this.f2630k0 = 0;
                mediaDescriptionCompat = this.e0;
                if (mediaDescriptionCompat != null) {
                    charSequence = null;
                } else {
                    charSequence = mediaDescriptionCompat.f846v;
                }
                z12 = !TextUtils.isEmpty(charSequence);
                mediaDescriptionCompat2 = this.e0;
                if (mediaDescriptionCompat2 != null) {
                    charSequence2 = mediaDescriptionCompat2.f847w;
                }
                isEmpty = true ^ TextUtils.isEmpty(charSequence2);
                if (!z12) {
                    this.Z.setText(charSequence);
                } else {
                    this.Z.setText(this.f2623b0);
                }
                if (!isEmpty) {
                    this.f2622a0.setText(charSequence2);
                    this.f2622a0.setVisibility(0);
                    return;
                }
                this.f2622a0.setVisibility(8);
                return;
            }
        }
        Bitmap bitmap3 = this.f2629j0;
        if (bitmap3 != null && bitmap3.isRecycled()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f2629j0);
        }
        this.Y.setVisibility(8);
        this.X.setVisibility(8);
        this.W.setImageBitmap(null);
        this.f2628i0 = false;
        this.f2629j0 = null;
        this.f2630k0 = 0;
        mediaDescriptionCompat = this.e0;
        if (mediaDescriptionCompat != null) {
        }
        z12 = !TextUtils.isEmpty(charSequence);
        mediaDescriptionCompat2 = this.e0;
        if (mediaDescriptionCompat2 != null) {
        }
        isEmpty = true ^ TextUtils.isEmpty(charSequence2);
        if (!z12) {
        }
        if (!isEmpty) {
        }
    }

    public final void k() {
        boolean z10;
        ArrayList arrayList = this.C;
        arrayList.clear();
        ArrayList arrayList2 = this.D;
        arrayList2.clear();
        ArrayList arrayList3 = this.E;
        arrayList3.clear();
        arrayList.addAll(this.B.b());
        l.f fVar = this.B.f30341a;
        fVar.getClass();
        r1.l.b();
        for (l.g gVar : Collections.unmodifiableList(fVar.f30338b)) {
            l.g.a a10 = this.B.a(gVar);
            if (a10 != null) {
                boolean z11 = true;
                g.b.a aVar = a10.f30361a;
                if (aVar != null && aVar.f30272d) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    arrayList2.add(gVar);
                }
                if ((aVar == null || !aVar.f30273e) ? false : false) {
                    arrayList3.add(gVar);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        i iVar = i.f2664u;
        Collections.sort(arrayList, iVar);
        Collections.sort(arrayList2, iVar);
        Collections.sort(arrayList3, iVar);
        this.M.y();
    }

    public final void l() {
        boolean z10;
        if (this.I) {
            if (SystemClock.uptimeMillis() - this.J >= 300) {
                if (this.P == null && !this.R) {
                    z10 = !this.H;
                } else {
                    z10 = true;
                }
                if (z10) {
                    this.S = true;
                    return;
                }
                this.S = false;
                if (!this.B.g() || this.B.d()) {
                    dismiss();
                }
                this.J = SystemClock.uptimeMillis();
                this.M.x();
                return;
            }
            a aVar = this.K;
            aVar.removeMessages(1);
            aVar.sendEmptyMessageAtTime(1, this.J + 300);
        }
    }

    public final void m() {
        if (this.S) {
            l();
        }
        if (this.T) {
            j();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
        this.f2631y.a(this.A, this.f2632z, 1);
        k();
        g(r1.l.d());
    }

    @Override // g.r, androidx.activity.g, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        Context context = this.G;
        u.j(context, this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.U = imageButton;
        imageButton.setColorFilter(-1);
        this.U.setOnClickListener(new b());
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.V = button;
        button.setTextColor(-1);
        this.V.setOnClickListener(new c());
        this.M = new h();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.L = recyclerView;
        recyclerView.setAdapter(this.M);
        this.L.setLayoutManager(new LinearLayoutManager(context));
        this.N = new j();
        this.O = new HashMap();
        this.Q = new HashMap();
        this.W = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.X = findViewById(R.id.mr_cast_meta_black_scrim);
        this.Y = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.Z = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.f2622a0 = textView2;
        textView2.setTextColor(-1);
        this.f2623b0 = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.H = true;
        i();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
        this.f2631y.g(this.f2632z);
        this.K.removeCallbacksAndMessages(null);
        g(null);
    }
}
