package com.google.firebase.messaging;

import de.f;
import java.util.HashMap;
/* compiled from: ProtoEncoderDoNotUse.java */
/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final de.f f9785a;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ce.a aVar = f.a.f12830a;
        hashMap.put(w.class, c.f9685a);
        hashMap2.remove(w.class);
        hashMap.put(ye.b.class, b.f9678a);
        hashMap2.remove(ye.b.class);
        hashMap.put(ye.a.class, a.f9658a);
        hashMap2.remove(ye.a.class);
        f9785a = new de.f(new HashMap(hashMap), new HashMap(hashMap2), aVar);
    }

    public abstract ye.b a();
}
