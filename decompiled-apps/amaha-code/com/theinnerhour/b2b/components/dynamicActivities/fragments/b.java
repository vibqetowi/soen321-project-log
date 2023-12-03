package com.theinnerhour.b2b.components.dynamicActivities.fragments;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.f0;
import com.google.android.exoplayer2.r;
import com.google.android.exoplayer2.v;
import com.google.android.exoplayer2.w;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import d9.q;
import java.util.List;
import kotlin.jvm.internal.i;
import o8.p;
import q7.d;
import z8.h;
/* compiled from: N14AScreenFragment.kt */
/* loaded from: classes2.dex */
public final class b implements w.d {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ N14AScreenFragment f11107u;

    public b(N14AScreenFragment n14AScreenFragment) {
        this.f11107u = n14AScreenFragment;
    }

    @Override // com.google.android.exoplayer2.w.b
    public final void q(ExoPlaybackException error) {
        N14AScreenFragment n14AScreenFragment = this.f11107u;
        i.g(error, "error");
        try {
            ApplicationPersistence applicationPersistence = ApplicationPersistence.getInstance();
            int intValue = applicationPersistence.getIntValue("daec_" + n14AScreenFragment.W);
            LogHelper logHelper = LogHelper.INSTANCE;
            String str = n14AScreenFragment.f10949w;
            logHelper.e(str, "N14Video failure for file " + n14AScreenFragment.W + " where error count " + intValue);
            n14AScreenFragment.k0();
            n14AScreenFragment.X().j(n14AScreenFragment.W);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(n14AScreenFragment.f10949w, e10);
        }
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void N() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void T() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void b() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void d0() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void e() {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void f() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void i() {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void A(r rVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void C(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void L(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void a(g8.a aVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void c(q qVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void f0(v vVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void g(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void h(List list) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void i0(d dVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void l(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void l0(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void r(f0 f0Var) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void s(boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void t(w.a aVar) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void w(float f) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void x(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void y(int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void D(w wVar, w.c cVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void G(p pVar, h hVar) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void R(com.google.android.exoplayer2.q qVar, int i6) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void V(int i6, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.d
    public final /* synthetic */ void e0(int i6, int i10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void v(int i6, boolean z10) {
    }

    @Override // com.google.android.exoplayer2.w.b
    public final /* synthetic */ void z(int i6, w.e eVar, w.e eVar2) {
    }
}
