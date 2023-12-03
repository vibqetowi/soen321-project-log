package com.moengage.widgets;

import android.widget.LinearLayout;
import hh.g;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.k;
/* compiled from: NudgeView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/moengage/widgets/NudgeView;", "Landroid/widget/LinearLayout;", "inapp_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class NudgeView extends LinearLayout {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f10261u = 0;

    /* compiled from: NudgeView.kt */
    /* loaded from: classes.dex */
    public static final class a extends k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f10263v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i6) {
            super(0);
            this.f10263v = i6;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder("null onWindowVisibilityChanged() : Visibility: ");
            int i6 = NudgeView.f10261u;
            NudgeView.this.getClass();
            sb2.append(this.f10263v);
            return sb2.toString();
        }
    }

    /* compiled from: NudgeView.kt */
    /* loaded from: classes.dex */
    public static final class b extends k implements ss.a<String> {
        public b() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            int i6 = NudgeView.f10261u;
            NudgeView.this.getClass();
            return i.n(" onWindowVisibilityChanged() : ", null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
        try {
            hh.a aVar = g.f17610d;
            g.a.b(0, new a(i6), 3);
        } catch (Exception e10) {
            hh.a aVar2 = g.f17610d;
            g.a.a(1, e10, new b());
        }
    }
}
