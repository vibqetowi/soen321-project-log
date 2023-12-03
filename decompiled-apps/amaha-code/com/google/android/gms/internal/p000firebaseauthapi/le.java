package com.google.android.gms.internal.p000firebaseauthapi;

import aa.e;
import android.text.TextUtils;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import v9.h;
import v9.k;
import v9.o;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.le  reason: invalid package */
/* loaded from: classes.dex */
public final class le {

    /* renamed from: a  reason: collision with root package name */
    public int f7969a;

    public /* synthetic */ le() {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static le a() {
        InputStream inputStream;
        String str;
        String str2;
        String concat;
        String str3 = "Failed to get app version for libraryName: firebase-auth";
        k kVar = k.f34913c;
        kVar.getClass();
        h hVar = k.f34912b;
        o.f("Please provide a valid libraryName", "firebase-auth");
        ConcurrentHashMap concurrentHashMap = kVar.f34914a;
        if (concurrentHashMap.containsKey("firebase-auth")) {
            str2 = (String) concurrentHashMap.get("firebase-auth");
        } else {
            Properties properties = new Properties();
            InputStream inputStream2 = null;
            r10 = null;
            String str4 = null;
            inputStream2 = null;
            try {
                try {
                    inputStream = k.class.getResourceAsStream(String.format("/%s.properties", "firebase-auth"));
                } catch (IOException e10) {
                    e = e10;
                    str = null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = inputStream2;
            }
            try {
                if (inputStream != null) {
                    properties.load(inputStream);
                    str4 = properties.getProperty("version", null);
                    String str5 = "firebase-auth version is " + str4;
                    if (Log.isLoggable(hVar.f34905a, 2)) {
                        String str6 = hVar.f34906b;
                        if (str6 != null) {
                            str5 = str6.concat(str5);
                        }
                        Log.v("LibraryVersion", str5);
                    }
                } else if (Log.isLoggable(hVar.f34905a, 5)) {
                    String str7 = hVar.f34906b;
                    if (str7 == null) {
                        concat = "Failed to get app version for libraryName: firebase-auth";
                    } else {
                        concat = str7.concat("Failed to get app version for libraryName: firebase-auth");
                    }
                    Log.w("LibraryVersion", concat);
                }
                if (inputStream != null) {
                    e.a(inputStream);
                }
            } catch (IOException e11) {
                e = e11;
                str = null;
                inputStream2 = inputStream;
                if (Log.isLoggable(hVar.f34905a, 6)) {
                    String str8 = hVar.f34906b;
                    if (str8 != null) {
                        str3 = str8.concat("Failed to get app version for libraryName: firebase-auth");
                    }
                    Log.e("LibraryVersion", str3, e);
                }
                if (inputStream2 != null) {
                    e.a(inputStream2);
                }
                str4 = str;
                if (str4 != null) {
                }
                concurrentHashMap.put("firebase-auth", str2);
                return new le((!TextUtils.isEmpty(str2) || str2.equals("UNKNOWN")) ? "-1" : "-1");
            } catch (Throwable th3) {
                th = th3;
                if (inputStream != null) {
                    e.a(inputStream);
                }
                throw th;
            }
            if (str4 != null) {
                if (Log.isLoggable(hVar.f34905a, 3)) {
                    String str9 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used";
                    String str10 = hVar.f34906b;
                    if (str10 != null) {
                        str9 = str10.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                    }
                    Log.d("LibraryVersion", str9);
                }
                str2 = "UNKNOWN";
            } else {
                str2 = str4;
            }
            concurrentHashMap.put("firebase-auth", str2);
        }
        return new le((!TextUtils.isEmpty(str2) || str2.equals("UNKNOWN")) ? "-1" : "-1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0060 -> B:15:0x0061). Please submit an issue!!! */
    public /* synthetic */ le(String str) {
        List d10;
        int i6 = 2;
        i6 = 2;
        i6 = 2;
        int i10 = 2;
        int i11 = 3;
        i11 = 3;
        i11 = 3;
        int i12 = 3;
        try {
            d10 = p2.b().d(str);
        } catch (IllegalArgumentException e10) {
            ?? isLoggable = Log.isLoggable("LibraryVersionContainer", i11);
            i10 = i6;
            i12 = isLoggable;
            if (isLoggable != 0) {
                ?? r12 = new Object[i6];
                r12[0] = str;
                r12[1] = e10;
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", r12));
                i10 = r12;
                i12 = isLoggable;
            }
        }
        if (d10.size() == 1) {
            str = Integer.parseInt(str);
        } else {
            if (d10.size() >= 3) {
                str = Integer.parseInt((String) d10.get(2)) + (Integer.parseInt((String) d10.get(1)) * 1000) + (Integer.parseInt((String) d10.get(0)) * 1000000);
            }
            str = -1;
            i6 = i10;
            i11 = i12;
        }
        this.f7969a = str;
    }
}
