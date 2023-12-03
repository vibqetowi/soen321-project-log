package com.bumptech.glide;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import g.x;
import i4.j;
import i4.l;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.m;
import kotlinx.coroutines.e0;
import m4.h;
import m4.i;
import n4.a;
import o4.a;
import o4.b;
import o4.c;
import o4.d;
import o4.e;
import o4.j;
import o4.s;
import o4.t;
import o4.u;
import o4.v;
import o4.w;
import p4.a;
import p4.b;
import p4.c;
import p4.d;
import p4.e;
import p4.f;
import r4.i;
import r4.l;
import r4.r;
import r4.t;
import r4.v;
import s4.a;
import w4.j;
/* loaded from: classes.dex */
public class Glide implements ComponentCallbacks2 {
    public static volatile Glide C;
    public static volatile boolean D;
    public final w4.c A;
    public final ArrayList B = new ArrayList();

    /* renamed from: u  reason: collision with root package name */
    public final l4.d f5924u;

    /* renamed from: v  reason: collision with root package name */
    public final h f5925v;

    /* renamed from: w  reason: collision with root package name */
    public final c f5926w;

    /* renamed from: x  reason: collision with root package name */
    public final Registry f5927x;

    /* renamed from: y  reason: collision with root package name */
    public final l4.b f5928y;

    /* renamed from: z  reason: collision with root package name */
    public final j f5929z;

    /* loaded from: classes.dex */
    public interface a {
    }

    public Glide(Context context, m mVar, h hVar, l4.d dVar, l4.b bVar, j jVar, w4.c cVar, int i6, b bVar2, t.b bVar3, List list) {
        this.f5924u = dVar;
        this.f5928y = bVar;
        this.f5925v = hVar;
        this.f5929z = jVar;
        this.A = cVar;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f5927x = registry;
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        k1.c cVar2 = registry.f5935g;
        synchronized (cVar2) {
            cVar2.f22768a.add(defaultImageHeaderParser);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 27) {
            registry.h(new l());
        }
        List<ImageHeaderParser> f = registry.f();
        u4.a aVar = new u4.a(context, f, dVar, bVar);
        v vVar = new v(dVar, new v.g());
        i iVar = new i(registry.f(), resources.getDisplayMetrics(), dVar, bVar);
        r4.e eVar = new r4.e(0, iVar);
        r rVar = new r(iVar, bVar);
        t4.d dVar2 = new t4.d(context);
        s.c cVar3 = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar4 = new s.b(resources);
        s.a aVar2 = new s.a(resources);
        r4.b bVar5 = new r4.b(bVar);
        v4.a aVar3 = new v4.a();
        df.b bVar6 = new df.b(5);
        ContentResolver contentResolver = context.getContentResolver();
        registry.b(ByteBuffer.class, new e0(3));
        registry.b(InputStream.class, new x(5, bVar));
        registry.a(eVar, ByteBuffer.class, Bitmap.class, "Bitmap");
        registry.a(rVar, InputStream.class, Bitmap.class, "Bitmap");
        registry.a(new r4.e(1, iVar), ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        registry.a(vVar, ParcelFileDescriptor.class, Bitmap.class, "Bitmap");
        registry.a(new v(dVar, new v.c()), AssetFileDescriptor.class, Bitmap.class, "Bitmap");
        u.a<?> aVar4 = u.a.f27110a;
        registry.d(Bitmap.class, Bitmap.class, aVar4);
        registry.a(new t(), Bitmap.class, Bitmap.class, "Bitmap");
        registry.c(Bitmap.class, bVar5);
        registry.a(new r4.a(resources, eVar), ByteBuffer.class, BitmapDrawable.class, "BitmapDrawable");
        registry.a(new r4.a(resources, rVar), InputStream.class, BitmapDrawable.class, "BitmapDrawable");
        registry.a(new r4.a(resources, vVar), ParcelFileDescriptor.class, BitmapDrawable.class, "BitmapDrawable");
        registry.c(BitmapDrawable.class, new androidx.appcompat.widget.l(dVar, 7, bVar5));
        registry.a(new u4.e(f, aVar, bVar), InputStream.class, GifDrawable.class, "Gif");
        registry.a(aVar, ByteBuffer.class, GifDrawable.class, "Gif");
        registry.c(GifDrawable.class, new tr.r());
        registry.d(g4.a.class, g4.a.class, aVar4);
        registry.a(new r4.e(2, dVar), g4.a.class, Bitmap.class, "Bitmap");
        registry.a(dVar2, Uri.class, Drawable.class, "legacy_append");
        registry.a(new r4.a(dVar2, dVar), Uri.class, Bitmap.class, "legacy_append");
        registry.i(new a.C0532a());
        registry.d(File.class, ByteBuffer.class, new c.b());
        registry.d(File.class, InputStream.class, new e.C0448e());
        registry.a(new t4.e(1), File.class, File.class, "legacy_append");
        registry.d(File.class, ParcelFileDescriptor.class, new e.b());
        registry.d(File.class, File.class, aVar4);
        registry.i(new j.a(bVar));
        registry.i(new l.a());
        Class cls = Integer.TYPE;
        registry.d(cls, InputStream.class, cVar3);
        registry.d(cls, ParcelFileDescriptor.class, bVar4);
        registry.d(Integer.class, InputStream.class, cVar3);
        registry.d(Integer.class, ParcelFileDescriptor.class, bVar4);
        registry.d(Integer.class, Uri.class, dVar3);
        registry.d(cls, AssetFileDescriptor.class, aVar2);
        registry.d(Integer.class, AssetFileDescriptor.class, aVar2);
        registry.d(cls, Uri.class, dVar3);
        registry.d(String.class, InputStream.class, new d.c());
        registry.d(Uri.class, InputStream.class, new d.c());
        registry.d(String.class, InputStream.class, new t.c());
        registry.d(String.class, ParcelFileDescriptor.class, new t.b());
        registry.d(String.class, AssetFileDescriptor.class, new t.a());
        registry.d(Uri.class, InputStream.class, new b.a());
        registry.d(Uri.class, InputStream.class, new a.c(context.getAssets()));
        registry.d(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets()));
        registry.d(Uri.class, InputStream.class, new c.a(context));
        registry.d(Uri.class, InputStream.class, new d.a(context));
        if (i10 >= 29) {
            registry.d(Uri.class, InputStream.class, new e.c(context));
            registry.d(Uri.class, ParcelFileDescriptor.class, new e.b(context));
        }
        registry.d(Uri.class, InputStream.class, new v.d(contentResolver));
        registry.d(Uri.class, ParcelFileDescriptor.class, new v.b(contentResolver));
        registry.d(Uri.class, AssetFileDescriptor.class, new v.a(contentResolver));
        registry.d(Uri.class, InputStream.class, new w.a());
        registry.d(URL.class, InputStream.class, new f.a());
        registry.d(Uri.class, File.class, new j.a(context));
        registry.d(o4.f.class, InputStream.class, new a.C0466a());
        registry.d(byte[].class, ByteBuffer.class, new b.a());
        registry.d(byte[].class, InputStream.class, new b.d());
        registry.d(Uri.class, Uri.class, aVar4);
        registry.d(Drawable.class, Drawable.class, aVar4);
        registry.a(new t4.e(0), Drawable.class, Drawable.class, "legacy_append");
        registry.j(Bitmap.class, BitmapDrawable.class, new x(resources));
        registry.j(Bitmap.class, byte[].class, aVar3);
        registry.j(Drawable.class, byte[].class, new s1.s(6, dVar, aVar3, bVar6));
        registry.j(GifDrawable.class, byte[].class, bVar6);
        if (i10 >= 23) {
            r4.v vVar2 = new r4.v(dVar, new v.d());
            registry.a(vVar2, ByteBuffer.class, Bitmap.class, "legacy_append");
            registry.a(new r4.a(resources, vVar2), ByteBuffer.class, BitmapDrawable.class, "legacy_append");
        }
        this.f5926w = new c(context, bVar, registry, new df.b(6), bVar2, bVar3, list, mVar, i6);
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i6;
        l4.d eVar;
        if (!D) {
            D = true;
            t.b bVar = new t.b();
            b bVar2 = new b();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Loading Glide modules");
            }
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                if (applicationInfo.metaData == null) {
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(x4.e.a(str));
                            if (Log.isLoggable("ManifestParser", 3)) {
                                Log.d("ManifestParser", "Loaded Glide module: " + str);
                            }
                        }
                    }
                    if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Finished loading Glide modules");
                    }
                }
                if (generatedAppGlideModule != null && !generatedAppGlideModule.c().isEmpty()) {
                    Set<Class<?>> c10 = generatedAppGlideModule.c();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        x4.c cVar = (x4.c) it.next();
                        if (c10.contains(cVar.getClass())) {
                            if (Log.isLoggable("Glide", 3)) {
                                Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar);
                            }
                            it.remove();
                        }
                    }
                }
                if (Log.isLoggable("Glide", 3)) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Log.d("Glide", "Discovered GlideModule from manifest: " + ((x4.c) it2.next()).getClass());
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    ((x4.c) it3.next()).b();
                }
                if (n4.a.f25879w == 0) {
                    n4.a.f25879w = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i10 = n4.a.f25879w;
                if (!TextUtils.isEmpty("source")) {
                    n4.a aVar = new n4.a(new ThreadPoolExecutor(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0421a("source", false)));
                    int i11 = n4.a.f25879w;
                    if (!TextUtils.isEmpty("disk-cache")) {
                        n4.a aVar2 = new n4.a(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0421a("disk-cache", true)));
                        if (n4.a.f25879w == 0) {
                            n4.a.f25879w = Math.min(4, Runtime.getRuntime().availableProcessors());
                        }
                        if (n4.a.f25879w >= 4) {
                            i6 = 2;
                        } else {
                            i6 = 1;
                        }
                        if (!TextUtils.isEmpty("animation")) {
                            n4.a aVar3 = new n4.a(new ThreadPoolExecutor(i6, i6, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.ThreadFactoryC0421a("animation", true)));
                            m4.i iVar = new m4.i(new i.a(applicationContext));
                            w4.e eVar2 = new w4.e();
                            int i12 = iVar.f24819a;
                            if (i12 > 0) {
                                eVar = new l4.i(i12);
                            } else {
                                eVar = new l4.e();
                            }
                            l4.h hVar = new l4.h(iVar.f24821c);
                            m4.g gVar = new m4.g(iVar.f24820b);
                            Glide glide = new Glide(applicationContext, new m(gVar, new m4.f(applicationContext), aVar2, aVar, new n4.a(new ThreadPoolExecutor(0, (int) SubsamplingScaleImageView.TILE_SIZE_AUTO, n4.a.f25878v, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.ThreadFactoryC0421a("source-unlimited", false))), aVar3), gVar, eVar, hVar, new w4.j(null), eVar2, 4, bVar2, bVar, Collections.emptyList());
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                x4.c cVar2 = (x4.c) it4.next();
                                try {
                                    cVar2.a();
                                } catch (AbstractMethodError e10) {
                                    throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(cVar2.getClass().getName()), e10);
                                }
                            }
                            applicationContext.registerComponentCallbacks(glide);
                            C = glide;
                            D = false;
                            return;
                        }
                        throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            } catch (PackageManager.NameNotFoundException e11) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e11);
            }
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    public static Glide b(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (C == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e11);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e12);
            } catch (InvocationTargetException e13) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e13);
            }
            synchronized (Glide.class) {
                if (C == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return C;
    }

    public static w4.j c(Context context) {
        if (context != null) {
            return b(context).f5929z;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    public static f f(Activity activity) {
        return c(activity).b(activity);
    }

    public static f g(Context context) {
        return c(context).c(context);
    }

    public static f h(Fragment fragment) {
        boolean z10;
        w4.j c10 = c(fragment.getContext());
        c10.getClass();
        if (fragment.getContext() != null) {
            char[] cArr = d5.j.f12201a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                return c10.c(fragment.getContext().getApplicationContext());
            }
            return c10.h(fragment.getContext(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
        throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
    }

    public static f i(p pVar) {
        return c(pVar).d(pVar);
    }

    public final void d(f fVar) {
        synchronized (this.B) {
            if (!this.B.contains(fVar)) {
                this.B.add(fVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    public final void e(f fVar) {
        synchronized (this.B) {
            if (this.B.contains(fVar)) {
                this.B.remove(fVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        boolean z10;
        char[] cArr = d5.j.f12201a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((d5.g) this.f5925v).e(0L);
            this.f5924u.b();
            this.f5928y.b();
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        boolean z10;
        long j10;
        char[] cArr = d5.j.f12201a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((f) it.next()).getClass();
            }
            m4.g gVar = (m4.g) this.f5925v;
            gVar.getClass();
            if (i6 >= 40) {
                gVar.e(0L);
            } else if (i6 >= 20 || i6 == 15) {
                synchronized (gVar) {
                    j10 = gVar.f12195b;
                }
                gVar.e(j10 / 2);
            }
            this.f5924u.a(i6);
            this.f5928y.a(i6);
            return;
        }
        throw new IllegalArgumentException("You must call this method on the main thread");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
