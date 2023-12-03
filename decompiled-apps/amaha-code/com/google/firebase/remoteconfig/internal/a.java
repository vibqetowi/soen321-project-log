package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.b;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import of.c;
import se.d;
/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final long f9814i = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f9815j = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final d f9816a;

    /* renamed from: b  reason: collision with root package name */
    public final re.b<wc.a> f9817b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f9818c;

    /* renamed from: d  reason: collision with root package name */
    public final Random f9819d;

    /* renamed from: e  reason: collision with root package name */
    public final of.b f9820e;
    public final ConfigFetchHttpClient f;

    /* renamed from: g  reason: collision with root package name */
    public final b f9821g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, String> f9822h;

    /* compiled from: ConfigFetchHandler.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0162a {

        /* renamed from: a  reason: collision with root package name */
        public final int f9823a;

        /* renamed from: b  reason: collision with root package name */
        public final c f9824b;

        /* renamed from: c  reason: collision with root package name */
        public final String f9825c;

        public C0162a(int i6, c cVar, String str) {
            this.f9823a = i6;
            this.f9824b = cVar;
            this.f9825c = str;
        }
    }

    public a(d dVar, re.b bVar, Executor executor, Random random, of.b bVar2, ConfigFetchHttpClient configFetchHttpClient, b bVar3, HashMap hashMap) {
        this.f9816a = dVar;
        this.f9817b = bVar;
        this.f9818c = executor;
        this.f9819d = random;
        this.f9820e = bVar2;
        this.f = configFetchHttpClient;
        this.f9821g = bVar3;
        this.f9822h = hashMap;
    }

    public final C0162a a(String str, String str2, Date date) {
        boolean z10;
        String str3;
        long millis;
        Long l2;
        boolean z11 = false;
        try {
            HttpURLConnection b10 = this.f.b();
            ConfigFetchHttpClient configFetchHttpClient = this.f;
            HashMap b11 = b();
            String string = this.f9821g.f9828a.getString("last_fetch_etag", null);
            Map<String, String> map = this.f9822h;
            wc.a aVar = this.f9817b.get();
            if (aVar == null) {
                l2 = null;
            } else {
                l2 = (Long) aVar.a(true).get("_fot");
            }
            C0162a fetch = configFetchHttpClient.fetch(b10, str, str2, b11, string, map, l2, date);
            String str4 = fetch.f9825c;
            if (str4 != null) {
                b bVar = this.f9821g;
                synchronized (bVar.f9829b) {
                    bVar.f9828a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f9821g.b(b.f9827e, 0);
            return fetch;
        } catch (FirebaseRemoteConfigServerException e10) {
            int i6 = e10.f9806u;
            if (i6 != 429 && i6 != 502 && i6 != 503 && i6 != 504) {
                z10 = false;
            } else {
                z10 = true;
            }
            b bVar2 = this.f9821g;
            if (z10) {
                int i10 = bVar2.a().f9831a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = f9815j;
                bVar2.b(new Date(date.getTime() + (timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]) / 2) + this.f9819d.nextInt((int) millis)), i10);
            }
            b.a a10 = bVar2.a();
            int i11 = e10.f9806u;
            if (!((a10.f9831a > 1 || i11 == 429) ? true : true)) {
                if (i11 != 401) {
                    if (i11 != 403) {
                        if (i11 != 429) {
                            if (i11 != 500) {
                                switch (i11) {
                                    case 502:
                                    case 503:
                                    case 504:
                                        str3 = "The server is unavailable. Please try again later.";
                                        break;
                                    default:
                                        str3 = "The server returned an unexpected error.";
                                        break;
                                }
                            } else {
                                str3 = "There was an internal server error.";
                            }
                        } else {
                            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                        }
                    } else {
                        str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
                    }
                } else {
                    str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
                }
                throw new FirebaseRemoteConfigServerException(e10.f9806u, "Fetch failed: ".concat(str3), e10);
            }
            a10.f9832b.getTime();
            throw new FirebaseRemoteConfigFetchThrottledException();
        }
    }

    public final HashMap b() {
        HashMap hashMap = new HashMap();
        wc.a aVar = this.f9817b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.a(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }
}
