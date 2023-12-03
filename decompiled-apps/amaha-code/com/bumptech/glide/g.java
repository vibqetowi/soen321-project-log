package com.bumptech.glide;

import b5.a;
import com.bumptech.glide.g;
/* compiled from: TransitionOptions.java */
/* loaded from: classes.dex */
public abstract class g<CHILD extends g<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: u  reason: collision with root package name */
    public final a.C0075a f5965u = b5.a.f3945a;

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
