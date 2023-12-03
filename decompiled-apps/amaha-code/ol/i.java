package ol;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.l1;
import is.u;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import pl.n0;
import w5.i0;
/* compiled from: N3LogsAdapterDSD.kt */
/* loaded from: classes2.dex */
public final class i extends RecyclerView.e<a> {
    public final String A;
    public final ZoneOffset B;
    public final ss.p<Integer, Long, hs.k> C;
    public boolean D;

    /* renamed from: x  reason: collision with root package name */
    public final List<HashMap<String, Object>> f27637x;

    /* renamed from: y  reason: collision with root package name */
    public final String f27638y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27639z;

    /* compiled from: N3LogsAdapterDSD.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final MotionLayout f27640u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f27641v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f27642w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f27643x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f27644y;

        /* renamed from: z  reason: collision with root package name */
        public final View f27645z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.clRowN3ItemParentContainer);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.clRowN3ItemParentContainer)");
            this.f27640u = (MotionLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowN3ItemHeaderLeft);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvRowN3ItemHeaderLeft)");
            this.f27641v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowN3ItemHeaderRight);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.tvRowN3ItemHeaderRight)");
            this.f27642w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowN3ItemBody);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvRowN3ItemBody)");
            this.f27643x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvRowN3ItemCta);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.tvRowN3ItemCta)");
            this.f27644y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.clRowN3ItemDescriptionContainer);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.c…ItemDescriptionContainer)");
            this.f27645z = findViewById6;
        }
    }

    public i(List list, String str, String str2, String str3, ZoneOffset localZoneOffset, n0 n0Var) {
        kotlin.jvm.internal.i.g(localZoneOffset, "localZoneOffset");
        this.f27637x = list;
        this.f27638y = str;
        this.f27639z = str2;
        this.A = str3;
        this.B = localZoneOffset;
        this.C = n0Var;
        this.D = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27637x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Long l2;
        int b10;
        int b11;
        a aVar2 = aVar;
        HashMap hashMap = (HashMap) u.j2(i6, this.f27637x);
        if (hashMap != null) {
            RobertoTextView robertoTextView = aVar2.f27641v;
            robertoTextView.setText(this.f27638y + ' ' + (i6 + 1));
            Object obj = hashMap.get("date");
            String str = null;
            if (obj instanceof Long) {
                l2 = (Long) obj;
            } else {
                l2 = null;
            }
            RobertoTextView robertoTextView2 = aVar2.f27642w;
            if (l2 != null) {
                robertoTextView2.setText(LocalDateTime.ofEpochSecond(l2.longValue() / 1000, 0, this.B).format(DateTimeFormatter.ofPattern("dd MMMM, hh:mm a").withLocale(Locale.ENGLISH)));
            }
            Object obj2 = hashMap.get(this.A);
            if (obj2 instanceof String) {
                str = (String) obj2;
            }
            if (str == null) {
                str = "";
            }
            aVar2.f27643x.setText(str);
            aVar2.f27644y.setText(this.f27639z);
            i0 i0Var = new i0(28, aVar2);
            View view = aVar2.f2751a;
            view.setOnClickListener(i0Var);
            aVar2.f27645z.setOnClickListener(new l1(this, i6, hashMap, 6));
            int i10 = i6 % 6;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                b10 = g0.a.b(view.getContext(), R.color.templateLightYellow);
                            } else {
                                b10 = g0.a.b(view.getContext(), R.color.templateLightPurple);
                            }
                        } else {
                            b10 = g0.a.b(view.getContext(), R.color.templateLightPeach);
                        }
                    } else {
                        b10 = g0.a.b(view.getContext(), R.color.templateLightBlue);
                    }
                } else {
                    b10 = g0.a.b(view.getContext(), R.color.templateLightRed);
                }
            } else {
                b10 = g0.a.b(view.getContext(), R.color.templateLightGreen);
            }
            MotionLayout motionLayout = aVar2.f27640u;
            motionLayout.setBackgroundColor(b10);
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                b11 = g0.a.b(view.getContext(), R.color.templateTextColorYellow);
                            } else {
                                b11 = g0.a.b(view.getContext(), R.color.templateTextColorPurple);
                            }
                        } else {
                            b11 = g0.a.b(view.getContext(), R.color.templateTextColorPeach);
                        }
                    } else {
                        b11 = g0.a.b(view.getContext(), R.color.templateTextColorBlue);
                    }
                } else {
                    b11 = g0.a.b(view.getContext(), R.color.templateTextColorRed);
                }
            } else {
                b11 = g0.a.b(view.getContext(), R.color.templateTextColorGreen);
            }
            robertoTextView.setTextColor(b11);
            robertoTextView2.setTextColor(b11);
            if (i6 == f() - 1 && this.D) {
                this.D = false;
                motionLayout.setProgress(1.0f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_n3_logs_item, parent, false, "from(parent.context).inf…logs_item, parent, false)"));
    }
}
