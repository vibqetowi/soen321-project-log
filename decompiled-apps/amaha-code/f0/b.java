package f0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import b7.b;
import bd.a;
import c9.j;
import com.canhub.cropper.CropOverlayView;
import com.facebook.FacebookException;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.w;
import com.google.firebase.database.android.AndroidAppCheckTokenProvider;
import com.google.firebase.database.android.AndroidAuthTokenProvider;
import com.google.firebase.encoders.EncodingException;
import d9.l;
import g6.p;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k7.o;
import l7.a;
import nd.l0;
import nd.o0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.g;
import r5.c;
import r7.e;
import re.a;
import t0.c;
import u7.a;
import w0.i;
import w5.l;
import zc.d;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements w0.f, CropOverlayView.a, l.a, g.a, p.c, androidx.activity.result.b, a.InterfaceC0377a, o.a, j.a, j.b, c9.e, a.d, l.a, s7.c, e.a, l.b.a, u0.d, ya.g, a.InterfaceC0519a, ya.b {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f14602u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Object f14603v;

    public /* synthetic */ b(int i6, Object obj) {
        this.f14602u = i6;
        this.f14603v = obj;
    }

    @Override // s7.c
    public final com.google.android.exoplayer2.drm.d a(com.google.android.exoplayer2.q qVar) {
        return (com.google.android.exoplayer2.drm.d) this.f14603v;
    }

    @Override // c9.e
    public final void accept(Object obj) {
        ((c.a) obj).e((Exception) this.f14603v);
    }

    @Override // k7.o.a
    public final Object apply(Object obj) {
        InputStream inputStream;
        int i6 = this.f14602u;
        Object obj2 = this.f14603v;
        switch (i6) {
            case 7:
                b7.b bVar = (b7.b) obj2;
                b.a aVar = (b.a) obj;
                bVar.getClass();
                URL url = aVar.f3959a;
                String c10 = h7.a.c("CctTransportBackend");
                if (Log.isLoggable(c10, 4)) {
                    Log.i(c10, String.format("Making request to: %s", url));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f3959a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(bVar.f3958g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = aVar.f3961c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        bVar.f3953a.a(aVar.f3960b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        Integer valueOf = Integer.valueOf(responseCode);
                        String c11 = h7.a.c("CctTransportBackend");
                        if (Log.isLoggable(c11, 4)) {
                            Log.i(c11, String.format("Status Code: %d", valueOf));
                        }
                        h7.a.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                        h7.a.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                        if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                            if (responseCode != 200) {
                                return new b.C0076b(responseCode, null, 0L);
                            }
                            InputStream inputStream2 = httpURLConnection.getInputStream();
                            try {
                                if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                    inputStream = new GZIPInputStream(inputStream2);
                                } else {
                                    inputStream = inputStream2;
                                }
                                b.C0076b c0076b = new b.C0076b(responseCode, null, c7.n.a(new BufferedReader(new InputStreamReader(inputStream))).f5059a);
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (inputStream2 != null) {
                                    inputStream2.close();
                                }
                                return c0076b;
                            } catch (Throwable th2) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        }
                        return new b.C0076b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    } catch (Throwable th4) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                            }
                        }
                        throw th4;
                    }
                } catch (EncodingException e10) {
                    e = e10;
                    h7.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new b.C0076b(400, null, 0L);
                } catch (ConnectException e11) {
                    e = e11;
                    h7.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new b.C0076b(500, null, 0L);
                } catch (UnknownHostException e12) {
                    e = e12;
                    h7.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new b.C0076b(500, null, 0L);
                } catch (IOException e13) {
                    e = e13;
                    h7.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new b.C0076b(400, null, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                a7.b bVar2 = k7.o.f23051z;
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j10));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j10), set);
                    }
                    set.add(new o.b(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // androidx.activity.result.b
    public final void b(Object obj) {
        ss.l tmp0 = (ss.l) this.f14603v;
        int i6 = g6.r.f16321z;
        kotlin.jvm.internal.i.g(tmp0, "$tmp0");
        tmp0.invoke((androidx.activity.result.a) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // q5.g.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(File file) {
        HashMap hashMap;
        HashMap hashMap2;
        r5.b bVar;
        HashMap hashMap3;
        int available;
        byte[] bArr;
        int i6;
        List<c.b> slaves = (List) this.f14603v;
        kotlin.jvm.internal.i.g(slaves, "$slaves");
        kotlin.jvm.internal.i.g(file, "file");
        HashMap hashMap4 = r5.b.f30455m;
        r5.e eVar = r5.e.f30482a;
        int i10 = 0;
        if (!b6.a.b(r5.e.class)) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
            } catch (Exception unused) {
            } catch (Throwable th2) {
                b6.a.a(r5.e.class, th2);
            }
            if (available >= 4) {
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i11 = wrap.getInt();
                int i12 = i11 + 4;
                if (available >= i12) {
                    JSONObject jSONObject = new JSONObject(new String(bArr, 4, i11, gv.a.f16927b));
                    JSONArray names = jSONObject.names();
                    int length = names.length();
                    String[] strArr = new String[length];
                    int i13 = length - 1;
                    if (i13 >= 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            strArr[i14] = names.getString(i14);
                            if (i15 > i13) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (length > 1) {
                        Arrays.sort(strArr);
                    }
                    hashMap = new HashMap();
                    int i16 = 0;
                    while (i16 < length) {
                        String str = strArr[i16];
                        i16++;
                        if (str != null) {
                            JSONArray jSONArray = jSONObject.getJSONArray(str);
                            int length2 = jSONArray.length();
                            int[] iArr = new int[length2];
                            int i17 = length2 - 1;
                            if (i17 >= 0) {
                                int i18 = 1;
                                while (true) {
                                    int i19 = i10 + 1;
                                    int i20 = jSONArray.getInt(i10);
                                    iArr[i10] = i20;
                                    i18 *= i20;
                                    if (i19 > i17) {
                                        break;
                                    }
                                    i10 = i19;
                                }
                                i6 = i18;
                            } else {
                                i6 = 1;
                            }
                            int i21 = i6 * 4;
                            int i22 = i12 + i21;
                            if (i22 <= available) {
                                ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i12, i21);
                                wrap2.order(ByteOrder.LITTLE_ENDIAN);
                                r5.a aVar = new r5.a(iArr);
                                wrap2.asFloatBuffer().get(aVar.f30454c, 0, i6);
                                hashMap.put(str, aVar);
                                i10 = 0;
                                i12 = i22;
                            }
                        }
                    }
                    if (hashMap != null) {
                        hashMap2 = new HashMap();
                        if (!b6.a.b(r5.b.class)) {
                            try {
                                hashMap3 = r5.b.f30455m;
                            } catch (Throwable th3) {
                                b6.a.a(r5.b.class, th3);
                            }
                            for (Map.Entry entry : hashMap.entrySet()) {
                                String str2 = (String) entry.getKey();
                                if (!hashMap3.containsKey(entry.getKey()) || (str2 = (String) hashMap3.get(entry.getKey())) != null) {
                                    hashMap2.put(str2, entry.getValue());
                                }
                            }
                            if (hashMap2 != null) {
                                try {
                                    bVar = new r5.b(hashMap2);
                                } catch (Exception unused2) {
                                    bVar = null;
                                }
                                if (bVar != null) {
                                    for (c.b bVar2 : slaves) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(bVar2.f30474a);
                                        sb2.append('_');
                                        String g5 = pl.a.g(sb2, bVar2.f30477d, "_rule");
                                        dd.a aVar2 = new dd.a(bVar2, 2, bVar);
                                        File file2 = new File(r5.e.a(), g5);
                                        String str3 = bVar2.f30476c;
                                        if (str3 != null && !file2.exists()) {
                                            new q5.g(str3, file2, aVar2).execute(new String[0]);
                                        } else {
                                            aVar2.c(file2);
                                        }
                                    }
                                    return;
                                }
                                return;
                            }
                            bVar = null;
                            if (bVar != null) {
                            }
                        }
                        hashMap3 = null;
                        while (r3.hasNext()) {
                        }
                        if (hashMap2 != null) {
                        }
                        bVar = null;
                        if (bVar != null) {
                        }
                    }
                    hashMap2 = null;
                    if (hashMap2 != null) {
                    }
                    bVar = null;
                    if (bVar != null) {
                    }
                }
            }
        }
        hashMap = null;
        if (hashMap != null) {
        }
        hashMap2 = null;
        if (hashMap2 != null) {
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    @Override // u7.a.d
    public final long d(long j10) {
        u7.o oVar = (u7.o) this.f14603v;
        return c9.w.i((j10 * oVar.f33888e) / 1000000, 0L, oVar.f33892j - 1);
    }

    @Override // w5.l.a
    public final void e(boolean z10) {
        boolean z11;
        String str = (String) this.f14603v;
        int i6 = FacebookException.f6108u;
        if (z10) {
            try {
                c6.a aVar = new c6.a(str);
                if (aVar.f4990b != null && aVar.f4991c != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    sp.b.k0(aVar.f4989a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // c9.j.b
    public final void f(Object obj, c9.h hVar) {
        int i6 = com.google.android.exoplayer2.k.H;
        ((w.b) obj).D((com.google.android.exoplayer2.w) this.f14603v, new w.c(hVar));
    }

    @Override // l7.a.InterfaceC0377a
    public final Object g() {
        int i6 = this.f14602u;
        Object obj = this.f14603v;
        switch (i6) {
            case 8:
                return Integer.valueOf(((k7.d) obj).k());
            case 9:
                ((j7.j) obj).f21731i.a();
                return null;
            case 10:
                return ((k7.c) obj).h();
            default:
                j7.l lVar = (j7.l) obj;
                for (d7.s sVar : lVar.f21739b.D()) {
                    lVar.f21740c.a(sVar, 1);
                }
                return null;
        }
    }

    @Override // ya.g
    public final ya.h h(Object obj) {
        ad.b c10;
        ad.d dVar = (ad.d) this.f14603v;
        zc.b bVar = (zc.b) obj;
        dVar.f490i.execute(new q7.f(dVar, 11, bVar));
        dVar.f494m = bVar;
        ad.n nVar = dVar.f;
        nVar.getClass();
        if (bVar instanceof ad.b) {
            c10 = (ad.b) bVar;
        } else {
            c10 = ad.b.c(bVar.b());
        }
        nVar.f526e = c10.f479b + ((long) (c10.f480c * 0.5d)) + 300000;
        long j10 = nVar.f526e;
        long j11 = c10.f479b + c10.f480c;
        if (j10 > j11) {
            nVar.f526e = j11 - 60000;
        }
        if (nVar.a()) {
            ad.g gVar = nVar.f522a;
            long j12 = nVar.f526e;
            ((a.C0082a) nVar.f523b).getClass();
            gVar.b(j12 - System.currentTimeMillis());
        }
        Iterator it = dVar.f486d.iterator();
        while (it.hasNext()) {
            ((d.a) it.next()).a();
        }
        ad.c c11 = ad.c.c(bVar);
        Iterator it2 = dVar.f485c.iterator();
        while (it2.hasNext()) {
            ((cd.a) it2.next()).onAppCheckTokenChanged(c11);
        }
        return ya.k.e(bVar);
    }

    @Override // re.a.InterfaceC0519a
    public final void i(re.b bVar) {
        int i6 = this.f14602u;
        Object obj = this.f14603v;
        switch (i6) {
            case 25:
                kd.b bVar2 = (kd.b) obj;
                bVar2.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Crashlytics native component now available.", null);
                }
                bVar2.f23252b.set((kd.a) bVar.get());
                return;
            case 28:
                ((AndroidAppCheckTokenProvider) obj).lambda$new$0(bVar);
                return;
            default:
                ((AndroidAuthTokenProvider) obj).lambda$new$0(bVar);
                return;
        }
    }

    @Override // c9.j.a
    public final void invoke(Object obj) {
        int i6 = com.google.android.exoplayer2.k.H;
        ((w.b) obj).A((com.google.android.exoplayer2.r) this.f14603v);
    }

    public final boolean j(w0.i iVar, int i6, Bundle bundle) {
        c.b c0544c;
        View view = (View) this.f14603v;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i6 & 1) != 0) {
            try {
                iVar.f36278a.c();
                InputContentInfo inputContentInfo = (InputContentInfo) iVar.f36278a.e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipDescription a10 = iVar.f36278a.a();
        i.c cVar = iVar.f36278a;
        ClipData clipData = new ClipData(a10, new ClipData.Item(cVar.b()));
        if (i10 >= 31) {
            c0544c = new c.a(clipData, 2);
        } else {
            c0544c = new c.C0544c(clipData, 2);
        }
        c0544c.a(cVar.d());
        c0544c.setExtras(bundle);
        if (t0.d0.m(view, c0544c.build()) != null) {
            return false;
        }
        return true;
    }

    public final void k(Display display) {
        d9.l lVar = (d9.l) this.f14603v;
        lVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            lVar.f12687k = refreshRate;
            lVar.f12688l = (refreshRate * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        lVar.f12687k = -9223372036854775807L;
        lVar.f12688l = -9223372036854775807L;
    }

    @Override // ya.b
    public final Object then(ya.h hVar) {
        boolean z10;
        int i6 = this.f14602u;
        Object obj = this.f14603v;
        switch (i6) {
            case 26:
                ((l0) obj).getClass();
                if (hVar.isSuccessful()) {
                    nd.b0 b0Var = (nd.b0) hVar.getResult();
                    com.google.android.gms.internal.cast.w wVar = com.google.android.gms.internal.cast.w.A;
                    wVar.e("Crashlytics report successfully enqueued to DataTransport: " + b0Var.c());
                    File b10 = b0Var.b();
                    if (b10.delete()) {
                        wVar.e("Deleted report file: " + b10.getPath());
                    } else {
                        wVar.j("Crashlytics could not delete report file: " + b10.getPath(), null);
                    }
                    z10 = true;
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", hVar.getException());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                ExecutorService executorService = o0.f26099a;
                ((CountDownLatch) obj).countDown();
                return null;
        }
    }
}
