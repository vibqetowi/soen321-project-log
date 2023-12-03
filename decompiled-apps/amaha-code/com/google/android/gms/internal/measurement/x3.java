package com.google.android.gms.internal.measurement;

import android.net.Uri;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: a  reason: collision with root package name */
    public static final t.b f8685a = new t.b();

    public static synchronized Uri a() {
        synchronized (x3.class) {
            t.b bVar = f8685a;
            Uri uri = (Uri) bVar.getOrDefault("com.google.android.gms.measurement", null);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                bVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }
}
