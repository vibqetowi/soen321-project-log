package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.Glide;
import java.util.List;
import java.util.Map;
import k4.m;
/* compiled from: GlideContext.java */
/* loaded from: classes.dex */
public final class c extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final a f5939k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final l4.b f5940a;

    /* renamed from: b  reason: collision with root package name */
    public final Registry f5941b;

    /* renamed from: c  reason: collision with root package name */
    public final df.b f5942c;

    /* renamed from: d  reason: collision with root package name */
    public final Glide.a f5943d;

    /* renamed from: e  reason: collision with root package name */
    public final List<z4.e<Object>> f5944e;
    public final Map<Class<?>, g<?, ?>> f;

    /* renamed from: g  reason: collision with root package name */
    public final m f5945g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5946h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5947i;

    /* renamed from: j  reason: collision with root package name */
    public z4.f f5948j;

    public c(Context context, l4.b bVar, Registry registry, df.b bVar2, b bVar3, t.b bVar4, List list, m mVar, int i6) {
        super(context.getApplicationContext());
        this.f5940a = bVar;
        this.f5941b = registry;
        this.f5942c = bVar2;
        this.f5943d = bVar3;
        this.f5944e = list;
        this.f = bVar4;
        this.f5945g = mVar;
        this.f5946h = false;
        this.f5947i = i6;
    }
}
