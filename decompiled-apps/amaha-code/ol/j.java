package ol;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.l1;
import is.u;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import pl.q0;
import w5.i0;
/* compiled from: N3LogsAdapterFreeTextWithFooter.kt */
/* loaded from: classes2.dex */
public final class j extends RecyclerView.e<a> {
    public final List<String> A;
    public final ZoneOffset B;
    public final ss.p<Integer, Long, hs.k> C;
    public final String D;
    public boolean E;

    /* renamed from: x  reason: collision with root package name */
    public final List<HashMap<String, Object>> f27646x;

    /* renamed from: y  reason: collision with root package name */
    public final String f27647y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27648z;

    /* compiled from: N3LogsAdapterFreeTextWithFooter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {
        public final View A;

        /* renamed from: u  reason: collision with root package name */
        public final MotionLayout f27649u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f27650v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f27651w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f27652x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f27653y;

        /* renamed from: z  reason: collision with root package name */
        public final RobertoTextView f27654z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.clRowN3ItemParentContainer);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.clRowN3ItemParentContainer)");
            this.f27649u = (MotionLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowN3ItemHeaderLeft);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvRowN3ItemHeaderLeft)");
            this.f27650v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowN3ItemHeaderRight);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.tvRowN3ItemHeaderRight)");
            this.f27651w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowN3ItemBody);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvRowN3ItemBody)");
            this.f27652x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvRowN3ItemFooter);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.tvRowN3ItemFooter)");
            this.f27653y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.tvRowN3ItemCta);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.tvRowN3ItemCta)");
            this.f27654z = (RobertoTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.clRowN3ItemDescriptionContainer);
            kotlin.jvm.internal.i.f(findViewById7, "view.findViewById(R.id.c…ItemDescriptionContainer)");
            this.A = findViewById7;
        }
    }

    public j(List list, String str, String str2, ArrayList arrayList, ZoneOffset localZoneOffset, q0 q0Var) {
        kotlin.jvm.internal.i.g(localZoneOffset, "localZoneOffset");
        this.f27646x = list;
        this.f27647y = str;
        this.f27648z = str2;
        this.A = arrayList;
        this.B = localZoneOffset;
        this.C = q0Var;
        this.D = LogHelper.INSTANCE.makeLogTag("N3LogsAdapterFreeTextWithFooter");
        this.E = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27646x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Long l2;
        String str;
        String str2;
        String str3;
        HashMap hashMap;
        Object obj;
        int b10;
        int b11;
        a aVar2 = aVar;
        MotionLayout motionLayout = aVar2.f27649u;
        RobertoTextView robertoTextView = aVar2.f27650v;
        View view = aVar2.f2751a;
        try {
            HashMap hashMap2 = (HashMap) u.j2(i6, this.f27646x);
            if (hashMap2 != null) {
                robertoTextView.setText(this.f27647y + ' ' + (i6 + 1));
                Object obj2 = hashMap2.get("date");
                String str4 = null;
                if (obj2 instanceof Long) {
                    l2 = (Long) obj2;
                } else {
                    l2 = null;
                }
                RobertoTextView robertoTextView2 = aVar2.f27651w;
                if (l2 != null) {
                    robertoTextView2.setText(LocalDateTime.ofEpochSecond(l2.longValue() / 1000, 0, this.B).format(DateTimeFormatter.ofPattern("dd MMMM, hh:mm a").withLocale(Locale.ENGLISH)));
                }
                RobertoTextView robertoTextView3 = aVar2.f27652x;
                List<String> list = this.A;
                if (list != null) {
                    str = (String) u.j2(0, list);
                } else {
                    str = null;
                }
                Object obj3 = hashMap2.get(str);
                if (obj3 instanceof String) {
                    str2 = (String) obj3;
                } else {
                    str2 = null;
                }
                String str5 = "";
                if (str2 == null) {
                    str2 = "";
                }
                robertoTextView3.setText(str2);
                if (list != null) {
                    str3 = (String) u.j2(1, list);
                } else {
                    str3 = null;
                }
                Object obj4 = hashMap2.get(str3);
                boolean z10 = obj4 instanceof String;
                RobertoTextView robertoTextView4 = aVar2.f27653y;
                if (z10) {
                    robertoTextView4.setText((CharSequence) obj4);
                } else if (obj4 instanceof ArrayList) {
                    Object i22 = u.i2((List) obj4);
                    if (i22 instanceof HashMap) {
                        hashMap = (HashMap) i22;
                    } else {
                        hashMap = null;
                    }
                    if (hashMap != null) {
                        obj = hashMap.get("text");
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str4 = (String) obj;
                    }
                    if (str4 != null) {
                        str5 = str4;
                    }
                    robertoTextView4.setText(str5);
                }
                aVar2.f27654z.setText(this.f27648z);
                view.setOnClickListener(new i0(29, aVar2));
                aVar2.A.setOnClickListener(new l1(this, i6, hashMap2, 7));
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
                motionLayout.setBackgroundColor(b10);
                int i11 = i6 % 6;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
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
                if (i6 == f() - 1 && this.E) {
                    this.E = false;
                    motionLayout.setProgress(1.0f);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.D, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_n3_logs_item_free_text_with_footer, parent, false, "from(parent.context).inf…th_footer, parent, false)"));
    }
}
