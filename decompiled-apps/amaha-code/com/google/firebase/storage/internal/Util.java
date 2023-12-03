package com.google.firebase.storage.internal;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import cd.b;
import com.google.firebase.storage.network.NetworkRequest;
import fd.g;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sc.e;
import v9.m;
import v9.o;
import ya.k;
import zc.c;
/* loaded from: classes.dex */
public class Util {
    public static final String ISO_8601_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
    private static final int MAXIMUM_TOKEN_WAIT_TIME_MS = 30000;
    public static final int NETWORK_UNAVAILABLE = -2;
    private static final String TAG = "StorageUtil";

    public static boolean equals(Object obj, Object obj2) {
        return m.a(obj, obj2);
    }

    public static String getCurrentAppCheckToken(b bVar) {
        if (bVar == null) {
            return null;
        }
        try {
            c cVar = (c) k.b(bVar.b(false), 30000L, TimeUnit.MILLISECONDS);
            if (cVar.a() != null) {
                Log.w(TAG, "Error getting App Check token; using placeholder token instead. Error: " + cVar.a());
            }
            return cVar.b();
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            Log.e(TAG, "Unexpected error getting App Check token: " + e10);
            return null;
        }
    }

    public static String getCurrentAuthToken(gd.b bVar) {
        String str;
        if (bVar != null) {
            try {
                str = ((g) k.b(bVar.c(false), 30000L, TimeUnit.MILLISECONDS)).f14954a;
            } catch (InterruptedException | ExecutionException | TimeoutException e10) {
                Log.e(TAG, "error getting token " + e10);
            }
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        Log.w(TAG, "no auth token for request");
        return null;
    }

    public static Uri normalize(e eVar, String str) {
        String substring;
        String str2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Uri uri = NetworkRequest.PROD_BASE_URL;
        if (str.toLowerCase().startsWith("gs://")) {
            String preserveSlashEncode = Slashes.preserveSlashEncode(Slashes.normalizeSlashes(str.substring(5)));
            return Uri.parse("gs://" + preserveSlashEncode);
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (scheme != null && (equals(scheme.toLowerCase(), "http") || equals(scheme.toLowerCase(), "https"))) {
            int indexOf = parse.getAuthority().toLowerCase().indexOf(uri.getAuthority());
            String slashize = Slashes.slashize(parse.getEncodedPath());
            if (indexOf == 0 && slashize.startsWith("/")) {
                int indexOf2 = slashize.indexOf("/b/", 0);
                int i6 = indexOf2 + 3;
                int indexOf3 = slashize.indexOf("/", i6);
                int indexOf4 = slashize.indexOf("/o/", 0);
                if (indexOf2 != -1 && indexOf3 != -1) {
                    substring = slashize.substring(i6, indexOf3);
                    if (indexOf4 != -1) {
                        str2 = slashize.substring(indexOf4 + 3);
                    } else {
                        str2 = "";
                    }
                    slashize = str2;
                } else {
                    Log.w(TAG, "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                    throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                }
            } else if (indexOf > 1) {
                substring = parse.getAuthority().substring(0, indexOf - 1);
            } else {
                Log.w(TAG, "Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
                throw new IllegalArgumentException("Firebase Storage URLs must point to an object in your Storage Bucket. Please obtain a URL using the Firebase Console or getDownloadUrl().");
            }
            o.f("No bucket specified", substring);
            return new Uri.Builder().scheme("gs").authority(substring).encodedPath(slashize).build();
        }
        Log.w(TAG, "FirebaseStorage is unable to support the scheme:" + scheme);
        throw new IllegalArgumentException("Uri scheme");
    }

    public static long parseDateTime(String str) {
        if (str == null) {
            return 0L;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat(ISO_8601_FORMAT, Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e10) {
            Log.w(TAG, "unable to parse datetime:" + replaceAll, e10);
            return 0L;
        }
    }
}
