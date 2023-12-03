package com.google.android.gms.internal.p000firebaseauthapi;

import com.android.volley.toolbox.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import kc.f;
import v.h;
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.e4  reason: invalid package */
/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentMap f7813a;

    /* renamed from: b  reason: collision with root package name */
    public f4 f7814b;

    /* renamed from: c  reason: collision with root package name */
    public final Class f7815c;

    /* renamed from: d  reason: collision with root package name */
    public b8 f7816d;

    public /* synthetic */ e4(ConcurrentMap concurrentMap, f4 f4Var, b8 b8Var, Class cls) {
        this.f7813a = concurrentMap;
        this.f7814b = f4Var;
        this.f7815c = cls;
        this.f7816d = b8Var;
    }

    public final List a(byte[] bArr) {
        List list = (List) this.f7813a.get(new g4(bArr));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public final void b(Object obj, eb ebVar, boolean z10) {
        Integer num;
        a s6Var;
        byte[] array;
        if (this.f7813a != null) {
            if (ebVar.E() == 3) {
                ConcurrentMap concurrentMap = this.f7813a;
                Integer valueOf = Integer.valueOf(ebVar.v());
                byte[] bArr = null;
                if (ebVar.z() == 4) {
                    num = null;
                } else {
                    num = valueOf;
                }
                v6 v6Var = v6.f8202b;
                String A = ebVar.w().A();
                h0 z11 = ebVar.w().z();
                int w10 = ebVar.w().w();
                int z12 = ebVar.z();
                if (z12 == 4) {
                    if (num != null) {
                        throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
                    }
                } else if (num == null) {
                    throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
                }
                c7 c7Var = new c7(A, z11, w10, z12, num);
                v6Var.getClass();
                try {
                    try {
                        s6Var = ((h7) v6Var.f8203a.get()).a(c7Var);
                    } catch (GeneralSecurityException unused) {
                        s6Var = new s6(c7Var);
                    }
                    a aVar = s6Var;
                    int d10 = h.d(ebVar.z());
                    if (d10 != 1) {
                        if (d10 != 2) {
                            if (d10 != 3) {
                                if (d10 != 4) {
                                    throw new GeneralSecurityException("unknown output prefix type");
                                }
                            } else {
                                array = f.f23232v;
                            }
                        }
                        array = ByteBuffer.allocate(5).put((byte) 0).putInt(ebVar.v()).array();
                    } else {
                        array = ByteBuffer.allocate(5).put((byte) 1).putInt(ebVar.v()).array();
                    }
                    f4 f4Var = new f4(obj, array, ebVar.E(), ebVar.z(), ebVar.v(), aVar);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(f4Var);
                    byte[] bArr2 = f4Var.f7845b;
                    if (bArr2 != null) {
                        bArr = Arrays.copyOf(bArr2, bArr2.length);
                    }
                    g4 g4Var = new g4(bArr);
                    List list = (List) concurrentMap.put(g4Var, Collections.unmodifiableList(arrayList));
                    if (list != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(list);
                        arrayList2.add(f4Var);
                        concurrentMap.put(g4Var, Collections.unmodifiableList(arrayList2));
                    }
                    if (z10) {
                        if (this.f7814b == null) {
                            this.f7814b = f4Var;
                            return;
                        }
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                    return;
                } catch (GeneralSecurityException e10) {
                    throw new zzhi(e10);
                }
            }
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        throw new IllegalStateException("addPrimitive cannot be called after build");
    }

    public final boolean c() {
        if (!this.f7816d.f7730a.isEmpty()) {
            return true;
        }
        return false;
    }

    public /* synthetic */ e4(Class cls) {
        this.f7813a = new ConcurrentHashMap();
        this.f7815c = cls;
        this.f7816d = b8.f7729b;
    }
}
