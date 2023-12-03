package a0;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;
/* compiled from: Key.java */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public int f7a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f8b = -1;

    /* renamed from: c  reason: collision with root package name */
    public String f9c = null;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<String, b0.a> f10d;

    public abstract void a(HashMap<String, z.c> hashMap);

    @Override // 
    /* renamed from: b */
    public abstract d clone();

    public d c(d dVar) {
        this.f7a = dVar.f7a;
        this.f8b = dVar.f8b;
        this.f9c = dVar.f9c;
        this.f10d = dVar.f10d;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> hashMap) {
    }
}
