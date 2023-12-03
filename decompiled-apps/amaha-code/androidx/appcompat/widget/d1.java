package androidx.appcompat.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a  reason: collision with root package name */
    public int f1390a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1391b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1392c = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: d  reason: collision with root package name */
    public int f1393d = LinearLayoutManager.INVALID_OFFSET;

    /* renamed from: e  reason: collision with root package name */
    public int f1394e = 0;
    public int f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1395g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1396h = false;

    public final void a(int i6, int i10) {
        this.f1392c = i6;
        this.f1393d = i10;
        this.f1396h = true;
        if (this.f1395g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f1390a = i10;
            }
            if (i6 != Integer.MIN_VALUE) {
                this.f1391b = i6;
                return;
            }
            return;
        }
        if (i6 != Integer.MIN_VALUE) {
            this.f1390a = i6;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1391b = i10;
        }
    }
}
