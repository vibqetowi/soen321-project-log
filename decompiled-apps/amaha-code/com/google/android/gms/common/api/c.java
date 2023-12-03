package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@Deprecated
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<c> f7318a = Collections.newSetFromMap(new WeakHashMap());

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* loaded from: classes.dex */
    public interface a extends e {
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @Deprecated
    /* loaded from: classes.dex */
    public interface b extends k {
    }

    public static Set<c> a() {
        Set<c> set = f7318a;
        synchronized (set) {
        }
        return set;
    }
}
