package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* compiled from: ExoMediaDrm.java */
/* loaded from: classes.dex */
public interface g {

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f6446a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6447b;

        public a(String str, byte[] bArr) {
            this.f6446a = bArr;
            this.f6447b = str;
        }
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes.dex */
    public interface b {
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes.dex */
    public interface c {
        g a(UUID uuid);
    }

    /* compiled from: ExoMediaDrm.java */
    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f6448a;

        /* renamed from: b  reason: collision with root package name */
        public final String f6449b;

        public d(String str, byte[] bArr) {
            this.f6448a = bArr;
            this.f6449b = str;
        }
    }

    void a();

    Map<String, String> b(byte[] bArr);

    d c();

    r7.b d(byte[] bArr);

    byte[] e();

    void f(byte[] bArr, byte[] bArr2);

    void g(byte[] bArr);

    byte[] h(byte[] bArr, byte[] bArr2);

    void i(byte[] bArr);

    void j(DefaultDrmSessionManager.a aVar);

    a k(byte[] bArr, List<b.C0134b> list, int i6, HashMap<String, String> hashMap);

    int l();

    boolean m(String str, byte[] bArr);
}
